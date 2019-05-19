
package Model;

import java.util.ArrayList;
import java.util.List;

public class Treinador extends Pessoa{
    private List<Cliente> alunos;
    public Treinador(String nome, String cpf, String rg, String sexo) {
        super(nome, cpf, rg, sexo);
        this.alunos = new ArrayList<>();
    }

    public boolean addAluno(Cliente aluno){
        return this.alunos.add(aluno);
    }
    
    public List<Cliente> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Cliente> alunos) {
        this.alunos = alunos;
    }
    
    public int getTotalDeAlunos(){
        return this.alunos.size();
    }
    
}
