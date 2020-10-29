package com.xianmaeve.reviews.repositories;

import com.xianmaeve.reviews.models.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long> {
    Review findReviewByTitle (String title);
}
