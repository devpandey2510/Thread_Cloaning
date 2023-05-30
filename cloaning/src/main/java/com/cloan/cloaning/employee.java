package com.cloan.cloaning;

public class employee implements Cloneable {

	String name,id;
	employee(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return "name="+name + "\nid="+id;
	}
	public employee clone()throws CloneNotSupportedException {
		return (employee)super.clone();
	}
}
