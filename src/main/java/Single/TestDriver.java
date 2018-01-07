package Single;

public class TestDriver {
    public static void main(String[] args){
        Bike bike = new Bike();
        bike.num ++;
        Bike bike2 = new Bike();
        bike2.num++;
        Bike.num =12;
        System.out.println(bike.num);
    }
}
