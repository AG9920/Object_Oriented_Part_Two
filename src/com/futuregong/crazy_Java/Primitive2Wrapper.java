package com.futuregong.crazy_Java;

public class Primitive2Wrapper {
	
	public static void main(String[] args) {
		boolean bl = true;
		//ͨ����������bl�������ͱ�����װ�ɡ���װ�����
		Boolean blObj = new Boolean(bl);
		
		int it =5;
		//ͨ����������it�������ͱ�����װ�ɡ���װ�����
		Integer itObj = new Integer(it);
		
		//��һ���ַ���ת����Float����
		Float fl = new Float("4.56");
		
		//��һ���ַ���ת����Boolean����
		Boolean bObj = new Boolean("false");
		
		//�����������ʱ������java.lang.NumberFormatException�쳣
		//Long lObj = new Long("ddd");
		
		System.out.println(blObj+" "+itObj+" "+fl+" "+bObj);
		
		//ȡ��Boolean�������boolean����
		boolean bb = bObj.booleanValue();
		//ȡ��Integer�������int����
		int i =itObj.intValue();
		//ȡ��Float�������float����
		float f = fl.floatValue();
		
		System.out.println(bb+" "+i+" "+f);
		
		//����ת���������Է�����Ϊ�˽������JDK1.5��ʼ�ṩ���Զ�װ����Զ����䣬��ϸ�뿴AutoBoxingUnboxing.java
	}

	
	
}
