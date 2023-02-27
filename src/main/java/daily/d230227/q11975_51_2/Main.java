package daily.d230227.q11975_51_2;
//문자열에 x가 몇개 들어닜는지
public class Main {
    public static void main(String[] args) {
        String str = "axslekjxxlkzjxkljxxXXXssjxxXXxxX";

        int xCount = 0;

        for (int i=0; i < str.length(); i++){
            if(str.charAt(i)=='x'||str.charAt(i)=='X') xCount++;
        }
        System.out.println("xCount : " + xCount);
    }
}
