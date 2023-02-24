package daily.d230224.q11975_35_1;

public class Main {
    public static void main(String[] args) {
        new 사람();
        // 출력 : 사람이 태어났습니다.

        new 사람(10);
        // 출력 : 태어나서부터 10살인 사람이 태어났습니다.

        new 사람(20);
        // 출력 : 태어나서부터 20살인 사람이 태어났습니다.
    }
}

class 사람{
    사람(){
        System.out.printf("사람이 태어났습니다.\n");
    }

    사람(int num){
        System.out.printf("태어나서부터 %d살인 사람이 태어났습니다.\n",num);
    }
}