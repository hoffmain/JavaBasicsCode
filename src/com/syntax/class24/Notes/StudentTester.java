package com.syntax.class24.Notes;

public class StudentTester {
    public static void main(String[] args) {
        Student[] students={new SyntaxStudent(), new SchoolStudent(), new CollegeStudent()};

        for(Student st:students){
            st.study();
            st.practice();
            st.doHomework();
        }

        for(int i=0; i< students.length; i++){
            students[i].study();
            students[i].doHomework();
            students[i].practice();
        }
    }
}
