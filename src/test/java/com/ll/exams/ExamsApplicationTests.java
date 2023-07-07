package com.ll.exams;

import com.ll.exams.article.Article;
import com.ll.exams.article.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class ExamsApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;

	@Test
	void testJpa() {
		Article a = new Article();
		a.setSubject("hi");
		a.setContent("bye");
		a.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(a);  // 첫번째 질문 저장

	}

}
