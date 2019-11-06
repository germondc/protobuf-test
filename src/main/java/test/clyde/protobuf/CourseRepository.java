package test.clyde.protobuf;

import java.util.Map;

import test.clyde.protobuf.BaeldungTraining.Course;

public class CourseRepository {
	private final Map<Integer, Course> courses;

    public CourseRepository(Map<Integer, Course> courses) {
        this.courses = courses;
    }

    public Course getCourse(int id) {
        return courses.get(id);
    }
}
