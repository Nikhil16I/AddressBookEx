package com.Addressbook;

public class AddresBListEx {

	String AddressBookName;

	public AddresBListEx(String addressBookName) {
		super();
		AddressBookName = addressBookName;
	}

	public String getAddressBookName() {
		return AddressBookName;
	}

	public void setAddressBookName(String addressBookName) {
		AddressBookName = addressBookName;
	}

	@Override
	public String toString() {
		return "AddresBListEx [AddressBookName=" + AddressBookName + "]";
	}

	

 }
