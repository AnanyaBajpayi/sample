package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="token")
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long user_tokn_sid;
    @Column(name = "token")
    private String usr_tokn_val;
    @Column(name = "last_updd_ts")
    private Timestamp last_updd_ts=new Timestamp(System.currentTimeMillis());
    @Column(name="crtd_by")
    private String crtd_by="System";
    @Column(name="updd_by")
    private String updd_by="System";
    @Column(name="login")
    private String login="abajpayi@visa.com";
    @Column(name="crtd_ts")
    private Timestamp crtd_ts=new Timestamp(System.currentTimeMillis());
    @Column(name = "mbr_id")
    private int mbr_id;
    @Column(name="clnt_id")
    private int clnt_id;

    public Token(){

    }
    public Token(long user_tokn_sid, String usr_tokn_val, String crtd_by, Timestamp last_updd_ts, String updd_by, String login, Timestamp crtd_ts, int mbr_id, int clnt_id) {
        this.user_tokn_sid = user_tokn_sid;
        this.usr_tokn_val = usr_tokn_val;
        this.crtd_by = crtd_by;
        this.last_updd_ts = last_updd_ts;
        this.updd_by = updd_by;
        this.login = login;
        this.crtd_ts = crtd_ts;
        this.mbr_id = mbr_id;
        this.clnt_id = clnt_id;
    }

    // Getters and setters


    public long getUser_tokn_sid() {
        return user_tokn_sid;
    }

    public void setUser_tokn_sid(long user_tokn_sid) {
        this.user_tokn_sid = user_tokn_sid;
    }

    public String getUsr_tokn_val() {
        return usr_tokn_val;
    }

    public void setUsr_tokn_val(String usr_tokn_val) {
        this.usr_tokn_val = usr_tokn_val;
    }

    public Timestamp getLast_updd_ts() {
        return last_updd_ts;
    }

    public void setLast_updd_ts(Timestamp last_updd_ts) {
        this.last_updd_ts = last_updd_ts;
    }

    public String getCrtd_by() {
        return crtd_by;
    }

    public void setCrtd_by(String crtd_by) {
        this.crtd_by = crtd_by;
    }

    public String getUpdd_by() {
        return updd_by;
    }

    public void setUpdd_by(String updd_by) {
        this.updd_by = updd_by;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Timestamp getCrtd_ts() {
        return crtd_ts;
    }

    public void setCrtd_ts(Timestamp crtd_ts) {
        this.crtd_ts = crtd_ts;
    }

    public int getMbr_id() {
        return mbr_id;
    }

    public void setMbr_id(int mbr_id) {
        this.mbr_id = mbr_id;
    }

    public int getClnt_id() {
        return clnt_id;
    }

    public void setClnt_id(int clnt_id) {
        this.clnt_id = clnt_id;
    }
}