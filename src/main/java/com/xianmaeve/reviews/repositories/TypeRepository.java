package com.xianmaeve.reviews.repositories;

import com.xianmaeve.reviews.models.Type;
import org.springframework.data.repository.CrudRepository;

public interface TypeRepository extends CrudRepository<Type, Long> {
    Type findTypeByValue(String value);
}
