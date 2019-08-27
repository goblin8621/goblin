package com.example.goblin.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Users {
    
    @Id
    private String userId;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private Boolean enabled;
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Boolean getEnabled() {
        return enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    @Override
    public String toString() {
        return "Users{" + "userId='" + userId + '\'' + ", password='" + password + '\'' + ", enabled=" + enabled + '}';
    }
}
