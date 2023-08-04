package com.simplilearn.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

//@Data
public class UserAnswer {
	
	
	//@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = {"username"})})
	@Id
	@Column(name="id")
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	// @GeneratedValue(strategy = GenerationType.FOREIGNKEY)
	private int id;
	
	private int quizid;
	private String questionid;
	private String useranswer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuizid() {
		return quizid;
	}
	public void setQuizid(int quizid) {
		this.quizid = quizid;
	}
	public String getQuestionid() {
		return questionid;
	}
	public void setQuestionid(String questionid) {
		this.questionid = questionid;
	}
	public String getUseranswer() {
		return useranswer;
	}
	public void setUseranswer(String useranswer) {
		this.useranswer = useranswer;
	}
	public UserAnswer(int id, int quizid, String questionid, String useranswer) {
		super();
		this.id = id;
		this.quizid = quizid;
		this.questionid = questionid;
		this.useranswer = useranswer;
	}
	public UserAnswer() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
