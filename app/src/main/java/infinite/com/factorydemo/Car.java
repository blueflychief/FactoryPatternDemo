package infinite.com.factorydemo;

/**
 * Created by lsq on 2/28/2017.
 */

//抽象产品
public abstract class Car {
    private String name;

    public abstract void drive();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
