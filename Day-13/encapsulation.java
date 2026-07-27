package Day_13;
class K{
    private int a;
    private int b;
    private String name;
    K(int a,int b,String name){
        this.a=a;
        this.b=b;
        this.name=name;
    }
    void setID(int a,int b){
        this.a=a;
        this.b=b;
    }
    int getA(){
        return this.a;
    }
    int getB(){
        return this.b;
    }
    void display(){
        System.out.println(a+" "+b+" "+name);
    }
}
public class encapsulation {
    public static void main(String[] args){
        K a=new K(4,10,"R Santhosh");
        a.display();
    }
}