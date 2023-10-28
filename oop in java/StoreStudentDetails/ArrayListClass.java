package StoreStudentDetails;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {
    public void splitMethod(){
        String name = "Rafi     Islam";
        String[] list = name.split(" ");
        System.out.println(list[0]);
    }
    public void arraylist(){
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(14);
        list.add(2);
        list.add(300);
        list.add(3);
        list.add(98);
        list.add(5);
        list.add(69);
        list.add(7);
        indexWisePrint(list, 3, 8);
        System.out.println("_________________________________");
        int ans = printMaxValue(list);
        System.out.println("Max value is: "+ans);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(list.size()-1));
        System.out.println(list.get(3));
        list.remove(3);
        System.out.println(list.size());
        //list.clear();
        System.out.println(list);
    }

    public void indexWisePrint(List<Integer> list, int x, int y){
        for(int i=x; i<=y; i++){
            System.out.println(list.get(i));
        }
    }

    public int printMaxValue(List<Integer> list){
        int max = list.get(0);
        for(int i=1; i<list.size(); i++){
            if( list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }
}
