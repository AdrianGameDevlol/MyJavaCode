public class Student{
    public int RollNo;
    public String Name;
    public double Marks;
    private static int TotalMarks = 100;
   
    public double Percentage(){
        double percent = (Marks/TotalMarks)*100;

        return percent;


    }
    
}