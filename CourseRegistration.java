package com.courseregistration;

import java.util.ArrayList;
import java.util.List;

public class CourseRegistration {

    private List<Course> registeredCourses = new ArrayList<>();

    public boolean registerCourse(Course course) {
        if (course == null) {
            return false;
        }

        registeredCourses.add(course);
        return true;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }
}
