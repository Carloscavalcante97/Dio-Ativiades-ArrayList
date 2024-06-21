package ListaDeTarefas;

public class Tarefa {
    private String descricao;

    public int getOrdem() {
        return ordem;
    }

    private int ordem;
    public String getDescricao() {
        return descricao;
    }

            public Tarefa(int ordem, String descricao) {
        this.descricao = descricao;
        this.ordem = ordem;
            }

            @Override
    public String toString() {
        return descricao;
            }
}
