package org.example;

/** Lab9 */
public class Lab9 {

  public int linearSearch(int[] arr, int goal) {

    int index = 0;
    int indexGoal = -1;

    for (int i : arr) {
      if (i == goal) {
        indexGoal = index;
        break;
      }
      index++;
    }

    return indexGoal;
  }

  public int findIndexLargest(int[] arr, boolean flag) {

    int indexLargest = 0;
    int largestNum = arr[0];
    if (flag) {
      for (int i = 0; i < arr.length; i++) {

        if (arr[i] == largestNum) {
          continue;
        } else if (arr[i] > largestNum) {
          largestNum = arr[i];
          indexLargest = i;
        }
      }
    } else {
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] >= largestNum) {
          largestNum = arr[j];
          indexLargest = j;
        }
      }
    }
    return indexLargest;
  }

  public int findIndexSmallest(int[] arr, boolean flag) {

    int indexSmallest = 0;
    int smallestNum = arr[0];

    if (flag) {
      for (int i = 0; i < arr.length; i++) {

        if (arr[i] == smallestNum) {
          continue;
        } else if (arr[i] < smallestNum) {
          smallestNum = arr[i];
          indexSmallest = i;
        }
      }
    } else {
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] <= smallestNum) {
          smallestNum = arr[j];
          indexSmallest = j;
        }
      }
    }
    return indexSmallest;
  }

  public int findSmallest(int[] arr) {

    int smallestNum = arr[0];

    for (int i = 0; i < arr.length; i++) {

      if (smallestNum > arr[i]) {

        smallestNum = arr[i];
      }
    }
    return smallestNum;
  }

  public String printInformation(Person[] students) {

    String result = "";

    for (Person person : students) {

      if (person.getGrade().equals("G") || person.getGrade().equals("VG")) {

        result += "Last name: " + person.getLastName() + ", points: " + person.getPoints();
      }
    }
    return result;
  }

  public float averageAirTemp(float[] temps) {

    float sum = 0;
    float small = 0;
    float large = 0;

    for (int i = 0; i < temps.length; i++) {

      if (small > temps[i]) {
        small = temps[i];
      } else if (large < temps[i]) {
        large = temps[i];
      }

      sum += temps[i];
    }
    return (float) (sum / temps.length);
  }

  public int[] sortData(int[] array) {

    int temp = 0;
    int indexOfZero = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] > 0) {
        continue;
      }
    }

    return array;
  }

  public int[][] compareEntries(int[][] first, int[][] second) {

    if ((first.length != second.length) || ((first[0].length != second[0].length))) {
      System.out.println("Wrong dimensions");
      int[][] bad = {{-1}};
      return bad;
    }

    int[][] answer = new int[first.length][first[0].length];

    for (int i = 0; i < first.length; i++) {
      for (int j = 0; j < first[0].length; j++) {

        if (first[i][j] > second[i][j]) {
          answer[i][j] = first[i][j];
        } else {
          answer[i][j] = second[i][j];
        }
      }
    }
    return answer;
  }

  public int[][] bushDensity(int[][] array) {

    int[][] answer = new int[array.length][array[0].length];

    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array[0].length - 1; j++) {

        int sum = 0;
        for (int k = -1; k < 2; k++) {
          for (int o = -1; o < 2; o++) {
            if (i + k < 0) {
              sum += 0;
            } else if (j + o < 0) {
              sum += 0;
            } else {
              sum += array[i + k][j + o];
            }
          }
        }
        answer[i][j] = sum;
      }
    }

    return answer;
  }
}
