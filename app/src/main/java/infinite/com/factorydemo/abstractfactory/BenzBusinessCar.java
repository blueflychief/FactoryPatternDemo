package infinite.com.factorydemo.abstractfactory;

import android.util.Log;

/**
 * Created by lsq on 2/28/2017.
 */

public class BenzBusinessCar extends BenzCar{
    public void drive(){
        Log.e("BenzBusinessCar", "drive: " + getName() + "----go-----------------------");
    }
}
