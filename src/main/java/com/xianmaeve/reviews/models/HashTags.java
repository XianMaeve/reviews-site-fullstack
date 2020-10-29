package com.xianmaeve.reviews.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class HashTags {
    @Id
    @GeneratedValue
    private Long id;
    private String tag;
    @ManyToMany(mappedBy = "hashTags")
    private Collection<Review> reviews;

    public HashTags () {};

    public HashTags (String tag) {
        this.tag = tag;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashTags hashTags = (HashTags) o;
        return Objects.equals(id, hashTags.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
