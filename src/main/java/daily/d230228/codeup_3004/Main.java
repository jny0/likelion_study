package daily.d230228.codeup_3004;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        List<NoData> noDatum = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int no = sc.nextInt();

            noDatum.add(new NoData(0, no));
        }
        sc.close();

        List<NoData> sortedNoDatum = noDatum
                .stream()
                .sorted(Comparator.comparing(NoData::getNo))
                .collect(Collectors.toList());




        for(int i = 0; i<sortedNoDatum.size(); i++){
            sortedNoDatum.get(i).setId(i);
        }

        String output = noDatum
                .stream()
                .map(e -> e.getId() + "")
                .collect(Collectors.joining(" "));

        System.out.println(output);
    }
}

class NoData {
    private int id;
    private int no;

    public NoData(int id, int no) {
        this.id = id;
        this.no = no;
    }

    public int getId() {
        return id;
    }

    public int getNo() {
        return no;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "NoData{" +
                "id=" + id +
                ", no=" + no +
                '}';
    }
}