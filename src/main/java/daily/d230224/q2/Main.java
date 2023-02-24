package daily.d230224.q2;

// 11975 -32-5
// 문제 : 아래와 같이 출력 되도록 해주세요.
public class Main {
    public static void main(String[] args) {
        캐릭터 a플레이어_캐릭터;

        a플레이어_캐릭터 = new 전사();
        a플레이어_캐릭터.공격();
        // 출력 : 전사가 대검으로 공격합니다.

        a플레이어_캐릭터 = new 마법사();
        a플레이어_캐릭터.공격();
        // 출력 : 마법사가 파이어볼로 공격합니다.
    }
}

abstract class 캐릭터 {
    abstract void 공격();

}

class 전사 extends 캐릭터 {
    String 이름 ;
    String 무기 ;
    전사() {
        this.이름  = "전사";
        this.무기 =  "대검";
    }
    void 공격() {
        System.out.printf("%s가 %s으로 공격합니다.\n", 이름, 무기);
    }
}

class 마법사 extends 캐릭터 {
    String 이름 ;
    String 무기 ;
    마법사() {
        this.이름  = "마법사";
        this.무기 =  "파이어볼";
    }
    void 공격() {
        System.out.printf("%s가 %s으로 공격합니다.\n", 이름, 무기);
    }

}