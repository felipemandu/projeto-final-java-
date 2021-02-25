package piedpipergamaacademia.projetofinaljava.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import piedpipergamaacademia.projetofinaljava.dto.AlunoDto;
import piedpipergamaacademia.projetofinaljava.dto.DisciplinaDto;
import piedpipergamaacademia.projetofinaljava.dto.EnderecoDto;
import piedpipergamaacademia.projetofinaljava.mapper.AlunoMapper;
import piedpipergamaacademia.projetofinaljava.mapper.DisciplinaMapper;
import piedpipergamaacademia.projetofinaljava.mapper.EnderecoMapper;
import piedpipergamaacademia.projetofinaljava.model.Aluno;
import piedpipergamaacademia.projetofinaljava.model.Disciplina;
import piedpipergamaacademia.projetofinaljava.model.Endereco;
import piedpipergamaacademia.projetofinaljava.repository.AlunoRepository;

@Service
public class AlunoService {

	private final AlunoRepository alunoRepository;

	@Autowired
	public AlunoService(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}

	public List<Aluno> getAlunos(String nome, String conceito, String disciplinaNome, String curso) {
		// TODO fazer filtragem com seleção com valores da query caso não nulos;

		return alunoRepository.findAll();
	}

	public Optional<Aluno> findAlunoPorId(Long id) {
		return alunoRepository.findById(id);
	}

	public Optional<Aluno> findAlunoPorNome(String nome) {
		return alunoRepository.findByNome(nome);
	}

	public Optional<Disciplina> findStatusDisciplinaDeAluno(Long id, String disciplinaNome) {
		return alunoRepository.findByIdAndNome(id, disciplinaNome);
	}
	
	public Optional<Disciplina> findDisciplinadeAlunoPorNome(Long id, String disciplinaNome) {
		return alunoRepository.findByIdAndNome(id, disciplinaNome);
	}
	
	public Optional<Aluno> saveAluno(@Valid AlunoDto alunoDto) {
		Aluno aluno = AlunoMapper.dtoToModel(alunoDto);
		aluno = alunoRepository.save(aluno);
		
		return Optional.of(aluno);
	}
	
	public List<Aluno>  findAlunoPorDisciplina(@Valid String disciplinaNome) {
		return alunoRepository.findByDisciplina(disciplinaNome);
	}
	
	public List<Aluno> findAlunoPorConceito(@Valid String conceito) {
		return alunoRepository.findAlunoPorConceito(conceito);
	}
	
	
	public List<Aluno> findAlunoPorCurso(@Valid String curso) {
		return alunoRepository.findByCurso(curso);
	}
	
	public Optional<Aluno> updateDisciplinaAluno(Long id, @Valid DisciplinaDto disciplina) {
		Optional<Aluno> alunoOptional = alunoRepository.findById(id);
		if (!alunoOptional.isPresent()) {
			return alunoOptional;
		}
		Aluno aluno = alunoOptional.get();
		atualizarDisciplinaNoALuno(disciplina, aluno.getDisciplinas());
		alunoOptional = Optional.of(aluno);
		return alunoOptional;
		
	}

	private void atualizarDisciplinaNoALuno(@Valid DisciplinaDto disciplina, List<Disciplina> disciplinas) {
		Disciplina disciplinaAtualizado = DisciplinaMapper.dtoToModel(disciplina);
		disciplinas.forEach(d -> {
			if(d.getNome().equals(disciplinaAtualizado.getNome())) {
				d = disciplinaAtualizado;
			}
		});
		
	}

	public Optional<Aluno> updateEnderecoAluno(Long id, Long idEndereco, EnderecoDto endereco) {
		Optional<Aluno> alunoOptional = alunoRepository.findById(id);
		if (!alunoOptional.isPresent()) {
			return alunoOptional;
		}
		Aluno aluno = alunoOptional.get();
		atualizarEnderecoNoALuno(endereco, idEndereco, aluno.getEnderecos());
		alunoOptional = Optional.of(aluno);
		return alunoOptional;
	}

	private void atualizarEnderecoNoALuno(EnderecoDto endereco, Long idEndereco, List<Endereco> enderecos) {
		Endereco enderecoAtualizado = EnderecoMapper.dtoToModel(endereco);
		enderecoAtualizado.setId(idEndereco);
		enderecos.forEach(e -> {
			if (enderecoAtualizado.equals(e)) {
				e = enderecoAtualizado;
			};});

	}

	public Optional<Aluno> updateAluno(Long id, @Valid AlunoDto alunoDto) {
		Optional<Aluno> alunoOptional = alunoRepository.findById(id);
		if (!alunoOptional.isPresent()) {
			return alunoOptional;
		}
		
		/*
		 * fiquei com dúvida aqui, imaginemos que a pessoa envia alguns dados para atualizar, mas não todos, 
		 * por exemplo, o dto tem nome, curso, telefone, mas também tem um lista de enderecos e lista de disciplinas,
		 * imagina que a pessoa quer mudar o aluno, faz sentindo enviar todos os dados? 
		 * E se ele enviar nome, curso telefone, e lista vazias, a gente apaga as listas? 
		 * Ou se enviarem novos enderecos e disciplinas, adicionamos caso não existam na lista do aluno, 
		 * substituimos a lista toda? e se existir atualizamos a lista?  
		 * vou partir do principio que somente vamos permitir mudar os dados do aluno, mas não endereco e disciplinas
		 * pois já temos métodos para isso. 
		 * Mas talvez o caso seja termos um dto especifico somente para mudarmos dados de um aluno, 
		 * mas sem permitir mexer com disciplinas ou endereços
		*/
		Aluno aluno = alunoOptional.get();
		aluno.setNome(alunoDto.getNome());
		aluno.setCurso(alunoDto.getCurso());
		aluno.setTelefone(alunoDto.getTelefone());
		
		alunoOptional = Optional.of(aluno);
		
		
		return alunoOptional;
	}

	public void deletePorId(Long id) {
		alunoRepository.deleteById(id);		
	}
	
	public void deletePorNome(Aluno aluno) {
		alunoRepository.delete(aluno);
		
	}

	

	

	

}
