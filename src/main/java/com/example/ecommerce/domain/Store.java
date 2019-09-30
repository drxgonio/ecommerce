package com.example.ecommerce.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name="store")
@Data
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="phone")
    private String phone;

    @Column(name="address")
    private String address;

    @Column(name="description")
    private String description;

    @Column (name="linkimage")
    private String linkimage;

    @ManyToOne
    @JoinColumn(name="id_user")
    @Cascade(value= org.hibernate.annotations.CascadeType.ALL)
    @JsonIgnore
    private User user;

}
