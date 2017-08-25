package com.tiy;

public class Main {

    public static void main(String[] args) {
	    EmailNotification emailNotification = new EmailNotification("Job", "You're Hired!", "Blaine", "Amazon SES");
	    TextNotification textNotification = new TextNotification("Jerb", "You're Hired!", "Me", "AT or T");

	    textNotification.transport();
		emailNotification.transport();
		emailNotification.clone();
		Object emailNotificationClone = emailNotification.clone();

		System.out.println(emailNotification);
		System.out.println(emailNotificationClone);

//		if (emailNotification.equals(emailNotificationClone)) {
//			System.out.println("Email and its are clone equal.");
//		} else {
//			System.out.println("Email and its clone are not equal.");
//		}
    }
}
