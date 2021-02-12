import cz.cipisek.rest.managers.RestManager;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("rest")
@Produces(MediaType.APPLICATION_JSON)
public class RestResource {


    @Inject
    private RestManager restManager;

    @GET
    public Object getAnim() {
        return Response.ok(RestManager.getAnim);
    }


    @DELETE
    public void deleteAnim() {
        restManager.deleteAnim();
    }

    @GET
    public void getInAnim(@PathParam("number") Integer number) {
        restManager.getInAnim();
    }

    @POST
    public void noveAnim(@FormParam("name") String name, @FormParam("age") String age) {
        restManager.noveAnim();
    }
    @PUT
    public void zmenitAnim(@PathParam("number") Integer number,@FormParam("name") String name ,@FormParam("age") String age){
        restManager.zmenitAnim();
    }
}
