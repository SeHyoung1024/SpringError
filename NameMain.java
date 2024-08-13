package com.di.spring_di_xml_setter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NameMain {

	public static void main(String[] args) {
		// 스프링 컨테이너 생성(application context)
		// application-context.xml 을 연동할 예정
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("application-context3.xml");
		
		// 위에서 생성한 context 객체 이용해서 bean 객체 얻어옴(nameController bean을 찾아옴)
		NameController controller =
				context.getBean("nameController",NameController.class);
		//getBean() : 컨텍스트(xml 파일)로 부터 id 에 해당하는 bean 을 찾아 반환해주는 메소드
		controller.show("이몽룡");
		System.out.println("main에서 NameController 에게 의존 객체를 주입(전달)");
		
	}

}
