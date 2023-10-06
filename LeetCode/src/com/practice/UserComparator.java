package com.practice;

import java.util.Comparator;

public class UserComparator implements Comparator<Object>{

	public int compare(Object obj1, Object obj2) {
		User user1 = (User)obj1;
		User user2 = (User)obj2;

		return user1.getUname().compareTo(user2.getUname());
	}
}
