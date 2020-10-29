package com.xianmaeve.reviews;

import com.xianmaeve.reviews.models.Review;
import com.xianmaeve.reviews.models.Type;
import com.xianmaeve.reviews.repositories.ReviewRepository;
import com.xianmaeve.reviews.repositories.TypeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

@DataJpaTest
public class JPATest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private TypeRepository typeRepo;

    @Autowired
    private ReviewRepository reviewRepo;

    @Test
    public void typeShouldListReviews() {
        Type testType = new Type("Test");
        Review testReview1 = new Review("Test1", "url", testType, "content", "date");
        Review testReview2 = new Review("Test2", "url", testType, "content", "date");

        typeRepo.save(testType);
        reviewRepo.save(testReview1);
        reviewRepo.save(testReview2);

        entityManager.flush();
        entityManager.clear();

        Optional<Type> pulledTypeOpt = typeRepo.findById(testType.getId());
        Type pulledType = pulledTypeOpt.get();
        assertThat(pulledType.getReviews()).contains(testReview1, testReview2);
    }
}
