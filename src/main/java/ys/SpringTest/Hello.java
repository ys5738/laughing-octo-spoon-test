package ys.SpringTest;

import org.springframework.stereotype.Component;

@Component("hello")
public class Hello {
	public String msg;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public  void say() {
		System.out.println("你好");
		System.out.println("msg:"+this.getMsg());
	}

}
