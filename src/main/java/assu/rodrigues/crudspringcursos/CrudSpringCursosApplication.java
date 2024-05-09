package assu.rodrigues.crudspringcursos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import assu.rodrigues.crudspringcursos.model.Course;
import assu.rodrigues.crudspringcursos.repository.CourseRepository;

@SpringBootApplication
public class CrudSpringCursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringCursosApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository){
		return args -> {
			courseRepository.deleteAll();

			Course c = new Course();
			c.setName("Angular Spring");
			c.setCategory("Front-end");

			courseRepository.save(c);
		};
	}
}
