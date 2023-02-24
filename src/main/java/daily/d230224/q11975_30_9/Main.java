package daily.d230224.q11975_30_9;

// // 11975-32-3
// 출력 : 아래와 같이 출력되게 해주세요.
public class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.나이 = 10;
        a사람.a왼팔 = new 팔();

        System.out.println(a사람.a왼팔.길이 + "cm");
        // 출력 : 100cm
    }
}

class 사람 {
    int 나이;
    팔 a왼팔;



}
class 팔{
    int 길이;
    팔() {
        길이 = 100;
    }

}