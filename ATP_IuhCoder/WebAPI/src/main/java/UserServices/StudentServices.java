package UserServices;

import DataAccess.I_Local_StudentDAO;
import Entities.Student;
import IUHCoder_ExceptionHandler.ATP_ExceptionHandler;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by THANH NGA on 6/19/2017.
 */

@Path("/Student")
public class StudentServices {
    @EJB
    private I_Local_StudentDAO studentDAO;
    public StudentServices() {

    }
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Student> GetAllStudent() throws ATP_ExceptionHandler {
        return studentDAO.GetAllStudent();
    }

    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Student GetStudentByID(@PathParam("id") String id) throws ATP_ExceptionHandler {
        return studentDAO.GetStudentByID(id);
    }

    @GET
    @Path("/{username}")
    @Produces({MediaType.APPLICATION_JSON})
    public Student GetStudentByUserName(@PathParam("username") String userName) throws ATP_ExceptionHandler {
        return studentDAO.GetStudentByUserName(userName);
    }

    @PUT
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void CreateStudent(Student student) throws ATP_ExceptionHandler {
        studentDAO.CreateStudent(student);
    }
}
