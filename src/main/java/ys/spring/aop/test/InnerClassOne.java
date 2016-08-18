package ys.spring.aop.test;

public class InnerClassOne implements InnerClass{

	public void say() {
		System.out.println("正在执行"+this.getClass()+"的"+ "say方法");
	}
	
}
