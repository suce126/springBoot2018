package io.com.ruc.springbootstarter.repository;

import io.com.ruc.springbootstarter.topic.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {
}
