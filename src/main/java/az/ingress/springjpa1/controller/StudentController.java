package az.ingress.springjpa1.controller;

import az.ingress.springjpa1.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentRepository studentRepository;

    @GetMapping("/students")
    private String getStudents(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastName,
            @RequestParam(name = "age") int age) {
        return "First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age;
    }
}
