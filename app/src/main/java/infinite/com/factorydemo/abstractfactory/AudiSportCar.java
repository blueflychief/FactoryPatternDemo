package infinite.com.factorydemo.abstractfactory;

import android.util.Log;

/**
 * Created by lsq on 2/28/2017.
 */

public class AudiSportCar extends AudiCar {
    public void drive() {
        Log.e("AudiSportCar", "drive: " + getName() + "----go-----------------------");
    }
}