package com.zx;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        File dir = new File("C:\\Users\\asus\\Desktop\\sql\\非白板");
        File[] files = dir.listFiles();
        for (File file : files){
            System.out.println(file.getName());
        }

    }
}



