package com.tiy;

public class TextNotification extends Notification {

    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
    }

    @Override
    public void transport() {
        System.out.println("*****************************************");
        testPrint();
        System.out.println("Notification Contents-- \n"
                + "Body: " + super.getBody() + "\n"
                + "Subject: " + super.getSubject() + "\n"
                + "Created on: " + getDate() + ". \n");
        System.out.println("Text Notification Contents-- \n"
                + "Recipient: "+ getRecipient() + "\n"
                + "SMS Provider: " + getSmsProvider() + ".");
        System.out.println("*****************************************");
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

}
