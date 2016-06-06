package com.futuregong.crazy_Java;

public class Primitive2Wrapper {
	
	public static void main(String[] args) {
		boolean bl = true;
		//通过构造器把bl基本类型变量包装成“包装类对象”
		Boolean blObj = new Boolean(bl);
		
		int it =5;
		//通过构造器把it基本类型变量包装成“包装类对象”
		Integer itObj = new Integer(it);
		
		//把一个字符串转换成Float对象
		Float fl = new Float("4.56");
		
		//把一个字符串转换成Boolean对象
		Boolean bObj = new Boolean("false");
		
		//下面程序运行时将出现java.lang.NumberFormatException异常
		//Long lObj = new Long("ddd");
		
		System.out.println(blObj+" "+itObj+" "+fl+" "+bObj);
		
		//取出Boolean对象里的boolean变量
		boolean bb = bObj.booleanValue();
		//取出Integer对象里的int变量
		int i =itObj.intValue();
		//取出Float对象里的float变量
		float f = fl.floatValue();
		
		System.out.println(bb+" "+i+" "+f);
		
		//这种转换过程略显繁琐，为了解决，从JDK1.5开始提供了自动装箱和自动拆箱，详细请看AutoBoxingUnboxing.java
	}

	
	
}
