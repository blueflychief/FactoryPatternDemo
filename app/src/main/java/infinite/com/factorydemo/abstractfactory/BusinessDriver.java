package infinite.com.factorydemo.abstractfactory;

/**
 * Created by lsq on 2/28/2017.
 */

public class BusinessDriver extends Driver3 {
    public BenzCar createBenzCar(String car){
        return new BenzBusinessCar();
    }

    public BmwCar createBmwCar(String car){
        return new BmwBusinessCar();
    }

    public AudiCar createAudiCar(String car){
        return new AudiBusinessCar();
    }
}