package com.example.demo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long orderid;

    @Column(name = "restaurantid")
    public long restaurantid;

    @Column(name = "userid")
    public long userid;

    @Column(name = "storename")
    public String storename;

    @Column(name = "date")
    public Date date;

    @Column(name = "totalprice")
    public float totalprice;

    @Column(name = "state")
    public int state;

    @Column(name = "note")
    public String note;

    @Column(name = "address")
    public String address;

    @Column(name = "arrivingtime")
    public Date arrivingtime;

    public long getOrderid() {
        return orderid;
    }

    public void setOrderid(long orderid) {
        this.orderid = orderid;
    }

    public long getRestaurantid() {
        return restaurantid;
    }

    public void setRestaurantid(long restaurantid) {
        this.restaurantid = restaurantid;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getArrivingtime() {
        return arrivingtime;
    }

    public void setArrivingtime(Date arrivingtime) {
        this.arrivingtime = arrivingtime;
    }
}
