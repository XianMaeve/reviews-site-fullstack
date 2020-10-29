package com.xianmaeve.reviews;

import com.xianmaeve.reviews.models.Review;
import com.xianmaeve.reviews.models.Type;
import com.xianmaeve.reviews.repositories.ReviewRepository;
import com.xianmaeve.reviews.repositories.TypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private TypeRepository typeRepo;

    @Resource
    private ReviewRepository reviewRepo;

    @Override
    public void run(String...args) throws Exception {

        Type vampire = new Type("Vampire");
        typeRepo.save(vampire);

        Type werewolf = new Type("Werewolf");
        typeRepo.save(werewolf);

        Review dracula = new Review("Dracula", "/images/dracula.jpg", vampire,
                "One of the OG modern vampires.  I've read and re-read this book so many times.",
                "2020");
        reviewRepo.save(dracula);

        Review carmilla = new Review("Carmilla", "/images/carmilla.jpg", vampire,
                "Another great OG vampire.  This one actually predates Dracula, and is very gay",
                "2020");
        reviewRepo.save(carmilla);

        Review edward = new Review("Edward", "/images/edward.jpg", vampire,
                "Kind of an annoying and cringy movie vampire.  Changing up the vampire \"Rules\" us fube abd dandy, but this was just silly.",
                "2020");
        reviewRepo.save(edward);

        Review damon = new Review("Damon", "/images/damon.jpg", vampire,
                "A much better recent vampire.  I like it when vampires actually embrace being vampires and everything that comes with it.  He's a good example of how to do that with a heroic character.",
                "2020");
        reviewRepo.save(damon);

        Review jacob = new Review("Jacob", "images/jacob.png", werewolf,
                "The werewolf counterpart to Edward.  Similarly silly (especially his aversion to shirts).",
                "2020");
        reviewRepo.save(jacob);

        Review zevon = new Review("Warren Zevon", "images/warrenzevon.png", werewolf,
                "I'm not sure if he's actually a werewolf, but he seems to know a lot about them...  Kinda sus",
                "2020");
        reviewRepo.save(zevon);
    }
}
