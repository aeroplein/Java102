import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<Integer> getOdd() {
        return odd;
    }

    public static void setOdd(List<Integer> odd) {
        Main.odd = odd;
    }

    private static List<Integer> odd = new ArrayList<>();

    public static List<Integer> getEven() {
        return even;
    }

    public static void setEven(List<Integer> even) {
        Main.even = even;
    }

    private static List<Integer> even = new ArrayList<>();

    public static void main(String[] args) {

        List<Integer> tenK = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            tenK.add(i);
        }

        //System.out.println(Arrays.toString(tenK.toArray()));

        List<List<Integer>> partitions = new ArrayList<>();



        for (int j = 0; j < 4; j++){
            int start = j * 2500;
            int end = start + 2500;
            partitions.add(tenK.subList(start, end));

        }

        List<Integer> p1;
        List<Integer> p2;
        List<Integer> p3;
        List<Integer> p4;

        p1 = partitions.get(0);
        p2 = partitions.get(1);
        p3 = partitions.get(2);
        p4 = partitions.get(3);




        Thread t1 = new Thread1(p1);
        Thread t2 = new Thread1(p2);
        Thread t3 = new Thread1(p3);
        Thread t4 = new Thread1(p4);


        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Odd numbers found by total of 4 threads: "+ Arrays.toString(odd.toArray()));
        System.out.println("Even numbers found by total of 4 threads: "+ Arrays.toString(even.toArray()));

    }

}
