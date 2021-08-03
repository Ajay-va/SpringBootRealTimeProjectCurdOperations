package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="custtabs")
public class Customer {

	@Id
	@GeneratedValue
	@Column(name="cid")
	private Integer custId;

	@Column(name="cname")
	private String custName;

	@Column(name="ccost")
	private Double custCost;

	@Column(name="cphone")
	private Integer custPhone;
	public Customer() {
		super();
	}
	public Customer(Integer custId, String custName, Double custCost, Integer custPhone) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custCost = custCost;
		this.custPhone = custPhone;
	}
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Double getCustCost() {
		return custCost;
	}
	public void setCustCost(Double custCost) {
		this.custCost = custCost;
	}
	public Integer getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(Integer custPhone) {
		this.custPhone = custPhone;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custCost=" + custCost + ", custPhone="
				+ custPhone + "]";
	}
	
	
	
	
	
}
