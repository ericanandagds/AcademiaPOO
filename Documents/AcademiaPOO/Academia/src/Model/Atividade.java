package Model;

import java.io.Serializable;

public class Atividade implements Serializable{
    private int repeticoes;
    private double peso;
    private String nome;

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Atividade(int repeticoes, double peso, String nome) {
        this.repeticoes = repeticoes;
        this.peso = peso;
        this.nome = nome;
    }
    
    
    
}
