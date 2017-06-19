package com.hm.InAndMarkSys.model;

import java.util.HashSet;
import java.util.Set;

/**
 * TbGys entity. @author MyEclipse Persistence Tools
 */

public class TbGys implements java.io.Serializable {

	// Fields

	private String id;
	private String gysName;
	private String gysAddress;
	private String gysPhone;
	private String gysMail;
	private Set tbWls = new HashSet(0);

	// Constructors

	/** default constructor */
	public TbGys() {
	}

	/** full constructor */
	public TbGys(String gysName, String gysAddress, String gysPhone,
			String gysMail, Set tbWls) {
		this.gysName = gysName;
		this.gysAddress = gysAddress;
		this.gysPhone = gysPhone;
		this.gysMail = gysMail;
		this.tbWls = tbWls;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGysName() {
		return this.gysName;
	}

	public void setGysName(String gysName) {
		this.gysName = gysName;
	}

	public String getGysAddress() {
		return this.gysAddress;
	}

	public void setGysAddress(String gysAddress) {
		this.gysAddress = gysAddress;
	}

	public String getGysPhone() {
		return this.gysPhone;
	}

	public void setGysPhone(String gysPhone) {
		this.gysPhone = gysPhone;
	}

	public String getGysMail() {
		return this.gysMail;
	}

	public void setGysMail(String gysMail) {
		this.gysMail = gysMail;
	}

	public Set getTbWls() {
		return this.tbWls;
	}

	public void setTbWls(Set tbWls) {
		this.tbWls = tbWls;
	}

}