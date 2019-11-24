package main.java.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDuplicateChars {

  public static void main(String args[]) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      System.out.println("Please enter the user input :");
      String userInput = br.readLine();
      String duplicateChars = null;
      for (int lp1 = 0; lp1 < userInput.length(); lp1++) {
        char c = userInput.charAt(lp1);
        int indexLoc = userInput.indexOf(c, (lp1 + 1));
        if (indexLoc != -1) {
          if (duplicateChars == null || !duplicateChars.contains(c + ",")) {
            duplicateChars = (duplicateChars == null ? "" : duplicateChars) + c + ", ";
          }
        }
      }
      if (duplicateChars != null) {
        duplicateChars = duplicateChars.substring(0, (duplicateChars.length() - 2));
      }
      System.out.println("Duplicate characters are :" + duplicateChars);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
