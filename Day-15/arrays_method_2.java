package Day_15;
import java.util.ArrayList;
import java.util.List;
public class arrays_method_2 {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1,20);
        list.set(1,2);
        System.out.println(list);
    }
}