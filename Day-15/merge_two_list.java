package Day_15;
import java.util.ArrayList;
import java.util.List;
public class merge_two_list {
    public static void main(String[] args){
        List<Integer>list1=new ArrayList<>();
        list1.add(6);
        list1.add(7);
        System.out.println(list1);
        List<Integer>list2=new ArrayList<>();
        list2.add(8);
        list2.add(9);
        list2.add(10);
        list2.addAll(list1);
        System.out.println(list2);
    }
}