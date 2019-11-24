package main.java.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PrimeBetweenTwoNumbers {

  public static void main(String args[]) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      PrimeBetweenTwoNumbers numberIsPrime = new PrimeBetweenTwoNumbers();
      System.out.println("Enter the first number :");
      Integer numberOne = Integer.parseInt(br.readLine());
      System.out.println("Enter the second number :");
      Integer numberTwo = Integer.parseInt(br.readLine());
      List<Integer> list = numberIsPrime.getPrimeBetweenTwoNumbers(numberOne, numberTwo);
      System.out.println("List of prime numbers :" + list);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public List<Integer> getPrimeBetweenTwoNumbers(Integer numberOne, Integer numberTwo) {
    List<Integer> list = new ArrayList<>();
    for (int lp1 = numberOne + 1; lp1 < numberTwo - 1; lp1++) {
      if (isPrimeNumber(lp1)) {
        list.add(lp1);
      }
    }
    return list;
  }

  public static boolean isPrimeNumber(Integer input) {
    boolean primeFlag = true;
    for (int lp1 = 2; lp1 < input - 1; lp1++) {
      if (input % lp1 == 0) {
        primeFlag = false;
        break;
      }
    }
    return primeFlag;
  }
}
