package Day_12;
class D{
    int id;
    String name1;
    String nmae2;
    D(int i,String n){
        id=i;
        name1=n;
    }
    void display(){
        System.out.println(id+" "+name1);
    }
}
public class overloading {
    public static void main (String[] args){
        D a=new D(1,"a");
        a.display();
    }
}