package com.AdressbookInfo;

public class AddressBookEx {
	
	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook");
}
	
String FirstName;String LastName;String Address;String City;String State;String Email;
long ZipCode;
long PhoneNumber;

	
public AddressBookEx(String Name, String Surname, String address, String city, String state, long zip, long contact, String mail) {
		
 this.FirstName = Name; this.LastName = Surname;this.Address = address;this.City = city;this.State = state;this.Email = mail;
 this.ZipCode = zip;
 this.PhoneNumber = contact;
 
}
  public String toString() {
return String.format(FirstName + ","  
		+ LastName + ","
		+ Address + ","
                + City + ","
		+ State + "," 
                + ZipCode + "," 
		+ PhoneNumber + ","
                + Email);
 
   }
	
}




