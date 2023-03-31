import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Start
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("welcome to student management app");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            System.out.println("Press 1 to add student");
            System.out.println("Press 2 to delete student");
            System.out.println("Press 3 to display student");
            System.out.println("Press 4 to exit student");
            int c= Integer.parseInt(br.readLine());

            if(c==1)
            {
                //add student

                System.out.println("Enter user name :");
                String name = br.readLine();

                System.out.println("Enter user phone :");
                String phone = br.readLine();

                System.out.println("Enter user city :");
                String city = br.readLine();

                //Create student object to store student

                Student st = new Student(name,phone,city);
                boolean ans =StudentDao.insertStudentToDB(st);
                {
                    if(ans)
                    {
                        System.out.println("Student is added....");
                    }
                    else
                    {
                        System.out.println("Something went wrong!....");

                    }
                }

                System.out.println(st);
            }

            else if(c==2)
            {
                //delete student
                
                System.out.println("Enter student Id to delete: ");
                int userId= Integer.parseInt(br.readLine());

                boolean flag=StudentDao.deleteStudent(userId);

                if(flag)
                {
                    System.out.println("deleted successfully....");
                }
                else
                {
                    System.out.println("Something went wrong!...");

                }



            }
            else if(c==3)
            {
                //display student

                StudentDao.showAllStudent();
            }
            else if(c==4)
            {
                //exit
                break;
            }
            else
            {

            }
            

            
        }
        System.out.println("Thank you for using my application....");
        
    }
}