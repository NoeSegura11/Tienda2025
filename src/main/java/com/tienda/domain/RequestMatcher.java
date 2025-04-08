package com.tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "request_matcher")
public class RequestMatcher implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_request_matcher")
    private Long idRequestMatcher;
    private String pattern;
    private String roleName;

    public RequestMatcher() {
    }

    public RequestMatcher(String pattern, String roleName) {
        this.pattern = pattern;
        this.roleName = roleName;
    }
}