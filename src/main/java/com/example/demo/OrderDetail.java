package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "t_order_detail")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long detailid;

    @Column(name = "orderid")
    public long  orderid;

    @Column(name = "menuid")
    public long menuid;

    @Column(name = "menuname")
    public String menuname;

    @Column(name = "menunumber")
    public int menunumber;

    public long getDetailid() {
        return detailid;
    }

    public void setDetailid(long detailid) {
        this.detailid = detailid;
    }

    public long getOrderid() {
        return orderid;
    }

    public void setOrderid(long orderid) {
        this.orderid = orderid;
    }

    public long getMenuid() {
        return menuid;
    }

    public void setMenuid(long menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public int getMenunumber() {
        return menunumber;
    }

    public void setMenunumber(int menunumber) {
        this.menunumber = menunumber;
    }
}
