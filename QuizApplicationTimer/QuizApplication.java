package QuizApplicationTimer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApplication {

	 private Question[] ques;
	    private int score;
	    private int currentQues;
	    private Timer timer;
	    private boolean ans;

	    //constructor of class
	    public QuizApplication(Question[] ques) {
	       this.ques=ques;
	       this.score=0;
	       this.currentQues=0;
	       this.ans=false;
	    }
	        
	   //method of quiz start 
	    public void startQuiz() {
	    	try(Scanner sc=new Scanner(System.in)){
	    			
	     while( currentQues < ques.length) {
	           ans=false;
	           displayQuestion();

	            // Start the timer
	           timer = new Timer();
	            timer.schedule(new TimerTask() {
	                @Override
	                public void run() {
	                	if(!ans) {
	                    System.out.println("Time's up! Moving to next Question...");
	                    nextQuestion();
	                	}
	                }
	            }, 20 * 1000); // 20 seconds
	            int userAnswer = sc.nextInt();
	          ans=true;
	          
	            // Cancel the timer
	            timer.cancel();
	            checkAns(userAnswer);
	            nextQuestion();
	        }
	    	}
	        displayResults();
	    }

	    //method for display the questions
	    private void displayQuestion() {
	    	Question q=ques[currentQues];
	        System.out.println("\nQuestion " + (currentQues + 1) + ": " + q.getQues());
	        for (int i = 0; i < q.getOpts().length; i++) {
	            System.out.println((i + 1) + ". " + q.getOpts()[i]);
	        }
	    }

	    //method to check the answers
	    private void checkAns(int answer) {
	    	if(answer == ques[currentQues].getCorrectans()) {
	    		score++;
	    		System.out.println("Correct!!");
	    	}else {
	    		System.out.println("Incorrect! The correct answer:--  "+ ques[currentQues].getCorrectans());
	    	}
	    }
	    
	    //method for next question
	    private void  nextQuestion() {
	    	currentQues++;
	    }
	    
//method to display result of quiz
	    private void displayResults() {
	    	System.out.println("\n Quiz Over!!!!!!!!");
	        System.out.println("Final Score: " + score + " out of " + ques.length);
	        System.out.println("\n Summary of correct/incorrect answers: ");
	        for (int i = 0; i < ques.length; i++) {
	            System.out.println("Ques " + (i + 1) + ":- " + (i< currentQues && i < score ? "Correct" : "Incorrect"));
	        }
	    }  
	    }