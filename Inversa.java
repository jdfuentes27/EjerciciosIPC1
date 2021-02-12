
package inversa;

import java.util.Scanner;


public class Inversa {

    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        //Declaramos variables
        double determinante,x00,x01,x02,x10,x11,x12,x20,x21,x22;
        // Declaramos nuestra matriz principal
        double [][]B=new double [3][3];
        // Matriz inversa
        double [][]C=new double [3][3];
        // Pedimos valores de la matriz
        System.out.println("Ingrese los valores de la matriz B :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                B[i][j]=entrada.nextByte();
            }
        }
        System.out.println();
        // Mostramos la matriz principal
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("|"+ B[i][j] +"|");
            }
            System.out.println();
        }
        //Hallamos determinante de nuestra matriz principal
        determinante=(B[0][0]*((B[1][1]*B[2][2])-(B[1][2]*B[2][1])))-(B[0][1]*((B[1][0]*B[2][2])-(B[2][0]*B[1][2])))+(B[0][2]*((B[1][0]*B[2][1])-(B[2][0]*B[1][1])));
        System.out.println();
        System.out.println("Determinate:" + determinante);
        System.out.println();
        // Calculamos los valores de la matriz inversa ya dividido entre la determinante
        if(determinante!=0){
            x00=((B[1][1]* B[2][2] - B[2][1]* B[1][2]))/determinante;
            x01=(-(B[1][0]* B[2][2] - B[2][0]* B[1][2]))/determinante;
            x02=((B[1][0]* B[2][1] - B[2][0]* B[1][1]))/determinante;
            x10=(-(B[0][1]* B[2][2] - B[2][1]* B[0][2]))/determinante;
            x11=((B[0][0]* B[2][2] - B[2][0]* B[0][2]))/determinante;
            x12=(-(B[0][0]* B[2][1] - B[2][0]* B[0][1]))/determinante;
            x20=((B[0][1]* B[1][2] - B[1][1]* B[0][2]))/determinante;
            x21=(-(B[0][0]* B[1][2] - B[1][0]* B[0][2]))/determinante;
            x22=((B[0][0]* B[1][1] - B[1][0]* B[0][1] ))/determinante;
            // Hacemos el intercambio de que las filas pasen como columnas
            C[0][0]=x00;
            C[0][1]=x10;
            C[0][2]=x20;
            C[1][0]=x01;
            C[1][1]=x11;
            C[1][2]=x21;
            C[2][0]=x02;
            C[2][1]=x12;
            C[2][2]=x22;
            // Mostramos la matriz inversa
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print("|"+ C[i][j] +"|");
                }
                System.out.println();
            } 
        }
        else{
            System.out.print("Erros la matriz no tiene inversa");
        }
        
    }
}


