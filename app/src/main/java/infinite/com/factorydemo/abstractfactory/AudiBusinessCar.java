package infinite.com.factorydemo.abstractfactory;

import android.util.Log;

/**
 * Created by lsq on 2/28/2017.
 */

public class AudiBusinessCar extends AudiCar {
    public void drive() {
        Log.e("AudiBusinessCar", "drive: " + getName() + "----go-----------------------");
    }
}