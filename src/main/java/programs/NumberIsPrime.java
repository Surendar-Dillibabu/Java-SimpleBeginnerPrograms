package main.java.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberIsPrime {

  public static void main(String args[]) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      NumberIsPrime numberIsPrime = new NumberIsPrime();
      System.out.println("Enter the input :");
      Integer input = Integer.parseInt(br.readLine());
      boolean primeFlag = numberIsPrime.isPrimeNumber(input);
      System.out.println("The input is prime :" + (primeFlag ? "Yes" : "No"));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public boolean isPrimeNumber(Integer input) {
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
