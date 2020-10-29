package com.xianmaeve.reviews;

import com.xianmaeve.reviews.models.Type;
import com.xianmaeve.reviews.repositories.TypeRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator {

    @Resource
    private TypeRepository typeRepo;

    public void run(String...args) throws Exception {

        Type vampire = new Type("vampire");
        typeRepo.save(vampire);

        Type werewolf = new Type("werewolf");
        typeRepo.save(werewolf);
    }
}
