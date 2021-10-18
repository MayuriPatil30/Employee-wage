import java.util.Random;
public class empwage
{
    public static void main(String args[])
     {
           int emppresent =1;
           double empcheck=Math.floor(Math.random()*10)%2;
               if(empcheck==emppresent)  
                      System.out.println("Emloyee is Present");
              else
                      System.out.println("Employee is Absent");
}
}