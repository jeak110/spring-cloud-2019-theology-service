package my.test.spring.theologyservice;

import my.test.spring.theologyservice.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "exercise", path = "exercise")
public interface ExerciseRestRepository extends JpaRepository<Exercise, String> {
}
