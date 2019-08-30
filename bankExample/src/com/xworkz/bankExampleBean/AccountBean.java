package com.xworkz.bankExampleBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AccountBean {
	@Value("12345678")
	private int accId;
	
	@Value("Saving Acc")
	private String accType;
	
	public void getAccounts() {
		System.out.println("Account details");
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	@Override
	public String toString() {
		return "AccountBean [accId=" + accId + ", accType=" + accType + ", getAccId()=" + getAccId() + ", getAccType()="
				+ getAccType() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
