package Repository;

import com.example.demo.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@RepositoryRestResource(path = "repository-programm-language", collectionResourceRel = "language")
public interface Repository1 extends PagingAndSortingRepository<ProgrammingLanguage,Long> {


}
