package com.phga.spring6.model;

import javax.persistence.*;

@Entity
public class roles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true)
    private String roles;


    public void setId(long id){
        this.id = id;
    }
    private long getId(){
        return id;
    }




}
