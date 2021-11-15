import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;


public class CafetoRestApplicationTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(CafetoRestApplicationTest.class);
    }

    @Test
    public void testSendWrongParamMustbeNotFound() {
        Response response = target("cafetorest/rest/service/proof/andres").request().get(Response.class);
        Assert.assertTrue(response.getStatusInfo().equals(Response.Status.NOT_FOUND));
    }

    @Test
    public void testSendCorrectParamMustbeOk() {
        Response response = target("cafetorest/rest/service/proof/santiago").request().get(Response.class);
        Assert.assertTrue(response.getStatusInfo().equals(Response.Status.OK));
    }

}
