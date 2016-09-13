package com.wxhao.test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal bigDecimal=new BigDecimal("123.8");
		System.out.println(bigDecimal.longValue());
		
		Set<String > set=new HashSet<String>();
		set.add("1");
		set.add("2");
		
		for(String str:set){
			if(str.equals("1")){
				set.remove(str);
				break;
			}
		}
		System.out.println(set.toString());
	}

}
