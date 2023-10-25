public class TFQuestions extends Questions {
    private boolean ans;
    public TFQuestions() {
        super();
        this.ans = false;
    }

    public TFQuestions(int questionId, String questionText, boolean ans) {
        super(questionId, questionText);
        this.ans = ans;
    }

     public boolean getAnswer() {
            return ans;
        }

        public void setAnswer(boolean answer) {
            this.ans = ans;
        }
        @Override
        public boolean isCorrect(Object guess) {
            if (guess instanceof Boolean) {
                return ((Boolean) guess) == ans;
            } else if (guess instanceof String) {
                String guessString = ((String) guess).toLowerCase();
                return guessString.equals("true") && ans || guessString.equals("false") && !ans;
            }
            return false;
        }@Override
        public String toString() {
            return super.toString() + " Answer: " + (ans ? "True" : "False");
        }
    }


