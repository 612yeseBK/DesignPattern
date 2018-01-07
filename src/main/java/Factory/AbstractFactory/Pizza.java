package Factory.AbstractFactory;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

public abstract class Pizza {
    String name;
    String sauce;
    public String getName() {
        return name;
    }

    void prepare(){
        System.out.println("Preparing:"+name);
        System.out.println("Add sauce:"+sauce);
    }

    void bake(){
        System.out.println("正在烘焙");
    }

    void cut(){
        System.out.println("正在切碎");
    }

    void box(){
        System.out.println("正在装盒");
    }
}
