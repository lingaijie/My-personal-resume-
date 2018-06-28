package com.example.demo.domain;


import javax.persistence.*;

@Entity
@Table(name="administor")

public class Person {
    @Id
    @GeneratedValue
    private  int id;

    @Column(nullable = false)
    private String name;

    @Column
    private int psd;

    @Column
    private  String  phn;

    @Column
    private  String e_mail;

    @Column
    private  String infro;


    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getInfro() {
        return infro;
    }

    public void setInfro(String infro) {
        this.infro = infro;
    }

    public int getId() {
        return id;
    }

   public void setId(int id) {
        if(id>1)
        {
            this.id = id;
        }
        else
        this.id=0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPsd() {
        return psd;
    }

    public void setPsd(int psd) {
        this.psd = psd;
    }
}
