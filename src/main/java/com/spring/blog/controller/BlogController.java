package com.spring.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.blog.model.Post;
import com.spring.blog.service.Blogservice;

@Controller
public class BlogController {
	
	@Autowired
	Blogservice blogservice;
	
	@RequestMapping("/posts")
	public ModelAndView getPosts() {
		ModelAndView mv = new ModelAndView("/posts");
		List<Post> posts = blogservice.findAll();
		mv.addObject("posts", posts);
		return mv;
	}
}
