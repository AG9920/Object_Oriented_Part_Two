package com.futuregong.crazy_Java;

//�Զ�װ�䣬����ʾ��

public class AutoBoxingUnboxing {
	public static void main(String[] args) {
		//ֱ�Ӱ�һ���������ͱ�������Integer����
		Integer inObj = 5;
		//ֱ�Ӱ�һ��boolean���ͱ�������һ��Object���͵ı���
		Object boolObj = true;
		//ֱ�Ӱ�һ��Integer���󸳸�int���͵ı���
		int it = inObj;
		if(boolObj instanceof Boolean){
			//�Ȱ�Object����ǿ������ת����Boolean���ͣ��ٸ���boolean����
			boolean b = (Boolean) boolObj;
			System.out.println(b);
		}
		
		
	}

}
