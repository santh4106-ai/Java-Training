package Day_13;
class animal{
    void makesound(){
        System.out.println("sound made by animal");
    }
}
class dog extends animal{
    @Override
    void makesound(){
        System.out.println("sound made by dog");
    }
}
public class override {
    public static void main(String[] args){
        dog d=new dog();
        animal a=new animal();
        d.makesound();
    }
}