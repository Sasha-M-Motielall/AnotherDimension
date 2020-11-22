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
  }
}
