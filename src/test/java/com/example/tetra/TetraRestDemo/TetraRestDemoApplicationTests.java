package com.example.tetra.TetraRestDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.tetra.TetraRestDemo.model.Topic;
import com.example.tetra.TetraRestDemo.service.TopicService;

@SpringBootTest
class TetraRestDemoApplicationTests {
	@Autowired
	TopicService topicService;
	@Test
	void contextLoads() {
	}
//	@Test
//	public void testGetAllTopics() {
//		List<Topic> topics = topicService.getAllTopics();
//		assertEquals(4, topics.size());
//	}
//
}
