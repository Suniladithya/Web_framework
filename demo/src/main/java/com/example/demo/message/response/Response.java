package com.example.demo.message.response;

public class Response
 {
    private long id;
    private String firstname;
    private String lastname;
    public void setId(long id) {
        this.id = id;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public Response(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public long getId() {
        return id;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    

}
