package com.xworkz.bankExampleBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomerBean {
	@Value("Shradha")
	private String custName;
	
	@Value("1231")
	private int custId;
	
	@Value("Belagavi")
	private String custAdress;
	
	@Autowired
	private AccountBean account;
	
	public void getCustomersDetail() {
		account.getAccounts();
		System.out.println("Customer details");
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustAdress() {
		return custAdress;
	}
	public void setCustAdress(String custAdress) {
		this.custAdress = custAdress;
	}
	public AccountBean getAccount() {
		return account;
	}
	public void setAccount(AccountBean account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "CustomerBean [custName=" + custName + ", custId=" + custId + ", custAdress=" + custAdress + ", account="
				+ account + ", getCustName()=" + getCustName() + ", getCustId()=" + getCustId() + ", getCustAdress()="
				+ getCustAdress() + ", getAccount()=" + getAccount() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
