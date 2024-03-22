package com.ohgiraffers.springbootpractice;

import java.time.LocalDateTime;
import java.util.Date;

public class OrderDTO {
    private String productName;
    private int amount;
    private String name;
    private String address;
    private String phone;
    private Date date;

    public OrderDTO() {
    }

    public OrderDTO(String productName, int amount, String name, String address, String phone, Date date) {
        this.productName = productName;
        this.amount = amount;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.date = date;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "productName='" + productName + '\'' +
                ", amount=" + amount +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", date=" + date +
                '}';
    }
}
