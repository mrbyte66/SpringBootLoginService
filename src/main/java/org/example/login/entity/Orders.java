package org.example.login.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Entity
public class Orders {

    private String tel;
    private String address;
    private Float fee;
    private Float tip;
    private Timestamp saveTime;
    private Timestamp deliverTime;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false)
    Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "state_id", nullable = false)
    State state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_id", nullable = false)
    Payment payment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "short_schedule_id", nullable = false)
    ShortSchedule shortSchedule;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(final String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(final Client client) {
        this.client = client;
    }

    public State getState() {
        return state;
    }

    public void setState(final State state) {
        this.state = state;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(final Payment payment) {
        this.payment = payment;
    }

    public ShortSchedule getShortSchedule() {
        return shortSchedule;
    }

    public void setShortSchedule(final ShortSchedule shortSchedule) {
        this.shortSchedule = shortSchedule;
    }

    public Float getFee() {
        return fee;
    }

    public void setFee(final Float fee) {
        this.fee = fee;
    }

    public Float getTip() {
        return tip;
    }

    public void setTip(final Float tip) {
        this.tip = tip;
    }

    public Timestamp getSaveTime() {
        return saveTime;
    }

    public String getSaveTimeStr(){
        return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(this.saveTime);
    }

    public void setSaveTime(final Timestamp saveTime) {
        this.saveTime = saveTime;
    }

    public Timestamp getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(final Timestamp deliverTime) {
        this.deliverTime = deliverTime;
    }
}
