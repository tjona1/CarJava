package com.example.CarJava.services;

import com.example.CarJava.entity.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Audi {
public List<Car> cars = new ArrayList<>();
        Random r = new Random();

        public List<Car> car1 () {
            Car audi = new Car();
            for ( int i=0; i<1; i++){
                audi.setModel("Q7");
                audi.setColor("Black");
                audi.setYear("2010");
                audi.setPrice("200K");


                System.out.println(" Audi model is " + ""  + audi.getModel());
                System.out.println(" Audi color is " + ""  + audi.getColor());
                System.out.println(" Audi year is " + ""  + audi.getYear());
                System.out.println(" Audi price is " + ""  + audi.getPrice());
                System.out.print("\n");
                //cars.add(audi);
            }
            return cars;
         }
}
