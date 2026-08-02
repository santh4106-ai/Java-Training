package Day_15;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
public class arrays_method_1 {
    public static void main(String[] args){
        List<Objects>list1=new ArrayList<>();
        System.out.println(list1);
        List<String>list2=new ArrayList<>();
        System.out.println(list2);
        List<String>list3=new ArrayList<>(Arrays.asList("S","A","N"));
        System.out.println(list3);
    }
}