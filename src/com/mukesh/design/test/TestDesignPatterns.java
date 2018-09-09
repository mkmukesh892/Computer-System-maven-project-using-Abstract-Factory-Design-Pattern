package com.mukesh.design.test;

import com.mukesh.design.abstractfactory.PCFactory;
import com.mukesh.design.abstractfactory.ServerFactory;
//import com.mukesh.design.factory.ComputerFactory;
import com.mukesh.design.model.Computer;
public class TestDesignPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Computer pc=com.mukesh.design.abstractfactory.ComputerFactory.getComputer(new PCFactory("2 GB","500 GB", "2.4 GHz"));
		Computer server=com.mukesh.design.abstractfactory.ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB", "2.9 GHz"));
		System.out.println("AbstractFactory PC Config:: "+pc);
		System.out.println("Abstractfactory Server Config:: "+server);
	}
	
}
