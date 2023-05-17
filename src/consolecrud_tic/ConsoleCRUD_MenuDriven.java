package consolecrud_tic;

import java.sql.*;
import java.util.Scanner;

public class ConsoleCRUD_MenuDriven {
    
    static Connection conn;
    static Statement stmt;
    static String id, name, age;
    
    public static void getDbConnection()
    {
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stud_info","root","Nano2023@hem");
            
            
            stmt = conn.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void menu()
    {
        System.out.println("------------Console-CRUD----------");
        System.out.println("1. ADD");
        System.out.println("2. Update");
        System.out.println("3. Delete");
        System.out.println("4. View");
        System.out.println("5. Search");
        System.out.println("6. Exit");
        System.out.println("--------------------------------"); 
    }
     
    public static void input(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter id ");
        id = inp.nextLine();
        System.out.println("Enter name ");
        name = inp.nextLine();
        System.out.println("Enter age ");
        age = inp.nextLine();
    }
   
    
    public static void main(String[] args) throws SQLException {
     do{
        menu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice(1-6): ");
        int choice = sc.nextInt();
        
        getDbConnection();
        switch(choice)
        {
            case 1:
                input();
                String sql1 = "insert into student values('"+id+"','"+name+"','"+age+"')";
                stmt.execute(sql1);
                conn.close();
                System.out.println("Data inserted successfully");
                break;
            case 2:
                input();
                String sql2 = "update student set name='"+name+"', age='"+age+"' where id='"+id+"'";
                int count = stmt.executeUpdate(sql2);
                if(count>0)
                {
                    System.out.println("Record updated successfully");
                }
                else
                {
                    System.out.println("No record found for update...");
                }
                conn.close();
                break;
            case 3:
                Scanner inp = new Scanner(System.in);
                System.out.println("Enter the id that you want to delete: ");
                int idd = inp.nextInt();
                String sql3 = "delete from student where id='"+idd+"'";
                boolean c = stmt.execute(sql3);
                if(!c)
                {
                  System.out.println("Record having id "+idd+" deleted successfully...");  
                }
                else
                {
                    System.out.println("Record not found for deletion...");
                }
                conn.close();
                break;

            case 4:
               String sql4 = "select * from student";
               ResultSet rs = stmt.executeQuery(sql4);
               System.out.print("ID \t Name \t Age \n");
               while(rs.next())
               {
                   String i = rs.getString(1);
                   String n = rs.getString(2);
                   String a = rs.getString(3);
                   System.out.print(i+"\t"+n+"\t"+a+"\n");
               }
               conn.close();
                break;
            case 5:
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the id that you want to search: ");
                int sid = input.nextInt();
               String sql5 = "select * from student where id='"+sid+"'";
               ResultSet rs1 = stmt.executeQuery(sql5);
               if(rs1.next())
               {
                   System.out.print("ID \t Name \t Age \n");
                   String i = rs1.getString(1);
                   String n = rs1.getString(2);
                   String a = rs1.getString(3);
                   System.out.print(i+"\t"+n+"\t"+a+"\n");
               }
               else
               {
                   System.out.println("Record not found...");
               }
               conn.close();
                break;
            case 6:
                System.out.println("Bye Bye...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Choice");     
        }  
       }while(true);
    }
}
