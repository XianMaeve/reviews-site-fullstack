package com.xianmaeve.reviews.controllers;

import com.xianmaeve.reviews.models.Review;
import com.xianmaeve.reviews.repositories.ReviewRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ReviewController {

    @Resource
    private ReviewRepository reviewRepo;

    @RequestMapping("/reviews")
    public String displayReviews(Model model) {
        model.addAttribute("reviewsModel", reviewRepo.findAll());
        return "reviewsTemplate";
    }

    @GetMapping("/reviews/{id}")
    public String displayReview(@PathVariable Long id, Model model) {
        Review foundReview = reviewRepo.findReviewById(id);
        model.addAttribute("review", foundReview);
        return "reviewTemplate";
    }
}

