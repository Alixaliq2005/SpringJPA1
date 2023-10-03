package az.ingress.springjpa1.repository;

import az.ingress.springjpa1.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByFirstName(String babek);
   List<Student> findByFirstNameAndLastName(String alihuseyn, String xaliqov);

    @Query("SELECT s FROM Student  s WHERE s.firstName= ?1 AND s.lastName = ?2")
    List<Student> findStudentWithJPQL(String firstName,String lastName);

    @Query(nativeQuery = true,value = "SELECT * FROM our_students s WHERE s.first_Name= ?1 AND s.last_Name = ?2")
    List<Student> findStudentWithNativeSql(String firstName, String lastName);
}
