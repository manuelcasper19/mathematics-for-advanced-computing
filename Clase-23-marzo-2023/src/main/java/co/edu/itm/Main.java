package co.edu.itm;

import co.edu.itm.graphs.Matrix;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de filas");
        int row = scanner.nextInt();

        System.out.println("Ingrese número de columnas");
        int column = scanner.nextInt();

        var matrixTemp = createMatrix(scanner, row, column);
        if( row == column){
            determineSymmetrycMatrix(matrixTemp);
        }

    }

    public static List<List<Boolean>> createMatrix(Scanner scanner, int rows, int columns){
        Matrix matrix = new Matrix(scanner);
        var matrixTemp = matrix.square(rows, columns);
        matrix.print(matrixTemp);
        return matrixTemp;
        //
    }

    public static void determineSymmetrycMatrix(List<List<Boolean>> matrixTemporal){
        Matrix matrix = new Matrix();
        if(matrix.determineSymmetryc(matrixTemporal)){
            System.out.println("Es simetrica");
        }else {
            System.out.println("No Es simetrica");
        }
    }
}