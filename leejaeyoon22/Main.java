package com.ll;

public class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();
        a전사.이름 = "카니";
        a전사.나이 = 22;
        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 22살 전사 카니(이)가 칼(으)로 공격합니다.

        a전사.이름 = "초코";
        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 22살 전사 초코(이)가 활(으)로 공격합니다.
    }
}
class 전사 {
    String 이름;
    int 나이;
    무기 a무기;

    void 공격() {
        a무기.공격실행(이름, 나이);
    }
}

class 무기 {
    String 무기명;
    void 공격실행(String name, int age) {
        System.out.println(age + "살 전사 " + name + "(이)가 " + 무기명 + "(으)로 공격합니다.");
    }
}

class 칼 extends 무기 {
    칼() {
        무기명 = "칼";
    }
}

class 활 extends 무기 {
    활() {
        무기명 = "활";
    }
}

//package com.ll;
//
//import java.util.HashMap;
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        App app = new App();
//        app.start();
//    }
//}
//
//class App {
//    void start() {
//        Movement mov = new Movement();
//
//        System.out.println("== 명언 앱 ==");
//        System.out.print("명령) ");
//        Scanner sc = new Scanner(System.in);
//        String ask = sc.next();
//
//        if(ask.equals("종료")) {
//            // break;
//        }
//        else if(ask.equals("등록")) {
//            mov.mov();
//        }
//    }
//}
//
//class Movement {
//    int cnt;
//    int re = 0;
//
//    Map<Integer, Saying> sayingMap = new HashMap<Integer, Saying>();
//    Saying sayingM = new Saying();
//
//    void mov() {
//        while(re==0) {
//            System.out.print("명언 : ");
//            Scanner sc2 = new Scanner(System.in);
//            String saying = sc2.next();
//            sayingM.saying = saying;
//
//            System.out.print("작가 : ");
//            String author = sc2.next();
//            sayingM.author = author;
//
//            cnt++;
//            sayingM.num = cnt;
//            sayingMap.put(cnt,  );
//
//            System.out.println(cnt + "번 명언이 등록되었습니다.");
//
//            System.out.print("명령) ");
//            String answer = sc2.next();
//
//            if(answer.equals("종료")) re = 1;
//            else if(answer.equals("목록")) {
//                System.out.println("번호 / 작가 / 명언");
//                System.out.println("----------------------");
//                for(int i=1; i<cnt+1; i++) {
//                    System.out.println(sayingMap.get(i));
//                }
//                System.out.print("명령) ");
//                Scanner sc5 = new Scanner(System.in);
//                String answer2 = sc4.next();
//                if(answer2.equals("종료")) re = 1;
//            }
//        }
//
//    }
//}
//
//class Saying {
//    String saying;
//    String author;
//    int num;
//
//    void setData() {
//
//    }
//}