package piedpipergamaacademia.projetofinaljava.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import piedpipergamaacademia.projetofinaljava.model.Aluno;
import piedpipergamaacademia.projetofinaljava.model.Disciplina;

@Repository
public interface AlunoRepository  extends MongoRepository<Aluno, Long> {

    /*TODO criar método necessarios utilizando spring DATA
    https://docs.spring.io/spring-data/jpa/docs/2.4.5/reference/html/#jpa.query-methods
    * */
	
	Optional<Aluno> findByNome(String nome);
	List<Aluno> findByCurso(String curso);
	void deleteById(Long id);
	
	void delete(Aluno aluno);
	
	void deleteByNome(String nome);
	
	@Query("{disciplina: {nome: ?0}")
	Optional<Disciplina> findByIdAndNome(@Param("id")Long id, @Param("disciplinaNome")String disciplinaNome);
	
	@Query("{disciplina: {nome: ?0}")
	List<Aluno> findByDisciplina(@Param("disciplinaNome")String disciplinaNome);
	
	
	@Query("{disciplina: {conceito: ?0")
	List<Aluno> findAlunoPorConceito(@Param("conceito")String conceito);
	
}
