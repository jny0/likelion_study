package daily.d230224.q11975_33_3;

public class Main {
    public static void main(String[] args) {
        전사 a전사 = new 홍길동();
        a전사.a무기 = new 활();

        a전사.공격();
        // 출력 => 홍길동이(가) 활(으)로 공격합니다.

        a전사 = new 홍길순();

        a전사.공격();
        // 출력 => 홍길순이(가) 칼(으)로 공격합니다.

        a전사.a무기 = new 창();
        a전사.공격();
        // 출력 => 홍길순이(가) 창(으)로 공격합니다.
    }
}

class 전사{
    String 이름;
    무기 a무기;
    void 공격() {
        a무기.작동(이름);
    }

}

class 무기{
    String 무기명;
    void 작동(String 이름){
        System.out.printf("%s(이)가 %s(으)로 공격합니다.\n",이름, 무기명);
    }

}

class 활 extends 무기{
    활(){
        this.무기명 = "활";
    }

}

class 창 extends 무기{
    창(){
        this.무기명 = "창";
    }
}
class 칼 extends 무기{
    칼(){
        this.무기명 = "칼";
    }
}

class 홍길동 extends 전사{
    홍길동(){
        this.이름 = "홍길동";
    }

}

class 홍길순 extends 전사{
    홍길순(){
        this.이름 = "홍길순";
        this.a무기 = new 칼();
    }
}
