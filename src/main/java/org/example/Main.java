package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //input 태그

        new App(sc).run(); //App 클래스에 Scanner 변수를 넣어 run시키겠다.

        sc.close(); //Scanner 닫기
    }
}
