package az.ingress.springjpa1.service;

import az.ingress.springjpa1.repository.StudentRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    //@PostConstruct
   public void ListByQueryMethods() {
        studentRepository.findByFirstName("akif")
                .stream()
                .forEach(System.out::println);

        studentRepository.findByFirstNameAndLastName("Alihuseyn", "Xaliqov")
                .stream()
                .forEach(System.out::println);

    }

        @PostConstruct
        public void jpql(){
        studentRepository.findStudentWithJPQL("Alihuseyn","Khaligov")
                .stream()
                .forEach(System.out::println);
        }

        @PostConstruct
        public void sql(){
        studentRepository.findStudentWithNativeSql("Alihsueyn","Khaliqov")
                .stream()
                .forEach(System.out::println);
        }


}