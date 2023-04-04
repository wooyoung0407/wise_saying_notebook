package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    private final Scanner sc;


    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");
        int number = 0;
        ArrayList<WiseSaying> wiseSayings = new ArrayList<>(); //목록 파트 list 작성

        while (true) { //while문으로 무한 반복문
            System.out.println("명언)");
            String command = sc.nextLine().trim(); // 명언)이후 문자열 받기, 공백 지우기 , 명언) 계속 반복
            Rq rq = new Rq(command);

            if (command.equals("종료")) { //문자열은 equals를 써서 같은지 확인 종료시 반복문 종료
                System.out.println("명언앱종료");
                break;
            } else if (command.equals("등록")) {
                System.out.println("명언 : ");
                String wise = sc.nextLine().trim(); // 명언받아오는 String
                System.out.println("작가 : ");
                String name = sc.nextLine().trim(); // 작가이름 받아오는 String
//                System.out.println("1번 명언이 등록되었습니다.");
                int id = ++number;
                System.out.printf("%d번 명언이 등록되었습니다.\n", id);

                WiseSaying wiseSaying = new WiseSaying(number, name, wise); //WiseSaying 매개변수 가져오기

                wiseSayings.add(wiseSaying); // wiseSayings 리스트에 wiseSaying 의 매개변수 넣기
            } else if (command.equals("목록")) {
                System.out.println("명언 수 : " + wiseSayings.size()); // list의 길이및 수 찾기
                System.out.println("번호 / 작가 / 명언");
                System.out.println("=".repeat(30));

                for (int i = wiseSayings.size() - 1; i >= 0; i--) { //for문을 돌려 최신 순으로 목록을 나타낸다.
                    WiseSaying wiseSaying = wiseSayings.get(i);

                    System.out.printf("%d / %s / %s\n", wiseSaying.getNumber(), wiseSaying.getName(), wiseSaying.getWise());
                    // wiseSayings.get(i) , wiseSaying getter 를 각각 넣어 출력해준다.
                }
            } else if (command.equals("삭제")) {
                int id = rq.getIntParam("id", -1);
                if (id == -1) {
                    System.out.println("정수를 입력해주세요.");
                    return;
                }
                WiseSaying wiseSaying = findById(id);

                System.out.printf("%d번 명언이 삭제되었습니다.\n", id);
            }
        }

    }
}

