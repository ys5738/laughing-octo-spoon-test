package ys.spring.aop.test;

import org.springframework.beans.factory.annotation.Autowired;

public class PerformerOne implements Performer{
	@Autowired
	public InnerClassOne innerclass;
	public void perform() {
		System.out.println("正在执行perform！");
	}
	public void say() {
		System.out.println("PerformerOne正在执行say！");
		innerclass.say();
	}
	
	
}
