package helpinghand.govinfo.TrialPages;

import java.util.ArrayList;

/**
 * Created by Rasil10 on 2017-12-13.
 */

public class FAQsInfo {
    ArrayList<String> questions;
    ArrayList<String> answers;

    public FAQsInfo() {
    }

    public FAQsInfo(ArrayList<String> questions, ArrayList<String> answers) {
        this.questions = questions;
        this.answers = answers;
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }
}
