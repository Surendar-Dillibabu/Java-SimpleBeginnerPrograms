package main.java.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeExample {

  public static void main(String args[]) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      PalindromeExample palindromeExample = new PalindromeExample();
      System.out.println("Enter the input :");
      String input = br.readLine();
      boolean palidromeFlag = palindromeExample.isInputIsPalindrome(input);
      System.out.println("Given input is palidrome :" + (palidromeFlag ? "Yes" : "No"));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public boolean isInputIsPalindrome(String input) {
    boolean palindromeFlag = false;
    String reverseInput = "";
    for (int lp1 = (input.length() - 1); lp1 >= 0; lp1--) {
      reverseInput += input.charAt(lp1);
    }
    if (input.equalsIgnoreCase(reverseInput)) {
      palindromeFlag = true;
    }
    return palindromeFlag;
  }
}
