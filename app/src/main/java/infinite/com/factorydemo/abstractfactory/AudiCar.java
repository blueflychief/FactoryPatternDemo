package infinite.com.factorydemo.abstractfactory;

/**
 * Created by lsq on 2/28/2017.
 */

public abstract class AudiCar {
    private String name;

    public abstract void drive();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
