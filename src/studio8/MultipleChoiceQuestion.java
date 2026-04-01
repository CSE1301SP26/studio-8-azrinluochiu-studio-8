package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {

	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	private String choices;
	private String prompt;
	private String answer;
	private int points;

	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		// Call the super class constructor, then create and set
		super (prompt, answer,points);
		// instance variables for any values that aren't handled
		this.choices = choices;
	}
		// by the base class
		if (this.answer == answer) {
			return points;
		}else{
			return 0;
		}
		}
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		throw new NotYetImplementedException();
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		throw new NotYetImplementedException();
	}
	
	public static void main(String[] args) {
		// TODO: create your own MultipleChoiceQuestion
	}

}
