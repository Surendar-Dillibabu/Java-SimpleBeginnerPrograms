package main.java.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciSeries {

  public static void main(String args[]) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      StringBuilder stringBuilder = new StringBuilder();
      System.out.println("Please enter the user input :");
      Integer userInput = Integer.parseInt(br.readLine());
      Integer firstNumber = 0, secondNumber = 0, temp = 1;
      for (int lp1 = 0; lp1 <= userInput; lp1++) {
        firstNumber = secondNumber;
        secondNumber = temp;
        temp = firstNumber + secondNumber;
        stringBuilder.append(firstNumber).append(" ");
      }
      System.out.println("stringBuilder :" + stringBuilder.toString());
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
