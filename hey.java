import java.io.*;
import java.util.*;
import java.util.Scanner;
class hey{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String rev= sc.nextLine();
         String[] arr =rev.split(" ");
         String need="";
    // for (int i = 0; i < arr.length; i++) {
    //      for (int j = 0; j < arr[i].length(); j++) {
    //          char c =arr[i].charAt(j);
    //            need=c+need;
    //      }
    //      System.out.print(need +" ");
    //      need="";
    // }
    for (int i = 0; i < arr.length; i++) {
          StringBuilder k = new StringBuilder(arr[i]);
            String val = new String(k.reverse());
            System.out.print( val +" ");
    }
    }
}