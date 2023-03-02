package daily.d230228.q11975_62_arrayList;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Integer> answer = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.printf("숫자를 입력해주세요(-1: 종료) : ");
            int input = sc.nextInt();

            if(input == -1) {
                System.out.println("입력을 종료합니다.");
                break;
            }
            else {
                answer.add(input);
            }
        }

        String str = answer
                .stream().sorted().map(e -> ""+e).collect(Collectors.joining(", "));



        System.out.printf("입력한 숫자(오름차순) : %s\n", str);
        System.out.println("프로그램을 종료합니다.");

        sc.close();

    }
}