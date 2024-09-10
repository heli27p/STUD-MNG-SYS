package com.studs.STUD_MNG_SYS.Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {
    private String username;
    private String password;

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }
}