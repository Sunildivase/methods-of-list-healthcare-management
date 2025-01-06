package com.methodsofcollection.model;

public class Billing {
    private int billId;
    private int personId;
    private int bill;
    private int totalBill;

    @Override
    public String toString() {
        return "Billing{" +
                "billId=" + billId +
                ", personId=" + personId +
                ", bill=" + bill +
                ", totalBill=" + totalBill +
                '}';
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
}
