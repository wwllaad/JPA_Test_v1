package com.bve;

import com.bve.model.Car;
import com.bve.service.CarService;
import org.junit.Test;


public class CarServiceTest {

    CarService service = new CarService();

    @Test
    public void testSaveRecord() throws Exception{
        Car testCar = new Car();
        testCar.setName("Renault");
        testCar.setYear(2012);

        service.add(testCar);
        //System.out.println(carForConsoleOutput);
    }

}
