package com.example.myplanningpoker.Models;

import java.util.ArrayList;

public class Group {
    private int group_id;
    private ArrayList<Question> questions;

    public Group(int group_id, ArrayList<Question> questions) {
        this.group_id = group_id;
        this.questions = questions;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Group{" +
                "group_id=" + group_id +
                ", questions=" + questions +
                '}';
    }
}
