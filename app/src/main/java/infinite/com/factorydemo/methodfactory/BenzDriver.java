package infinite.com.factorydemo.methodfactory;

import infinite.com.factorydemo.Benz;
import infinite.com.factorydemo.Car;

/**
 * Created by lsq on 2/28/2017.
 */

public class BenzDriver extends MethodDriver {
    public Car createCar(String car) {
        return new Benz();
    }
}