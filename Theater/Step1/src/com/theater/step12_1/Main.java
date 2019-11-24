package com.theater.step12_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Lecture lecture = new Lecture(70, "객체지향 프로그래밍", Arrays.asList(81, 95, 75, 50, 45));
        String evaluration = lecture.evaluate();
        System.out.println(evaluration);

        Professor professor = new Professor("다익스트라",
                new Lecture(70,"알고리즘",
                Arrays.asList(81, 95, 75, 50, 45)));

        String statistics = professor.compileStatistics();

        Professor professor2 = new Professor("다익스트라",
                new GradeLecture(70, "알고리즘",
                        Arrays.asList(81, 95, 75, 50, 45),
                        Arrays.asList(new Grade("A", 100, 95));
    }
}
