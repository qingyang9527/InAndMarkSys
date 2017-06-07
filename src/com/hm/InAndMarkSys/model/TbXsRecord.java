package com.hm.InAndMarkSys.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TbXsRecord entity. @author MyEclipse Persistence Tools
 */

public class TbXsRecord implements java.io.Serializable {

	// Fields

	private Integer xsid;
	private TbUser tbUser;
	private TbWl tbWl;
	private String xsname;
	private Timestamp xstime;
	private String zhekou;
	private Set tbXses = new HashSet(0);

	// Constructors

	/** default constructor */
	public TbXsRecord() {
	}

	/** full constructor */
	public TbXsRecord(TbUser tbUser, TbWl tbWl, String xsname,
			Timestamp xstime, String zhekou, Set tbXses) {
		this.tbUser = tbUser;
		this.tbWl = tbWl;
		this.xsname = xsname;
		this.xstime = xstime;
		this.zhekou = zhekou;
		this.tbXses = tbXses;
	}

	// Property accessors

	public Integer getXsid() {
		return this.xsid;
	}

	public void setXsid(Integer xsid) {
		this.xsid = xsid;
	}

	public TbUser getTbUser() {
		return this.tbUser;
	}

	public void setTbUser(TbUser tbUser) {
		this.tbUser = tbUser;
	}

	public TbWl getTbWl() {
		return this.tbWl;
	}

	public void setTbWl(TbWl tbWl) {
		this.tbWl = tbWl;
	}

	public String getXsname() {
		return this.xsname;
	}

	public void setXsname(String xsname) {
		this.xsname = xsname;
	}

	public Timestamp getXstime() {
		return this.xstime;
	}

	public void setXstime(Timestamp xstime) {
		this.xstime = xstime;
	}

	public String getZhekou() {
		return this.zhekou;
	}

	public void setZhekou(String zhekou) {
		this.zhekou = zhekou;
	}

	public Set getTbXses() {
		return this.tbXses;
	}

	public void setTbXses(Set tbXses) {
		this.tbXses = tbXses;
	}

}