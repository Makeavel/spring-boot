package com.phga.spring6.model;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import javax.persistence.*;

@Entity
@Table(name = "Usuario")
public class user {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    public long id;
    @Column(name = "name")
    private String name;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email" , nullable = false)
    private String email;
    @Column(name = "senha")
    private String Senha;
    @Column(name = "nickName")
    private String nickName;

    public user(){} // quando quiser usar normal só chamar esse método

    public user(String name , String lastName , String email , String Senha , String nickName ){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.Senha = Senha;
        this.nickName = nickName;
    }

    public void setId(long id){
        this.id = id;
    }
    private long getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    private String getName(){
        return name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    private String getLastName(){
        return lastName;
    }

    public void setEmail(String email){
        this.email = email;
    }
    private String getEmail(){
        return email;
    }

    public void setSenha(String Senha){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        this.Senha = passwordEncoder.encode(Senha);
    }
    private String getSenha(){
        return Senha;
    }

    public void setNickName(String nickName){
        this.nickName = nickName;
    }
    private String getNickName(){
        return nickName;
    }



}
