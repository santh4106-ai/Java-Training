package Day_13;
class A{
    void dispaly(){
        System.out.println("Hello...............");
    }
}
class B extends A{
    void show(){
        System.out.println("Welcome to My House");
    }
}
public class oops {
    public static void main(String[] args){
        A h=new A();
        B v=new B();
        v.dispaly();
        v.show();
        h.dispaly();
    }
}