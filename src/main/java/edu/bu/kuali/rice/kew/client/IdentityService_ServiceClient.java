
package edu.bu.kuali.rice.kew.client;

import java.net.URL;

import javax.xml.namespace.QName;

import org.kuali.rice.kim.v2_0.CreateEntity;
import org.kuali.rice.kim.v2_0.CreateEntityResponse;
import org.kuali.rice.kim.v2_0.EntityType;
import org.kuali.rice.kim.v2_0.GetEntityByEmployeeId;
import org.kuali.rice.kim.v2_0.GetEntityByEmployeeIdResponse;
import org.kuali.rice.kim.v2_0.IdentityService;
import org.kuali.rice.kim.v2_0.IdentityService_Service;






public final class IdentityService_ServiceClient {

    private static final QName SERVICE_NAME = new QName("http://rice.kuali.org/kim/v2_0", "identityService");

    private IdentityService_ServiceClient() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = IdentityService_Service.WSDL_LOCATION;
      KSBCampusServiceClient client = new KSBCampusServiceClient();

      IdentityService svc = client.getCampusService( wsdlURL );
		//Campuses campuses = svc.findAllCampuses();
      GetEntityByEmployeeId id= new GetEntityByEmployeeId();
      CreateEntity createNewEntity = new CreateEntity();
      EntityType type = new EntityType();
      type.setActive(true);
     // type.setAffiliations(value);
      //createNewEntity.setEntity(type);

     CreateEntityResponse  response= svc.createEntity(createNewEntity);
      id.setEmployeeId("U17116978");
     GetEntityByEmployeeIdResponse test=   svc.getEntityByEmployeeId(id);
      System.out.println( test.toString() );

      //for( CodedAttributeType campus : svc.findAllEmploymentStatuses() )
		//{
		///	System.out.printf( "%s : %s : %s \n", campus.getCode(), campus.getSortCode(), campus.getName() );
		//}


        //System.exit(0);
    }



}

