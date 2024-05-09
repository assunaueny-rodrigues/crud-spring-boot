package assu.rodrigues.crudspringcursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import assu.rodrigues.crudspringcursos.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
