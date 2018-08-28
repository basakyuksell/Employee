import Controller.EmployeeController;
import Model.Department;
import Model.Employee;
import Model.Group;
import Repository.DepartmentRepository;
import Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.Transactional;

@EntityScan("Model")
@SpringBootApplication(scanBasePackages = "/")
public class App extends SpringBootServletInitializer {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    EmployeeController employeeController;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
return builder.sources(App.class);
        //return super.configure(builder);
    }

    /*
    @Transactional
    public void createTestData() {

        Department department = new Department();
        department.setDepartmentName("Uygulama Geliştirme");
        departmentRepository.save(department);

        Group group = new Group();
        group.setGroupName("misyon");
        group.setDepartment(department);

        Employee employee = new Employee();
        employee.setPhone("5750");
        employee.setUniversity("Yalova Üniversitesi");
        employee.setName("başak");
        employee.setSurname("yüksel");
        employee.setUniversityDept("Bilgisayar Mühendisliği");
        employee.getGroup().add(group);
        group.setEmployee(employee);
        employeeRepository.save(employee);


    }
*/
}
