package ys.spring.aop.test;

public class Audience {
	public void beforeOne(){
		System.out.println("beforeOne");
	}
	public void beforeTwo(){
		System.out.println("beforeTwo");
	}
	public void afterOne(){
		System.out.println("afterOne");
	}
	public void afterThrowing(){
		System.out.println("afterThrowing");
	}
	public void afterTwo(){
		System.out.println("afterTwo");
	}	
}
