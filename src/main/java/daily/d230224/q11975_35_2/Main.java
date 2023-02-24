package daily.d230224.q11975_35_2;

import java.sql.SQLOutput;

public record Main() {
    public static void main(String[] args) {
        계산기 a계산기 = new 계산기();

        System.out.println(a계산기.더하기(10, 20));
        // 출력 : 30

        System.out.println(a계산기.더하기(10, 20, 30));
        // 출력 : 60

        System.out.println(a계산기.더하기(10.5, 20, 30));
        // 출력 : 60.5
    }
}

class 계산기 {
    double 더하기(double num1, double num2){
        return num1+num2;
    }
    double 더하기(double num1, double num2, double num3){
        return num1+num2+num3;
    }
}