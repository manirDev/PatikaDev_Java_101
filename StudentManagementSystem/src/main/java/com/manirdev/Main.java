package com.manirdev;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Mathematics", "MAT101", "MAT");
        Course physic = new Course("Physic", "FZK101", "PHC");
        Course chemistry = new Course("Chemistry", "KMY101", "CHM");

        Teacher t1 = new Teacher("Ousman Abanga", "90550000000", "MAT");
        Teacher t2 = new Teacher("Papa Yawali", "90550000001", "PHC");
        Teacher t3 = new Teacher("Ali Arslantas", "90550000002", "CHM");

        math.addTeacher(t1);
        physic.addTeacher(t2);
        chemistry.addTeacher(t3);
        ArrayList<Course> lessons = new ArrayList<>();
        lessons.add(math);
        lessons.add(physic);
        lessons.add(chemistry);
        Student s1 = new Student("Manir MHT", "123", 3, lessons);
        List<Integer> s1Notes = new ArrayList<>();
        s1Notes.add(100);
        s1Notes.add(95);
        s1Notes.add(90);
        List<Integer> s1VerbalNotes = new ArrayList<>();
        s1VerbalNotes.add(100);
        s1VerbalNotes.add(95);
        s1VerbalNotes.add(90);
        s1.addBulkExamVerbalNote(s1VerbalNotes);
        s1.addBulkExamNote(s1Notes);
        s1.isPass();

        Student s2 = new Student("John Doe", "234", 3, lessons);
        List<Integer> s2Notes = new ArrayList<>();
        s2Notes.add(50);
        s2Notes.add(55);
        s2Notes.add(60);
        List<Integer> s2VerbalNotes = new ArrayList<>();
        s2VerbalNotes.add(20);
        s2VerbalNotes.add(10);
        s2VerbalNotes.add(0);
        s2.addBulkExamVerbalNote(s2VerbalNotes);
        s2.addBulkExamNote(s2Notes);
        s2.isPass();

        Student s3 = new Student("Hamido Saleh", "345", 3, lessons);
        List<Integer> s3Notes = new ArrayList<>();
        s3Notes.add(50);
        s3Notes.add(100);
        s3Notes.add(60);
        List<Integer> s3VerbalNotes = new ArrayList<>();
        s3VerbalNotes.add(50);
        s3VerbalNotes.add(70);
        s3VerbalNotes.add(66);
        s3.addBulkExamVerbalNote(s3VerbalNotes);
        s3.addBulkExamNote(s3Notes);
        s3.isPass();
    }
}