package academia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Treino implements Serializable{
    private List<Atividade> atividadesFisicasDoTreino;
    private Date dataHoraTreino;

    public List<Atividade> getAtividadesFisicasDoTreino() {
        return atividadesFisicasDoTreino;
    }

    public void setAtividadesFisicasDoTreino(List<Atividade> atividadesFisicasDoTreino) {
        this.atividadesFisicasDoTreino = atividadesFisicasDoTreino;
    }

    public Date getDataHoraTreino() {
        return dataHoraTreino;
    }

    public void setDataHoraTreino(Date dataHoraTreino) {
        this.dataHoraTreino = dataHoraTreino;
    }
    
    public void addAtividade(Atividade a){
        this.getAtividadesFisicasDoTreino().add(a);
    }

    public Treino() {
        this.dataHoraTreino = new Date();
        this.atividadesFisicasDoTreino = new ArrayList<>();
    }
    
    
    
}
