package Collections.java.API2023.list.aula;

public class Tarefas {

    private String descricao;

    public Tarefas(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return  descricao ;
    }
}
