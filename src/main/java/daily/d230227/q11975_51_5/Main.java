package daily.d230227.q11975_51_5;

//code.oa.gg/java8/945
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.[정답]
// static 사용금지

public class Main {
    public static void main(String[] args) {
        System.out.println(new 수학().더하기(10, 20));
        // 출력 : 30

        System.out.println(new 수학().더하기(20, 20, 50));
        // 출력 : 90
    }
}

class 수학 {
    int 더하기(int a, int b) {
        return this.더하기(a, b, 0);
    }

    int 더하기(int a, int b, int c) {
        return a + b + c;
    }
}