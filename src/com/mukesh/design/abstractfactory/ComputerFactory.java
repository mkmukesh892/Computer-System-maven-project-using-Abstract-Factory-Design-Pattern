package com.mukesh.design.abstractfactory;

import com.mukesh.design.model.Computer;

public class ComputerFactory {
public static Computer getComputer(ComputerAbstractFactory factory) {
	return factory.createComputer();
}
}
