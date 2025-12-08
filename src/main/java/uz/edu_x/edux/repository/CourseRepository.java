package uz.edu_x.edux.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.edu_x.edux.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}