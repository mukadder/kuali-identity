package com.arpit.react.app;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.kuali.rice.kim.v2_0.GetEntityByEmployeeId;
import org.kuali.rice.kim.v2_0.GetEntityByEmployeeIdResponse;
import org.kuali.rice.kim.v2_0.IdentityService;
import org.kuali.rice.kim.v2_0.IdentityService_Service;
import org.kuali.rice.kim.v2_0.RiceIllegalArgumentException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.bu.kuali.rice.kew.client.KSBCampusServiceClient;

@SpringBootApplication
@RestController
public class ReactAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactAppApplication.class, args);
	}

	@GetMapping("/employee/get")
	public List<Employee> get() throws RiceIllegalArgumentException {
		URL wsdlURL = IdentityService_Service.WSDL_LOCATION;
	      KSBCampusServiceClient client = new KSBCampusServiceClient();

	      IdentityService svc = client.getCampusService( wsdlURL );
			//Campuses campuses = svc.findAllCampuses();
	      GetEntityByEmployeeId id= new GetEntityByEmployeeId();
	      id.setEmployeeId("U17116978");
	     GetEntityByEmployeeIdResponse test=   svc.getEntityByEmployeeId(id);

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee( test.getEntity().getPrincipals().getPrincipal().get(0).getEntityId().toString(),  test.getEntity().getPrincipals().getPrincipal().get(0).getPrincipalName(), test.getEntity().getNames().getName().get(0).getFirstName().toString()));
		return employeeList;
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