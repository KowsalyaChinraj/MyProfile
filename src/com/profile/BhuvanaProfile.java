package com.profile;

public class BhuvanaProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstant.FIRST_NAME+"bhuvana");
		System.out.println(ProfileConstant.LAST_NAME+"ramasamy");
		System.out.println("Age:21");
		
		
	}

	@Override
	public void myHobbies() {
		System.out.println("My hobbies are watching movies");
		
		
	}

}
