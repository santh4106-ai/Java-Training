package Day_13;
class I{
    I(){
        super();
        System.out.println("print value A");
    }
    I(int a){
        this();
        System.out.println("print the value A"+a);
    }
}
class J extends I{
    J(){

    }
    J(int a,int b){

    }
    J(int a){
        this();
        System.out.println("print the value B"+a);
    }
}
public class super_class {
    public static void main(String[] args){
        J b=new J(10);
        I s=new I(8);
    }
}
