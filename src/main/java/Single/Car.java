package Single;

public class Car {
    // 双重加锁机制
    private volatile static Car car ;
    // volatile 关键字是保证了每个线程读取的值都是内存中的最新值
    // 因为对个线程初始化某个实例时，他们会将这个对象从内存读入到自己的高速缓存中，
    // 这时候在获得锁做第二次非空判定时，没有去内存更新别人写入的值，而是用了自己高速缓存的值，
    // 这里是实现了可见性
    private Car(){}
    public static Car getInstance(){
        if (car==null) {
            // 当线程发现对象没有进行实例化时，就会锁住这个类，然后进行new一个对象，
            // 不过由于多个线程同步走到了这一步，如果没有再次判断，除了第一个线程需要new对象
            // 后面被锁住的几个线程等待第一个人的锁结束之后都会继续new自己的新的对象，
            // 其实如果已经有了就不再new对象了，直接返回就可以了
            synchronized(Car.class){
                if (car == null){
                    car = new Car();
                }
            }
        }
        return car;
    }

//    // 急切实例化方法
//    private static Car car = new Car(); // 载入时就已经给它出事了一个对象，之后只需要返回它就行了，不过这样这块空间一直都在内存里面
//    private Car(){}
//    public static Car getInstance(){
//        return car;
//    }
}
