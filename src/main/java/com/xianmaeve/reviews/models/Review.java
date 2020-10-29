package com.xianmaeve.reviews.models;

import javax.persistence.*;
import java.util.*;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private Long id;
    private String title = "";
    private String imageUrl = "";
    @ManyToOne
    private Type reviewCategory;
    @Lob
    private String reviewContent = "";
    private String reviewDate = "";

    public Review() {
    }

    public Review(String title, String imageUrl, Type reviewCategory, String reviewContent, String reviewDate) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.reviewCategory = reviewCategory;
        this.reviewContent = reviewContent;
        this.reviewDate = reviewDate;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Type getReviewCategory() {
        return reviewCategory;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return Objects.equals(id, review.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
