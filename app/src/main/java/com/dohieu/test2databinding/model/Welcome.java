package com.dohieu.test2databinding.model;

public class Welcome {
    public String detel;
    public String conten;
    public String creatacount;
    public String login;

    public String getDetel() {
        return detel;
    }

    public void setDetel(String detel) {
        this.detel = detel;
    }

    public String getConten() {
        return conten;
    }

    public void setConten(String conten) {
        this.conten = conten;
    }

    public String getCreatacount() {
        return creatacount;
    }

    public void setCreatacount(String creatacount) {
        this.creatacount = creatacount;
    }

    public String getLoign() {
        return login;
    }

    public void setLoign(String loign) {
        this.login = loign;
    }

    public Welcome(String detel, String conten, String creatacount, String loign) {
        this.detel = detel;
        this.conten = conten;
        this.creatacount = creatacount;
        this.login = loign;
    }
}
