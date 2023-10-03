package az.ingress.springjpa1;

import az.ingress.springjpa1.domain.Student;
import az.ingress.springjpa1.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringJpa1Application implements CommandLineRunner {

    private final StudentRepository studentRepository;
    public static void main(String[] args) {
        SpringApplication.run(SpringJpa1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Student student= Student.builder()
//                .age(22)
//                .firstName("akif")
//                .lastName("Khaliqov")
//                .studentNumber("123456L")
//                .build();
//        studentRepository.save(student);


    }
}
