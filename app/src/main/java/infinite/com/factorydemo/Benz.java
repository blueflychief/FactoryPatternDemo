package infinite.com.factorydemo;

import android.util.Log;

/**
 * Created by lsq on 2/28/2017.
 */
//具体产品
public class Benz extends Car {
    public void drive() {
        Log.e("Benz", "drive: " + getName() + "----go-----------------------");
    }
}