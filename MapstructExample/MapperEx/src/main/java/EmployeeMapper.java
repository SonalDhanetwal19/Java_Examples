import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
    @Mapping(source = "dto.employeeId", target = "id")
    @Mapping(source = "dto.employeeName", target = "name")
    Employee employeeTOEmployeeDTO(EmployeeDTO dto);
    @Mapping(source = "emp.id", target = "employeeId")
    @Mapping(source = "emp.name", target = "employeeName")
    EmployeeDTO employeeDTOToEmployee(Employee emp);
}
