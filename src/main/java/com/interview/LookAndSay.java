package com.interview;

public class LookAndSay {

    public static String countAndSay(int n) {

        if(n < 1) return null;
        String result = "1";
        int i = 1;

        while(i < n){
            StringBuilder builder = new StringBuilder();
            int counter = 1;
            for (int j =1 ; j< result.length(); j++){
                char c = result.charAt(j - 1);
                if(result.charAt(j) == c){
                    counter++;
                }else{
                    builder.append(counter).append(c);
                    counter = 1;
                }
            }

            result = builder.append(counter).append(result.charAt(result.length() - 1)).toString();
            i++;
        }

        return result;
    }


    public static void main(String[] args) {
        for (int i=1; i<10; i++)
            System.out.println(countAndSay(i));
        //312211
    }

}
