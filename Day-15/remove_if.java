package Day_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_if {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<String>list1=new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","10"));
        list.remove(1);
        list1.remove(1);
        list1.remove(2);
        list.removeIf(n->n%2==0);
        System.out.println(list);
    }
}
