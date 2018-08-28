package Repository;

import Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department findByName(String name);
}
