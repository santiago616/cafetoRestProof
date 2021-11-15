package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@Path("/service")
public class CafetoRestApplication {

    public static String FILE_ROUTE = "../webapps/cafetorest/WEB-INF/classes/proof.properties";

    @GET
    @Path("/proof/{name}")
    public Response getResponseValidation(@PathParam(value="name")String name){
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(FILE_ROUTE));
            return properties.getProperty("name").equals(name) ? Response.status(Response.Status.OK).build() :
                    Response.status(Response.Status.NOT_FOUND).build();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("Problems reading file");
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
