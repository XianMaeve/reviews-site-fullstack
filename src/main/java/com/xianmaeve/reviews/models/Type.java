package com.xianmaeve.reviews.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Type {

    @Id
    @GeneratedValue
    private Long id;
    private String value;
    @OneToMany(mappedBy = "reviewCategory")
    private Collection<Review> reviews;

    public Type(Collection<Review> reviews) {
        this.reviews = reviews;
    }

    public Type(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Type() {

    }

    public String getValue() {
        return value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Collection<Review> getReviews() {
        return reviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return Objects.equals(id, type.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
