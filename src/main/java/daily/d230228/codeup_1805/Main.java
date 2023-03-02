package daily.d230228.codeup_1805;

import java.util.*;
import java.util.stream.Collectors;
//https://codeup.kr/problem.php?id=1805
//구조체 연습 - 입체기동장치 생산공장
public class Main {
    public static void main(String[] args) {
        List<Device> devices = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int id = sc.nextInt();
            int gas = sc.nextInt();
            devices.add(new Device(id, gas));
        }

        sc.close();

        devices = devices
                .stream()
                .sorted((e2, e1) -> e2.getId() - e1.getId())
                .collect(Collectors.toList());

        for(Device d : devices){
            System.out.printf("%d %d\n",d.getId(), d.getGas());
        }

    }
}

class Device{
    private int id;
    private int gas;

    public Device(int id, int gas){
        this.id = id;
        this.gas = gas;
    }

    public int getId() {
        return id;
    }

    public int getGas() {
        return gas;
    }


}