public class Module
{
    private String moduleName; 
    private String moduleCode; 
    private int marks;


    public Module(String moduleName, String moduleCode, int marks){
        this.moduleName = moduleName; 
        this.moduleCode = moduleCode; 
        this.marks = marks;
    }
    public String getmoduleName()
    {
        return moduleName; 
    }
    public String getmoduleCode()
    {
        return moduleCode; 
    }
    public int getMarks()
    {
        return marks; 
    }


}
