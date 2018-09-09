package com.mukesh.design.abstractfactory;

import com.mukesh.design.model.Computer;
import com.mukesh.design.model.PC;

public class PCFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	public PCFactory(String ram, String hdd, String cpu) {
		//super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new PC(ram,hdd,cpu);
	}

}
