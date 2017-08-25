package com.tiy;

public class EmailNotification extends Notification {

    private String recipient;
    private String smtpProvider;


    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        super.status = "OOO";
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;

    }

    //cloning was not confusing at all.... yeah right!
    @Override
    protected Object clone() {

        EmailNotification clone = new EmailNotification(this.getSubject(), this.getBody(), this.getRecipient(), this.getSmtpProvider());
        return clone;
    }

    @Override
    public void transport() {
        System.out.println("******************************************");
        testPrint();
        System.out.println("Notification contents-- \n"
                + "Subject: " + super.getSubject() + "\n"
                + "Created on: " + super.getDate() + "\n"
                + "Body: " + super.getBody() + ". \n");

        System.out.println("Email Notification Detail-- \n"
                + "Recipient: " + getRecipient() + "\n"
                + "SMPT: " + getSmtpProvider() + ".");
        System.out.println("******************************************");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
        return smtpProvider != null ? smtpProvider.equals(that.smtpProvider) : that.smtpProvider == null;
    }

    @Override
    public int hashCode() {
        int result = recipient != null ? recipient.hashCode() : 0;
        result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
        return result;
    }

    //makes method public in override --- can do!
    @Override
    public void testPrint() {
        System.out.println("This is an OVERRIDDEN test method. Test print is PUBLIC in Emails. \n");
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }



}
