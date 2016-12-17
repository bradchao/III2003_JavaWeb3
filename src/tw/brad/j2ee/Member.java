package tw.brad.j2ee;

import java.io.Serializable;

/*
 * JavaBean
 * 1. implements Serializable
 * 2. public class
 * 3. 屬性成員一定不可以 public
 * 4. => getter, setter
 * 5. 有無傳參數的建構子(預設建構子)
 */
public class Member implements Serializable {
	private String id;
	private String name;
	
	public Member(){
		System.out.println("Member()");
	}
	
	public void setId(String id){
		this.id = id;
		System.out.println("setId()");
	}
	public void setName(String name){
		this.name = name;
		System.out.println("setName()");
	}
	public String getId(){return id;}
	public String getName(){
		System.out.println("getName()");
		return m1() + name;
	}
	private String m1(){
		return "OK";
	}
	
}
