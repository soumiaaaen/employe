
import entite.Employe; 
import response.EmployeResponse;
import repository.EmployeRepo; 
import org.modelmapper.ModelMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.Optional; 
 
public class EmployeService { 
    private final EmployeRepo employeRepo; 
    private final ModelMapper mapper;

    EmployeService(EmployeRepo employeRepo, ModelMapper mapper) {
        this.employeRepo = employeRepo;
        this.mapper = mapper;
    } 
    
	public EmployeService() {
		// TODO Auto-generated constructor stub
	}

	public EmployeResponse getEmployeById(int id) { 
        Optional<Employe> employee = employeRepo.findById(id); 
        EmployeResponse employeResponse = mapper.map(employee, EmployeResponse.class); 
        return employeResponse; 
    } 
}