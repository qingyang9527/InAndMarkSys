package com.hm.InAndMarkSys.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private Set tbRukus = new HashSet(0);

	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** full constructor */
	public Admin(String username, String password, Set tbRukus) {
		this.username = username;
		this.password = password;
		this.tbRukus = tbRukus;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set getTbRukus() {
		return this.tbRukus;
	}

	public void setTbRukus(Set tbRukus) {
		this.tbRukus = tbRukus;
	}

}