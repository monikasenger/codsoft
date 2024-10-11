package QuizApplicationTimer;

import java.util.Arrays;

public class Question {
	 private String ques;
	    private String[] opts;
	    private int correctans;

	    public String getQues() {
			return ques;
		}

		public void setQues(String ques) {
			this.ques = ques;
		}

		public String[] getOpts() {
			return opts;
		}

		public void setOpts(String[] opts) {
			this.opts = opts;
		}

		public int getCorrectans() {
			return correctans;
		}

		public void setCorrectans(int correctans) {
			this.correctans = correctans;
		}


	       public Question(String ques, String[] opts, int correctans) {
			super();
			this.ques = ques;
			this.opts = opts;
			this.correctans = correctans;
		}

		
}
