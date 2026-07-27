package Day_14;
abstract class emp{
    protected String name;
    protected int id;
    protected int salary;
    emp(String nmae,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    abstract void bonus();

}
class manager extends emp{
    manager(int id, String name,int salary){
        super(id,name,salary);
    }
    void bonus(){
        System.out.println(id+" "+name+" "+salary*0.10);
    }
}
class developer extends emp{
    developer(int id, String name,int salary){
        super(id,name,salary);
    }
    void bonus(){
        System.out.println(id+" "+name+" "+salary*0.05);
        }
    }
class intern extends emp{
    intern(int id, String name, int salary){
        super(id,name,salary);
    }
    void bonus(){
        System.out.println(id+" "+name+" "+salary*0.08);
    }
}
public class practice {
    public static void main(String[] args){
        emp man=new manager(101,"R Santhosh",10000);
        emp dev=new developer(102,"praveen",20000);
        emp in=new intern(103,"raj",30000);
        man.bonus();
        dev.bonus();
        in.bonus();
    }
}
