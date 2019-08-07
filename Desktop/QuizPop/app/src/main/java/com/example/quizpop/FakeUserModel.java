package com.example.quizpop;

public class FakeUserModel {

    String Username;
    int QuestionsCorrect;
    int QuestionsAttmepted;

    FakeUserModel(String uName, int questionsCorrect, int questionsAttmepted)
    {
        Username=uName;
        QuestionsCorrect = questionsCorrect;
        QuestionsAttmepted=questionsAttmepted;
    }

    public String getUsername() {
        return Username;
    }

    public int getQuestionsCorrect() {
        return QuestionsCorrect;
    }

    public int getQuestionsAttmepted() {
        return QuestionsAttmepted;
    }
}
