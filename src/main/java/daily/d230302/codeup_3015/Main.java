package daily.d230302.codeup_3015;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        List<list> st_list = new ArrayList<>();
        for(int i=0; i<n; i++){
            String[] input2 = sc.nextLine().split(" ");
            st_list.add(new list(input2[0],Integer.parseInt(input2[1])));

        }

        sc.close();

        List<list> sortedList = st_list.stream()
                //.sorted((e2, e1) -> e1.getScore() - e2.getScore()) // 내림차순 정렬 (가장 큰 값이 1번)
                .sorted(Comparator.comparing(list::getScore).reversed())  // 내림차순 정렬 (가장 큰 값이 1번)
                .collect(Collectors.toList());

        for(int i=0; i<m; i++){
            System.out.println(sortedList.get(i).getName());
        }


    }
}

class list {
    private String name;
    private int score;

    public list(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + score;
    }
}