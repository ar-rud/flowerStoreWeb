package ua.edu.ucu.apps.flowerStore.studentTransition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long>{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
    @Query("SELECT u FROM Student u WHERE u.name = ?1")
    Optional<Student> findByFirstName(String name);
}
