package infinite.com.factorydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import infinite.com.factorydemo.abstractfactory.AudiCar;
import infinite.com.factorydemo.abstractfactory.BusinessDriver;
import infinite.com.factorydemo.abstractfactory.Driver3;
import infinite.com.factorydemo.methodfactory.BenzDriver;
import infinite.com.factorydemo.methodfactory.MethodDriver;
import infinite.com.factorydemo.simplefactory.Driver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        invokeSimpleFactory();


        invokeMethodFatory();


        invokeAbstractFatory();


    }

    private void invokeAbstractFatory() {
        Driver3 d = new BusinessDriver();
        AudiCar car = d.createAudiCar("audi");
        car.setName("audi");
        car.drive();
    }

    private void invokeMethodFatory() {
        MethodDriver d = new BenzDriver();
        Car c = d.createCar("benz");
        c.setName("benz");
        c.drive();
    }

    //简单工厂模式
    private void invokeSimpleFactory() {
        //老板告诉司机我今天坐奔驰
        Car car = Driver.createCar("benz");
        car.setName("benz");
        //司机开着奔驰出发
        car.drive();
    }
}
