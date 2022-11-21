public class Course {

private String courseDepartment;

private int courseNum;

private double courseCredits;

public Course(String courseDepartment, int courseNum, double courseCredits) throws CourseException {

if (courseDepartment.length() != 3 || (courseNum < 100 || courseNum > 499)

|| (courseCredits < 0.5 || courseCredits > 6)) {

throw (new CourseException(

"Course Information is Invalid: " + courseDepartment + "," + courseNum + "," + courseCredits));

}

this.courseDepartment = courseDepartment;

this.courseNum = courseNum;

this.courseCredits = courseCredits;

}

public String GetCourseDepartment() {

return courseDepartment;

}

public int getCourseNum() {

return courseNum;

}

public double getCourseCredits() {

return courseCredits;

}

@Override

public String toString() {

return courseDepartment + "," + courseNum + "," + courseCredits;

}

}
