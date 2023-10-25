public abstract class Questions {

    private int questionId;
    private String questionText;

    public Questions(){ //constructor
        this.questionId = questionId;
        this.questionText = questionText;

    }

    public Questions (int questionId, String questionText) {
        if (questionId <= 0) {
            throw new IllegalArgumentException("Cannot be empty");

        }
        if (questionText == null || questionText.trim().isEmpty()) {
            throw new IllegalArgumentException(("cannot be empty"));
        }

        this.questionId = questionId;
        this.questionText = questionText;
    }

    public int getQuestionId() {
        return questionId;
    }
    public String getQuestionText(){
        return questionText;
    }
    public void setQuestionId(){
        if (questionId <= 0) {
            throw new IllegalArgumentException("The question Id must be greater than 0 and cannot be empty");

        }
        this.questionId = questionId;

    }
    public void setQuestionText(){
        if (questionText == null || questionText.trim().isEmpty()) {
            throw new IllegalArgumentException(("cannot be empty"));
        }
        this.questionText = questionText;
    }

    public abstract boolean isCorrect(Object guess);

    public String toString(){
        String text = questionText.equals("TBD") ? "No question text entered." : questionText;
        return String.format("#%d: %s", questionId, text);
    }
}






