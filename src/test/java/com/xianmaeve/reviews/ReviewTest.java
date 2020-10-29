package com.xianmaeve.reviews;

import com.xianmaeve.reviews.models.Review;
import com.xianmaeve.reviews.models.Type;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewTest {

    private Type testType = new Type();
    private Review testReview = new Review("title", "url", testType, "content", "date");

    @Test
    public void canGetTitle() {
        assertEquals("title", testReview.getTitle());
    }

    @Test
    public void canGetUrl() {
        assertEquals("url", testReview.getImageUrl());
    }

    @Test
    public void canGetType() {
        assertEquals(testType, testReview.getReviewCategory());
    }

    @Test
    public void canGetContent() {
        assertEquals("content", testReview.getReviewContent());
    }

    @Test
    public void canGetDate() {
        assertEquals("date", testReview.getReviewDate());
    }
}

