package Day_12;
import java.util.Scanner;
class E{
    int rev(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int rev=0;
        while(num!=0){
            int pop=num%10;
            rev=rev*10+pop;
            num=num/10;
        }
        return rev;
    }
}

public class reverse_integer {
    public static void main(String[] args){
        E num=new E();
        System.out.println(num.rev());
    }

}
