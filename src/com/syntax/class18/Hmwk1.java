package com.syntax.class18;

public class Hmwk1 {
    /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
     */

    int arrSum(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Hmwk1 sumArr=new Hmwk1();

        int[] arr={7, 11, 9};
        System.out.println(sumArr.arrSum(arr));
    }

}
