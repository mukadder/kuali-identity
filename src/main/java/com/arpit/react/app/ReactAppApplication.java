package com.arpit.react.app;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.ws.Holder;

import org.json.JSONObject;
import org.kuali.rice.kim.v2_0.AddAffiliationToEntity;
import org.kuali.rice.kim.v2_0.AddAffiliationToEntityResponse;
import org.kuali.rice.kim.v2_0.AddEmploymentToEntity;
import org.kuali.rice.kim.v2_0.AddEmploymentToEntityResponse;
import org.kuali.rice.kim.v2_0.AddEntityTypeContactInfoToEntity;
import org.kuali.rice.kim.v2_0.AddEntityTypeContactInfoToEntityResponse;
import org.kuali.rice.kim.v2_0.AddPrincipalToEntity;
import org.kuali.rice.kim.v2_0.AddPrincipalToEntityResponse;
import org.kuali.rice.kim.v2_0.CreateEntity;
import org.kuali.rice.kim.v2_0.CreateEntityResponse;
import org.kuali.rice.kim.v2_0.EntityAffiliationType;
import org.kuali.rice.kim.v2_0.EntityEmploymentType;
import org.kuali.rice.kim.v2_0.EntityNameType;
import org.kuali.rice.kim.v2_0.EntityType;
import org.kuali.rice.kim.v2_0.EntityTypeContactInfoType;
import org.kuali.rice.kim.v2_0.GetEntityByEmployeeId;
import org.kuali.rice.kim.v2_0.GetEntityByEmployeeIdResponse;
import org.kuali.rice.kim.v2_0.GetPrincipal;
import org.kuali.rice.kim.v2_0.GetPrincipals;
import org.kuali.rice.kim.v2_0.GetPrincipalsResponse;
import org.kuali.rice.kim.v2_0.IdentityService;
import org.kuali.rice.kim.v2_0.IdentityService_Service;
import org.kuali.rice.kim.v2_0.ObjectFactory;
import org.kuali.rice.kim.v2_0.PrincipalType;
import org.kuali.rice.kim.v2_0.RiceIllegalArgumentException;
import org.kuali.rice.kim.v2_0.RiceIllegalStateException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import edu.bu.identityApi.Entity;
import edu.bu.identityApi.Principals;
import edu.bu.kuali.rice.kew.client.KSBCampusServiceClient;
@SpringBootApplication
@RestController
public class ReactAppApplication {
	//private ObjectFactory objectFactory;
	public static void main(String[] args) {
		SpringApplication.run(ReactAppApplication.class, args);
	}

	@GetMapping("/employee/get")
	public List<Employee> get() throws RiceIllegalArgumentException {
		URL wsdlURL = IdentityService_Service.WSDL_LOCATION;
		KSBCampusServiceClient client = new KSBCampusServiceClient();

		IdentityService svc = client.getCampusService(wsdlURL);
		// Campuses campuses = svc.findAllCampuses();
		ObjectFactory factory = new ObjectFactory();

		GetEntityByEmployeeId id = factory.createGetEntityByEmployeeId();;
		id.setEmployeeId("U17116978");
		GetEntityByEmployeeIdResponse test = svc.getEntityByEmployeeId(id);

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(test.getEntity().getPrincipals().getPrincipal().get(0).getEntityId().toString(),
				test.getEntity().getPrincipals().getPrincipal().get(0).getPrincipalName(),
				test.getEntity().getNames().getName().get(0).getFirstName().toString()));
		return employeeList;
	}
//http://localhost:8080/employee/get/U17116978
	@GetMapping("/employee/get/{id}")
	public ResponseEntity getCustomer(@PathVariable("id") String id) throws RiceIllegalArgumentException {
		URL wsdlURL = IdentityService_Service.WSDL_LOCATION;
		KSBCampusServiceClient client = new KSBCampusServiceClient();

		IdentityService svc = client.getCampusService(wsdlURL);
		// Campuses campuses = svc.findAllCampuses();
		GetEntityByEmployeeId idd = new GetEntityByEmployeeId();
		idd.setEmployeeId(id);
		GetEntityByEmployeeIdResponse test = svc.getEntityByEmployeeId(idd);

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(test.getEntity().getPrincipals().getPrincipal().get(0).getEntityId().toString(),
				test.getEntity().getPrincipals().getPrincipal().get(0).getPrincipalName(),
				test.getEntity().getNames().getName().get(0).getFirstName().toString()));

		return new ResponseEntity(test, HttpStatus.OK);
	}
