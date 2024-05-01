package calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {
    Scanner scExit = new Scanner(System.in);
    Scanner scRemove = new Scanner(System.in);
    Scanner scPrintMap = new Scanner(System.in);
    //결과 저장
    Map<Integer, Integer> intMap = new HashMap<>();

    int key = 0;

    public int calculate(int num1, int num2, char calChar) {

        if ((calChar == '/') && (num2 == 0)) {
            System.out.println("나누기 연산 시, 분모(2번째 정수)는 0이 될 수 없습니다. 종료!");
            return 0;
        }

        switch (calChar) {
            case '+':
                intMap.put(key, num1 + num2);
                break;
            case '-':
                intMap.put(key, num1 - num2);
                break;
            case '*':
                intMap.put(key, num1 * num2);
                break;
            case '/':
                intMap.put(key, num1 / num2);
                break;
            default:
                System.out.println("Invalid calculate char.");
                key--;
                break;
        }
        System.out.println("계산결과는 " + num1 + " " + calChar + " " + num2 + " = " + intMap.get(key) + " 입니다.");




        key++;
        System.out.print("더 입력하시겠습니까?(exit) : ");

        return intMap.get(--key);
    }

    public Calculator() {
        System.out.println("public 계산기 객체가 생성되었습니다.");
    }


    // 캡슐화를 통한 Getter 메소드
    public Map<Integer, Integer> getIntMap() {
        return intMap;
    }

    // 캡슐화를 통한 Setter 메소드
    public void setIntMap(int keySetter, int valueSetter) {
        this.intMap.put(keySetter, valueSetter);
    }
    public void removeResult() {
        System.out.println("-------------Remove------------");
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까?(remove) : ");
        if (scRemove.next().equals("remove")) {
            intMap.remove(0);
            System.out.println("삭제되었습니다.");
        }
    }

    public void inquiryResults() {
        System.out.println("------------inquiry----------");
        System.out.println("저장된 연산결과를 조회하시겠습니까?(inquiry) : ");
        if (scPrintMap.next().equals("inquiry")) {
            for (int in : intMap.values()) {
                System.out.println(in);
            }
        }
    }
}
