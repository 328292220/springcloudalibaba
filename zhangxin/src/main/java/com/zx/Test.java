package com.zx;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int i, n = 10;
 int[] a = new int[n];for (i = 0; i < n; i++) {
 try {
 BufferedReader br = new BufferedReader(
                         new InputStreamReader(System.in));
 a[i] = Integer.parseInt(br.readLine( ));
 } catch (IOException e) {
 }
 }
 for (i=n-1; i >= 0; i--)
  System.out.println(a[i] + " ");
 }
    }



