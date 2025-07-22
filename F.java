package com.accessspecifiers;
// when a constructor is private inheritance of that class is not aloud
public class F extends AccessSpecifierOnConstructor {
	public static void main(String[] args) {
		//error private constructor object can not be created in different class
		AccessSpecifierOnConstructor c=new AccessSpecifierOnConstructor();
	}

}
