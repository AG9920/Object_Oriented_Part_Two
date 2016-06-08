package com.futuregong.crazy_Java;

public class TestEnum {
	public void judge(SeasonEnum s){
		//switch里面的表达式可以是枚举值
		switch(s){
		case SPRING: System.out.println("春暖花开");break;
		case SUMMER:System.out.println("夏日炎炎");break;
		case FALL: System.out.println("秋高");break;
		case WINTER: System.out.println("冬日");break;
		}
	}
	public static void main(String[] args) {
		//所有枚举类都有一个values方法，返回该枚举类的所有实例
		for(SeasonEnum s:SeasonEnum.values()){
			System.out.println(s);
		}
		//平常使用枚举实例时，总是通过EnumClass.variable形式来访问
		new TestEnum().judge(SeasonEnum.SPRING);
	}
}
