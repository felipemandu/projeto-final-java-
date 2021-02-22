	package piedpipergamaacademia.projetofinaljava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import piedpipergamaacademia.projetofinaljava.model.Aluno;
import piedpipergamaacademia.projetofinaljava.repository.AlunoRepository;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;


    @Autowired
    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> getAlunos(String nome, String conceito, String disciplinaNome, String curso) {
        //TODO fazer filtragem com seleção com valores da query caso não nulos;
        return alunoRepository.findAll();
    }
}
