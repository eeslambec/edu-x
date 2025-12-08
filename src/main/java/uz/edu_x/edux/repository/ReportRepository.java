package uz.edu_x.edux.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.edu_x.edux.model.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {
}
