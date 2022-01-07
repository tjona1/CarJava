package com.example.CarJava;

import ch.qos.logback.core.joran.conditional.ElseAction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


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


