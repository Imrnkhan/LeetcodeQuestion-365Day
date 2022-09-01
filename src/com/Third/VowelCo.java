package com.Third;

public class VowelCo {
    public static void main(String[] args) {
        char ch = '1';

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println(" is Vowel");
        }
        else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println(" is Consonant");
        else
            System.out.println("Invalid char");
    }
}