/*Pass this json  this will create an entity to the api http://localhost:8090/employee/createEntity
 * {

  "id": "U17114444",
  "principals": {
    "principal": [
      {
        "principalId": "U17114444",
        "principalName": "mukadd3eeer",
        "active": true,
        "any": []
      }
    ]
  }
}
 */
	@PostMapping(value = "/employee/createEntity")
	public ResponseEntity createEntity(@RequestBody  Entity entity) throws RiceIllegalArgumentException, RiceIllegalStateException {

		URL wsdlURL = IdentityService_Service.WSDL_LOCATION;
		KSBCampusServiceClient client = new KSBCampusServiceClient();
		ObjectFactory factory = new ObjectFactory();
	    final ObjectMapper mapper = new ObjectMapper(); // jackson's objectmapper
	    final EntityType pojo = mapper.convertValue(entity, EntityType.class);

		CreateEntity createNewEntity = factory.createCreateEntity();
		createNewEntity.setEntity(pojo);
		IdentityService svc = client.getCampusService(wsdlURL);

		CreateEntityResponse response = svc.createEntity(createNewEntity);
		return new ResponseEntity(response, HttpStatus.OK);
	}

/*  http://localhost:8090/employee/addEntityTypeContactInfoToEntity  call this api with this jason
 * {
	"entityId": "g000000",
	"entityTypeCode": "PERSON",
	"entityType": {
		"code": "PERSON",
		"name": "Person",
		"sortCode": "01",
		"active": true,
		"any": []
	},
	"active": true,
	"any": []

}
 */
	@PostMapping(value = "/employee/addEntityTypeContactInfoToEntity")
	public ResponseEntity addEntityTypeContactInfoToEntity(@RequestBody  EntityTypeContactInfoType entity) throws RiceIllegalArgumentException, RiceIllegalStateException {

		URL wsdlURL = IdentityService_Service.WSDL_LOCATION;
		KSBCampusServiceClient client = new KSBCampusServiceClient();
		ObjectFactory factory = new ObjectFactory();
	    final ObjectMapper mapper = new ObjectMapper(); // jackson's objectmapper
	    final EntityTypeContactInfoType pojo = mapper.convertValue(entity, EntityTypeContactInfoType.class);
		IdentityService svc = client.getCampusService(wsdlURL);
		AddEntityTypeContactInfoToEntity contactToEntity = factory.createAddEntityTypeContactInfoToEntity();
		contactToEntity.setEntityTypeContactInfo(pojo);
		AddEntityTypeContactInfoToEntityResponse response = svc.addEntityTypeContactInfoToEntity(contactToEntity);
		return new ResponseEntity(response, HttpStatus.OK);
	}


	/*http://localhost:8090/employee/addAffliationToEntity
	 * {
                    "id": "475347",
                    "entityId": "F344444",
                    "affiliationType": {
                        "code": "0002",
                        "name": "NREP-Staff",
                        "sortCode": null,
                        "active": true,
                        "employmentAffiliationType": false,
                        "any": []
                    },
                    "campusCode": "10",
                    "defaultValue": true,
                    "active": true,
                    "any": []
                }
	 */
	@PostMapping(value = "/employee/addAffliationToEntity")
	public ResponseEntity addAffliationToEntity(@RequestBody  EntityAffiliationType entity) throws RiceIllegalArgumentException, RiceIllegalStateException {

		URL wsdlURL = IdentityService_Service.WSDL_LOCATION;
		KSBCampusServiceClient client = new KSBCampusServiceClient();
		ObjectFactory factory = new ObjectFactory();
	    final ObjectMapper mapper = new ObjectMapper(); // jackson's objectmapper
	    final EntityAffiliationType pojo = mapper.convertValue(entity, EntityAffiliationType.class);

		//CreateEntity createNewEntity = factory.createCreateEntity();

		IdentityService svc = client.getCampusService(wsdlURL);
		//AddAffiliationToEntity type = factory.createAddAffiliationToEntity();
	    final Holder<EntityAffiliationType> holder = new Holder<EntityAffiliationType>(pojo);
	    svc.addAffiliationToEntity(holder);
		return new ResponseEntity(HttpStatus.OK);
	}
	/*http://localhost:8090/employee/addEmploymentToEntity
	 *  {
                    "id": "56843",
                    "entityId": "F344444",
                    "employeeId": "F344444",
                    "employmentRecordId": "2",
                    "entityAffiliation": {
                        "id": "475347",
                        "entityId": "F344444",
                        "affiliationType": {
                            "code": "0002",
                            "name": "NREP-Staff",
                            "sortCode": null,
                            "active": true,
                            "employmentAffiliationType": false,
                            "any": []
                        },
                        "campusCode": "10",
                        "defaultValue": true,
                        "active": true,
                        "any": []
                    },
                    "employeeStatus": {
                        "code": "3",
                        "name": "Active",
                        "sortCode": null,
                        "active": true,
                        "any": []
                    },
                    "employeeType": {
                        "code": "6",
                        "name": "Staff-Exempt FT",
                        "sortCode": null,
                        "active": true,
                        "any": []
                    },
                    "primaryDepartmentCode": "1510500000",
                    "baseSalaryAmount": "0.00",
                    "primary": true,
                    "versionNumber": 21,
                    "active": true,
                    "any": []
                }
	 */

	@PostMapping(value = "/employee/addEmploymentToEntity")
	public ResponseEntity addEmploymentToEntity(@RequestBody  EntityEmploymentType entity) throws RiceIllegalArgumentException, RiceIllegalStateException {

		URL wsdlURL = IdentityService_Service.WSDL_LOCATION;
		KSBCampusServiceClient client = new KSBCampusServiceClient();
		ObjectFactory factory = new ObjectFactory();
	    final ObjectMapper mapper = new ObjectMapper(); // jackson's objectmapper
	    final EntityEmploymentType pojo = mapper.convertValue(entity, EntityEmploymentType.class);

	   // AddEmploymentToEntity addEmploymentToEntity = factory.createAddEmploymentToEntity();
	    final Holder<EntityEmploymentType> holder = new Holder<EntityEmploymentType>(pojo);

		IdentityService svc = client.getCampusService(wsdlURL);

		 svc.addEmploymentToEntity(holder);
		return new ResponseEntity(HttpStatus.OK);
	}
