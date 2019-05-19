package com.paf.sellandbuy.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class PaymentDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pid")
    private int pid;

    @Column(name = "oid")
    private int oid;

    @Column(name = "cost")
    private float cost;

    @Column(name = "address")
    private String address;

    @Column(name = "date")
    private String date;

    @Column(name = "card_no")
    private String card_no;

    public PaymentDTO (){
        super();
    }

    public PaymentDTO(int pid, int oid, float cost, String address, String date, String card_no){
        super();
        this.pid = pid;
        this.oid = oid;
        this.cost = cost;
        this.address = address;
        this.date = date;
        this.card_no = card_no;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }
}
