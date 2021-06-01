package com.employee;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    List<Employee> employeeList=null;
    public List<Employee> getAllEmployees(){
        //Database code
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee","root","Saiful@123");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from employee");
            employeeList=new ArrayList<Employee>();
            while(rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                int salary=rs.getInt(3);
                String dept=rs.getString(4);

                employeeList.add(new Employee(id,name,dept,""+salary));
            }
            rs.close();
            stmt.close();
            con.close();

            return employeeList;
        } catch (Exception e) {
            System.out.println(e);
        }

        return employeeList;
    }

    public String addEmployee(int id, String name,String dept, int salary){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee","root","Saiful@123");
            Statement stmt=con.createStatement();
            int result=stmt.executeUpdate("insert into employee values("+id+",'"+name+"','"+salary+"','"+dept+"')");
            if(result==1){
                return "success";
            }
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return "Fail";
    }

    public String updateEmployee(int id, String name,String dept, int salary){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee","root","Saiful@123");
            Statement stmt=con.createStatement();
            int result=stmt.executeUpdate("update employee set name='"+name+"',dept='"+dept+"',salary='"+salary+"' where id='"+id+"'");
            if(result==1){
                return "updated";
            }
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return "update fail";
    }
}
