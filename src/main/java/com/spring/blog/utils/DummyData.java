package com.spring.blog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.blog.model.Post;
import com.spring.blog.repository.BlogRepository;

@Component
public class DummyData {
	
	@Autowired
	BlogRepository blogRepository;
	
	//@PostConstruct
	public void savePosts() {
		List<Post> postlist =new ArrayList<>();
		
		Post post1 =new Post();
		post1.setAutor("Eddie");
		post1.setTitulo("Java/Spring/Angular");
		post1.setTexto("Vamos lá");
		post1.setData(LocalDate.now());
		
		Post post2 = new Post();
		post2.setAutor("Maico");
		post2.setTitulo("Rails/Ruby/Angular");
		post2.setTexto("Show");
		post2.setData(LocalDate.now());
		
		postlist.add(post1);
		postlist.add(post2);
		
		for (Post post : postlist) {
			Post postSaved = blogRepository.save(post);
			System.out.println(postSaved.getId());
		}
		
	}
	
}
