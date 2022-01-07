package com.example.CarJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tesla {

    public  List<Car> teslacar = new ArrayList<>();
        Random ran = new Random();

        public List<Car> car2 () {
           Car tesla = new Car();
           for ( int i=0; i<1; i++) {
               tesla.setModel("S");
               tesla.setColor("Blue");
               tesla.setYear("2020");
               tesla.setPrice("105k");


               System.out.print("\n");
               System.out.println(" Tesla model is " + "" + tesla.getModel());
               System.out.println(" Tesla color is " + "" + tesla.getColor());
               System.out.println(" Tesla year is " + "" + tesla.getYear());
               System.out.println(" Tesla price is " + "" + tesla.getPrice());
               System.out.print("\n");


               teslacar.add(tesla);
           }
           return teslacar;
        }
}
