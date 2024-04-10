package com.ecommerce.startapp;
import java.util.Scanner;

import com.ecommerce.exception.*;
import com.ecommerce.guest.*;
import com.ecommerce.user.*;
import com.ecommerce.admin.*;


public class StartECommerceApplication {

	
	Scanner sc = new Scanner(System.in);
	//1
	public void userRegistration() {

		
	}
	//2
	public void userLogin() {
		
		
	}
	//3
	public void productList() {
		
		
	}
	//4
	public void buyProducts() {
		
		
	}
	//5
	public void viewCart() {
		
		
	}
	//6
	public void purchaseItem() {
		
		
	}
	
	//7
	public void addProductByAdmin() {
		

		
	}
	//8
	public void calculateBillForUser() {
		
		
	}
	
	//10
	public void checkQuantity() {
		
		
	}
	
	//11
	public void checkRegisterUserList() {
		
		
	}
	//12
	public void checkRegisterUserHistory() {
		
		
	}
	
	//13
	public void viewListOfProduct() {
			
			
	}
	
	public static void main(String[] args) {
		
		StartECommerceApplication eComApp = new StartECommerceApplication();
		System.out.println("******Welcome to E-Commerce based application********");

		System.out.println("-------user operations choose one of the follwing task----------");
	
		System.out.println("1 . User Registration");
		System.out.println("2 . User login");
		System.out.println("3 . User view Product item as Sorted Order");
		System.out.println("4 . Buy Product");
		System.out.println("5 . View Cart");
		System.out.println("6 . Purchase the item");
		
		System.out.println("------------Admin Operations----------------");
		System.out.println("7 . Add Product Item");
		System.out.println("8 .Calculate Bill");
		System.out.println("9 . Display Amount to end user");
		System.out.println("10 . Check Quantity");
		System.out.println("11 . Check registered user");
		System.out.println("12 . Check the particular user history");
		
		System.out.println("------------Guest  Operations----------------");
		
		System.out.println("13 . View Product Item");
			
	while(true) {
		
		//1
		   System.out.print("enetr your choice>>");
		   Scanner sc = new Scanner(System.in);
		   int userChoice = sc.nextInt();
		   
		
		   if(userChoice == 1) {
				
			   eComApp.userRegistration();
		   }else if(userChoice == 2) {
			
			   eComApp.userLogin();
		   }else if(userChoice == 3) {
			
			   eComApp.productList();
		   }else if(userChoice == 4) {
			
			   eComApp.buyProducts();
		   }else if(userChoice == 5) {
			
			   eComApp.viewCart();
		   }else if(userChoice == 6) {
			
			   eComApp.purchaseItem();
		   }else if(userChoice == 7) {
				
			   eComApp.addProductByAdmin();
		   }else if(userChoice == 8) {
			
			   eComApp.calculateBillForUser();
		   }else if(userChoice == 10) {
				
			   eComApp.checkQuantity();
		   }else if(userChoice == 11) {
			
			   eComApp.checkRegisterUserList();
		   }else if(userChoice == 12) {
			   eComApp.checkRegisterUserHistory();
		   }else if(userChoice == 13) {
			  
			   eComApp.viewListOfProduct();
			    
		   }else{
			
			   throw new ResourceNotFoundException("please enter valid userChoice...");
		   }
          
		   System.out.print("do you want to contineu shoping ((1)Y/(0)/N) >> ");
		   int num = sc.nextInt();
		   if(num ==0) {
			 System.out.println("Thank you for visiting us...");
			 break;
		   }
	 
	}
  }

}



