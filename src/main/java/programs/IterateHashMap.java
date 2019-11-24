package main.java.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashMap {

  public static void main(String args[]) {
    IterateHashMap iteratrHashMap = new IterateHashMap();
    Map<String, Integer> wordsMap = new HashMap<>();
    wordsMap.put("Saket", 2);
    wordsMap.put("by", 1);
    wordsMap.put("this", 1);
    wordsMap.put("This", 1);
    wordsMap.put("is", 2);
    wordsMap.put("done", 1);
    // iteratrHashMap.iteateByWhile(wordsMap);
    // iteratrHashMap.iteateByEnhancedForLoop(wordsMap);
    // iteratrHashMap.iterateByKeySet(wordsMap);
    iteratrHashMap.iterateUsingJava8(wordsMap);
  }

  public void iteateByWhile(Map<String, Integer> wordsMap) {
    if (wordsMap != null && !wordsMap.isEmpty()) {
      Iterator<Entry<String, Integer>> it = wordsMap.entrySet().iterator();
      while (it.hasNext()) {
        Map.Entry<String, Integer> entry = it.next();
        System.out.println("Key :" + entry.getKey() + ", Value :" + entry.getValue());
      }
    }
  }

  public void iteateByEnhancedForLoop(Map<String, Integer> wordsMap) {
    if (wordsMap != null && !wordsMap.isEmpty()) {
      for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
        System.out.println("Key :" + entry.getKey() + ", Value :" + entry.getValue());
      }
    }
  }

  public void iterateByKeySet(Map<String, Integer> wordsMap) {
    if (wordsMap != null && !wordsMap.isEmpty()) {
      for (String key : wordsMap.keySet()) {
        System.out.println("Key :" + key + ", Value :" + wordsMap.get(key));
      }
    }
  }

  public void iterateUsingJava8(Map<String, Integer> wordsMap) {
    wordsMap.forEach((key, value) -> {
      System.out.println("Key :" + key + ", Value :" + value);
    });
  }
}
