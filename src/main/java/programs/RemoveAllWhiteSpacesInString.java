package main.java.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveAllWhiteSpacesInString {

  public static void main(String args[]) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      RemoveAllWhiteSpacesInString removeAllWhiteSpacesInString = new RemoveAllWhiteSpacesInString();
      System.out.println("Please enter the number :");
      String userInput = br.readLine();
      // System.out.println("White spaced removed input :" + removeAllWhiteSpacesInString.usingReplaceAll(userInput));
      System.out.println("White spaced removed input :" + removeAllWhiteSpacesInString.usingForLoop(userInput));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public String usingReplaceAll(String userInput) {
    return userInput.replaceAll("\\s", "");
  }
  
  public String usingForLoop(String userInput) {
    StringBuilder strBuilder = new StringBuilder();
    char[] c = userInput.toCharArray();
    for(int lp1 = 0; lp1 < c.length; lp1++) {
      if(c[lp1] != ' ' && c[lp1] != '\t') {
        strBuilder.append(c[lp1]);
      }
    }
    return strBuilder.toString();
  }
}
