package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NombresUtils.getList(
                "Java",
                "FrontEnd",
                "Backend",
                "FullStack");
        for (String course: courseList) {
            System.out.println("Platzi: "+ course);
        }

        Stream<String> courseStream = Stream.of("Java",
                "FrontEnd",
                "Backend",
                "FullStack");

        //Stream<Integer> courseLengthStream = courseStream.map(course -> course.length());
        //Optional<Integer> longest = courseLengthStream.max((x,y) -> y -x);

        Stream<String>  emphasisCourses = courseStream.map(course -> course + "!");
        Stream<String> justJavaCourses = courseStream.filter(course ->  course.contains("Java"));
        emphasisCourses.forEach(System.out::println);
    }
}
