package com.manirdev;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    String stdNo;
    int classes;
    ArrayList<Course> courses;
    double average;
    boolean isPass;

    public Student(String name, String stdNo, int classes, ArrayList<Course> courses){
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.courses = courses;
        this.isPass = false;
    }
    void addBulkExamNote(List<Integer> notes){
        for (int i=0; i<notes.size(); i++){
            if (notes.get(i) >= 0 && notes.get(i) <= 100){
                this.courses.get(i).note = notes.get(i);
            }

        }
    }
    void addBulkExamVerbalNote(List<Integer> verbalNotes){
        for (int i=0; i<verbalNotes.size(); i++){
            if (verbalNotes.get(i) >= 0 && verbalNotes.get(i) <= 100){
                this.courses.get(i).verbalNote = verbalNotes.get(i);
            }

        }
    }
    void isPass(){
        System.out.println("================================");
        this.isPass = checkIsPass();
        printNote();
        System.out.println("Average :" + this.average);
        if (this.isPass){
            System.out.println("Successfully Passed :)");
        }else{
            System.out.println("Unsuccessful :(");
        }

    }
    private boolean checkIsPass(){
        calcAverage();
        return this.average > 55;
    }
    void calcAverage(){
        double noteSum = 0;
        for (Course course : this.courses){
            noteSum = noteSum + course.note;
        }
        double verbalNoteSum = 0;
        for (Course course : this.courses){
            verbalNoteSum = verbalNoteSum + course.verbalNote;
        }
        this.average = (noteSum / this.courses.size()) * 0.8 + (verbalNoteSum / this.courses.size()) * 0.2;
    }
    void printNote(){
        System.out.println("Student Name: " + this.name);
        for (Course course : this.courses){
            System.out.println(course.name + ": " + course.note);
        }

    }
}
