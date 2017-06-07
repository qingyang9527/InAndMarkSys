package com.hm.InAndMarkSys.model;

import java.util.HashSet;
import java.util.Set;

/**
 * TbCk entity. @author MyEclipse Persistence Tools
 */

public class TbCk implements java.io.Serializable {

	// Fields

	private Integer ckid;
	private Integer id;
	private String ckname;
	private Set tbRukus = new HashSet(0);

	// Constructors

	/** default constructor */
	public TbCk() {
	}

	/** minimal constructor */
	public TbCk(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TbCk(Integer id, String ckname, Set tbRukus) {
		this.id = id;
		this.ckname = ckname;
		this.tbRukus = tbRukus;
	}

	// Property accessors

	public Integer getCkid() {
		return this.ckid;
	}

	public void setCkid(Integer ckid) {
		this.ckid = ckid;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCkname() {
		return this.ckname;
	}

	public void setCkname(String ckname) {
		this.ckname = ckname;
	}

	public Set getTbRukus() {
		return this.tbRukus;
	}

	public void setTbRukus(Set tbRukus) {
		this.tbRukus = tbRukus;
	}

}