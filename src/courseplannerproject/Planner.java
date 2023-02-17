/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package courseplannerproject;

import java.util.ArrayList;
public class Planner {
    
    private ArrayList<Course> Plan = new ArrayList<>();
    
    public Planner()
    {
    }
    public void addCourse(Course c)
    {
        Plan.add(c);
    }
    public void removeCourse(String n, String t, String l, String g)
    {
        for (int i = 0; i < Plan.size(); i++)
            {
                Course c = Plan.get(i);
                if(c.getCourseName().equals(n) && c.getCourseType().equals(t) && c.getCourseLevel().equals(l) && c.getCourseGrade().equals(g))
                {
                    Plan.remove(c);
                }
            }
    }
    public void display()
    {
        for(Course c : Plan)
	System.out.println(c);
    }
    public String tallyToString()
    {
        int mathTally = 0;
        int scienceTally = 0;
        int socialStudiesTally = 0;
        int englishTally = 0;
        int artTally = 0;
        int languageTally = 0;
        int electiveTally = 0;
        int otherTally = 0;
        
        String s = "";
        for(Course courses: Plan)
        {
            if(courses.getCourseType().equals("Math"))
                    mathTally++;
            if(courses.getCourseType().equals("Science"))
                    scienceTally++;
            if(courses.getCourseType().equals("Social Studies"))
                    socialStudiesTally++;
            if(courses.getCourseType().equals("English"))
                    englishTally++;
            if(courses.getCourseType().equals("Art"))
                    artTally++;
            if(courses.getCourseType().equals("Language"))
                    languageTally++;
            if(courses.getCourseType().equals("Elective"))
                    electiveTally++;
            if(courses.getCourseType().equals("Other"))
                    otherTally++;          
                          
                
            
        }
        s += ("Math Courses: "+mathTally+"\n");
        s += ("Science Courses: "+scienceTally+"\n");
        s += ("Social Studies Courses: "+socialStudiesTally+"\n");
        s += ("English Courses: "+englishTally+"\n");
        s += ("Art Courses: "+artTally+"\n");
        s += ("Language Courses: "+languageTally+"\n");
        s += ("Elective Courses: "+electiveTally+"\n");
        s += ("Other Courses: "+otherTally+"\n");
        
        return s;
    }
    @Override
    public String toString()
        {
            String s = "";
            for (Course courses: Plan)
                s += courses + "\n";
            return s;
        }
    
}
