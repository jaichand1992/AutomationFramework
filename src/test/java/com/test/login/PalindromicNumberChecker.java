package com.test.login;

public class PalindromicNumberChecker {
    public static void main(String a[]){

        int n=23454321, temp=n, rev=0;

        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(temp==rev)
            System.out.println(temp+" the given number is palindromic");
        else
            System.out.println(temp+" the given is not palindromic");

    }
}
