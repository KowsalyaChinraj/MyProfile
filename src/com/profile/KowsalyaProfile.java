package com.profile;

public  class KowsalyaProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstant.FIRST_NAME+"kowsalya");
		System.out.println(ProfileConstant.LAST_NAME+"chinraj");
		System.out.println("Age:21");
	
		
	}

	@Override
	public void myHobbies() {
		System.out.println("My hobbies are watching movies");
		
		
	}
	

}

