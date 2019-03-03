package com.Tarasov.main;

public class Palindrom {

    public static boolean isPalindrome(String text) {
        return text.replaceAll("", "").equals(new StringBuilder(text.replaceAll
                ("", "")).reverse().toString());
        // \\W
    }
}