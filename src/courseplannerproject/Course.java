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

    private String CourseName;
    private String CourseType;
    private String CourseLevel;
    private String CourseGrade;
    
    public Course(String cn, String ct, String cl, String cg)
    {
        CourseName = cn;
        CourseType = ct;
        CourseLevel = cl;
        CourseGrade = cg;
    }
               
    public String getCourseName(){
        return CourseName;
    }
    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }
    public String getCourseType(){
        return CourseType;
    }
    public void setCourseType(String CourseType) {
        this.CourseType = CourseType;
    }
    public String getCourseLevel(){
        return CourseLevel;
    }
    public void setCourseLevel(String CourseLevel){
        this.CourseLevel = CourseLevel;
    }
    public String getCourseGrade(){
        return CourseGrade;
    }
    public void setCourseGrade(String CourseGrade) {
        this.CourseGrade = CourseGrade;
    }
        
        
        
        
        
        
        
        
        
        
        
        
}
