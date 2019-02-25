package day14_list;

import java.net.URL;

public class User {
	
	private String name;
	private String pass;
	
	public User(String name) {
		this.name= name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public boolean equals(Object obj) {
		User u=(User) obj; 
		System.out.println(u.getName()+"---"+name);
		return (u.getName().equals(name));
	}
	
	@Override
	public int hashCode() {
		return 60;
	}
	
	public URL getPath() {
		return this.getClass().getResource("/");
	}
}
