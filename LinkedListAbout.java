package Section12.Liste_InterFace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListAbout {
    public static void main(String[] args) {


        LinkedList<Integer> number = new LinkedList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        long start =System.currentTimeMillis();
        linklistequr(number);
        long finish = System.currentTimeMillis();
        System.out.println("linkedlist isleme vaxti" + (finish - start));

         start =System.currentTimeMillis();
        arraylistiqur(number2);
         start =System.currentTimeMillis();
        System.out.println("Arraylist isleme vaxti" + (finish - start));





         /* number.add(1);
        number.add(2);
        number.add(0,5);
        number.set(1,10);
        System.out.println(number);
        System.out.println(number.get(2));

        ListIterator<Integer> iterator= number.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        } */

    }

    private static void arraylistiqur(ArrayList<Integer> number2) {
        for (int i = 0; i < 9; i++) {
            int yeniElaveOlunacaq = (int) (Math.random() * 5);
            siraliElaveEtmek(number2, yeniElaveOlunacaq);
        }
    }

    private static void linklistequr(LinkedList<Integer> number) {
        for (int i = 0; i < 9; i++) {

            int yeniElaveOlunacaq = (int) (Math.random() * 5);
            siraliElaveEtmek(number, yeniElaveOlunacaq);
        }
    }


    public static boolean siraliElaveEtmek(List<Integer> list1, int yeniElaveOlunacaq) {
        ListIterator<Integer> iterator = list1.listIterator();
        while (iterator.hasNext()) {
            int uzlesdirme = iterator.next().compareTo(yeniElaveOlunacaq);
            if (uzlesdirme == 0){
                iterator.add(yeniElaveOlunacaq);
                return true;
            }else if(uzlesdirme > 0){
                iterator.previous();
                iterator.add(yeniElaveOlunacaq);
                return true;
            }else{

            }
        }
        iterator.add(yeniElaveOlunacaq);
        return true;
    }

}
