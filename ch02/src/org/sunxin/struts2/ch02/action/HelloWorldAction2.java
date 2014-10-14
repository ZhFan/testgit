package org.sunxin.struts2.ch02.action;

import com.opensymphony.xwork2.Action;
public class HelloWorldAction2 implements Action
{
	private String name;
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String execute() {
	name = "Hello, " + name + "!";
	return SUCCESS;
}
}