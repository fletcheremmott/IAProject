 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package courseplannerproject;

/**
 *
 * @author fletc
 */
public class Course {

    private String courseName;
    private String courseType;
    private String courseLevel;
    private String courseGrade;
    
    public Course(String cn, String ct, String cl, String cg)
    {
        courseName = cn;
        courseType = ct;
        courseLevel = cl;
        courseGrade = cg;
    }
               
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String CourseName) {
        this.courseName = CourseName;
    }
    public String getCourseType(){
        return courseType;
    }
    public void setCourseType(String CourseType) {
        this.courseType = CourseType;
    }
    public String getCourseLevel(){
        return courseLevel;
    }
    public void setCourseLevel(String CourseLevel){
        this.courseLevel = CourseLevel;
    }
    public String getCourseGrade(){
        return courseGrade;
    }
    public void setCourseGrade(String CourseGrade) {
        this.courseGrade = CourseGrade;
    }
    @Override
    public String toString()
    {
        String s = "";
        s += ("Course Name: "+courseName+" Course Level: "+courseLevel+" Course Type: "+courseType+" Course Grade: "+courseGrade+"\n");
        return s;
    }
        
        
        
        
        
        
        
        
        
        
        
        
}
