package assu.rodrigues.crudspringcursos.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import assu.rodrigues.crudspringcursos.model.Course;
import assu.rodrigues.crudspringcursos.repository.CourseRepository;
import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    private CourseRepository courseRepository;

    @GetMapping
    public List<Course> list(){
        return courseRepository.findAll();
    }
    
}