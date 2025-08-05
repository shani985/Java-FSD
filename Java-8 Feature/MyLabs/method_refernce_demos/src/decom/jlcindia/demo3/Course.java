package decom.jlcindia.demo3;

public class Course {
private int courseId;
private String courseName;
private double price;
private String trainer;
public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId=courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName=courseName;
}
public double getprice() {
	return price;
}
public void setprice(int price) {
	this.price=price;
}
public String gettrainer() {
	return trainer;
}
public Course() {
	
}
public Course( String courseName, double price, String trainer) {
	
	this.courseName = courseName;
	this.price = price;
	this.trainer = trainer;
}
public Course(int courseId, String courseName, double price, String trainer) {
	
	System.out.println("4 argument constructor");

	this.courseId = courseId;
	this.courseName = courseName;
	this.price = price;
	this.trainer = trainer;
}
public void settrainer(String trainer) {
	this.trainer=trainer;
}
@Override
public String toString() {
	return "Course [courseId=" + courseId + ", courseName=" + courseName + ", price=" + price + ", trainer=" + trainer
			+ "]";
}

}
