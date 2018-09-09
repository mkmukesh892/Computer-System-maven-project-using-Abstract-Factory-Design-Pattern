package com.mukesh.design.abstractfactory;

import com.mukesh.design.model.Computer;
import com.mukesh.design.model.Server;

public class ServerFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	public ServerFactory(String ram, String hdd, String cpu) {
		//super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new Server(ram, hdd, cpu);
	}

}
