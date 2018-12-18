/*
package io.com.ruc.springbootstarer.student;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

   */
/* public List<Student> listAllStudent(String topicId) {

        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }*//*


    public Student getStudentById(String id) {
        //return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();

        return studentRepository.findOne(id);
    }


    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(Student student) {
      */
/*  for (int i = 0; i < topicList.size(); i++) {
            Topic t = topicList.get(i);
            if (t.getId().equals(id)) {
                topicList.set(i, topic);
                return;
            }
        }*//*

        studentRepository.save(student);
    }

    public void deleteStudentById(String id) {
        // topicList.removeIf(t -> t.getId().equals(id));
        studentRepository.delete(id);
    }

}
*/
