package com.employee;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;


@Path("/employeeservice")
public class EmployeeService {
    EmployeeDao employeeDao=new EmployeeDao();
    @GET
    @Path("/emplist")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> displayEmployee(){
        return employeeDao.getAllEmployees();
    }

    @POST
    @Path("/addemployee")
    @Consumes("application/x-www-form-urlencoded")
//    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addEmployee(@FormParam("id") int id,
                              @FormParam("name") String name,
                              @FormParam("salary") int salary, @FormParam("dept") String dept,
                              @Context HttpServletResponse servletResponse) throws IOException{
        return employeeDao.addEmployee(id,name,dept,salary);
    }

    @POST
    @Path("/updateemployee")
    @Consumes("application/x-www-form-urlencoded")
    @Produces(MediaType.APPLICATION_JSON)
    public String updateEmployee(@FormParam("id") int id,
                                 @FormParam("name") String name,
                                 @FormParam("salary") int salary, @FormParam("dept") String dept,
                                 @Context HttpServletResponse servletResponse) throws IOException{
        return employeeDao.updateEmployee(id,name,dept,salary);
    }
}
