package com.hm.InAndMarkSys.model;

import java.util.HashSet;
import java.util.Set;

/**
 * TbUser entity. @author MyEclipse Persistence Tools
 */

public class TbUser implements java.io.Serializable {

	// Fields

	private Integer userid;
	private String username;
	private String userAddress;
	private String userPhone;
	private String userMail;
	private Set tbXsRecords = new HashSet(0);

	// Constructors

	/** default constructor */
	public TbUser() {
	}

	/** full constructor */
	public TbUser(String username, String userAddress, String userPhone,
			String userMail, Set tbXsRecords) {
		this.username = username;
		this.userAddress = userAddress;
		this.userPhone = userPhone;
		this.userMail = userMail;
		this.tbXsRecords = tbXsRecords;
	}

	// Property accessors

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserAddress() {
		return this.userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserMail() {
		return this.userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public Set getTbXsRecords() {
		return this.tbXsRecords;
	}

	public void setTbXsRecords(Set tbXsRecords) {
		this.tbXsRecords = tbXsRecords;
	}

}