package com.xianmaeve.reviews;

import com.xianmaeve.reviews.models.Review;
import com.xianmaeve.reviews.models.Type;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class TypeTEst {

    private Review testReview1 = new Review();
    private Review testReview2 = new Review();
    private Type testType = new Type(List.of(testReview1, testReview2));


    @Test
    public void canGetValue() {
        testType.setValue("test");
        assertEquals("test", testType.getValue());
    }

    @Test
    public void canGetReviews() {
        assertThat(testType.getReviews()).contains(testReview1, testReview2);
    }
}
