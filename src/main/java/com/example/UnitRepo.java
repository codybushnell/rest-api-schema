package com.example;

import com.example.types.*;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by sasha on 11/8/16.
 */
public interface UnitRepo extends MongoRepository<Unit, String> {
}