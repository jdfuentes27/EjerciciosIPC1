package practica_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Practica_1 {

    static Scanner op;
    static int[][] matrizM; //la ingresa el usuario
    static int[][] M;
    static int[][] N;
    static int[][] matrizA = new int[3][3]; //siempre es de 3X3
    static int[][] matrizB;  //se lee pero es de el tamano de la matriz M
    static int[][] matrizR; //resultado de las operaciones de las 3 matrices
    static int[][] matrizD;
    static int[][] matrizPrueba;
    static double [][] matrizI = new double[3][3]; //matriz inversa de 'A'
    static int res1, b = 3;
    static int nc = 0, nf = 0;
    static double inver[][];
    

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int a = 0;
        do {
            System.out.println("Menu Princiapal");
            System.out.println("1. Encriptar.");
            System.out.println("2. Desencriptar.");
            System.out.println("3. Ataque con texto claro.");
            System.out.println("4. Generar reporte.");
            System.out.println("5. Salir.");

            try {
                op = new Scanner(System.in);
                a = op.nextInt();
            } catch (Exception e) {
                System.out.println("Por favor ingrese un numero");
                System.out.println("");
            }

            switch (a) {
                case 1:
                    System.out.println("");
                    System.out.println("--------------------");
                    menuencriptar();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("--------------------");
                    menuDes();
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("--------------------");
                    menuAtaque();
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("--------------------");
                    reporte();
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("Gracias por usas estre programa");
                    System.exit(0);

                    break;
            }
        } while (a != 5);
    }

    public static void menuencriptar() {
        int a = 0;
        do {
            System.out.println("Menu Encriptar");
            System.out.println("1. Ingresar Mensaje.");
            System.out.println("2. Ingresar Matriz clave A");
            System.out.println("3. Ingresar Matriz clave B");
            System.out.println("4. Encriptar");
            System.out.println("5. Menu principal");

            try {
                op = new Scanner(System.in);
                a = op.nextInt();
            } catch (Exception e) {
                System.out.println("Por favor ingrese un numero");
                System.out.println("");
            }

            switch (a) {
                case 1:
                    System.out.println("------------------");
                    en();
                    break;
                case 2:
                    System.out.println("------------------");
                    leerMA();
                    System.out.println("La matriz de 3X3 ingresada es: ");
                    mostrarMA(matrizA);
                    System.out.println("");
                    System.out.println(" matriz inversa");
                    inversa();
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("--------------------");
                    leerMB();
                    System.out.println("La matriz ingresada es:");
                    mostrarMB(matrizB);
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("--------------------");
                    multiM();
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("--------------------");
                    menu();
                    break;

            }
        } while (a != 5);

    }

    public static void en() {
        Scanner letra = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Ingrese una frase");
        String a = letra.nextLine().toUpperCase();
        int[] array = new int[a.length()];
        int b, res;
        b = a.length();
        int contador = 0;

        matrizM = new int[a.length()][a.length()];

        for (int i = 0; i < a.length(); i++) {
            int v;

            switch (a.charAt(i)) {
                case 'A':
                    v = 0;
                    array[i] = v;
                    break;
                case 'B':
                    v = 1;
                    array[i] = v;
                    break;
                case 'C':
                    v = 2;
                    array[i] = v;
                    break;
                case 'D':
                    v = 3;
                    array[i] = v;
                    break;
                case 'E':
                    v = 4;
                    array[i] = v;
                    break;
                case 'F':
                    v = 4;
                    array[i] = v;
                    break;
                case 'G':
                    v = 6;
                    array[i] = v;
                    break;
                case 'H':
                    v = 7;
                    array[i] = v;
                    break;
                case 'I':
                    v = 8;
                    array[i] = v;
                    break;
                case 'J':
                    v = 9;
                    array[i] = v;
                    break;
                case 'K':
                    v = 10;
                    array[i] = v;
                    break;
                case 'L':
                    v = 11;
                    array[i] = v;
                    break;
                case 'M':
                    v = 12;
                    array[i] = v;
                    break;
                case 'N':
                    v = 13;
                    array[i] = v;
                    break;
                case 'Ñ':
                    v = 14;
                    array[i] = v;
                    break;
                case 'O':
                    v = 15;
                    array[i] = v;
                    break;
                case 'P':
                    v = 16;
                    array[i] = v;
                    break;
                case 'Q':
                    v = 17;
                    array[i] = v;
                    break;
                case 'R':
                    v = 18;
                    array[i] = v;
                    break;
                case 'S':
                    v = 19;
                    array[i] = v;
                    break;
                case 'T':
                    v = 20;
                    array[i] = v;
                    break;
                case 'U':
                    v = 21;
                    array[i] = v;
                    break;
                case 'V':
                    v = 22;
                    array[i] = v;
                    break;
                case 'W':
                    v = 23;
                    array[i] = v;
                    break;
                case 'X':
                    v = 24;
                    array[i] = v;
                    break;
                case 'Y':
                    v = 25;
                    array[i] = v;
                    break;
                case 'Z':
                    v = 26;
                    array[i] = v;
                    break;
                default:
                    v = 27;
                    array[i] = v;
            }
        }
        System.out.println("");
        res = b % 3;
        res1 = b / 3;

        if (res != 0) {
            res1 = res1 + 1;
        }

        int fi = 3;
        for (int j = 0; j < res1; j++) {
            for (int c = 0; c < fi; c++) {
                if (contador < array.length) {
                    matrizM[j][c] = array[contador];
                } else {
                    matrizM[j][c] = 27;
                }
                contador++;
            }
        }

        System.out.println("El mensaje se Guardara en la Matriz 'M'");
        System.out.println("");
        for (int j = 0; j < fi; j++) {
            for (int c = 0; c < res1; c++) {
                System.out.print("[" + matrizM[c][j] + "]" + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("---------------");
    } //listo

    public static void leerMA() {
        Scanner a = new Scanner(System.in);
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            System.out.println("Ingrese la ruta del archivo que desea ver");
            String ruta = a.nextLine();
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            int contador = 0;

            while ((linea = br.readLine()) != null) {
                //System.out.println(linea);
                String[] numeros = linea.split(",");

                if (linea.split(",").length != 3) {
                    System.out.println("Por favor ingrese una matriz de 3X3 :D");
                    System.out.println("");
                    System.out.println("------------");
                    menuencriptar();
                }

                for (int i = 0; i < numeros.length; i++) {
                    //System.out.print("[" + contador + "][" + i + "]=");
                    //System.out.println(numeros[i]);
                    matrizA[contador][i] = Integer.parseInt(numeros[i]);
                }
                //System.out.println("----------------------");
                contador++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    } //listo

    public static void mostrarMA(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("------------------");
    }  //listo

    public static void leerMB() {
        Scanner a = new Scanner(System.in);
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            System.out.println("Ingrese la ruta del archivo que desea ver");
            String ruta = a.nextLine();
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                String[] numeros = linea.split(",");
                nc = numeros.length;
                nf++;
            }

            //System.out.println(nc);
            //System.out.println(nf);
            matrizB = new int[nf][nc];

            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {
                String[] numeros = linea.split(",");
                for (int i = 0; i < numeros.length; i++) {
                    matrizB[contador][i] = Integer.parseInt(numeros[i]);
                }
                //System.out.println("----------------------");
                contador++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    } //listo

    public static void mostrarMB(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("------------------");
    }  //listo

    public static void multiM() {

        matrizR = new int[matrizA.length][matrizM[0].length];
        M = new int[matrizA.length][matrizM[0].length];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                for (int k = 0; k < matrizA[0].length; k++) {
                    matrizR[i][j] += (matrizA[i][k] * matrizM[k][j]);
                }
            }
        }
        
        System.out.println("MATRIZ 'R'");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < res1; j++) {
                System.out.print("[" + matrizR[i][j] + "]" + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                M[i][j] = matrizB[i][j] + matrizR[i][j];
            }
        }

        System.out.println("El mensaje encriptado se Guardo en la sigueinte matriz: ");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < res1; j++) {
                System.out.print("[" + M[i][j] + "]" + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("----------------");
    } //listo

    public static void inversa() {
        double determinante, x00, x01, x02, x10, x11, x12, x20, x21, x22;
        double[][] B = new double[3][3];
        matrizI = new double[3][3];

        determinante = (matrizA[0][0] * ((matrizA[1][1] * matrizA[2][2]) - (matrizA[1][2] * matrizA[2][1]))) - (matrizA[0][1] * ((matrizA[1][0] * matrizA[2][2]) - (matrizA[2][0] * matrizA[1][2]))) + (matrizA[0][2] * ((matrizA[1][0] * matrizA[2][1]) - (matrizA[2][0] * matrizA[1][1])));
        System.out.println();
        System.out.println("Determinate:" + determinante);
        System.out.println();
        if (determinante != 0) {
            x00 = ((matrizA[1][1] * matrizA[2][2] - matrizA[2][1] * matrizA[1][2])) / determinante;
            x01 = (-(matrizA[1][0] * matrizA[2][2] - matrizA[2][0] * matrizA[1][2])) / determinante;
            x02 = ((matrizA[1][0] * matrizA[2][1] - matrizA[2][0] * matrizA[1][1])) / determinante;
            x10 = (-(matrizA[0][1] * matrizA[2][2] - matrizA[2][1] * matrizA[0][2])) / determinante;
            x11 = ((matrizA[0][0] * matrizA[2][2] - matrizA[2][0] * matrizA[0][2])) / determinante;
            x12 = (-(matrizA[0][0] * matrizA[2][1] - matrizA[2][0] * matrizA[0][1])) / determinante;
            x20 = ((matrizA[0][1] * matrizA[1][2] - matrizA[1][1] * matrizA[0][2])) / determinante;
            x21 = (-(matrizA[0][0] * matrizA[1][2] - matrizA[1][0] * matrizA[0][2])) / determinante;
            x22 = ((matrizA[0][0] * matrizA[1][1] - matrizA[1][0] * matrizA[0][1])) / determinante;
            matrizI[0][0] = x00;
            matrizI[0][1] = x10;
            matrizI[0][2] = x20;
            matrizI[1][0] = x01;
            matrizI[1][1] = x11;
            matrizI[1][2] = x21;
            matrizI[2][0] = x02;
            matrizI[2][1] = x12;
            matrizI[2][2] = x22;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matrizI[i][j] + "]" + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.print("Erros la matriz no tiene inversa");
        }
        System.out.println("");

    }
    
    public static void menuDes(){
        int a = 0;
        do {
            System.out.println("Menu Desencriptar");
            System.out.println("1. Mensaje cifrado es: ");
            System.out.println("2. Menu principal");

            try {
                op = new Scanner(System.in);
                a = op.nextInt();
            } catch (Exception e) {
                System.out.println("Por favor ingrese un numero");
                System.out.println("");
            }

            switch (a) {
                case 1:
                    System.out.println("");
                    System.out.println("--------------------");
                    des();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("--------------------");
                    menu();
                    break;
            }
        } while (a != 2);
    }

    public static void des(){
        matrizD = new int[matrizA.length][matrizM[0].length];
        N = new int[matrizA.length][matrizM[0].length];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                for (int k = 0; k < matrizA[0].length; k++) {
                    matrizD[i][j] += (matrizI[i][k] * matrizR[k][j]);
                }
            }
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                N[i][j] = matrizD[i][j] - matrizB[i][j];
            }
        }

        System.out.println("El mensaje encriptado se Guardo en la sigueinte matriz: ");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < res1; j++) {
                System.out.print("[" + N[i][j] + "]" + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("----------------");
        
        
        //imprimir matriz identidad
        
        matrizPrueba = new int[matrizA.length][matrizM[0].length];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    matrizPrueba[i][j] += (matrizI[i][k] * matrizA[k][j]);
                }
            }
        }
        
        System.out.println("El mensaje encriptado se Guardo en la sigueinte matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizPrueba[i][j] + "]" + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("----------------");
        
        
        
    }
    
    public static void menuAtaque() {
        int a = 0;
        do {
            System.out.println("Menu de Ataque con Texto plano");
            System.out.println("1. Ingrese Matriz Mensaje original.");
            System.out.println("2. Ingrese Matriz mensaje cifrado");
            System.out.println("3. Obtener clave.");
            System.out.println("4. Menu principal");

            try {
                op = new Scanner(System.in);
                a = op.nextInt();
            } catch (Exception e) {
                System.out.println("Por favor ingrese un numero");
                System.out.println("");
            }

            switch (a) {
                case 1:
                    System.out.println("");
                    System.out.println("--------------------");

                    break;
                case 2:
                    System.out.println("");
                    System.out.println("--------------------");

                    break;
                case 3:
                    System.out.println("");
                    System.out.println("--------------------");

                    break;
                case 4:
                    System.out.println("");
                    System.out.println("--------------------");
                    menu();
                    break;
            }
        } while (a != 5);
    }

    public static void reporte() {

    }
    
    
}
