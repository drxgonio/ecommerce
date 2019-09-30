package com.example.ecommerce.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;


import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Table(name="category_sub")
@Data
public class Category_Sub {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name="idCategory")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    @NotFound(action = NotFoundAction.IGNORE)
    @JsonIgnore
    private Category category;

    @Column(name="linkimage")
    private String linkimage;



    public Category_Sub() {
    }
}
