package main.java.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapNumbers {

  public static void main(String args[]) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      SwapNumbers swapNumbers = new SwapNumbers();
      System.out.println("Please provide the first input :");
      Integer n1 = Integer.parseInt(br.readLine());
      System.out.println("Please provide the second input :");
      Integer n2 = Integer.parseInt(br.readLine());
      swapNumbers.swapWithoutTempVariable(n1, n2);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public void swapByTempVariable(Integer n1, Integer n2) {
    Integer temp = n1;
    n1 = n2;
    n2 = temp;
    System.out.println("n1 :" + n1 + " n2 :" + n2);
  }

  public void swapWithoutTempVariable(Integer n1, Integer n2) {
    n1 = n1 + n2;
    n2 = n1 - n2;
    n1 = n1 - n2;
    System.out.println("n1 :" + n1 + " n2 :" + n2);
  }
}
