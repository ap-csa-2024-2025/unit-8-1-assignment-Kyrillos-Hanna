import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[][] multTable = productTable(13, 13);
    System.out.println(sumOfDiag(multTable));
    System.out.println();
    for (int i = 0; i < multTable.length; i++) {
      System.out.print("|");
      for (int k = 0; k < multTable[0].length; k++) {
        if (multTable[i][k] < 10) {
          System.out.print(multTable[i][k] + "   |");
        } else if (multTable[i][k] < 100) {
          System.out.print(multTable[i][k] + "  |");
        } else {
          System.out.print(multTable[i][k] + " |");
        }
      }
      System.out.println();
    }

  }


  public static int sumOfDiag(int[][] matrix)
  {
    int tableLength;
    int sum = 0;
    if (matrix[0].length < matrix.length) {
      tableLength = matrix[0].length;
    } else {
      tableLength = matrix.length;
    }

    for (int i = 0; i < tableLength; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }

  public static int[][] productTable(final int numRows, final int numCols)
  {
    int[][] table = new int[numRows][numCols];

    for (int i = 0; i < numRows; i++) {
      for (int k = 0; k < numCols; k++) {
        table[i][k] = i * k;
      }
    }
    return table;
  }
}
