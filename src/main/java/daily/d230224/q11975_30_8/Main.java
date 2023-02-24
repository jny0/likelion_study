package daily.d230224.q11975_30_8;


public class Main {
    public static void main(String[] args) {
        전사 a전사1 = new 전사();
        a전사1.공격();

        a전사1.a왼손무기 = new 칼();
        a전사1.공격();
        // 출력 => 전사가 왼손으로 칼(을)를 사용합니다.

        전사 a전사2 = new 전사();
        a전사2.a왼손무기 = new 창();
        a전사2.a오른손무기 = new 도끼();
        a전사2.공격();
        // 출력 => 전사가 왼손으로 창(을)를 사용합니다.
        // 출력 => 전사가 오른손으로 도끼(을)를 사용합니다.
    }
}

class 전사{
    String 이름;
    int 나이;

    전사() {
        이름 = "전사";
        나이 = 20;
    }

    무기 a왼손무기;
    무기 a오른손무기;

    void 공격(){
        if ( a왼손무기 != null ) {
            a왼손무기.작동(이름, "왼손");
        }
        if ( a오른손무기 != null ) {
            a오른손무기.작동(이름, "오른손");
        }
    }
}

abstract class 무기{
    void 작동(String 이름, String 손){
    }
}

class 칼  extends 무기{
    String 무기이름 = "칼";
    void 작동(String 이름, String 손){
        System.out.printf("%s가 %s으로 %s(을) 사용합니다.\n",이름 , 손, 무기이름);
    }
}

class 창  extends 무기{
    String 무기이름 = "창";
    void 작동(String 이름, String 손){
        System.out.printf("%s가 %s으로 %s(을) 사용합니다.\n",이름 , 손, 무기이름);
    }
}

class 도끼  extends 무기{
    String 무기이름 = "도끼";
    void 작동(String 이름, String 손){
        System.out.printf("%s가 %s으로 %s(을) 사용합니다.\n",이름 , 손, 무기이름);
    }
}