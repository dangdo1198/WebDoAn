package com.Model;





public class TaiLieuNghienCuu {
	private int id;
	private String tenTaiLieu;
	private String tacGia;
	private int userId;
	private String linhVuc;
	private String thoiGian;
	private String linkTai;

	public TaiLieuNghienCuu() {
	};

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getTenTaiLieu() {
		return tenTaiLieu;
	}

	public void setTenTaiLieu(String tenTaiLieu) {
		this.tenTaiLieu = tenTaiLieu;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getLinhVuc() {
		return linhVuc;
	}

	public void setLinhVuc(String linhVuc) {
		this.linhVuc = linhVuc;
	}

	public String getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(String thoigian) {
		this.thoiGian = thoigian;
	}

	public String getLinkTai() {
		return linkTai;
	}

	public void setLinkTai(String linkTai) {
		this.linkTai = linkTai;
	}

	@Override
	public String toString() {
		return "TaiLieuNghienCuu [AAA=" + id +",tenTaiLieu="+tenTaiLieu+ ", tacGia=" + tacGia + ", userId=" + userId + ", linhVuc=" + linhVuc
				+ ", thoiGian=" + thoiGian + ", linkTai=" + linkTai + "]";
	}

}
