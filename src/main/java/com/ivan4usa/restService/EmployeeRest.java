package com.ivan4usa.restService;

import com.ivan4usa.entity.Employee;
import com.ivan4usa.persistence.GenericDao;
import com.ivan4usa.util.DaoFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/employees")
public class EmployeeRest {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getAll() {
        GenericDao employeeDao = DaoFactory.createDao(Employee.class);
        return (List<Employee>) employeeDao.getAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Employee getById(@PathParam("id") int id) {
        GenericDao employeeDao = DaoFactory.createDao(Employee.class);
        return (Employee) employeeDao.getById(id);
    }
}
