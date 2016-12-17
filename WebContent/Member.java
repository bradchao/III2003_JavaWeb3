package tw.brad.j2ee;

import java.io.Serializable;

/*
 * JavaBean
 * 1. implements Serializable
 * 2. public class
 * 3. 屬性成員一定不可以 public
 * 4. => getter, setter
 */
public class Member implements Serializable {
	private String id;
	private String name;
	
	public void setId(String id){this.id = id;}
	public void setName(String name){this.name = name;}
	public String getId(){return id;}
	public String getName(){return name;}
}
