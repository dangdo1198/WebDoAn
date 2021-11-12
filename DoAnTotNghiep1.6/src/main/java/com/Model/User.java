package com.Model;

public class User {
	
	
	private int id;
	private String tenNguoiDung;
	private String matKhau;
	private String email;
	private String role;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTenNguoiDung() {
		return tenNguoiDung;
	}


	public void setTenNguoiDung(String tenNguoiDung) {
		this.tenNguoiDung = tenNguoiDung;
	}


	public String getMatKhau() {
		return matKhau;
	}


	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", tenNguoiDung=" + tenNguoiDung + ", matKhau=" + matKhau + ", email=" + email
				+ ", role=" + role + "]";
	}
	

	
	
	

}
