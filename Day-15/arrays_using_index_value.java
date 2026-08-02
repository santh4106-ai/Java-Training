package Day_15;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrays_using_index_value {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<String>list1=new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","10"));
        list.remove(1);
        list1.remove(1);
        list1.remove(2);
        list1.removeAll(list1);
        System.out.println(list);
        System.out.println(list1);

    }
}
