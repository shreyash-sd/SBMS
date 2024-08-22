package in.ashokit.main;

import java.beans.Beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import in.ashokit.beans.Car;
import in.ashokit.beans.PetrolEngine;

public class Main {
 public static void main(String[] args) {
	// start IOC

	 
	 ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	 
	 Car car=context.getBean(Car.class);
	 car.drive();
}
}
