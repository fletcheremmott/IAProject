/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package courseplannerproject;

/**
 *
 * @author fletc
 */
public class coursePlannerMain {
    
    public int search(Course[] arr, int N, Course x)
    {
       for(int i = 0; i < N; i++)
           if(arr[i] == x)
               return i;
       return -1;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Planner Plan = new Planner();
    for(int i = 0; i < 28; i++)
    {
        Course c = new Course("","","","");
        Plan.addCourse(c);
    }
    
        
/*       
loop through 4 years
    loop through 7 courses
            make a new course object with the year and add it to the planner
*/          
    }
    
}