/*http://localhost:8090/employee/addNameToEntity
 *  {
                    "entityId": "F344444",
                    "nameType": {
                        "code": "PRFR",
                        "name": "Preferred",
                        "sortCode": "b",
                        "active": true,
                        "any": []
                    },
                    "namePrefix": null,
                    "nameTitle": null,
                    "firstName": "Mohabbet",
                    "middleName": null,
                    "lastName": "khan",
                    "nameSuffix": null,
                    "compositeName": "khan, Mohabbet",
                    "namePrefixUnmasked": null,
                    "nameTitleUnmasked": null,
                    "firstNameUnmasked": "Mohabbet",
                    "middleNameUnmasked": null,
                    "lastNameUnmasked": "khan",
                    "nameSuffixUnmasked": null,
                    "compositeNameUnmasked": "khan, Mohabbet",
                    "noteMessage": null,
                    "nameChangedDate": null,
                    "suppressName": false,
                    "defaultValue": true,
                    "active": true,
                    "any": []
                }
 */
	@PostMapping(value = "/employee/addNameToEntity")
	public ResponseEntity addNameToEntity(@RequestBody  EntityNameType entity) throws RiceIllegalArgumentException, RiceIllegalStateException {

		URL wsdlURL = IdentityService_Service.WSDL_LOCATION;
		KSBCampusServiceClient client = new KSBCampusServiceClient();
	    final Holder<EntityNameType> holder = new Holder<EntityNameType>(entity);
		IdentityService svc = client.getCampusService(wsdlURL);
		 svc.addNameToEntity(holder);
		return new ResponseEntity( HttpStatus.OK);
	}

	@PostMapping(value = "/employee/addEmailToEntity")
	public ResponseEntity addEmailToEntity(@RequestBody  Entity entity) throws RiceIllegalArgumentException, RiceIllegalStateException {

		URL wsdlURL = IdentityService_Service.WSDL_LOCATION;
		KSBCampusServiceClient client = new KSBCampusServiceClient();
		ObjectFactory factory = new ObjectFactory();
	    final ObjectMapper mapper = new ObjectMapper(); // jackson's objectmapper
	    final EntityType pojo = mapper.convertValue(entity, EntityType.class);

		CreateEntity createNewEntity = factory.createCreateEntity();
		createNewEntity.setEntity(pojo);
		IdentityService svc = client.getCampusService(wsdlURL);

		CreateEntityResponse response = svc.createEntity(createNewEntity);
		return new ResponseEntity(response, HttpStatus.OK);
	}


	@DeleteMapping("/employee/{id}")
	public ResponseEntity deleteEmployee(@PathVariable String id) {

		return new ResponseEntity(id, HttpStatus.OK);

	}

	@PutMapping("/employee/{id}")
	public ResponseEntity updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {

		if (null == employee) {
			return new ResponseEntity("No Employee found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(employee, HttpStatus.OK);
	}

}

@Controller
class IndexPageController {

	@GetMapping(value = "/")
	public String index() {
		return "index";
	}
}

final class Employee {

	private String id;
	private String name;
	private String department;

	public Employee() {

	}

	public Employee(final String id, final String name, final String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}