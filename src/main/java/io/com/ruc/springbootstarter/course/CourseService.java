package io.com.ruc.springbootstarter.course;

import io.com.ruc.springbootstarter.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ce Su
 */
@Service
class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> listAllCourse(String topicId) {

        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCourseById(String id) {
        //return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();

        return courseRepository.findOne(id);
    }


    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
      /*  for (int i = 0; i < topicList.size(); i++) {
            Topic t = topicList.get(i);
            if (t.getId().equals(id)) {
                topicList.set(i, topic);
                return;
            }
        }*/
        courseRepository.save(course);
    }

    public void deleteCourseById(String id) {
        // topicList.removeIf(t -> t.getId().equals(id));
        courseRepository.delete(id);
    }

}
