package com.practice;

import java.io.Serializable;

public class SingleTon implements Serializable, Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static SingleTon single = null;
	
	private SingleTon() {
		
	}
	
	public static SingleTon getInstance() {
		if(single == null) {
			synchronized(SingleTon.class) {
				if(single == null) {
					single = new SingleTon();
				}
			}
		}
		return single;
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException  {
        return super.clone();
    }
}
