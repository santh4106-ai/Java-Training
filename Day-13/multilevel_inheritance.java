package Day_13;
class F{
    void display(){
        System.out.println("Hello guys");
    }
}
class G extends F{
    void show(){
        System.out.println("Welcome");
    }
}
class H extends G{
    void fly(){
        System.out.println("Have a nice day");
    }
}
public class multilevel_inheritance {
    public static void main(String[] args){
        G i=new G();
        F r=new F();
        H s=new H();
        r.display();
        r.display();
        i.show();
        i.show();
        s.fly();
        s.fly();
    }
}
