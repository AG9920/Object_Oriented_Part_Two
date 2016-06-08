package com.futuregong.crazy_Java;

//�ֶ�ʵ��ö����
public class Season {
	//��Season�ඨ��ɲ��ɱ�ģ���������Ҳ�����final
	private final String name;
	private final String desc;
	public static final Season SPRING =new Season("����","̤��");
	public static final Season SUMMER = new Season("����","����");
	public static final Season FALL  = new Season("����","���");
	public static final Season Winter = new Season("����","��ѩ");
	
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
	//�������������privateȨ��
	private Season(String name, String desc){
		this.name =  name;
		this.desc =desc;
	}
	//ֻΪname��desc�����ṩgetter����
	public String getName(){
		return this.name;
	}
	public String getDesc(){
		return this.desc;
	}

}
