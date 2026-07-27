package Day_13;
class car{
    void station(){
        System.out.println("petrol station");
    }
}
class EVcar extends car{
    void station(){
        System.out.println("EV station");
    }
}
class petrolcar extends car{
    void station(){
        System.out.println("petrol station is not working");
    }
}
public class method_overriding {
    public static void main(String[] args){
        EVcar evcar=new EVcar();
        evcar.station();
        petrolcar car=new petrolcar();
        car.station();
    }
}