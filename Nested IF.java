import java.util.Scanner;

public class NestedIf {
        public static void main(String args[]){
            Scanner ob=new Scanner(System.in);
            System.out.print("Enter the mark :");
            int mark=ob.nextInt();
            System.out.println("Your grade is ");
            if(mark>=40){
                if(mark>=50)
                    if(mark>=70)
                        if(mark>=80)
                            if(mark>=90)
                                if(mark==100)
                                    System.out.print("O");
                                else
                                    System.out.print("A+");
                            else
                                System.out.print("A");
                        else
                            System.out.print("B+");
                    else
                        System.out.print("Grade B");
            }
            else
                System.out.print("Fail");
        }
    }
