package uz.edu_x.edux.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.edu_x.edux.model.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
}
