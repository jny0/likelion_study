package daily.d230224.q11975_35_5;

public class Main {
    public static void main(String[] args) {
        new 사람();
    }
}

class 동물 {
    동물(String 이름) {
        System.out.println("동물(String 이름) 실행됨!");
        System.out.println("이름 : " + 이름);
    }
    동물(String 이름, int 나이) {
        System.out.println("동물(String 이름, int 나이) 실행됨!");
        System.out.println("이름 : " + 이름);
        System.out.println("나이 : " + 나이);
    }
}

class 사람 extends 동물 {
    사람() {
        super("홍길동", 22);
    }

}