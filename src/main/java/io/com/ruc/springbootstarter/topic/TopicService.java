package io.com.ruc.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import io.com.ruc.springbootstarter.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ce Su
 */
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    /*List<Topic> topicList = new ArrayList<>(Arrays.asList(new Topic("1", "Hello Java", "Java is a programming"),
            new Topic("2", "Pythod", "Hello Pythod")));
*/
    public List<Topic> listAllTopics() {

        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopicById(String id) {
        //return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();

        return topicRepository.findOne(id);
    }


    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
      /*  for (int i = 0; i < topicList.size(); i++) {
            Topic t = topicList.get(i);
            if (t.getId().equals(id)) {
                topicList.set(i, topic);
                return;
            }
        }*/
        topicRepository.save(topic);
    }

    public void deleteTopicById(String id) {
        // topicList.removeIf(t -> t.getId().equals(id));
        topicRepository.delete(id);
    }

}

//package io.com.ruc.springbootstarter.topic;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
///**
// * 
// * @author Ce Su
// * @version $Id: TopicService.java, v 0.1 11 Aug 2018 19.26.06 Ce Su Exp $
// */
//@Service
//public class TopicService {
//
//    List<Topic> topicList = new ArrayList<>(Arrays.asList(new Topic("1", "Hello Java", "Java is a programming"),
//	    new Topic("2", "Pythod", "Hello Pythod")));
//
//    public List<Topic> listAllTopics() {
//	return topicList;
//    }
//
//    public Topic getTopicById(String id) {
//	return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//
//    }
//
//    public void addTopic(Topic topic) {
//	topicList.add(topic);
//    }
//
//    public void updateTopic(String id, Topic topic) {
//	for (int i = 0; i < topicList.size(); i++) {
//	    Topic t = topicList.get(i);
//	    if (t.getId().equals(id)) {
//		topicList.set(i, topic);
//		return;
//	    }
//
//	}
//    }
//
//    public void deleteTopicById(String id) {
//	topicList.removeIf(t -> t.getId().equals(id));
//    }
//
//}
