package piedpipergamaacademia.projetofinaljava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import piedpipergamaacademia.projetofinaljava.model.Aluno;
import piedpipergamaacademia.projetofinaljava.repository.AlunoRepository;
import piedpipergamaacademia.projetofinaljava.response.AlunoResponse;

import java.util.List;

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
