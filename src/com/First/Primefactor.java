package com.First;

public class Primefactor {
    public static void Prime(int N){
        if(N>=2 && N<=100){ // range
            for(int i =1;i<=N;i++){

                if(N%i==0){
                    System.out.print(i+" ");
                }
            }
        }
        else {
            System.out.print("invalid number");

        }
    }
    public static void main(String[] args){

        Prime( 12 );
    }
}

