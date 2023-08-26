package com.manirdev;

public class Course {
    String name;
    String code;
    String prefix;
    double note;
    double verbalNote;
    Teacher courseTeacher;

    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }
    void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.courseTeacher = teacher;
            System.out.println(teacher.name + " is added to this course code: " + this.code);
        }else{
            System.out.println("Teacher" + teacher.name + "can not give this lesson");
        }
    }
    void printTeacher(){
        if (this.courseTeacher != null){
            System.out.println(this.name + ", teacher info : " + this.courseTeacher.name + ", " + this.courseTeacher.mpno);
        }else {
            System.out.println(this.name + ", this course has no teacher yet. ");
        }
    }
}
