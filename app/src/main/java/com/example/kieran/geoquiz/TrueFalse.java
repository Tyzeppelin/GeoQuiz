package com.example.kieran.geoquiz;

/**
 * Created by Kieran on 18/02/2016.
 */
public class TrueFalse {

    int mQuestion;

    boolean mTrueQuestion;

    public TrueFalse(int question, boolean trueQuestion){
        mQuestion = question;
        mTrueQuestion = trueQuestion;

    }

    public void setmQuestion(int question){
        mQuestion = question;
    }

    public int getmQuestion(){
        return mQuestion;
    }

    public void setmTrueQuestion(boolean trueQuestion){
        mTrueQuestion = trueQuestion;
    }

    public boolean ismTrueQuestion(){
        return mTrueQuestion;
    }

}
