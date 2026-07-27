package Day_12;
class A{
    int age;
    int id;
    String name;
    A(){

    }
    A(int i){
        System.out.println(i+i+i);
    }
    A(int age,String name,int id){
        this.age=age;
        this.name=name;
        this.id=id;
    }
    void show(){
        System.out.println(age);
        System.out.println(name);
        System.out.println(id);
    }
}

public class constructor {
    public static void main(String[] args){
        A obj=new A(19,"R Santhosh",20246311);
        obj.show();
    }
}
