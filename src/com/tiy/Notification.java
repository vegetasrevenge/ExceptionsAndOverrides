package com.tiy;


import java.time.LocalDateTime;


public abstract class Notification {
    private  LocalDateTime createdAt = LocalDateTime.now();
    private String subject;
    private String body;
    protected String status = "Available";

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
    }

    public LocalDateTime getDate() {
        return createdAt;
    }

    public String getBody() {
        return body;
    }

    public String getSubject() {
        return subject;
    }

    public void showStatus() {
        System.out.println("Current Status: " + status + ".");
    }

    protected void testPrint() {
        System.out.println("This is a test line for PROTECTED methods. \n");
    }


    public abstract void transport();
}
