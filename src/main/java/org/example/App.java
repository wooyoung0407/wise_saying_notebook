package org.example;

import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {    
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        while(true){ //while문으로 무한 반복문
            System.out.println("명언)");
            String command = sc.nextLine().trim(); // 명언)이후 문자열 받기, 공백 지우기 , 명언) 계속 반복

            if(command.equals("종료")){ //문자열은 equals를 써서 같은지 확인 종료시 반복문 종료
                System.out.println("명언앱종료");
                break;
            }else if(command.equals("등록")){
                System.out.println("명언 : ");
                String wise = sc.nextLine().trim(); // 명언받아오는 String
                System.out.println("작가 : ");
                String name = sc.nextLine().trim(); // 작가이름 받아오는 String
                System.out.println("1번 명언이 등록되었습니다.");
            }


        }

    }
}
