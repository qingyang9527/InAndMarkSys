package com.hm.InAndMarkSys.model;

/**
 * TbXs entity. @author MyEclipse Persistence Tools
 */

public class TbXs implements java.io.Serializable {

	// Fields

	private Integer id;
	private TbXsRecord tbXsRecord;
	private String xsname;
	private Integer invoiceid;

	// Constructors

	/** default constructor */
	public TbXs() {
	}

	/** full constructor */
	public TbXs(TbXsRecord tbXsRecord, String xsname, Integer invoiceid) {
		this.tbXsRecord = tbXsRecord;
		this.xsname = xsname;
		this.invoiceid = invoiceid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TbXsRecord getTbXsRecord() {
		return this.tbXsRecord;
	}

	public void setTbXsRecord(TbXsRecord tbXsRecord) {
		this.tbXsRecord = tbXsRecord;
	}

	public String getXsname() {
		return this.xsname;
	}

	public void setXsname(String xsname) {
		this.xsname = xsname;
	}

	public Integer getInvoiceid() {
		return this.invoiceid;
	}

	public void setInvoiceid(Integer invoiceid) {
		this.invoiceid = invoiceid;
	}

}