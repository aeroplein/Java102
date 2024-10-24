import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        MyList<Integer> list = new MyList<>(5);
        System.out.println("Dizideki mevcut eleman sayısı: " + list.size());
        System.out.println("Dizinin kapasitesi: " + list.getCapacity());
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(80);
        list.add(70);
        System.out.println("Dizideki mevcut eleman sayısı: " + list.size());
        System.out.println("Dizinin kapasitesi: " + list.getCapacity());
        System.out.println(list.toString());
        System.out.println(list.get(2));
        System.out.println(list.get(11));
        System.out.println(list.toString());
        System.out.println(list.remove(2));
        System.out.println(list.toString());
        list.add(60);
        System.out.println(list.toString());
        list.add(40);
        System.out.println(list.toString());
        list.add(80);
        System.out.println(list.toString());
        System.out.println(list.lastIndexOf(80));
        System.out.println(list.indexOf(80));
        System.out.println(list.isEmpty());
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.sublist(2, 6));
        System.out.println(list.contains(50));
        System.out.println(list.contains(100));
        //list.clear();
        System.out.println(list.toString());


    }
}
