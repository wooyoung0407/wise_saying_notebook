package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");
        int number = 0;
        ArrayList<WiseSaying> wiseSayings = new ArrayList<>();

        while (true) {
            System.out.println("명령)");
            String command = sc.nextLine().trim();
            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {

                System.out.println("명언 : ");
                String wise = sc.nextLine().trim();
                System.out.println("작가 : ");
                String name = sc.nextLine().trim();

                int id = ++number;
                System.out.printf("%d번 명언이 등록되었습니다.\n", id);

                WiseSaying wiseSaying = new WiseSaying(number, name, wise);

                wiseSayings.add(wiseSaying);
            } else if (command.equals("목록")) {
                System.out.println("명언 수 :" + wiseSayings.size());
                System.out.println("번호 / 작가 / 명언\n");

                for (int i = wiseSayings.size() - 1; i >= 0; i--) {
                    WiseSaying wiseSaying = wiseSayings.get(i);

                    System.out.printf("%d / %s / %s \n", wiseSaying.getNumber(),wiseSaying.getName(),wiseSaying.getWise());
                }
            }
        }
    }
}
