package piedpipergamaacademia.projetofinaljava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import piedpipergamaacademia.projetofinaljava.model.Aluno;

@Repository
public interface AlunoRepository  extends JpaRepository<Aluno, Long> {

    /*TODO criar método necessarios utilizando spring DATA
    https://docs.spring.io/spring-data/jpa/docs/2.4.5/reference/html/#jpa.query-methods
    * */
}
