package com.hm.InAndMarkSys.model;

import java.util.HashSet;
import java.util.Set;

/**
 * TbWl entity. @author MyEclipse Persistence Tools
 */

public class TbWl implements java.io.Serializable {

	// Fields

	private Integer id;
	private TbGys tbGys;
	private String wlid;
	private String wlname;
	private Double wlprice;
	private Integer wlnum;
	private Double wltotalprice;
	private Set tbXsRecords = new HashSet(0);
	private Set tbCgWls = new HashSet(0);

	// Constructors

	/** default constructor */
	public TbWl() {
	}

	/** minimal constructor */
	public TbWl(String wlid) {
		this.wlid = wlid;
	}

	/** full constructor */
	public TbWl(TbGys tbGys, String wlid, String wlname, Double wlprice,
			Integer wlnum, Double wltotalprice, Set tbXsRecords, Set tbCgWls) {
		this.tbGys = tbGys;
		this.wlid = wlid;
		this.wlname = wlname;
		this.wlprice = wlprice;
		this.wlnum = wlnum;
		this.wltotalprice = wltotalprice;
		this.tbXsRecords = tbXsRecords;
		this.tbCgWls = tbCgWls;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TbGys getTbGys() {
		return this.tbGys;
	}

	public void setTbGys(TbGys tbGys) {
		this.tbGys = tbGys;
	}

	public String getWlid() {
		return this.wlid;
	}

	public void setWlid(String wlid) {
		this.wlid = wlid;
	}

	public String getWlname() {
		return this.wlname;
	}

	public void setWlname(String wlname) {
		this.wlname = wlname;
	}

	public Double getWlprice() {
		return this.wlprice;
	}

	public void setWlprice(Double wlprice) {
		this.wlprice = wlprice;
	}

	public Integer getWlnum() {
		return this.wlnum;
	}

	public void setWlnum(Integer wlnum) {
		this.wlnum = wlnum;
	}

	public Double getWltotalprice() {
		return this.wltotalprice;
	}

	public void setWltotalprice(Double wltotalprice) {
		this.wltotalprice = wltotalprice;
	}

	public Set getTbXsRecords() {
		return this.tbXsRecords;
	}

	public void setTbXsRecords(Set tbXsRecords) {
		this.tbXsRecords = tbXsRecords;
	}

	public Set getTbCgWls() {
		return this.tbCgWls;
	}

	public void setTbCgWls(Set tbCgWls) {
		this.tbCgWls = tbCgWls;
	}

}