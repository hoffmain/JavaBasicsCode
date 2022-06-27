package com.syntax.Interview;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array={10, 20, 10, 30, 40, 40};
        int[] arr = new int[0];
        System.out.println(Arrays.toString(removeDuplicate(arr)));
    }
    static int[] removeDuplicate(int[] arr){
        int[] newArr=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]!=arr[j]){
                    newArr[i] = arr[i];
                }
            }
        }
        return newArr;
    }
}
