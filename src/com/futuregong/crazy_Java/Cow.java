package com.futuregong.crazy_Java;

public class Cow {
	
	private double weight;
	public Cow(){
		
	};
	public Cow(double weight){
		this.weight = weight;
	}
	
	
	
	//����һ���Ǿ�̬�ڲ���
	private class Cowleg{
		//�Ǿ�̬�ڲ������������
		private double length;
		private String color;
		//�Ǿ�̬�ڲ�����������صĹ�����
		public Cowleg(){
			
		};
		public Cowleg(double length,String color){
			this.length = length;
			this.color = color;
		}
		public void setLength(double length){
			this.length = length;
		}
		public double getLength(){
			return length;
		}
		public void setColor(String color){
			this.color = color;
		}
		public String getColor(){
			return this.color;
		}
		//�Ǿ�̬�ڲ����ʵ������
		public void info(){
			System.out.println("��ǰţ�ȵ���ɫ�ǣ�"+color+",��"+length);
			//ֱ�ӷ����ⲿ���private���ԣ�weight
			System.out.println("��ţ��������ţ�أ�"+weight);
		}
	}
	
	public void test(){
		Cowleg c1 = new Cowleg(1.12,"�ڰ����");
		c1.info();
	}
	public static void main(String[] args){
		Cow cow = new Cow(378.9);
		cow.test();
	}
	
	

}
