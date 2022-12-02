package com.exam.examserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.exam.examserver.model.Category;
import com.exam.examserver.model.Question;
import com.exam.examserver.model.Quiz;
import com.exam.examserver.model.User;
import com.exam.examserver.repository.CategoryRepository;
import com.exam.examserver.repository.QuestionRepository;
import com.exam.examserver.repository.QuizRepository;
import com.exam.examserver.service.CategoryService;
import com.exam.examserver.service.QuestionService;
import com.exam.examserver.service.QuizService;
import static org.junit.jupiter.api.Assertions.assertNotNull;





@SpringBootTest(classes= ExamserverApplication.class)
class ExamserverApplicationTests {
    
	@SuppressWarnings("unused")
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private CategoryRepository categoryRepo;
	
	@SuppressWarnings("unused")
	@Autowired
	private QuestionService questionService;
	@Autowired
	private QuestionRepository questionRepository;
	
	@SuppressWarnings("unused")
	@Autowired
	private QuizService quizService;
	@Autowired
	private QuizRepository quizRepository;
	
	@Test
    public void contextLoads() {
	User user = new User();
    user.setUsername("suprim");
    user.setPassword("456");

	}
	@Test
    void addTest() {
		
		Category category = new Category(40L,"Programming Languages","This quiz category contains quizzes related to programming Languages");
		
		assertNotNull(categoryRepo.findAll());
		}
	@Test
	void addquesTest() {
		@SuppressWarnings("unused")
		Question question = new Question("Inheritance is a feature of?","java.png","OOPS","Function","Method","Collection","OOPS","");
		
		assertNotNull(questionRepository.findAll());
		}
	@Test
	void addquizTest() {
		@SuppressWarnings("unused")
		Quiz quiz = new Quiz("Java Basics","This quiz contains basics concepts of java","200","20");
		
		assertNotNull(quizRepository.findAll());
		
	}
	
     
     
}
