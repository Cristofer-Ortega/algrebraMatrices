 import java.util.Arrays;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        System.out.println("A) Verificar si 2 matrices son iguales o no ");
        System.out.println("B) Sumar 2 matrices");
        System.out.println("C) Generar una matriz 0 de n x m ");
        System.out.println("D) Restar 2 matrices ");
        System.out.println("E) Obtener el inverso aditivo de una matriz de n x m");
        System.out.println("F) Multiplicar un escalar por una matriz de n x m ");
        System.out.println("G) Multiplicar 2 matrices compatibles ");
        System.out.println("H) Obtener una matriz identidad de tamaño n ");
        System.out.println("I) Obtener la inversa de una matriz de tamaño n ");
        System.out.println("J) Obtener el determinante de una matriz de tamaño n ");
        char opc = lector.next().charAt(0);
        switch (opc) {
            case 'a':
            case 'A':
            System.out.println("MATRIZ NUMERO 1");
            System.out.print("Cantidad de filas: ");
            int cantFilas = lector.nextInt();
            System.out.print("Cantidad de columnas: ");
            int cantColumnas = lector.nextInt();
            int[][] MatrizA = new int[cantFilas][cantColumnas];
            System.out.println("Ingrese los valores de la matriz numero 1");
            for (int i = 0; i < MatrizA.length ; i++) {
                for (int  j = 0; j < MatrizA[i].length; j++) {
                    System.out.println("Matriz 1["+i+ "," +j+ "]=");
                    MatrizA[i][j] = lector.nextInt();
                }
            }
            System.out.println("MATRIZ NUMERO 2");
            System.out.print("Cantidad de filas: ");
            int cantFilas1 = lector.nextInt();
            System.out.print("Cantidad de columnas: ");
            int cantColumnas1 = lector.nextInt();

            int[][] MatrizB = new int[cantFilas1][cantColumnas1];
            System.out.println("Ingrese los valores de la matriz numero 2");
            for (int i = 0; i < MatrizB.length ; i++) {
                for (int  j = 0; j < MatrizB[i].length; j++) {
                    System.out.println("Matriz 2["+i+ "," +j+ "]=");
                    MatrizB[i][j] = lector.nextInt();
                }
            }

            System.out.println("Matriz numero 1");
            for (int i = 0; i < MatrizA.length; i++) {
                for (int j = 0; j < MatrizA[i].length; j++) {
                    System.out.print( +MatrizA[i][j]  + "\t" );
                }
               System.out.println(); 
            }
            
            System.out.println("Matriz numero 2");
            for (int i = 0; i < MatrizB.length; i++) {
                for (int j = 0; j < MatrizB[i].length; j++) {
                    System.out.print(MatrizB[i][j]  + "\t");
                }
               System.out.println(); 
            }
            if (Arrays.deepEquals(MatrizA, MatrizB)){
                System.out.println("son iguales");     
             }else{
                System.out.println("no son iguales");
             }
           
                break;
            
            case 'b':
            case 'B':
            System.out.println("SUMA DE MATRICES");
            System.out.println("MATRIZ NUMERO 1");
            System.out.print("Cantidad de filas: ");
            int cantFilas2 = lector.nextInt();
            System.out.print("Cantidad de columnas: ");
            int cantColumnas2 = lector.nextInt();
            int[][] MatrizAb = new int[cantFilas2][cantColumnas2];
            System.out.println("Ingrese los valores de la matriz numero 1");
            for (int i = 0; i < MatrizAb.length ; i++) {
                for (int  j = 0; j < MatrizAb[i].length; j++) {
                    System.out.println("Matriz 1["+i+ "," +j+ "]=");
                    MatrizAb[i][j] = lector.nextInt();
                }
            }
            System.out.println("MATRIZ NUMERO 2");
            System.out.print("Cantidad de filas: ");
            int cantFilas21 = lector.nextInt();
            System.out.print("Cantidad de columnas: ");
            int cantColumnas21 = lector.nextInt();

            int[][] MatrizBb = new int[cantFilas21][cantColumnas21];
            System.out.println("Ingrese los valores de la matriz numero 2");
            for (int i = 0; i < MatrizBb.length ; i++) {
                for (int  j = 0; j < MatrizBb[i].length; j++) {
                    System.out.println("Matriz 2["+i+ "," +j+ "]=");
                    MatrizBb[i][j] = lector.nextInt();
                }
            }

            System.out.println("Matriz numero 1");
            for (int i = 0; i < MatrizAb.length; i++) {
                for (int j = 0; j < MatrizAb[i].length; j++) {
                    System.out.print(MatrizAb[i][j]  + "\t");
                }
               System.out.println(); 
            }
            
            System.out.println("Matriz numero 2");
            for (int i = 0; i < MatrizBb.length; i++) {
                for (int j = 0; j < MatrizBb[i].length; j++) {
                    System.out.print(MatrizBb[i][j]  + "\t");
                }
               System.out.println(); 
            }
            
                
                int[][] sumaMatriz = new int[cantFilas21][cantColumnas21];
                for (int i = 0; i < MatrizAb.length; i++) {
                    for ( int j = 0; j < MatrizAb[i].length; j++) {
                    sumaMatriz[i][j] = MatrizAb[i][j] + MatrizBb[i][j];
                        
                    }
                }
                System.out.println("Suma matriz");
            for (int i = 0; i < sumaMatriz.length; i++) {
                for (int j = 0; j < sumaMatriz[i].length; j++) {
                    System.out.print(sumaMatriz[i][j]  + "\t");
                }
               System.out.println(); 
            }
                   
             
            
             
                
                break;

            case 'c':
            case 'C':
             System.out.println("MATRIZ MxN");
            System.out.print("Cantidad de filas: ");
            int cantFilas3 = lector.nextInt();
            System.out.print("Cantidad de columnas: ");
            int cantColumnas3 = lector.nextInt();
            int[][] Matriznm = new int[cantFilas3][cantColumnas3];

            
            for (int i = 0; i < Matriznm.length; i++) {
                for (int j = 0; j < Matriznm[i].length; j++) {
                    System.out.print( +Matriznm[i][j]  + "\t" );
                }
               System.out.println(); 
            }
                
                break;

            case 'd':
            case 'D':
            System.out.println("RESTA DE MATRICES");
            System.out.println("MATRIZ NUMERO 1");
            System.out.print("Cantidad de filas: ");
            int cantFilas41 = lector.nextInt();
            System.out.print("Cantidad de columnas: ");
            int cantColumnas41 = lector.nextInt();
            int[][] MatrizAd = new int[cantFilas41][cantColumnas41];
            System.out.println("Ingrese los valores de la matriz numero 1");
            for (int i = 0; i < MatrizAd.length ; i++) {
                for (int  j = 0; j < MatrizAd[i].length; j++) {
                    System.out.println("Matriz 1["+i+ "," +j+ "]=");
                    MatrizAd[i][j] = lector.nextInt();
                }
            }
            System.out.println("MATRIZ NUMERO 2");
            System.out.print("Cantidad de filas: ");
            int cantFilas42 = lector.nextInt();
            System.out.print("Cantidad de columnas: ");
            int cantColumnas42 = lector.nextInt();

            int[][] MatrizBd = new int[cantFilas42][cantColumnas42];
            System.out.println("Ingrese los valores de la matriz numero 2");
            for (int i = 0; i < MatrizBd.length ; i++) {
                for (int  j = 0; j < MatrizBd[i].length; j++) {
                    System.out.println("Matriz 2["+i+ "," +j+ "]=");
                    MatrizBd[i][j] = lector.nextInt();
                }
            }

            System.out.println("Matriz numero 1");
            for (int i = 0; i < MatrizAd.length; i++) {
                for (int j = 0; j < MatrizAd[i].length; j++) {
                    System.out.print(MatrizAd[i][j]  + "\t");
                }
               System.out.println(); 
            }
            
            System.out.println("Matriz numero 2");
            for (int i = 0; i < MatrizBd.length; i++) {
                for (int j = 0; j < MatrizBd[i].length; j++) {
                    System.out.print(MatrizBd[i][j]  + "\t");
                }
               System.out.println(); 
            }
            
                
                int[][] restaMatriz = new int[cantFilas41][cantColumnas41];
                for (int i = 0; i < MatrizAd.length; i++) {
                    for ( int j = 0; j < MatrizAd[i].length; j++) {
                    restaMatriz[i][j] = MatrizAd[i][j] - MatrizBd[i][j];
                        
                    }
                }
                System.out.println("Resta matriz");
            for (int i = 0; i < restaMatriz.length; i++) {
                for (int j = 0; j < restaMatriz[i].length; j++) {
                    System.out.print(restaMatriz[i][j]  + "\t");
                }
               System.out.println(); 
            }


                
                break;

            case 'e':
            case 'E':
            System.out.println("MATRIZ aditiva");
            System.out.print("Cantidad de filas: ");
            int cantFilas51 = lector.nextInt();
            System.out.print("Cantidad de columnas: ");
            int cantColumnas51 = lector.nextInt();
            int[][] MatrizAe = new int[cantFilas51][cantColumnas51];
            System.out.println("Ingrese los valores de la matriz aditiva");
            for (int i = 0; i < MatrizAe.length ; i++) {
                for (int  j = 0; j < MatrizAe[i].length; j++) {
                    System.out.println("Matriz 1["+(i+1)+ "," +(j+1)+ "]=");
                    MatrizAe[i][j] = lector.nextInt();
                }
            }
                 System.out.println("Matriz inversa aditiva");
            for (int i = 0; i < MatrizAe.length; i++) {
                for (int j = 0; j < MatrizAe[i].length; j++) {
                    System.out.print( (MatrizAe[i][j] * -1) + "\t" );
                }
               System.out.println(); 
            }
                break;

            case 'f':
            case 'F':
                
                break;

            case 'g':
            case 'G':
                
                break;

            case 'h':
            case 'H':
                
                break;

            case 'i':
            case 'I':
                
                break;

            case 'j':
            case 'J':
                
                break;
        
            
                
        }
    }
}
