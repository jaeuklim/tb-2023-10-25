package com.ll;

import java.util.Scanner;

public class App {
    void run() {
        System.out.println("== 명언 앱 ==");

        while(true) {
            System.out.print("명령) ");

            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine();

            if(cmd .equals("종료"))
                break;

            System.out.printf("입력하신 명령 : %s\n", cmd);
            // 위 라인은 아래 라인과 같은 뜻
            // System.out.print("입력하신 명령 : " + cmd + "\n");
        }


    }
}
