package com.cts.designpatrens;

public class FactoryPatorn {
public static void main(String[] args) {
	FactoryPatorn factoryPatorn=new FactoryPatorn();
	Shape sh=factoryPatorn.factrymethod(new Circle());
	sh.draw();
}

public Shape factrymethod(Shape sh) {
	if(sh.equals(new Circle())) {
		sh= new Circle();
	}
	else if(sh.equals(new Tringle())) {
		sh= new Tringle();
		
	}
	return sh;
	
	
}
}
