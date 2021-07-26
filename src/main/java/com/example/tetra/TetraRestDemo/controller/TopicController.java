package com.example.tetra.TetraRestDemo.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tetra.TetraRestDemo.model.Topic;
import com.example.tetra.TetraRestDemo.service.TopicService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value ="/topics", produces=MediaType.APPLICATION_JSON_VALUE)
public class TopicController {
	private final Logger log = LoggerFactory.getLogger(getClass());
	private final TopicService topicService;
	public TopicController(TopicService topicService) {
		this.topicService = topicService;
	}
	
//	@GetMapping(value = "/{id}")
//	public Topic getTopicById( @RequestParam Long id) {
//		
//		log.debug("ById:{}", id);
//		return this.topicService.findById(id);
//	}
	
	
	@GetMapping(value = {"","/all"})
	public List<Topic> getAllTopics(){
		log.debug("/all");
		
		return this.topicService.getAllTopics();
	}
	
	@GetMapping("/{id}")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	public Topic getEmployeeById(@PathVariable("id") Long id) {
		return topicService.findById(id);
	}
//	@GetMapping(value = "/{id}")
//	public ResponseEntity<Topic> getTopicById(@PathVariable("id") Long id) {
//		
//		log.debug("ById:{}", id);
//		return ResponseEntity.ok(this.topicService.findById(id)) 
//				;
//	}
	
	
//	@GetMapping()
//	public Topic getTopic() {
//		return new Topic("3","Java","Desc here");
//	}
	
	@PostMapping()
	public String addTopic(@RequestBody Topic topic) {
		log.debug("add {}", topic.toString());
		this.topicService.addTopic(topic);
		return "topic added";
	}
}
