package com.futuregong.crazy_Java;

public class OverrideEqualsRight {
	
	public static void main(String[] args) {
		Person p1 = new Person("�����","1234");
		Person p2 = new Person("������","1234");
		Person p3 = new Person("����","2134");
		//p1��p2��idStr��ȣ��������true
		System.out.println("p1��p2�Ƿ����"+p1.equals(p2));
		
		System.out.println("p2��p3�Ƿ����"+p2.equals(p3));
	}
	

}

class Person{
	private String name;
	private String idStr;
	public Person(){
		
	}
	public Person(String name,String idStr){
		this.name = name;
		this.idStr =idStr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdStr() {
		return idStr;
	}
	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}
	
	public boolean equals(Object obj){
		//ֻ�е�obj��Person����
		if(obj!=null&&obj instanceof Person){
			Person personObj = (Person)obj;
			//���ҵ�ǰ�����idStr��obj�����idStr��Ȳſ��ж������������
			if(this.getIdStr().equals(personObj.getIdStr())){
				return true;
			}
		}
		return false;
	}
	
	
}
