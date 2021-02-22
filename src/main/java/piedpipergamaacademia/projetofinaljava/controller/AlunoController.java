package piedpipergamaacademia.projetofinaljava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import piedpipergamaacademia.projetofinaljava.dto.AlunoDto;
import piedpipergamaacademia.projetofinaljava.dto.DisciplinaDto;
import piedpipergamaacademia.projetofinaljava.dto.EnderecoDto;
import piedpipergamaacademia.projetofinaljava.mapper.AlunoMapper;
import piedpipergamaacademia.projetofinaljava.mapper.EnderecoMapper;
import piedpipergamaacademia.projetofinaljava.model.Aluno;
import piedpipergamaacademia.projetofinaljava.response.AlunoResponse;
import piedpipergamaacademia.projetofinaljava.service.AlunoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoService service;

    @Autowired
    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<AlunoResponse>> getAlunos(@RequestParam(value="nome", required = false) String nome,
                                                         @RequestParam(value="conceito", required = false) String conceito,
                                                         @RequestParam(value="disciplina", required = false) String disciplinaNome,
                                                         @RequestParam(value="curso", required = false) String curso) {
        //TODO
        List<Aluno> alunos = service.getAlunos(nome, conceito, disciplinaNome, curso);
        List<AlunoResponse> alunosResponse = alunos.stream()
                                                    .map(AlunoMapper::modelToResponse)
                                                    .collect(Collectors.toList());
        return ResponseEntity.ok(alunosResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoResponse> getAlunoPorId(@PathVariable("id") Long id) {
        //TODO
        return null;
    }

    @GetMapping("/{nome}")
    public ResponseEntity<AlunoResponse> getAlunoPorNome(@PathVariable("nome") String nome) {
        //TODO
        return null;
    }

    @GetMapping("/{id}/{disciplina}/status")
    public ResponseEntity<String> getAlunoDisciplinaAprovacao(@PathVariable("id") Long id,
                                                              @PathVariable("disciplina") String disciplinaNome) {
        //TODO
        return null;
    }

    @GetMapping("/{id}/{disciplina}/conceito")
    public ResponseEntity<String> getAlunoDisciplinaConceito(@PathVariable("id") Long id,
                                                             @PathVariable("disciplina") String disciplinaNome) {
        //TODO
        return null;
    }

    @GetMapping("/{id}/{disciplina}/notas")
    public ResponseEntity<String> getAlunoDisciplinaNotas(@PathVariable("id") Long id,
                                                          @PathVariable("disciplina") String disciplinaNome) {
        //TODO
        return null;
    }

    @PostMapping
    public ResponseEntity<AlunoResponse> postAluno(@RequestBody AlunoDto aluno) {
        //TODO
        return null;
    }

    @PutMapping
    public ResponseEntity<AlunoResponse> putAluno(@RequestBody AlunoDto aluno) {
        //TODO
        return null;
    }

    @PutMapping("/{id}/{disciplina}")
    public ResponseEntity<AlunoResponse> putAlunoDisciplinaNota(@PathVariable("id") Long id,
                                                                @PathVariable("disciplina") String disciplinaNome,
                                                                @RequestBody DisciplinaDto disciplina) {
        //TODO
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<AlunoResponse> putAlunoEndereco(@PathVariable("id") Long id,
                                                          @RequestBody EnderecoDto endereco) {
        //TODO
        return null;
    }




}
