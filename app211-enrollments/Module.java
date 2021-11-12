
/**
 * This class module represent the code, title and credit value
 * for a given module.
 *
 * @author Muhammad Mulla 
 * @version 08/10/2021
 */
public class Module
{
    private String code;
    // code variable
    private String title;
    // title variable
    private int credit;
    // credit variable

    
     /** Module constructor assigns the code and title 
      * for a module. Also instialises the credit value to 0
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        this.credit = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *   
     * This method retutns the code
     */
    public String getCode()
    {
        // Returning the code value
        return this.code;
         
    } 
    public String getTitle()
    {
        // Returning the title value
        return this.title;
         
    }
    public int getCredit()
    {
        // Returning the credit value
        return this.credit;
         
    }
    
    public void setCredit(int credit)
    {
       this.credit = credit;  
    }
    
    /**
     * Print the details of the module which includes
     * the code, title and credits
     */
    public void print()
    {
        System.out.println(" Module  Code: " + code + ": " + title);
        System.out.println(" Credit: " + credit);
        System.out.println();
    }
}
