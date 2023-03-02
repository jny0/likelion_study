package daily.d230228.q11975_60;

import java.util.*;

public class Main {
    public static void main(String[] args){
        int an_length=0;
        int[] answer = new int[100];
        Arrays.fill(answer, -1);
        Scanner sc = new Scanner(System.in);
        int lastindex = 0;
        for(int i = 0; i<100; i++){
            System.out.printf("숫자를 입력해주세요(-1: 종료) : ");

            int input = sc.nextInt();
            if(input == -1) {
                System.out.println("입력을 종료합니다.");
                break;
            }
            else {
                answer[i] = input;
            }
            an_length = i;
        }

        int[] result = new int[an_length+1];
        for(int i=0; i<an_length+1; i++){
            result[i] = answer[i];
        }

        Arrays.sort(result);
        System.out.printf("입력한 숫자(오름차순) : ");
        System.out.println(Arrays.toString(result));

        sc.close();

    }
}
