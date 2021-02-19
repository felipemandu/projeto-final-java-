package piedpipergamaacademia.projetofinaljava.mapper;

import org.springframework.http.ResponseEntity;
import piedpipergamaacademia.projetofinaljava.dto.AlunoDto;
import piedpipergamaacademia.projetofinaljava.dto.DisciplinaDto;
import piedpipergamaacademia.projetofinaljava.model.Aluno;
import piedpipergamaacademia.projetofinaljava.model.Disciplina;
import piedpipergamaacademia.projetofinaljava.model.Endereco;
import piedpipergamaacademia.projetofinaljava.response.AlunoResponse;
import piedpipergamaacademia.projetofinaljava.response.DisciplinaResponse;
import piedpipergamaacademia.projetofinaljava.response.EnderecoResponse;

import java.util.List;
import java.util.stream.Collectors;

public class AlunoMapper {


    //TODO criar métodos static para as transformações entre as representacoes de Aluno

    public static AlunoResponse modelToResponse(Aluno aluno) {
        AlunoResponse response = new AlunoResponse();
        response.setNome(aluno.getNome());
        response.setTelefone(aluno.getTelefone());
        response.setCurso(aluno.getCurso());
        response.setDisciplina(getDisciplinaResponse(aluno.getDisciplinas()));
        response.setEndereco(getEnderecoResponse(aluno.getEnderecos()));
        return response;
    }

    public static Aluno dtoToModel(AlunoDto dto) {
        return null;
    }

    private static List<DisciplinaResponse> getDisciplinaResponse(List<Disciplina> disciplinas) {
        return disciplinas
                .stream()
                .map(DisciplinaMapper::modelToResponse)
                .collect(Collectors.toList());
    }

    private static List<EnderecoResponse> getEnderecoResponse(List<Endereco> enderecos) {
        return enderecos
                .stream()
                .map(EnderecoMapper::modelToResponse)
                .collect(Collectors.toList());
    }

}
