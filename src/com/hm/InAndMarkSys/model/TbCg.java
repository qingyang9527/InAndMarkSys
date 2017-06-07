package com.hm.InAndMarkSys.model;

import java.util.HashSet;
import java.util.Set;

/**
 * TbCg entity. @author MyEclipse Persistence Tools
 */

public class TbCg implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer purchaseId;
	private String purchaser;
	private Integer invoiceNumber;
	private Set tbCgWls = new HashSet(0);

	// Constructors

	/** default constructor */
	public TbCg() {
	}

	/** minimal constructor */
	public TbCg(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	/** full constructor */
	public TbCg(Integer purchaseId, String purchaser, Integer invoiceNumber,
			Set tbCgWls) {
		this.purchaseId = purchaseId;
		this.purchaser = purchaser;
		this.invoiceNumber = invoiceNumber;
		this.tbCgWls = tbCgWls;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPurchaseId() {
		return this.purchaseId;
	}

	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getPurchaser() {
		return this.purchaser;
	}

	public void setPurchaser(String purchaser) {
		this.purchaser = purchaser;
	}

	public Integer getInvoiceNumber() {
		return this.invoiceNumber;
	}

	public void setInvoiceNumber(Integer invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Set getTbCgWls() {
		return this.tbCgWls;
	}

	public void setTbCgWls(Set tbCgWls) {
		this.tbCgWls = tbCgWls;
	}

}