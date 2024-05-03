package calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class App extends Exception {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scExit = new Scanner(System.in);
        Scanner scRemove = new Scanner(System.in);
        Scanner scPrintMap = new Scanner(System.in);

        //결과 저장
        Map<Integer, Integer> intMap = new HashMap<>();

        //calculator 객체 선언
        Calculator intCalculator = new Calculator();

        do {
            System.out.println("--------------------------------");
            int result = 0;

            int num1 = 0;
            int num2 = 0;
            char calChar = '+';

            System.out.print("처음 숫자 :");
            try {
                num1 = sc.nextInt();
            } catch (Exception e) {
                System.out.println("e.getMessage() = " + e.getMessage());
                continue;
            }
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            System.out.print("두번째 숫자 : ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            try {
                num2 = sc.nextInt();
            } catch (Exception e) {
                System.out.println("e.getMessage() = " + e.getMessage());
                continue;
            }

            System.out.print("사칙연산 기호를 입력하세요 :");
            // 스트링을 입력받되 맨 처음 인덱스의 char를 가져옴

            try {
                calChar = sc.next().charAt(0);
            } catch (Exception e) {
                System.out.println("e.getMessage() = " + e.getMessage());
                continue;
            }

            // intCalculator 객체의 calculate 메서드 호출
            intCalculator.calculate(num1, num2, calChar);

            // 연산 삭제 메소드
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력시 삭제) : ");
            if (Objects.equals(sc.next(), "remove")) {
                intCalculator.removeResult();
            }
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력시 조회) : ");
            if (Objects.equals(sc.next(), "inquiry")) {
                intCalculator.inquiryResults();
            }
            System.out.print("더 입력하시겠습니까?(exit) : ");
        } while (!scExit.next().equals("exit"));

    }
}
