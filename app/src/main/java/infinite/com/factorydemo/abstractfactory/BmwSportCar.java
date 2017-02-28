package infinite.com.factorydemo.abstractfactory;

import android.util.Log;

/**
 * Created by lsq on 2/28/2017.
 */

public class BmwSportCar extends BmwCar{
    public void drive(){
        Log.e("BmwSportCar", "drive: " + getName() + "----go-----------------------");
    }
}