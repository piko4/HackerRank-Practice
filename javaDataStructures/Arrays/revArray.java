package javaDataStructures.Arrays;

import java.util.Scanner;

public class revArray
{
    private static int[] reverseArray(int[] arr)
    {
        int revarr[]=new int[arr.length];
        int j=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            revarr[j]=arr[i];
            j++;
        }
        return revarr;
    }

    public static void main(String[] args)
    {


        Scanner sc=new Scanner(System.in);
        int arr[]=new int[Integer.parseInt(sc.nextLine())];

        String values[]=sc.nextLine().trim().split("\\s+");
        for (int i = 0; i < values.length; i++) {
            arr[i]=Integer.parseInt(values[i]);
        }
        int revarr[] = reverseArray(arr);
       for(var i:revarr)
           System.out.print(i + " ");

    }


}
