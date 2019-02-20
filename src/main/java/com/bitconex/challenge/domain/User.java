package com.bitconex.challenge.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

/**
 * @author ozanozgurdursun
 *
 */
@Entity
@Table(name = "app_user")
@Audited
public class User extends AuditModel implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -8797613450156685386L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column
    private String fullName;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private  List<Product> product;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	} 

}
