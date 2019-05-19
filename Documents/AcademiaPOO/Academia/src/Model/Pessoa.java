
package Model;

import java.io.Serializable;

/**
 *
 * @author cesmac
 */
public abstract class Pessoa implements Serializable{
    private String nome, cpf, rg,sexo;

    public Pessoa(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
    }       

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    public String  getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
}
