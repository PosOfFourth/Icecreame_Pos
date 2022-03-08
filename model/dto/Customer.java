package model.dto;

public class Customer {
	private String cus_id;
	private String cus_pwd;
	
	public Customer() {}

	public Customer(String cus_id, String cus_pwd) {
		super();
		this.cus_id = cus_id;
		this.cus_pwd = cus_pwd;
	}

	public String getCus_id() {
		return cus_id;
	}

	public void setCus_id(String cus_id) {
		this.cus_id = cus_id;
	}

	public String getCus_pwd() {
		return cus_pwd;
	}

	public void setCus_pwd(String cus_pwd) {
		this.cus_pwd = cus_pwd;
	}

}
