package main.java.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IterateArrayList {

  public static void main(String args[]) {
    IterateArrayList iterateArrayList = new IterateArrayList();
    List<String> list = new ArrayList<>();
    list.add("Deepan");
    list.add("Surendar");
    list.add("Harini");
    list.add("Praveena");
    list.add("Sahana");
    // iterateArrayList.usingListIterator(list);
    // iterateArrayList.usingForLoop(list);
    // iterateArrayList.usingForEachLoop(list);
    iterateArrayList.usingJava8ForEach(list);
  }

  public void usingListIterator(List<String> list) {
    System.out.println("Iterate list using ListIterator");
    if (list != null && !list.isEmpty()) {
      ListIterator<String> listIter = list.listIterator();
      while (listIter.hasNext()) {
        final String name = listIter.next();
        System.out.println("Name :" + name);
      }
    }
  }

  public void usingForLoop(List<String> list) {
    System.out.println("Iterate list using for loop");
    if (list != null && !list.isEmpty()) {
      for (int lp1 = 0; lp1 < list.size(); lp1++) {
        final String name = list.get(lp1);
        System.out.println("Name :" + name);
      }
    }
  }

  public void usingForEachLoop(List<String> list) {
    System.out.println("Iterate list using for-each loop");
    if (list != null && !list.isEmpty()) {
      for (String name : list) {
        System.out.println("Name :" + name);
      }
    }
  }

  public void usingJava8ForEach(List<String> list) {
    System.out.println("Iterate list using Java8 forEach loop");
    if (list != null && !list.isEmpty()) {
      list.forEach(name -> {
        System.out.println("Name :" + name);
      });
    }
  }
}
