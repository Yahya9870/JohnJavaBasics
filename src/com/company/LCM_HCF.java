package com.company;

public class LCM_HCF {
    public static void main(String[] args) {
        int num1=18;
        int num2=36;

        // Variables to store the initial values of num1 and num2.

        int a = num1;
        int b = num2;

        // Find GCD/HCF using Euclidean algorithm.

        while(b!=0){         // 1. true  2. true  3. false (loop terminates)
            int temp = b;    // 1. temp =36  2. temp = 18
            b= a%b;          // 1. b= 18, b =0

            a=temp;          // a = 36, a= 18


        }



        int hcf =a;

        // Calculate LCM using a general formula

        // LCM X HCF = num1 X num2

        // LCM = (num1Xnum2)/HCF

        int lcm = (num1*num2)/hcf;

        System.out.println("LCM of "+num1+" and "+num2+" is: "+lcm);
        System.out.println("HCF of "+num1+" and "+num2+" is: "+hcf);



    }
}
