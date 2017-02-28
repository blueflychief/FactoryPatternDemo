package infinite.com.factorydemo.abstractfactory;

/**
 * Created by lsq on 2/28/2017.
 */

public class SportDriver extends Driver3 {
    public BenzCar createBenzCar(String car) {
        return new BenzSportCar();
    }

    public BmwCar createBmwCar(String car) {
        return new BmwSportCar();
    }

    public AudiCar createAudiCar(String car) {
        return new AudiSportCar();
    }
}