package Day_13;
class C{
    void Show(){
        System.out.println("Hai");
    }
}
class D extends C{
    void display(){
        System.out.println("Good Morning");
    }
}
class E extends C{
    void dis(){
        System.out.println("How Are You");
    }
}
public class multiple_inheritance {
    public static void main(String[] args){
      D i=new D();
      C u=new C();
      E j=new E();
      u.Show();
      i.display();
      j.dis();
    }
}
