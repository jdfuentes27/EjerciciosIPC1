package practica01;
import java.io.File;
import java.util.*;
public class Practica01 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		menuprincipal();
	}
	
	//Menú principal
	public static void menuprincipal () {
		boolean salir=false;
		int opcion=0;
		//Menu principal
		while(!salir) {
		
		System.out.println(" ============MENU============ ");
		System.out.println("|1. Encriptar                |");
		System.out.println("|2. Desencriptar             |");
		System.out.println("|3. Antaque con texto claro  |");
		System.out.println("|4. Generar reportes         |");
		System.out.println("|5. Salir                    |");
		System.out.println(" ============================ ");
		
		try{
			
		    opcion = sc.nextInt();
		
		switch(opcion){
		case 1:
			menuencriptar();
			
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		case 4:
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Ingrese una de las opciones mostradas en el menú.");
			
			
		}
		}catch(Exception e)
		{
			System.out.println("Ingrese una opción numérica.");
			sc.next(); 
		}
		
		}

	}
	//Metodo del menu ENCRIPTAR
	
	public static void menuencriptar () {

	int option;//Variable de selección
	option=0;
	boolean salir=false;
	
	while(!salir) {
	
	try{
	
	System.out.println(" ========MENU ENCRIPTAR========= ");
	System.out.println("|1. Ingreso Mensaje             |");
	System.out.println("|2. Ingreso Matriz Clave A      |");
	System.out.println("|3. Ingreso Matriz Clave B      |");
	System.out.println("|4. Encriptar                   |");
	System.out.println("|5. Menú principal              |");
	System.out.println(" =============================== ");
	
	System.out.println("Ingrese la accion a realizar:");
	option = sc.nextInt();
	switch(option) {
	case 1:
				
		leematriz();
		
		break;
		
	case 2:

		leermatriza();
		
		break;
				
	case 3:
		
		leermatrizb();
		break;
		
	case 4:
		encripta();
	
		break;
	
	case 5:
		menuprincipal();
		break;
	default: System.out.println("Opcion inexistente.");
	}
	
		}catch(InputMismatchException e) {
			System.out.println("Ingrese una opción válida.");//En caso de que no se ingrese un entero como o
			sc.next();
		}
	
	}
	
		}
		

	
	public static void leematriz(){
		
		String mensaje="";
		int M [][]=null;
		char abc[];
		abc=new char[28];
		abc[0]='A';
		abc[1]='B';
		abc[2]='C';
		abc[3]='D';
		abc[4]='E';
		abc[5]='F';
		abc[6]='G';
		abc[7]='H';
		abc[8]='I';
		abc[9]='J';
		abc[10]='K';
		abc[11]='L';
		abc[12]='M';
		abc[13]='N';
		abc[14]='Ñ';
		abc[15]='O';
		abc[16]='P';
		abc[17]='Q';
		abc[18]='R';
		abc[19]='S';
		abc[20]='T';
		abc[21]='U';
		abc[22]='V';
		abc[23]='W';
		abc[24]='X';
		abc[25]='Y';
		abc[26]='z';
		abc[27]=' ';
		
		char caracter;
		boolean encuentra=false;
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Ingrese el mensaje a encriptar:");
		mensaje = sc.nextLine();
		int j;
		mensaje=mensaje.toUpperCase();

		int nofilas=3;
		int longitud=mensaje.length();	
		int longi=mensaje.length();
		while(longitud%3!=0) {
			longitud++;
		}
		int nocolumnas=longitud/3;
		M = new int[nofilas][nocolumnas];
		int num[]=new int[longitud];
		//Sustituyendo letras por números
		System.out.println("Mensaje codificado:");
		for (int i=0;i<longi;i++) {
			j=0;
			encuentra=false;
			caracter=mensaje.charAt(i);
	
			while(!encuentra) {
			
				if(caracter==abc[j]) {
					encuentra=true;
					num[i]=j;
				
				}
				else {
					
					j++;
					if(j>27) {
						num[i]=27;
						encuentra=true;
					}
				}
				
					
			}
			System.out.print(num[i]+" ");
			
		}
		
		
		for(int i=longi;i<longitud;i++) {
			num[i]=27;
		}
		int k=0;
		for(int i=0;i<nocolumnas;i++) {
			System.out.print(" ");
			for (j=0;j<nofilas;j++) {
				M[j][i]=num[k];
				
				k++;
			}
		}
		System.out.println("");
		System.out.println("Mensaje codificado en forma matricial:");
		
		for(int i=0;i<nofilas;i++) {
			for(j=0;j<nocolumnas;j++) {
				System.out.print("["+M[i][j]+"]"+'\t');
			}
			System.out.println("");
		}
		
		}catch(InputMismatchException e) {
			System.out.println("Hubo un error, el error es: " +e.getMessage());
			main(null);
	}
		System.out.println("Presione una tecla para continuar...");
		System.out.println("K");
		sc.close();
		
	}
	
	public static void leermatriza() {
		String matriz="";
		int [][]A=null;
		Scanner sn = new Scanner(System.in);
		System.out.println("Ingrese el nombre del archivo que contiene la matriz codigo A:");
		try {
		 //Contendrá la matriz código
			String ruta=sn.nextLine();
			
		
		//Se lee la ruta relativa del archivo
			
			File archivo = new File(ruta);
			Scanner sc3 = new Scanner(archivo);
			
			while(sc3.hasNextLine()) {
				
				matriz+=sc3.nextLine()+"\n";
			}
			
			sc3.close();
			
			String filas []=matriz.split("\n"); //Se mueve cada vez que hay un espacio
			String columnas[]=filas[0].split(","); //Se mueve cada vez que hay una coma
			int nofilas=filas.length; //Determina cuantas filas tiene A
			int nocolumnas=columnas.length; //Determina cuantas columnas tiene A
			A= new int[nofilas][nocolumnas];
			//Llenanado la matriz
			
			for(int i=0;i<nofilas;i++) {
				columnas=filas[i].split(",");
				for(int j=0;j<nocolumnas;j++) {
					A[i][j]=Integer.parseInt(columnas[j]);
				}
			}
			//Mostrando la Matriz
			System.out.println("Matriz contenida en el archivo:");
			for(int i=0;i<nofilas;i++) {
				for(int j=0;j<nocolumnas;j++) {
					System.out.print("["+A[i][j]+"]"+'\t');
				}
				System.out.println(" ");
			}
			sn.close();
	    	System.out.println("Presione una tecla para continuar...");
		}catch(Exception e) {
			System.out.println("Hubo un error, el error es: " +e.getMessage());
			
		}
		
			System.out.println("K");
			
	    }
	    
		
		
		

	//Lectura del archivo que contiene la matriz B
	
	public static void leermatrizb(){
		int B[][];
		Scanner sn = new Scanner(System.in);
		try {
		//Contendrá la matriz código
		String matriz="";
		String ruta;
		//Se lee la ruta relativa del archivo
			System.out.println("Ingrese el nombre del archivo que contiene la matriz codigo B:");
			ruta=sn.nextLine();
			File archivo = new File(ruta);
			Scanner sc = new Scanner(archivo);
			
			while(sc.hasNextLine()) {
				
				matriz+=sc.nextLine()+"\n";
			}
			
			sc.close();
			
			String filas []=matriz.split("\n"); //Se mueve cada vez que hay un espacio
			String columnas[]=filas[0].split(","); //Se mueve cada vez que hay una coma
			int nofilas=filas.length; //Determina cuantas filas tiene A
			int nocolumnas=columnas.length; //Determina cuantas columnas tiene A
			B= new int[nofilas][nocolumnas];
			//Llenanado la matriz
			
			for(int i=0;i<nofilas;i++) {
				columnas=filas[i].split(",");
				for(int j=0;j<nocolumnas;j++) {
					B[i][j]=Integer.parseInt(columnas[j]);
				}
			}
			//Mostrando la Matriz
			System.out.println("Matriz contenida en el archivo:");
			for(int i=0;i<nofilas;i++) {
				for(int j=0;j<nocolumnas;j++) {
					System.out.print("["+B[i][j]+"]"+'\t');
				}
				System.out.println(" ");
				
			}
			sn.close();
			
		}catch(Exception e) {
			System.out.println("Hubo un error, el error es: " +e.getMessage());
			
	}
		System.out.println("Presione una tecla para continuar");

	}
	
//Proceso de encriptación
	public static void encripta() {
		
		
		
	}		
	
}
