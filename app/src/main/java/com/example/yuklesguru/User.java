package com.example.yuklesguru;

public class User {
    public String FullName, date, Email, gender;
    public int Reputation;

    public User(){

    }

    public User(String FN, String em, String Gen, String dt, int Rep){
        this.date = dt;
        this.FullName = FN;
        this.Email = em;
        this.gender = Gen;
        this.Reputation = Rep;
    }


}
