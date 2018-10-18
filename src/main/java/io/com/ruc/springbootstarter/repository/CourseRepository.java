package io.com.ruc.springbootstarter.repository;

import io.com.ruc.springbootstarter.course.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String> {
    public List<Course> findByTopicId(String topicId);
}
