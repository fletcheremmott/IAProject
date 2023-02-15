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
    @Override
    public String toString()
        {
            String s = "";
            for (Course courses: Plan)
                s += courses + "\n";
            return s;
        }
    
}
