package edu.snnu.carrent.model;

import java.util.Date;

public class Order {
	private Integer id;// ������
	// new
	private String drivername;// ��ʻԱ����
	private Date birthday; // ��������

	private Integer telephone;// �绰
	private Date takeday; // ȡ������
	private Date backday; // ��������
	private String takeplace; // ȡ���ص�
	private String backplace; // �����ص�
	private String payway; // ���ʽ
	private Integer price; // ������
	private String company; // ������˾
	private String carname; // ��������
	private String service; // ��������
	private Integer isPay;// �Ƿ��Ѹ���
	private byte[] photo; // ͷ��ͼƬ
	private User user;

	// private String desc;//һ�������
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDrivername() {
		return drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getTelephone() {
		return telephone;
	}

	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}

	public Date getTakeday() {
		return takeday;
	}

	public void setTakeday(Date takeday) {
		this.takeday = takeday;
	}

	public Date getBackday() {
		return backday;
	}

	public void setBackday(Date backday) {
		this.backday = backday;
	}

	public String getTakeplace() {
		return takeplace;
	}

	public void setTakeplace(String takeplace) {
		this.takeplace = takeplace;
	}

	public String getBackplace() {
		return backplace;
	}

	public void setBackplace(String backplace) {
		this.backplace = backplace;
	}

	public String getPayway() {
		return payway;
	}

	public void setPayway(String payway) {
		this.payway = payway;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public Integer getIsPay() {
		return isPay;
	}

	public void setIsPay(Integer isPay) {
		this.isPay = isPay;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	// public String toString() {
	// return "[Order:name=" + name + " /telephone = " + telephone
	// + " /takeday = " + takeday + " /backday = " + backday
	// + " /takeplace = " + takeplace + " /backplace = " + backplace
	// + " /payway = " + payway + " /price = " + price
	// + " /company = " + company + " /carname = " + carname
	// + " /service = " + service + " /isPay = " + isPay
	// + " /photo = " + photo + "]";
	// }
}
