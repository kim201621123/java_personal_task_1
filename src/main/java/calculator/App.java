package calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

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

            System.out.print("처음 숫자 :");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num1 = sc.nextInt();
            System.out.print("두번째 숫자 : ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 :");
            // 스트링을 입력받되 맨 처음 인덱스의 char를 가져옴
            char calChar = sc.next().charAt(0);

//            intCalculator 객체의 calculate 메서드 호출
            intCalculator.calculate(num1, num2, calChar);

        }while (!scExit.next().equals("exit"));

    }
}
