package src.br.com.zup.trilhabackend.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import src.br.com.zup.trilhabackend.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);
}
