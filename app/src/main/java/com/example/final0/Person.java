package com.example.final0;

import androidx.annotation.NonNull;

public class Person {
    private String gender;
    private int age;
    private String goal;
    private int aim;
    private int cur;
    private int water;

    public Person(String gender, int age, String goal, int aim, int cur) {
        this.gender = gender;
        this.age = age;
        this.goal = goal;
        this.aim = aim;
        this.cur = cur;
    }

    public Person(int water) {
        this.water = water;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public int getAim() {
        return aim;
    }

    public void setAim(int aim) {
        this.aim = aim;
    }

    public int getCur() {
        return cur;
    }

    public void setCur(int cur) {
        this.cur = cur;
    }

    @NonNull
    @Override
    public String toString() {
        return "gender: " + gender + "\nage: " + age + "\ngoal: " + goal + "\naim weight: " + aim + "\ncurrent weight: " + cur;
    }
}
