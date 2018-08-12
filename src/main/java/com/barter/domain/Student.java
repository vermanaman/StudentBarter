package com.barter.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Student extends User{
	
	@ManyToMany(cascade=CascadeType.ALL)
	 @JoinTable(
		      name="STUDENT_SUBSCRIPTION",
		      joinColumns=@JoinColumn(name="STUDENT_ID", referencedColumnName="ID"),
		      inverseJoinColumns=@JoinColumn(name="SUBSCRIPTION_ID", referencedColumnName="ID"))
	private List<Subscription> subscriptions = new ArrayList<Subscription>();
	
	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}
	
	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	
}
