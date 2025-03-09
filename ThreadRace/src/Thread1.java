import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Thread1 extends Thread{
    private List<Integer> list;
    private List<Integer> odd = new ArrayList<>();
    private List<Integer> even = new ArrayList<>();

    public Thread1(List<Integer> list){
        this.list = list;
    }

    public void run(){


            for (Integer i: list) {
                if (i % 2 == 0) {
                    even.add(i);
                    synchronized (Main.class){
                        Main.getEven().add(i);
                    }

                } else {
                    odd.add(i);
                    synchronized (Main.class){
                        Main.getOdd().add(i);
                    }

                }
            }



        System.out.println("Even numbers in thread " + Thread.currentThread().getName() + " is " + Arrays.toString(even.toArray()));
        System.out.println("Odd numbers in thread " + Thread.currentThread().getName() + " is " + Arrays.toString(odd.toArray()));



    }

}
