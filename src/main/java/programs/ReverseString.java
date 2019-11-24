package main.java.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ReverseString {

  public static void main(String args[]) {
    ReverseString resverseString = new ReverseString();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the input to reverse the string :");
    // Scanner next() method will not hold the user input which is given with space.
    // It will hold only the characters before space.
    // nextLine() used to hold the results including spaces and after space
    // characters.
    String userInput = sc.nextLine();
    sc.close();
    // String reverseInput = resverseString.usingForLoop(userInput);
    // String reverseInput = resverseString.usingToCharArray(userInput);
    // String reverseInput = resverseString.usingStringBuilder(userInput);
    // String reverseInput = resverseString.usingToCharArrayAndSwap(userInput);
    // String reverseInput = resverseString.usingList(userInput);
    String reverseInput = resverseString.reverseString(userInput);    
    System.out.println("Reversed string :" + reverseInput);
  }

  public String usingForLoop(String userInput) {
    String reverseInput = "";
    for (int lp1 = (userInput.length() - 1); lp1 >= 0; lp1--) {
      reverseInput += userInput.charAt(lp1);
    }
    return reverseInput;
  }

  public String usingToCharArray(String userInput) {
    char[] arr = userInput.toCharArray();
    String reverseInput = "";
    for (int lp1 = (arr.length - 1); lp1 >= 0; lp1--) {
      reverseInput += String.valueOf(arr[lp1]);
    }
    return reverseInput;
  }

  public String usingStringBuilder(String userInput) {
    StringBuilder stringBuilder = new StringBuilder(userInput);
    return stringBuilder.reverse().toString();
  }

  public String usingToCharArrayAndSwap(String userInput) {
    char[] temparray = userInput.toCharArray();
    int left, right = 0;
    right = temparray.length - 1;

    for (left = 0; left < right; left++, right--) {
      // Swap values of left and right
      char temp = temparray[left];
      temparray[left] = temparray[right];
      temparray[right] = temp;
    }
    return String.valueOf(temparray);
  }

  public String usingList(String userInput) {
    char[] arr = userInput.toCharArray();
    List<Object> l = new ArrayList<>();
    String reverseInput = "";
    for (char c : arr) {
      l.add(c);
    }
    Collections.reverse(l);
    ListIterator<Object> it = l.listIterator();
    while (it.hasNext()) {
      reverseInput += it.next();
    }
    return reverseInput;
  }
  
  public String reverseString(String userInput) {
    if(userInput.length() == 0) {
      return "";
    }
    return userInput.substring(userInput.length() - 1, userInput.length()) + reverseString(userInput.substring(0, userInput.length() - 1));
  }
}
