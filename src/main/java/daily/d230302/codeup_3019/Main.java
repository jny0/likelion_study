package daily.d230302.codeup_3019;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        //int n = sc.nextInt();

        List<schedule> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            String[] param = sc.nextLine().split(" ");

            String name = param[0];
            int year = Integer.parseInt(param[1]);
            int month = Integer.parseInt(param[2]);
            int day = Integer.parseInt(param[3]);

            list.add(new schedule(name, year, month, day));
        }

        list.stream().sorted(Comparator.comparing(schedule::getYear)
                        .thenComparing(schedule::getMonth)
                        .thenComparing(schedule::getDay)
                        .thenComparing(schedule::getName))
                .map(schedule::getName)
                .forEach(System.out::println);

    }
}

class schedule{
    private String name;
    private int year;
    private int month;
    private int day;

    public schedule(String name, int year, int month, int day) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }


}
