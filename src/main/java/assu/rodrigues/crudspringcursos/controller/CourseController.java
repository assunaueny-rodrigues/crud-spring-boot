package assu.rodrigues.crudspringcursos.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import assu.rodrigues.crudspringcursos.model.Course;
import assu.rodrigues.crudspringcursos.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    private CourseRepository courseRepository;

    @GetMapping
    public List<Course> list(){
        return courseRepository.findAll();
    }
    

    @PostMapping    
    @ResponseStatus(code = HttpStatus.CREATED)
    public Course add(@RequestBody Course course){
        return courseRepository.save(course);
    }
}