import java.util.*;

public class Task2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of subjects :");
    int subnum=sc.nextInt();

    if(subnum<0)
    System.out.println("Enter valid number of subjects.");

    int marks;
    int sum=0;
    int maxmarks=100;
    for(int i=0; i<subnum ; i++)
    {
        System.out.println("Enter marks of subject "+(i+1)+" out of 100");
        marks=sc.nextInt();
        
        if(marks<0 && marks>maxmarks)
        {
            System.out.println("Marks should be in the range of 100, Please enter valid marks.");
            i--;
        }
        else
        sum +=marks;
    }
double avg=(double) sum/(subnum*maxmarks)*100;
String grade;
 
if(avg>=90)
grade="A+";
else if(avg>=80)
grade="A";
else if(avg>=70)
grade="B";
else if(avg>=60)
grade="C";
else if(avg>=50)
grade="D";
else 
grade="E";

System.out.println("------------------RESULT-----------------------");
System.out.println("OBTAINED MARKS OF "+subnum+" SUBJECTS ARE :"+sum);
System.out.println("MAXIMUM MARKS OF "+subnum+" SUBJECTS ARE :"+(maxmarks*subnum));
System.out.println("PERCENTAGE :"+avg+"%");
System.out.println("GRADE :"+grade);

sc.close();
}
    
}
