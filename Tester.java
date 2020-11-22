import java.io.*;
import java.util.*;

public class Tester{
  public static void main (String[] args){
    int[] SumTester1 = {1,2,3};
    int[] SumTester2 = {};
    int[] SumTester3 = {4,5,6,7};
    System.out.println(ArrayOps.sum(SumTester1));
    System.out.println(ArrayOps.sum(SumTester2));
    System.out.println(ArrayOps.sum(SumTester3));

    System.out.println();

    System.out.println(ArrayOps.largest(SumTester1));
    System.out.println(ArrayOps.largest(SumTester3));

    System.out.println();

    int[][] sumRowsTester1 = {{1,2,3},{4,5,6}};
    int[][] sumRowsTester2 = {{-3,2,-1}, {6,5,4}, {30,-20,10}};
    System.out.println(Arrays.toString(ArrayOps.sumRows(sumRowsTester1)));
    System.out.println(Arrays.toString(ArrayOps.sumRows(sumRowsTester2)));
  }
}
