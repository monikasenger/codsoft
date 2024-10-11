package QuizApplicationTimer;

import java.util.Scanner;

public class QuizApplicationTimer_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	        System.out.println("\n***************Welcome to the Quiz Application!***************");
	        System.out.println("\nYou will have 20 seconds to answer each question.");
	        System.out.println("Please enter your answer by typing the number of your choice.");
	        System.out.println("\nLet's start the quiz!!!!!!!!");

	        Question[] ques= {
	        		// Add questions to the list
	    	      new Question("What is used to find and fix bugs in the java program?", 
	    	                new String[] {"JVM", "JRE", "JDK", "JDB"}, 3),
	    	      
	    	       new Question("Arrays in java are?", 
	    	                new String[] {"Object references", "objects","primitive datatypes","none"}, 1),
	    	      
	    	       new Question("Identify the return type of method that does not return any value?", 
	    	                new String[] {"int", "void","double","none"}, 1),
	    	      
	    	       new Question("Identify the modifier which cannot be used for constructor?", 
	    	                new String[] {"public", "protected", "private", "static"}, 3),
	    	      
	    	       new Question("what is runnable?", 
	    	                new String[] {"abstract class", "interface", "class", "method"}, 1)
	        };

	    	QuizApplication quiz=new QuizApplication(ques);
	    	quiz.startQuiz();
	    	
	}
	
	    }

	