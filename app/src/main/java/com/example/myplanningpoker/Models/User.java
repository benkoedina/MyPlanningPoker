package com.example.myplanningpoker.Models;

import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private int answer;
    private ArrayList<Group> groups;

    public User(int id, String name, int answer, ArrayList<Group> groups) {
        this.id = id;
        this.name = name;
        this.answer = answer;
        this.groups = groups;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", answer=" + answer +
                ", groups=" + groups +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }
}
