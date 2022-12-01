package com.project.statements;

public class SwitchStatement {
	public static void main(String[] args) {
		String gadgets="Phone";
		switch(gadgets) {
		case "Phone":
			System.out.println("Smallest Screen");
			break;
		case "Ipad":
			System.out.println("Screen size is bigger than phone but smaller than Laptop");
			break;
		case "Laptop":
			System.out.println("Screen is bigger than Phone and Ipad");
			break;
		default:
			System.out.println("Not a Gadget");
		}
	}

}
