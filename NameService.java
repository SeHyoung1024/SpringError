package com.di.spring_di_xml_setter;

public class NameService {
	// 인수로 전달되는 이름을 받아서 소개문자열 구성해서 반환하는 메소드
	public String showName(String name) {
		System.out.println("NameService showName() 메소드");
		String myName = "내 이름은 " + name + "입니다.";
		return myName;
	}
}
