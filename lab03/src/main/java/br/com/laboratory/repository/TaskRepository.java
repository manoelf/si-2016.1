package br.com.laboratory.repository;

import br.com.laboratory.model.banks.TaskBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by manoelferreira on 2/5/17.
 */
@Repository
public interface TaskRepository extends JpaRepository<TaskBank, Long>{

}
