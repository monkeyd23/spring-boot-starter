package com.imran.boot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	 private List<Topic> topics = Arrays.asList(
								new Topic("spring", "Spring Framework", "Spring Framework Decription"),
								new Topic("java", "Core Java", "Core Java Decription"),
								new Topic("javascript", "JavaScript", "JavaScript Decription")
						 	);
	 
	public List<Topic> getAllTopics () {
		return topics;
	}
}
