package com.hm.InAndMarkSys.model;

import java.sql.Timestamp;

/**
 * TbRuku entity. @author MyEclipse Persistence Tools
 */

public class TbRuku implements java.io.Serializable {

	// Fields

	private Integer id;
	private Admin admin;
	private TbCk tbCk;
	private String rukuid;
	private Timestamp rktime;
	private Double price;
	private Integer num;
	private Double rktotalprice;

	// Constructors

	/** default constructor */
	public TbRuku() {
	}

	/** full constructor */
	public TbRuku(Admin admin, TbCk tbCk, String rukuid, Timestamp rktime,
			Double price, Integer num, Double rktotalprice) {
		this.admin = admin;
		this.tbCk = tbCk;
		this.rukuid = rukuid;
		this.rktime = rktime;
		this.price = price;
		this.num = num;
		this.rktotalprice = rktotalprice;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public TbCk getTbCk() {
		return this.tbCk;
	}

	public void setTbCk(TbCk tbCk) {
		this.tbCk = tbCk;
	}

	public String getRukuid() {
		return this.rukuid;
	}

	public void setRukuid(String rukuid) {
		this.rukuid = rukuid;
	}

	public Timestamp getRktime() {
		return this.rktime;
	}

	public void setRktime(Timestamp rktime) {
		this.rktime = rktime;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Double getRktotalprice() {
		return this.rktotalprice;
	}

	public void setRktotalprice(Double rktotalprice) {
		this.rktotalprice = rktotalprice;
	}

}