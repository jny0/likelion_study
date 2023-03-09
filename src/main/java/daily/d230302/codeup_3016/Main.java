package daily.d230302.codeup_3016;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int n = Integer.parseInt(sc.nextLine());
        //int n = sc.nextInt();

        List<studentList> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            String[] param = sc.nextLine().split(" ");

            String name = param[0];
            int sc1 = Integer.parseInt(param[1]);
            int sc2 = Integer.parseInt(param[2]);
            int sc3 = Integer.parseInt(param[3]);

            list.add(new studentList(name, sc1, sc2, sc3));
        }


        List<studentList> sortedSc1 = list.stream()
                .sorted(Comparator.comparing(studentList::getSc1).reversed())
                .collect(Collectors.toList());


        studentList output = sortedSc1.get(0);

        int[] rank1 = new int[n];
        int[] rank2 = new int[n];
        for(int i = 0; i < n; i++){
            rank1[i] = 1;
            for(int j = 0; j < n; j++){
                if(sortedSc1.get(i).getSc2() < sortedSc1.get(j).getSc2()){
                    rank1[i]++;
                }
            }
        }

        for(int i = 0; i < n; i++){
            rank2[i] = 1;
            for(int j = 0; j < n; j++){
                if(sortedSc1.get(i).getSc3() < sortedSc1.get(j).getSc3()){
                    rank2[i]++;
                }
            }
        }

        System.out.printf("%s %d %d",output.getName(),rank1[0],rank2[0]);


        sc.close();
    }
}

class studentList{
    private String name;
    private int sc1;
    private int sc2;
    private int sc3;

    public studentList(String name, int sc1, int sc2, int sc3) {
        this.name = name;
        this.sc1 = sc1;
        this.sc2 = sc2;
        this.sc3 = sc3;
    }

    public String getName() {
        return name;
    }

    public int getSc1() {
        return sc1;
    }

    public int getSc2() {
        return sc2;
    }

    public int getSc3() {
        return sc3;
    }

}