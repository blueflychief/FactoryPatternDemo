package infinite.com.factorydemo.abstractfactory;

import android.util.Log;

/**
 * Created by lsq on 2/28/2017.
 */

public class BmwBusinessCar extends BmwCar {
    public void drive() {
        Log.e("BmwBusinessCar", "drive: " + getName() + "----go-----------------------");
    }
}