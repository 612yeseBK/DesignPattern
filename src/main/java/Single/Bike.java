package Single;

public class Bike {
    public static int num = 0;
    static {
        System.out.println("类加载近jvm时候执行");
    }

    {
        System.out.println("对象创建时执行，并且先于构造器");
    }
    public Bike(){
        System.out.println("构造了一个对象");
    }
}
