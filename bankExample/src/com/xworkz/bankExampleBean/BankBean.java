package com.xworkz.bankExampleBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BankBean {
	@Value("SBI")
	private String BankName;
	
	@Value("Kengei satelitte town")
	private String Address;
	
	@Value("12345")
	private int BankId;
	
	@Autowired
	private CustomerBean customer;
	
	public void getAllBankDetails() {
		customer.getCustomersDetail();
		System.out.println("Make customer happy");
	}
	
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getBankId() {
		return BankId;
	}
	public void setBankId(int bankId) {
		BankId = bankId;
	}
	public CustomerBean getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerBean customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "BankBean [BankName=" + BankName + ", Address=" + Address + ", BankId=" + BankId + ", customer="
				+ customer + ", getBankName()=" + getBankName() + ", getAddress()=" + getAddress() + ", getBankId()="
				+ getBankId() + ", getCustomer()=" + getCustomer() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
