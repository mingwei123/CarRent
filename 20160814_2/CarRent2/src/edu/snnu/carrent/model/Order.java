package edu.snnu.carrent.model;

import java.util.Date;

public class Order {
	private Integer id;// 订单号
	// new
	private String drivername;// 驾驶员姓名
	private Date birthday; // 出生日期

	private Integer telephone;// 电话
	private Date takeday; // 取车日期
	private Date backday; // 还车日期
	private String takeplace; // 取车地点
	private String backplace; // 还车地点
	private String payway; // 付款方式
	private Integer price; // 付款金额
	private String company; // 所属公司
	private String carname; // 车辆名称
	private String service; // 包含服务
	private Integer isPay;// 是否已付款
	private byte[] photo; // 头像图片
	private User user;

	// private String desc;//一大段文字
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
