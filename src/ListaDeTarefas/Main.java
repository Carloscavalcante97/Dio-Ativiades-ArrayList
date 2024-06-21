package ListaDeTarefas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
ListaTarefas Tarefa = new ListaTarefas();
Tarefa.adicionarTarefa( 1,"Fazer almoço");
Tarefa.adicionarTarefa(2,"Comer almoço");
System.out.println(Tarefa.imprimirTamanhoLista());
        Tarefa.imprimirListaTarefas();
    }
}