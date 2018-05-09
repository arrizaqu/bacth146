package com.training.xsis.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="TRANSAKSI_PEMBELIAN")
public class Pembelian {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String id;
	@Column(name="quantity_items")
	private int quantityItems;
	@Column(name="total_price")
	private double totalPrice;
	@Column(name="create_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	@Column(name="create_user")
	private String createUser;
	@ManyToOne
	private Customer customer;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="pembelian")
	private List<DetailPembelian> detailPembelian;
	
	public List<DetailPembelian> getDetailPembelian() {
		return detailPembelian;
	}
	public void setDetailPembelian(List<DetailPembelian> detailPembelian) {
		this.detailPembelian = detailPembelian;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getQuantityItems() {
		return quantityItems;
	}
	public void setQuantityItems(int quantityItems) {
		this.quantityItems = quantityItems;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	
}
