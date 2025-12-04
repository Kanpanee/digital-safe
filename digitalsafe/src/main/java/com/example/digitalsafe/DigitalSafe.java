package com.example.digitalsafe;

public class DigitalSafe {

    // properties (private)
    private String ownerName;
    private double balance;

    // constructor: รับชื่อเจ้าของ ตั้งค่า balance เริ่มต้น = 0.0
    public DigitalSafe(String ownerName) {
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    // ฝากเงิน (รับเฉพาะค่าบวก)
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    // ดูยอดเงิน
    public double getBalance() {
        return balance;
    }

    // ดูชื่อเจ้าของ
    public String getOwnerName() {
        return ownerName;
    }
}