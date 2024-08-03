package beginner;

import java.util.Scanner;

public class CompareTwoDigitScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("숫자판별기 On. 종료하려면 exit을 입력하세요.");

            System.out.print("첫 번째 수를 입력하세요 : ");
            String input1 = scanner.nextLine();
            if(input1.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int num1;
            try{
                num1 = Integer.parseInt(input1);
            } catch(NumberFormatException e) {
                System.out.println("유효한 숫자를 입력하거나, exit를 입력하세요! \n" + e.getMessage() + " 는 잘못된 입력입니다. \n");
                continue;
            }

            System.out.print("두 번째 수를 입력하세요 : ");
            String input2 = scanner.nextLine();

            int num2;
            try{
                num2 = Integer.parseInt(input2);
            } catch(NumberFormatException e) {
                System.out.println("유효한 숫자를 입력하거나, exit를 입력하세요! \n" + e.getMessage() + " 는 잘못된 입력입니다. \n");
                continue;
            }

            if (num1 > num2) {
                System.out.println("두 수 중 더 큰 수는" + num1 + "입니다.");
            } else if (num2 > num1) {
                System.out.println("두 수 중 더 큰 수는" + num2 + "입니다.");
            } else {
                System.out.println("두 수는 같습니다.");
            }
        }
    }
}
