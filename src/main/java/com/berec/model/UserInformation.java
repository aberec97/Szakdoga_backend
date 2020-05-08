package com.berec.model;

public class UserInformation {

    private String nev;
    private String email;
    private boolean admin;

    public UserInformation(String nev, String email, boolean admin) {
        this.nev = nev;
        this.email = email;
        this.admin = admin;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

}