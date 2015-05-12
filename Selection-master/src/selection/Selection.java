package selection;


import java.util.Random;
import java.util.Scanner;


public class Selection {

    public static void main(String[] args) {
       
        int n, c, d, swap;
        int i, j, minIndex, tmp;
    int s=0;
    int comp = 0;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Input number of integers to sort");
    n = in.nextInt();
 
    int arr[] = new int[n];
 
    System.out.println("Enter " + n + " integers");
    
      for (c = 0; c < n; c++) {
       int rnd = new Random().nextInt(n);
       arr[c] = rnd;
   }
    for (i = 0; i < n - 1; i++) {
            minIndex = i;
            comp++;
            for (j = i + 1; j < n; j++)
                  if (arr[j] < arr[minIndex])
                        minIndex = j;
            if (minIndex != i) {
                  tmp = arr[i];
                  arr[i] = arr[minIndex];
                  arr[minIndex] = tmp;
                  s++;
            }
      }
     System.out.println("Sorted list of numbers");
    System.out.println("swap =" +s +" comp ="+ comp);
 
    for (c = 0; c < n; c++) 
      System.out.println(arr[c]);
    }
 
   
  }