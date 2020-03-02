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
		post1.setTitulo("Notícias Populares");
		post1.setTexto("Startups em ritmo acelerado de crescimento precisam, regularmente, aumentar a equipe para dar conta das novas demandas. Algumas delas, como o iFood, chegam a ter mais de 70 vagas abertas. Abaixo, você pode conferir uma lista de 10 startups com posições a serem preenchidas.");
		post1.setData(LocalDate.now());
		
		Post post2 = new Post();
		post2.setAutor("Maico");
		post2.setTitulo("Notícias Necessárias");
		post2.setTexto("Dezembro chegou, e muita gente gosta de fazer previsões para o ano novo que está batendo à porta. A consultoria Gartner não ficou de fora, e apontou as dez principais tendências tecnológicas para 2020–que vão levar disrupção e criar as maiores oportunidades no mercado pelos próximos cinco ou dez anos.");
		post2.setData(LocalDate.now());
		
		postlist.add(post1);
		postlist.add(post2);
		
		for (Post post : postlist) {
			Post postSaved = blogRepository.save(post);
			System.out.println(postSaved.getId());
		}
		
	}
	
}
