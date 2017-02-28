package infinite.com.factorydemo.abstractfactory;

/**
 * Created by lsq on 2/28/2017.
 */
//抽象产品（Bmw和Audi同理）
public abstract class BenzCar {
    private String name;

    public abstract void drive();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
