package com.di.spring_di_xml_setter;

import com.di_spring_di_xml_setter.NameService;

public class NameController {
	// 필요한 곳에서 new 연산자 사용 객체 직접 생성하는 방식
	private NameService nameService;
	
	// 스프링에서 Setter 통한 의존성 주입시에는 생성자가 기본 생성자만 명시하던가 아예 없던가 해야함
	public NameService getNameService() {
		return nameService;
	}


	public void setNameService(NameService nameService) {
		this.nameService = nameService;
	}


	// name 매개변수에 실제 이름을 전달받고 Service Class 에 showName 호출해서 출력
	  public void show(String name) {
	        System.out.println("NameController : " + nameService.showName(name));
	  }
}