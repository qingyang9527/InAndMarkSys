package com.hm.InAndMarkSys.model;

/**
 * TbCgWl entity. @author MyEclipse Persistence Tools
 */

public class TbCgWl implements java.io.Serializable {

	// Fields

	private Integer id;
	private TbCg tbCg;
	private TbWl tbWl;

	// Constructors

	/** default constructor */
	public TbCgWl() {
	}

	/** full constructor */
	public TbCgWl(TbCg tbCg, TbWl tbWl) {
		this.tbCg = tbCg;
		this.tbWl = tbWl;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TbCg getTbCg() {
		return this.tbCg;
	}

	public void setTbCg(TbCg tbCg) {
		this.tbCg = tbCg;
	}

	public TbWl getTbWl() {
		return this.tbWl;
	}

	public void setTbWl(TbWl tbWl) {
		this.tbWl = tbWl;
	}

}