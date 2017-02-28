package infinite.com.factorydemo.abstractfactory;

/**
 * Created by lsq on 2/28/2017.
 */

public abstract class Driver3{
    public abstract BenzCar createBenzCar(String car);

    public abstract BmwCar createBmwCar(String car);

    public abstract AudiCar createAudiCar(String car);
}