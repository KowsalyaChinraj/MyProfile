package com.profile;

public class TestProfile {
	public static void printProfile(IProfile profile)
	{
		profile.myBasicInfo();
		profile.myHobbies();
	}
	public static void main(String args[]) {
		IProfile myProfile1=new KowsalyaProfile();
		IProfile myProfile2=new BhuvanaProfile();
		printProfile(myProfile1);
		printProfile(myProfile2);
		
		
		
		
		
	}

}
