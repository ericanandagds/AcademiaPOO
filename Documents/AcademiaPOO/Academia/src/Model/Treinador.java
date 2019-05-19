
package Model;

import Model.Pessoa;
import Model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class Treinador extends Pessoa{
    private List<Cliente> alunos;
    public Treinador(String nome, String cpf, String rg) {
        super(nome, cpf, rg);
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
