package com.futuregong.crazy_Java;

public class TestEnum {
	public void judge(SeasonEnum s){
		//switch����ı��ʽ������ö��ֵ
		switch(s){
		case SPRING: System.out.println("��ů����");break;
		case SUMMER:System.out.println("��������");break;
		case FALL: System.out.println("���");break;
		case WINTER: System.out.println("����");break;
		}
	}
	public static void main(String[] args) {
		//����ö���඼��һ��values���������ظ�ö���������ʵ��
		for(SeasonEnum s:SeasonEnum.values()){
			System.out.println(s);
		}
		//ƽ��ʹ��ö��ʵ��ʱ������ͨ��EnumClass.variable��ʽ������
		new TestEnum().judge(SeasonEnum.SPRING);
	}
}
