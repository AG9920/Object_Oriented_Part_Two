package com.futuregong.crazy_Java;

public class TestSeason {
	
	public TestSeason(Season s){
		System.out.println(s.getName()+",������һ��"+s.getDesc()+"�ļ���");
	}
	public static void main(String[] args) {
		//ֱ��ʹ��Season��FALL��������һ��Season����
		new TestSeason(Season.FALL);
	}

}
