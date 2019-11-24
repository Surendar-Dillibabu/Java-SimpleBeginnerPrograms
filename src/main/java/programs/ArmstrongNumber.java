package main.java.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumber {

  public static void main(String args[]) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      System.out.println("Please enter the number :");
      String originalNum = br.readLine();
      Integer num = Integer.parseInt(originalNum);
      Double armstrongNumber = 0.0;
      for (int lp1 = 0; lp1 < originalNum.length(); lp1++) {
        int lastDigit = num % 10;
        armstrongNumber += Math.pow(lastDigit, originalNum.length());
        num = num / 10;
      }
      if (Integer.parseInt(originalNum) == armstrongNumber) {
        System.out.println("The given number is armstrong number");
      } else {
        System.out.println("The given number is not an armstrong number");
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
