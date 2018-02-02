package com.innov.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order {
    @Id
    @GeneratedValue
    private String Order_Id ;
    private int number ;
    private float price ;
    private String describe ;
    private String receive_address ;
    private String sent_address ;
    private String receive_people ;
    private String sent_people ;

    public String getOrder_Id() {
        return Order_Id;
    }

    public void setOrder_Id(String order_Id) {
        Order_Id = order_Id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getReceive_address() {
        return receive_address;
    }

    public void setReceive_address(String receive_address) {
        this.receive_address = receive_address;
    }

    public String getSent_address() {
        return sent_address;
    }

    public void setSent_address(String sent_address) {
        this.sent_address = sent_address;
    }

    public String getReceive_people() {
        return receive_people;
    }

    public void setReceive_people(String receive_people) {
        this.receive_people = receive_people;
    }

    public String getSent_people() {
        return sent_people;
    }

    public void setSent_people(String sent_people) {
        this.sent_people = sent_people;
    }
}
