package com.practice;

public class AnagramCheck {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "bcf";

        if(isAnagram(str1, str2)){
            System.out.println("Two strings are anagram");
        }
        else{
            System.out.println("Not an anagram");
        }
    }

    private static boolean isAnagram(String str1, String str2) {

        if(str1.length() != str2.length()) return false;

        int[] charCount = new int[26];

        for(int i=0; i<str1.length(); i++){
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }

        for(int count : charCount){
            if(count != 0) return false;
        }
        return true;
    }
}
