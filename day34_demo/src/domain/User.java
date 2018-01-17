package domain;
/*
 *  uid INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(50),
  pwd VARCHAR(32),
  age INT
 */
public class User {
	private int uid;
	private String username;
	private String pwd;
	private int age;
	public User() {
		super();
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
