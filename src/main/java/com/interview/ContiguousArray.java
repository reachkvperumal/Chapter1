package com.interview;

public class ContiguousArray {

    public static void main(String[] args) {
        int[] items = {1,2,3,4};

        for (int i =0; i<items.length;i++){
            for(int j =i; j<items.length;j++){
                for(int k = i; k<= j;k++){
                    System.out.print(items[k]);
                }
                System.out.println();
            }
        }

    }
}
