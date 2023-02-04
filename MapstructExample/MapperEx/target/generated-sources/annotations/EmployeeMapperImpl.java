
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-21T14:55:40+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.15 (Oracle Corporation)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee employeeTOEmployeeDTO(EmployeeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId( dto.getEmployeeId() );
        employee.setName( dto.getEmployeeName() );

        return employee;
    }

    @Override
    public EmployeeDTO employeeDTOToEmployee(Employee emp) {
        if ( emp == null ) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setEmployeeId( emp.getId() );
        employeeDTO.setEmployeeName( emp.getName() );

        return employeeDTO;
    }
}
