package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scExit = new Scanner(System.in);

        //결과 저장
        int[] result = new int[10];

        int i = 0;
        do {


            System.out.print("처음 숫자 :");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num1 = sc.nextInt();
            System.out.print("두번째 숫자 : ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 :");
            // 스트링을 입력받되 맨 처음 인덱스의 char를 가져옴
            char calChar = sc.next().charAt(0);


            if((calChar == '/') && (num2 == 0)){
                System.out.println("나누기 연산 시, 분모(2번째 정수)는 0이 될 수 없습니다. 종료!");
                return;
            }
            else if(i == result.length){
                System.out.println(i+"번 째 result가 저장되었습니다.");
                System.out.println("한 칸씩 앞으로 당기겠습니다.");
                result[0] = 0;
                for (int j = 0; j < i-1; j++) {
                    result[j] = result[j+1];
                }
                result[i-1] = 0;
                for (int in : result) {
                    System.out.println(in);
                }
                i--;
            }

            switch (calChar){
                case '+':
                    result[i] = num1 + num2;
                    break;
                case '-':
                    result[i] = num1 - num2;
                    break;
                case '*':
                    result[i] = num1 * num2;
                    break;
                case '/':
                    result[i] = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid calculate char.");
                    i--;
                    break;
            }

            System.out.println("계산결과는 "+num1+" "+calChar+" "+num2+" = "+result[i]+" 입니다.");

            for (int in : result) {
                System.out.println(in);
            }

            System.out.print("더 입력하시겠습니까?(exit) : ");
            i++;
        }while(!scExit.next().equals("exit"));









    }
}
