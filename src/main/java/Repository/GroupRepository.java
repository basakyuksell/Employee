package Repository;

import Model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface GroupRepository extends JpaRepository<Group,Long> {
}
