package com.example.goblin.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Authorities {
    
    @Id
    private String username;
    @Column(nullable = false)
    private String authority;
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getAuthority() {
        return authority;
    }
    
    public void setAuthority(String authority) {
        this.authority = authority;
    }
    
    @Override
    public String toString() {
        return "Authorities{" + "userId='" + userId + '\'' + ", authority='" + authority + '\'' + '}';
    }
}
