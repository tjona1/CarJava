package com.example.CarJava;

import com.example.CarJava.services.Audi;


public class CarJavaApplication {

	public static void main(String[] args) {
		Audi a = new Audi();
		a.car1();

		Tesla t = new Tesla();
		t.car2();

		//Compare the year production of two cars

			int ayear = 2010;
			int tyear = 2020;

			if (ayear > tyear) {
				System.out.print("Audi is younger than Tesla");
			} else {
				System.out.print("Tesla is the Best");
			}

		}

	}


