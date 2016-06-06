package com.futuregong.crazy_Java;

public class OverrideEqualsRight {
	
	public static void main(String[] args) {
		Person p1 = new Person("孙悟空","1234");
		Person p2 = new Person("孙行者","1234");
		Person p3 = new Person("孙悟饭","2134");
		//p1和p2的idStr相等，所以输出true
		System.out.println("p1和p2是否相等"+p1.equals(p2));
		
		System.out.println("p2和p3是否相等"+p2.equals(p3));
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
		//只有当obj是Person对象
		if(obj!=null&&obj instanceof Person){
			Person personObj = (Person)obj;
			//并且当前对象的idStr与obj对象的idStr相等才可判断两个对象相等
			if(this.getIdStr().equals(personObj.getIdStr())){
				return true;
			}
		}
		return false;
	}
	
	
}
