package daily.d230227.q11975_53;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.DoubleFunction;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = 0;

        while(true){
            System.out.printf("숫자 : ");

            try {
                input = sc.nextInt();
                break;
            } catch(InputMismatchException e) {
                sc.nextLine();
                System.out.printf("숫자를 입력해주세요.\n");
            }
        }
        System.out.printf("입력된 숫자 : %d\n",input);
        sc.close();
    }
}
