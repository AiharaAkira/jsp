package com.re.account;

import java.math.BigDecimal;
import java.sql.Date;

public class AccountVO {

	private String u_id;
	private String u_pw;
	private String u_name;
	private String u_nickName;
	private String u_profileImg;
	private BigDecimal u_typeOfManager;
	private Date u_date;
	
	public AccountVO() {
	}

	public AccountVO(String u_id, String u_pw, String u_name, String u_nickName, String u_profileImg,
			BigDecimal u_typeOfManager, Date u_date) {
		super();
		this.u_id = u_id;
		this.u_pw = u_pw;
		this.u_name = u_name;
		this.u_nickName = u_nickName;
		this.u_profileImg = u_profileImg;
		this.u_typeOfManager = u_typeOfManager;
		this.u_date = u_date;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public String getU_pw() {
		return u_pw;
	}

	public void setU_pw(String u_pw) {
		this.u_pw = u_pw;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_nickName() {
		return u_nickName;
	}

	public void setU_nickName(String u_nickName) {
		this.u_nickName = u_nickName;
	}

	public String getU_profileImg() {
		return u_profileImg;
	}

	public void setU_profileImg(String u_profileImg) {
		this.u_profileImg = u_profileImg;
	}

	public BigDecimal getU_typeOfManager() {
		return u_typeOfManager;
	}

	public void setU_typeOfManager(BigDecimal u_typeOfManager) {
		this.u_typeOfManager = u_typeOfManager;
	}

	public Date getU_date() {
		return u_date;
	}

	public void setU_date(Date u_date) {
		this.u_date = u_date;
	}
	
	
	
	
}
