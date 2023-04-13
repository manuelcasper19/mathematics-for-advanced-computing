package co.edu.itm.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Matrix {
    private Scanner _scanner;
    public Matrix() {
    }

    public Matrix(Scanner scanner){
        _scanner = scanner;
    }


    public List<List<Boolean>> square(int rows, int columns){
        List<List<Boolean>> matrixSquare = new ArrayList<>();
        for (int i = 1; i <= rows; i++){
            List<Boolean> row = new ArrayList<>();
            for (int j = 1; j <= columns; j++){
                System.out.printf("Ingrese valor en la posicion %d, %d %n", i, j);
                boolean value = _scanner.nextBoolean();
                row.add(value);
            }
            matrixSquare.add(row);

        }
        return  matrixSquare;
    }

    public boolean determineSymmetryc(List<List<Boolean>> matrix){
        for (int i = 0; i < matrix.size(); i++){
            int additionRow = 0, additionColumn = 0;
            for (int j = 0; j < matrix.get(i).size(); j++){
                if( j < matrix.get(i).size() ){
                    int valueRow = (matrix.get(i).get(j)) ? 1 : 0;
                    int valueColumn = (matrix.get(j).get(i)) ? 1 : 0;
                    additionRow+=valueRow;
                    additionColumn+=valueColumn;
                }
            }
            if(additionColumn != additionRow){
                return false;
            }
        }
        return true;
    }

    public void print(List<List<Boolean>> matrix) {
        for (int i = 0; i < matrix.size(); i++){
           for (int j = 0; j < matrix.get(i).size(); j++){
               int number = (matrix.get(i).get(j)) ? 1 : 0;
                System.out.print(number + ", ");
           }
            System.out.println();
        }
    }


    public List<Integer> determineDegreeVertex(List<List<Boolean>> matrix){
        List<Integer> degreeVertex = new ArrayList<>();
        for (int i = 0; i < matrix.size(); i++){
            int addition = 0;
            for (int j = 0; j < matrix.get(i).size(); j++){
                int number = (matrix.get(i).get(j)) ? 1 : 0;
                addition+=number;
            }
            degreeVertex.add(addition);
        }
        return degreeVertex;
    }

//    public List<List<Integer>> convertMatrixToInteger(List<List<Boolean>> matrix){
//        List<List<Integer>> matrixInteger = new ArrayList<>();
//        for (int i = 0; i < matrix.size(); i++){
//            List<Integer> dataTemp = new ArrayList<>();
//            for (int j = 0; j < matrix.get(i).size(); j++){
//                int value = (matrix.get(i).get(j)) ? 1 : 0;
//                dataTemp.add(value);
//            }
//            matrixInteger.add(dataTemp);
//        }
//        return matrixInteger;
//    }
}
