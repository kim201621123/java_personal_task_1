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

        int i = 0;
        int removedCount = 0;
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


            if ((calChar == '/') && (num2 == 0)) {
                System.out.println("나누기 연산 시, 분모(2번째 정수)는 0이 될 수 없습니다. 종료!");
                return;
            }


            switch (calChar) {
                case '+':
                    intMap.put(i, num1 + num2);
                    break;
                case '-':
                    intMap.put(i, num1 - num2);
                    break;
                case '*':
                    intMap.put(i, num1 * num2);
                    break;
                case '/':
                    intMap.put(i, num1 / num2);
                    break;
                default:
                    System.out.println("Invalid calculate char.");
                    i--;
                    break;
            }
            System.out.println("계산결과는 " + num1 + " " + calChar + " " + num2 + " = " + intMap.get(i) + " 입니다.");

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까?(remove) : ");
            if (scRemove.next().equals("remove")) {

//                for (int j = 0; j < i - 1; j++) {
//                    intMap.put(j, intMap.put(j + 1, intMap.get(j + 1)));
//                }
//                removedCount++;
//                intMap.put(i - 1, null);
//                for (int in : intMap.values()) {
//                    System.out.println(in);
//                }
                intMap.remove(0);
            }
            System.out.println("저장된 연산결과를 조회하시겠습니까?(inquiry) : ");
            if (scPrintMap.next().equals("inquiry")) {
                for (int in : intMap.values()) {
                    System.out.println(in);
                }
            }
            System.out.print("더 입력하시겠습니까?(exit) : ");
            i++;
        } while (!scExit.next().equals("exit"));





    }
}
