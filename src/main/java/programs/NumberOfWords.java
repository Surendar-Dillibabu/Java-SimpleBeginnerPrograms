package main.java.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NumberOfWords {

  public static void main(String args[]) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      NumberOfWords numberOfWords = new NumberOfWords();
      System.out.println("Enter the input :");
      String input = br.readLine();
      numberOfWords.usingHashMap(input);
    }catch(IOException ex) {
      ex.printStackTrace();
    }
  }
  
  public void usingHashMap(String input) {
    Map<String, Integer> wordsMap = new HashMap<>();
    String[] inputArr = input.split(" ");
    for(int lp1 = 0; lp1 <= inputArr.length - 1; lp1++) {
      if(wordsMap.containsKey(inputArr[lp1])) {
        int count = wordsMap.get(inputArr[lp1]);
        wordsMap.put(inputArr[lp1], count+1);
      } else {
        wordsMap.put(inputArr[lp1], 1);
      }
    }
    System.out.println("Result :"+wordsMap);
  }
}
