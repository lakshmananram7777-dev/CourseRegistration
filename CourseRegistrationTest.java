package com.courseregistration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CourseRegistrationTest {

    @Test
    void testCourseRegistration() {
        CourseRegistration registration = new CourseRegistration();

        Course course = new Course(
                "CSE101",
                "Software Engineering",
                4
        );

        assertTrue(registration.registerCourse(course));
        assertEquals(1, registration.getRegisteredCourses().size());
    }
}
