package com.example.com.geoquiz;

public class TrueFalse {
    //two member
    private int mQuestion;
    private boolean mTrueQuestion;

    //constructor
    public TrueFalse(int question, boolean truequestion) {
        mQuestion = question;
        mTrueQuestion = truequestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean mTrueQuestion) {
        this.mTrueQuestion = mTrueQuestion;
    }
}
