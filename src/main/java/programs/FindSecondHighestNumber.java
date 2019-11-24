package main.java.programs;

public class FindSecondHighestNumber {

  public static void main(String args[]) {
    FindSecondHighestNumber findSecondHighestNumber = new FindSecondHighestNumber();
    int arr[] = { 14, 46, 47, 94, 94, 52, 86, 36, 94, 89, 92 };
    findSecondHighestNumber.getSortedArr(arr);
    int max = arr[arr.length - 1];
    int secondMax = 0;
    for (int lp1 = (arr.length - 2); lp1 >= 0; lp1--) {
      if (max != arr[lp1]) {
        secondMax = arr[lp1];
        break;
      }
    }
    System.out.println("Second highest number is :" + secondMax);
  }

  public void getSortedArr(int[] numArr) {
    int temp = 0;
    for (int lp1 = 1; lp1 < numArr.length; lp1++) {
      for (int lp2 = (lp1 + 1); lp2 < numArr.length; lp2++) {
        if (numArr[lp1] > numArr[lp2]) {
          temp = numArr[lp1];
          numArr[lp1] = numArr[lp2];
          numArr[lp2] = temp;
        }
      }
    }
  }
}
