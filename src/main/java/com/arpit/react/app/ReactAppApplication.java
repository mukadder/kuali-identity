package com.arpit.react.app;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Holder;

import org.kuali.rice.kim.v2_0.AddEntityTypeContactInfoToEntity;
import org.kuali.rice.kim.v2_0.AddEntityTypeContactInfoToEntityResponse;
import org.kuali.rice.kim.v2_0.CreateEntity;
import org.kuali.rice.kim.v2_0.CreateEntityResponse;
import org.kuali.rice.kim.v2_0.EntityAffiliationType;
import org.kuali.rice.kim.v2_0.EntityEmailType;
import org.kuali.rice.kim.v2_0.EntityEmploymentType;
import org.kuali.rice.kim.v2_0.EntityNameType;
import org.kuali.rice.kim.v2_0.EntityType;
import org.kuali.rice.kim.v2_0.EntityTypeContactInfoType;
import org.kuali.rice.kim.v2_0.GetEntityByEmployeeId;
import org.kuali.rice.kim.v2_0.GetEntityByEmployeeIdResponse;
import org.kuali.rice.kim.v2_0.IdentityService;
import org.kuali.rice.kim.v2_0.IdentityService_Service;
import org.kuali.rice.kim.v2_0.ObjectFactory;
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
		IdentityService svc = initializeService();
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
		IdentityService svc = initializeService();
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

  "principals": {
    "principal": [
      {
        "principalId": "k345666",
        "principalName": "k345666",
        "entityId": "k345666",
        "active": true,
        "any": []
      }
    ]
  },
  "entityTypeContactInfos": {
    "entityTypeContactInfo": [
      {
        "entityId": "k345666",
        "entityTypeCode": "PERSON",
        "entityType": {
          "code": "PERSON",
          "name": "Person",
          "sortCode": "01",
          "active": true,
          "any": []
        },
        "addresses": {
          "address": [
            {
              "entityTypeCode": "PERSON",
              "entityId": "k345666",
              "addressType": {
                "code": "WRK",
                "name": "Work",
                "sortCode": "a",
                "active": true,
                "any": []
              },
              "attentionLine": null,
              "line1": "Administrative Offices - Buick",
              "line2": "Boston University",
              "line3": "25 Buick St",
              "city": "Boston",
              "stateProvinceCode": "MA",
              "postalCode": "02215",
              "countryCode": "US",
              "attentionLineUnmasked": null,
              "line1Unmasked": "Administrative Offices - Buick",
              "line2Unmasked": "Boston University",
              "line3Unmasked": "25 Buick St",
              "cityUnmasked": "Boston",
              "stateProvinceCodeUnmasked": "MA",
              "postalCodeUnmasked": "02215",
              "countryCodeUnmasked": "US",
              "addressFormat": null,
              "modifiedDate": null,
              "validatedDate": null,
              "validated": false,
              "noteMessage": null,
              "suppressAddress": false,
              "defaultValue": true,
              "active": true,
              "any": []
            }
          ]
        },
        "emailAddresses": {
          "emailAddress": [
            {
              "entityTypeCode": "PERSON",
              "entityId": "k345666",
              "emailType": {
                "code": "WRK",
                "name": "Work",
                "sortCode": "a",
                "active": true,
                "versionNumber": 1,
                "any": []
              },
              "emailAddress": "k345666@BU.EDU",
              "emailAddressUnmasked": "k345666@BU.EDU",
              "suppressEmail": false,
              "defaultValue": true,
              "active": true,
              "any": []
            }
          ]
        },
        "phoneNumbers": {
          "phoneNumber": [
            {
              "entityTypeCode": "PERSON",
              "entityId": "k345666",
              "phoneType": {
                "code": "WRK",
                "name": "Work",
                "sortCode": "a",
                "active": true,
                "any": []
              },
              "countryCode": null,
              "phoneNumber": "617-353-9500",
              "extensionNumber": null,
              "formattedPhoneNumber": "617-353-9500",
              "countryCodeUnmasked": null,
              "phoneNumberUnmasked": "617-353-9500",
              "extensionNumberUnmasked": null,
              "formattedPhoneNumberUnmasked": "617-353-9500",
              "suppressPhone": false,
              "defaultValue": false,
              "active": true,
              "any": []
            },
            {
              "entityTypeCode": "PERSON",
              "entityId": "k345666",
              "phoneType": {
                "code": "WRK",
                "name": "Work",
                "sortCode": "a",
                "active": true,
                "any": []
              },
              "countryCode": null,
              "phoneNumber": "617-358-0196",
              "extensionNumber": null,
              "formattedPhoneNumber": "617-358-0196",
              "countryCodeUnmasked": null,
              "phoneNumberUnmasked": "617-358-0196",
              "extensionNumberUnmasked": null,
              "formattedPhoneNumberUnmasked": "617-358-0196",
              "suppressPhone": false,
              "defaultValue": true,
              "active": true,
              "any": []
            }
          ]
        },
        "defaultAddress": {
          "entityTypeCode": "PERSON",
          "entityId": "k345666",
          "addressType": {
            "code": "WRK",
            "name": "Work",
            "sortCode": "a",
            "active": true,
            "any": []
          },
          "attentionLine": null,
          "line1": "Administrative Offices - Buick",
          "line2": "Boston University",
          "line3": "25 Buick St",
          "city": "Boston",
          "stateProvinceCode": "MA",
          "postalCode": "02215",
          "countryCode": "US",
          "attentionLineUnmasked": null,
          "line1Unmasked": "Administrative Offices - Buick",
          "line2Unmasked": "Boston University",
          "line3Unmasked": "25 Buick St",
          "cityUnmasked": "Boston",
          "stateProvinceCodeUnmasked": "MA",
          "postalCodeUnmasked": "02215",
          "countryCodeUnmasked": "US",
          "addressFormat": null,
          "modifiedDate": null,
          "validatedDate": null,
          "validated": false,
          "noteMessage": null,
          "suppressAddress": false,
          "defaultValue": true,
          "active": true,
          "any": []
        },
        "defaultEmailAddress": {
          "entityTypeCode": "PERSON",
          "entityId": "k345666",
          "emailType": {
            "code": "WRK",
            "name": "Work",
            "sortCode": "a",
            "active": true,
            "versionNumber": 1,
            "any": []
          },
          "emailAddress": "MUKADDER@BU.EDU",
          "emailAddressUnmasked": "MUKADDER@BU.EDU",
          "suppressEmail": false,
          "defaultValue": true,
          "active": true,
          "any": []
        },
        "defaultPhoneNumber": {
          "entityTypeCode": "PERSON",
          "entityId": "U171169718",
          "phoneType": {
            "code": "WRK",
            "name": "Work",
            "sortCode": "a",
            "active": true,
            "any": []
          },
          "countryCode": null,
          "phoneNumber": "617-358-0196",
          "extensionNumber": null,
          "formattedPhoneNumber": "617-358-0196",
          "countryCodeUnmasked": null,
          "phoneNumberUnmasked": "617-358-0196",
          "extensionNumberUnmasked": null,
          "formattedPhoneNumberUnmasked": "617-358-0196",
          "suppressPhone": false,
          "defaultValue": true,
          "active": true,
          "any": []
        },
        "active": true,
        "any": []
      }
    ]
  },
  "externalIdentifiers": {
    "externalIdentifier": []
  },
  "affiliations": {
    "affiliation": [
      {
        "entityId": "k345666",
        "affiliationType": {
          "code": "0002",
          "name": "NREP-Staff",
          "sortCode": null,
          "active": true,
          "employmentAffiliationType": false,
          "versionNumber": 1,
          "any": []
        },
        "campusCode": "10",
        "defaultValue": true,
        "active": true,
        "any": []
      }
    ]
  },
  "names": {
    "name": [
      {
        "entityId": "k345666",
        "nameType": {
          "code": "PRFR",
          "name": "Preferred",
          "sortCode": "b",
          "active": true,
          "any": []
        },
        "namePrefix": null,
        "nameTitle": null,
        "firstName": "HITESH",
        "middleName": null,
        "lastName": "TARA",
        "nameSuffix": null,
        "compositeName": "TARA, HITESH",
        "namePrefixUnmasked": null,
        "nameTitleUnmasked": null,
        "firstNameUnmasked": "HITESH",
        "middleNameUnmasked": null,
        "lastNameUnmasked": "TARA",
        "nameSuffixUnmasked": null,
        "compositeNameUnmasked": "TARA, HITESH",
        "noteMessage": null,
        "nameChangedDate": null,
        "suppressName": false,
        "defaultValue": true,
        "active": true,
        "any": []
      }
    ]
  },
  "employmentInformation": {
    "employment": [
      {
        "entityId": "k345666",
        "employeeId": "k345666",
        "employmentRecordId": "2",
        "entityAffiliation": {
          "id": "47537",
          "entityId": "k345666",
          "affiliationType": {
            "code": "0002",
            "name": "NREP-Staff",
            "sortCode": null,
            "active": true,
            "employmentAffiliationType": false,
            "versionNumber": 1,
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
        "active": true,
        "any": []
      }
    ]
  },
  "privacyPreferences": {
    "entityId": "k345666",
    "suppressName": false,
    "suppressAddress": false,
    "suppressEmail": false,
    "suppressPhone": false,
    "suppressPersonal": false,
    "any": []
  },
  "bioDemographics": null,
  "citizenships": {
    "citizenship": []
  },
  "primaryEmployment": {
    "entityId": "k345666",
    "employeeId": "k345666",
    "employmentRecordId": "2",
    "entityAffiliation": {
      "entityId": "k345666",
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
    "active": true,
    "any": []
  },
  "defaultAffiliation": {
    "entityId": "k345666",
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
  "defaultName": {
    "entityId": "k345666",
    "nameType": {
      "code": "PRFR",
      "name": "Preferred",
      "sortCode": "b",
      "active": true,
      "any": []
    },
    "namePrefix": null,
    "nameTitle": null,
    "firstName": "rakesh",
    "middleName": null,
    "lastName": "mehra",
    "nameSuffix": null,
    "compositeName": "mehra, rakesh",
    "namePrefixUnmasked": null,
    "nameTitleUnmasked": null,
    "firstNameUnmasked": "rakesh",
    "middleNameUnmasked": null,
    "lastNameUnmasked": "mehra",
    "nameSuffixUnmasked": null,
    "compositeNameUnmasked": "mehra, eakesh",
    "noteMessage": null,
    "nameChangedDate": null,
    "suppressName": false,
    "defaultValue": true,
    "active": true,
    "any": []
  },
  "ethnicities": {
    "ethnicity": []
  },
  "residencies": {
    "residency": []
  },
  "visas": {
    "visa": []
  },
  "active": true,
  "any": []

}
 */
	@PostMapping(value = "/employee/createEntity")
	public ResponseEntity createEntity(@RequestBody  EntityType entity) throws RiceIllegalArgumentException, RiceIllegalStateException {
		IdentityService svc = initializeService();
		ObjectFactory factory = new ObjectFactory();
	    final ObjectMapper mapper = new ObjectMapper(); // jackson's objectmapper
	    final EntityType pojo = mapper.convertValue(entity, EntityType.class);
		CreateEntity createNewEntity = factory.createCreateEntity();
		createNewEntity.setEntity(pojo);
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
		IdentityService svc = initializeService();
		ObjectFactory factory = new ObjectFactory();
	    final ObjectMapper mapper = new ObjectMapper(); // jackson's objectmapper
	    final EntityTypeContactInfoType pojo = mapper.convertValue(entity, EntityTypeContactInfoType.class);
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
		IdentityService svc = initializeService();
		//AddAffiliationToEntity type = factory.createAddAffiliationToEntity();
	    final Holder<EntityAffiliationType> holder = new Holder<EntityAffiliationType>(entity);
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
		IdentityService svc = initializeService();
	    final Holder<EntityEmploymentType> holder = new Holder<EntityEmploymentType>(entity);
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
		IdentityService svc = initializeService();
	    final Holder<EntityNameType> holder = new Holder<EntityNameType>(entity);
		 svc.addNameToEntity(holder);
		return new ResponseEntity( HttpStatus.OK);
	}
/*http://localhost:8090/employee/addEmailToEntity
 *  {
                                "entityTypeCode": "PERSON",
                                "entityId": "F344444",
                                "emailType": {
                                    "code": "WRK",
                                    "name": "Work",
                                    "sortCode": "a",
                                    "active": true,
                                    "any": []
                                },
                                "emailAddress": "Mohabbetkhan@BU.EDU",
                                "emailAddressUnmasked": "Mohabbetkhan@BU.EDU",
                                "suppressEmail": false,
                                "defaultValue": true,
                                "active": true,
                                "any": []
                            }
 */
	@PostMapping(value = "/employee/addEmailToEntity")
	public ResponseEntity addEmailToEntity(@RequestBody  EntityEmailType entity) throws RiceIllegalArgumentException, RiceIllegalStateException {
		IdentityService svc = initializeService();
	    final Holder<EntityEmailType> holder = new Holder<EntityEmailType>(entity);
		svc.addEmailToEntity(holder);
		return new ResponseEntity(HttpStatus.OK);
	}

	private static IdentityService initializeService() {
		URL wsdlURL = IdentityService_Service.WSDL_LOCATION;
		KSBCampusServiceClient client = new KSBCampusServiceClient();
		IdentityService svc = client.getCampusService(wsdlURL);
		return svc;
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