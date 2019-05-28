
package Model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private List<Treino> meusTreinos;

    /**
     *
     * @param nome
     * @param cpf
     * @param rg
     * @param sexo
     */
    public Cliente(String nome, String cpf, String rg, String sexo ) {
        super(nome, cpf, rg, sexo);
        this.meusTreinos = new ArrayList<>();
    }

    public List<Treino> getMeusTreinos() {
        return meusTreinos;
    }

    public void setMeusTreinos(List<Treino> meusTreinos) {
        this.meusTreinos = meusTreinos;
    }
    
    
}
