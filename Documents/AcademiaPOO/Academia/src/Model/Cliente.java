
package Model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private List<Treino> meusTreinos;
    public Cliente(String nome, String cpf, String rg) {
        super(nome, cpf, rg);
        this.meusTreinos = new ArrayList<>();
    }

    public List<Treino> getMeusTreinos() {
        return meusTreinos;
    }

    public void setMeusTreinos(List<Treino> meusTreinos) {
        this.meusTreinos = meusTreinos;
    }
    
    
}
