package com.futuregong.crazy_Java;

//手动实现枚举类
public class Season {
	//把Season类定义成不可变的，将其属性也定义成final
	private final String name;
	private final String desc;
	public static final Season SPRING =new Season("春天","踏青");
	public static final Season SUMMER = new Season("夏天","炎炎");
	public static final Season FALL  = new Season("秋天","秋高");
	public static final Season Winter = new Season("冬天","赏雪");
	
	public static Season getSeason(int seasonNum){
		switch (seasonNum) {
		case 1:
			return SPRING;
		case 2:
			return SUMMER;
		case 3 :
			return FALL;
		case 4:
			return Winter;

		default:
			return null;
		}
	}
	//将构造器定义成private权限
	private Season(String name, String desc){
		this.name =  name;
		this.desc =desc;
	}
	//只为name和desc属性提供getter方法
	public String getName(){
		return this.name;
	}
	public String getDesc(){
		return this.desc;
	}

}
