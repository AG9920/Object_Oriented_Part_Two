package com.futuregong.crazy_Java;

//�Զ�װ�䣬����ʾ��

/*
 * �Զ�װ�䣺��һ���������ͱ���ֱ�Ӹ�����Ӧ�İ�װ����������߸���Object������������ĸ��࣬��������ֱ�Ӹ������������
 * �Զ����䣺ֱ�ӰѰ�װ�����ֱ�Ӹ���һ����Ӧ�Ļ������ͱ���
 */

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
