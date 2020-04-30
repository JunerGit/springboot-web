package vip.juner.springboot.web.system.model;

public class JDBC {
	private String uid;
	private String name;
	private Integer age;
	
	public JDBC() {
		super();
	}
	public JDBC(String uid,String name,Integer age) {
		this.uid = uid;
		this.name = name;
		this.age = age;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "JDBC [uid=" + uid + ", name=" + name + ", age=" + age + "]";
	}
}
