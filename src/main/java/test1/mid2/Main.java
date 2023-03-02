package test1.mid2;


public class Main {
    public static void main(String[] args) {

        캐릭터 a캐릭터 = new 전사();

        a캐릭터.공격();
        // 출력 : 전사(이)가 칼(으)로 공격합니다.
        // 출력 : 데미지 : 전사 기본공격력(10) * 칼 공격력(20) => 200

        a캐릭터.set무기(new 활());

        a캐릭터.공격();
        // 출력 : 전사(이)가 활(으)로 공격합니다.
        // 출력 : 데미지 : 전사 기본공격력(10) * 활 공격력(100) => 1000

        a캐릭터 = new 마법사();

        a캐릭터.공격();
        // 출력 : 마법사(이)가 불지팡이(으)로 공격합니다.
        // 출력 : 데미지 : 마법사 기본공격력(5) * 불지팡이 공격력(50) => 250

        a캐릭터 = new 얼음마법사();

        a캐릭터.공격();
        // 출력 : 마법사(이)가 얼음지팡이(으)로 공격합니다.
        // 출력 : 데미지 : 마법사 기본공격력(5) * 얼음지팡이 공격력(60) => 300
    }
}

abstract class 캐릭터{
    String 이름 ;
    int 기본공격력 ;

    무기 a무기;

    public void set무기(무기 name) {
        a무기 = name;
        a무기.set무기();
    }
    public void 공격() {
        a무기.print(this.이름, this.기본공격력);
    }



}
abstract class 무기 {

    String 이름;
    int 기본공격력;
    String 무기이름;
    int 무기공격력;

    public abstract void set무기();

    public void print(String 이름, int 기본공격력) {
        this.이름 = 이름;
        System.out.println(이름 + "(이)가 " + 무기이름 + "(으)로 공격합니다.");
        System.out.println("데미지 : " + 이름 + " 기본공격력(" + 기본공격력 + ") * " + 무기이름 + " 공격력(" + 무기공격력 + ") => " + 기본공격력*무기공격력);
    }
}

class 전사 extends 캐릭터{

    전사(){
        this.이름 = "전사";
        this.기본공격력 = 10;
        a무기 = new 칼();
        a무기.set무기();
    }


}

class 마법사 extends 캐릭터 {
    마법사(){
        this.이름 = "마법사";
        this.기본공격력 = 5;
        a무기 = new 불지팡이();
        a무기.set무기();
    }

}

class 얼음마법사 extends 마법사{
    얼음마법사(){
        a무기 = new 얼음지팡이();
        a무기.set무기();
    }
}


class 칼 extends 무기{
    public void set무기() {
        this.무기이름 = "칼";
        this.무기공격력 = 20;
    }
}

class 활 extends 무기{
    public void set무기() {
        this.무기이름 = "활";
        this.무기공격력 = 100;
    }
}

class 불지팡이 extends 무기{
    @Override
    public void set무기() {
        this.무기이름 = "불지팡이";
        this.무기공격력 = 50;
    }
}

class 얼음지팡이 extends 무기{
    @Override
    public void set무기() {
        this.무기이름 = "얼음지팡이";
        this.무기공격력 = 60;
    }
}