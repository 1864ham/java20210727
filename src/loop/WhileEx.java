package loop;

import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            do {
                menu();
                int menuChoice = scan.nextInt();
                switch (menuChoice) {
                    case 1:
                        memberRegist();
                        break;
                    case 2:
                    case 3:
                    case 4:
                        break;
                    case 5:
                        System.out.println("프로그램을 종료합니다.");
                    default:
                        System.out.println("메뉴를 확인 바랍니다.");
                        continue;
                }
            }while(true);
        }
    }
    private static void menu() {
        System.out.println("회원관리 프로그램입니다. 메뉴를 선택해주세요.");
        System.out.println("회원관리 프로그램");
        System.out.println("1. 회원 등록");
        System.out.println("2. 회원 조회");
        System.out.println("3. 회원 수정");
        System.out.println("4.회원 탈퇴");
        System.out.println("5. 종료");
    }
    private static void memberRegist() {
        System.out.println("회원관리 프로그램");
        System.out.println("1. 이름");
        System.out.println("2. 전화번호");
        System.out.println("3. 이전 메뉴");
    }
}
