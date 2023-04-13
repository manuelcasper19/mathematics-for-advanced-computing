package co.edu.itm;

import co.edu.itm.graphs.Matrix;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matrix matrix = new Matrix(scanner);

        System.out.println("Ingrese el número de filas");
        int row = scanner.nextInt();

        System.out.println("Ingrese número de columnas");
        int column = scanner.nextInt();

        var matrixInitial = matrix.square(row, column);
        matrix.print(matrixInitial);

        if( row == column){
            if(matrix.determineSymmetryc(matrixInitial)){
                System.out.println("Es simetrica");
                List<Integer> degreeVertex;
                degreeVertex = matrix.determineDegreeVertex(matrixInitial);
                for (int i = 0; i <degreeVertex.size() ; i++) {
                    System.out.printf("Vertice %d, grado %d%n", i+1, degreeVertex.get(i));
                }
            }else {
                System.out.println("No Es simetrica");
            }
        }

    }

//    public static List<List<Boolean>> createMatrix(Scanner scanner, int rows, int columns){
//        Matrix matrix = new Matrix(scanner);
//        var matrixTemp = matrix.square(rows, columns);
//        matrix.print(matrixTemp);
//        return matrixTemp;
//        //
//    }
//
//    public static void determineSymmetrycMatrix(List<List<Boolean>> matrixTemporal){
//        Matrix matrix = new Matrix();
//        if(matrix.determineSymmetryc(matrixTemporal)){
//            System.out.println("Es simetrica");
//        }else {
//            System.out.println("No Es simetrica");
//        }
//    }
}