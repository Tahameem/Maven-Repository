package com.xworkz.BankTester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.bankExampleBean.BankBean;



public class BankTester {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		BankBean   bankbean=context.getBean(BankBean.class);
		System.out.println(bankbean.getBankName());	
		System.out.println(bankbean.getBankId());
		System.out.println(bankbean.getAddress());
		System.out.println(bankbean.getCustomer());
		bankbean.getAllBankDetails();
		System.out.println("Bank Details");
		

	}

}
