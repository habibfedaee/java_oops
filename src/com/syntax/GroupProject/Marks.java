package com.syntax.GroupProject;

public abstract class Marks {
    abstract double getPercentage(int[] subject_marks);

}
class A extends Marks {

    int[] subjects=new int[20];
    A(int[] subjects){
        this.subjects=subjects;
    }

    @Override
    double getPercentage(int[] subject_marks) {
        int sum=0;
        for(int i=0; i<subject_marks.length; i++){
             sum+=subject_marks[i];
            }
        return sum/subject_marks.length;
    }
}

class B extends Marks {

    int[] subjects=new int[20];
    B(int[] subjects){
        this.subjects=subjects;
    }

    @Override
    double getPercentage(int[] subject_marks) {
        int sum=0;
        for(int i=0; i<subject_marks.length; i++){
            sum+=subject_marks[i];
        }
        return sum/subject_marks.length;
    }
}

