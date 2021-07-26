package com.example.tetra.TetraRestDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tetra.TetraRestDemo.model.Topic;
import com.example.tetra.TetraRestDemo.repo.TopicRepository;

@Service
public class TopicService {
	private final TopicRepository topicRepository;
	
	public TopicService(TopicRepository topicRepository) {
		this.topicRepository = topicRepository;
	}

	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
				
		topicRepository.findAll().forEach(topics::add);
		
		return topics;
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	public void updateTopic(Topic topic) {
		topicRepository.save(topic);
	}public void deleteTopicById(Long id) {
		topicRepository.deleteById(id);
	}

	public Topic findById(Long id) {
		return this.topicRepository.getById(id);
	}

}
