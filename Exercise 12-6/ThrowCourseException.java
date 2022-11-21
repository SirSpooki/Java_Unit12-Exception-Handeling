public class ThrowCourseException {

public static void main(String[] args) throws CourseException {

Course[] course = new Course[6];

try {

course[0] = new Course("COM", 209, 3);

System.out.println("Course: " + course[0] + "." + "Created Successfully. ");

} catch (CourseException e) {

System.out.println(e.getMessage());

}

try {

course[1] = new Course("ACC", 303, 0.3);

System.out.println("Course: " + course[1] + "." + "Created Successfully. ");

} catch (CourseException e) {

System.out.println(e.getMessage());

}

try {

course[2] = new Course("PHY", 101, 4);

System.out.println("Course: " + course[2] + "." + "Created Successfully. ");

} catch (CourseException e) {

}

try {

course[3] = new Course("ECO", 500, 2);

System.out.println("Course: " + course[3] + "." + "Created Successfully. ");

} catch (CourseException e) {

}

try {

course[4] = new Course("HUM", 10, 3);

System.out.println("Course: " + course[4] + "." + "Created Successfully. ");

} catch (CourseException e) {

System.out.println(e.getMessage());

}

try {

course[5] = new Course("SOC", 110, 1);

System.out.println("Course: " + course[5] + "." + "Created Successfully. ");

} catch (CourseException e) {

System.out.println(e.getMessage());

}

}

}
