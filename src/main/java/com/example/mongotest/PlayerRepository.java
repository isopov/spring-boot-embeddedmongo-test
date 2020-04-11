package com.example.mongotest;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<GameOfThronesPlayer, ObjectId> {
}
