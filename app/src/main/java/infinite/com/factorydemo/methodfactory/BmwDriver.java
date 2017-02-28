package infinite.com.factorydemo.methodfactory;

import infinite.com.factorydemo.Bmw;
import infinite.com.factorydemo.Car;

/**
 * Created by lsq on 2/28/2017.
 */

public class BmwDriver extends MethodDriver {
    public Car createCar(String car) {
        return new Bmw();
    }
}