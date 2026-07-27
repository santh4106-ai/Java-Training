package Day_12;
class C{
    int a(){
        return 1;
    }
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    void dispaly(){
        System.out.println("hello guys");
    }
}
public class method_overloading {
    public static void main(String[] args) {
        C a = new C();
        int e = a.a();
        System.out.println(e);
        System.out.println(a.add(1, 2, 3));
        System.out.println(a.add(1, 2));
    }
}