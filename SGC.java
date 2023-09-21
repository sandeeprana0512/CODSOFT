import java.util.Scanner;

public class SGC
{
   public static void display(float a, String g, float s){
    System.out.println("The total marks: " + s);
    System.out.println("The average percentage: " + a);
    System.out.println("The grade: " + g);
   }

   public static void main(String[] args)
   {
      float[] marks = new float[8];
      float sum=0, avg;
      int i;
      String g;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter Marks Obtained in 5 Subjects: ");
      for(i=0; i<5; i++)
         marks[i] = sc.nextFloat();
      
      for(i=0; i<5; i++)
         sum = sum + marks[i];
      avg = sum/5;
	  
      if(avg>90)
         g = "A+";
      else if(avg>80 && avg<91)
         g = "A";
      else if(avg>70 && avg<81)
         g = "B+";
      else if(avg>60 && avg<71)
         g = "B";
      else if(avg>50 && avg<61)
         g = "C+";
      else if(avg>40 && avg<51)
         g = "C";
      else
         g = "F";

        display(avg, g, sum);
   }
}