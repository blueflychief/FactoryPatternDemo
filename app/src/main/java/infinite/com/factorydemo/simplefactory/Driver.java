package infinite.com.factorydemo.simplefactory;

import infinite.com.factorydemo.Benz;
import infinite.com.factorydemo.Bmw;
import infinite.com.factorydemo.Car;

/**
 * Created by lsq on 2/28/2017.
 */

//简单工厂
public class Driver {
    public static Car createCar(String car) {
        Car c = null;
        if ("Benz".equalsIgnoreCase(car))
            c = new Benz();
        else if ("Bmw".equalsIgnoreCase(car))
            c = new Bmw();
        return c;
    }
}