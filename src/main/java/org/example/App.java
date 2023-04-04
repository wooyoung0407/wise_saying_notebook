package org.example;

import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {    
        this.sc = sc;
    }

    public void run() {
        System.out.println("명언)");
        String command = sc.nextLine().trim(); // 명언)이후 문자열 받기, 공백 지우기

    }
}
