package cn.com.ibm.hackthon.controller.helper;

import org.springframework.stereotype.Component;


@Component("demoHelper")
public class DemoControllerHelper {

	public String sayHello() {
		return "hello, welcome to IBM hackthon!";
	}
}
