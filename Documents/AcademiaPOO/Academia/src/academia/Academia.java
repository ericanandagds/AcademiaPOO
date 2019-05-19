package academia;

import Model.Treino;
import Model.Treinador;
import Model.Cliente;
import Model.Atividade;
import java.util.List;



public class Academia {

public static void main (String[] args){

System.out.println();
}
    private List<Treinador> treinadores;

    public List<Treinador> getTreinadores() {
        return treinadores;
    }

    public void setTreinadores(List<Treinador> treinadores) {
        this.treinadores = treinadores;
    }

    public int getTotalTreinadores() {
        return this.treinadores.size();
    }

 
    public int getTotalClientesAcademia() {
        int total = 0;
        total = this.treinadores.stream().map((t) -> t.getAlunos().size()).reduce(total, Integer::sum);
        return total;
    }

    public Treino getTreinoPadrao() {
        Treino t = new Treino();
        t.addAtividade(new Atividade(20, 50, "biceps"));
        t.addAtividade(new Atividade(25, 50, "ffff"));
        t.addAtividade(new Atividade(28, 50, "ddd"));
        t.addAtividade(new Atividade(29, 50, "yyy"));
        t.addAtividade(new Atividade(22, 50, "xxx"));
        t.addAtividade(new Atividade(25, 50, "remada baixa"));
        t.addAtividade(new Atividade(15, 100, "costas"));

        return t;
    }

    public Cliente getMaiorMarombado() {
        double max = 0d;
        Cliente bombado = null;
        for (Treinador t : treinadores) {
            for (Cliente c : t.getAlunos()) {
                for (Treino t1 : c.getMeusTreinos()) {
                    for (Atividade a1 : t1.getAtividadesFisicasDoTreino()) {
                        if (a1.getPeso() > max) {
                            max = a1.getPeso();
                            bombado = c;
                        }
                    }
                }
            }
        }
        return bombado;
    }

    public double getMédiaPesoAcademia() {
        double max = 0d;
        int total = 0;
        for (Treinador t : treinadores) {
            for (Cliente c : t.getAlunos()) {
                for (Treino t1 : c.getMeusTreinos()) {
                    for (Atividade a1 : t1.getAtividadesFisicasDoTreino()) {
                        max += a1.getPeso();//Armazena maior peso
                        total++;
                    }
                }
            }
        }
        return max / total;
    }

    public boolean trocaTreinador(String nomeAluno, String nomeTreinador) {
        int posTreinadorAntigo = -1;
        int posTreinadrNovo = -1;
        Cliente alunoInsatisfeito = null;
        for (int i = 0; i < treinadores.size(); i++) {
            Treinador t = treinadores.get(i);
            if (t.getNome().equals(nomeTreinador)) {
                posTreinadrNovo = i;
            }
            for (Cliente c : t.getAlunos()) {
                if (c.getNome().equals(nomeAluno)) {
                    alunoInsatisfeito = c;
                    posTreinadorAntigo = i;
                }
            }
        }
        if (alunoInsatisfeito != null) {
            boolean t1 = treinadores.get(posTreinadorAntigo).getAlunos().remove(alunoInsatisfeito);
           
            boolean t2 = treinadores.get(posTreinadrNovo).getAlunos().add(alunoInsatisfeito);
            return (t1 && t2);
        } else {
            return false;
        }
    }
}
