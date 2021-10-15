
/**
 * This class represents a course module and contains information on the 
 * module title and code.
 *
 * @author Muhammad Mulla 
 * @version 08/10/2021
 */
public class Module
{
    // instance variables - replace the example below with your own
    private int x;
    private String code;
    private String title;
    private int credit;

    /**
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title= title;
        credit = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param   
     * @return    code
     */
    public String getCode()
    {
        // put your code here
        return this.code;
         
    } 
    public String getTitle()
    {
        // put your code here
        return this.title;
         
    }
    public int getCredit()
    {
        // put your code here
        return this.credit;
         
    }
    
    public void setCredit(int credit)
    {
       this.credit = credit;  
    }
    
    /**
     * Print the details of the course, the list
     * of students enrolled and the module
     */
    public void print()
    {
        //printHeading();
        
        System.out.println(" Module  Code: " + code + ": " + title
        + " Credit " + credit );
        System.out.println();
    }
}
