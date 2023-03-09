package daily.d230302.codeup_3108;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        //int n = sc.nextInt();

        List<dataList> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] param = sc.nextLine().split(" ");

            String code = param[0];
            int no = Integer.parseInt(param[1]);
            String name = param[2];


            if(code.equals("I")){
                int count = 0;
                for(dataList lists : list){
                    if(lists.getNo() == no){
                        count =1;
                    }
                }

                if(count == 0 ){
                    list.add(new dataList(no, name));
                }

            } else if(code.equals("D")){
                for(dataList lists : list){
                    if(lists.getNo() == no){
                        list.remove(lists);
                        break;
                    }
                }

            }

        }

        list = list.stream()            // 리스트 정렬
                .sorted(Comparator.comparing(dataList::getNo))
                .collect(Collectors.toList());


        String[] num_list = sc.nextLine().split(" ");
        int[] arr = new int[num_list.length];
        for (int i = 0; i < arr.length; i++) {      // 리스트 요소 정수형으로 바꿈
            arr[i] = Integer.parseInt(num_list[i]);
        }

        for(int i=0; i<list.size(); i++){
            int findIndex = Arrays.binarySearch(arr, i+1); // 인덱스 찾아서 있으면 반환
            if(findIndex >=0){
                System.out.printf("%d %s\n",list.get(i).getNo(),list.get(i).getName());
            }
        }

    }

}

class dataList {

    private int no;
    private String name;

    public dataList(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return no + " " +name +"\n";
    }
}