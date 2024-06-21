package ListaDeTarefas;

import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
ListaTarefas Tarefa = new ListaTarefas();
Tarefa.adicionarTarefa( 1,"Fazer almoço");
Tarefa.adicionarTarefa(2,"Comer almoço");
        Tarefa.adicionarTarefa(3,"Descansar");
        Tarefa.adicionarTarefa(4,"Estudar");
System.out.println(Tarefa.imprimirTamanhoLista());
        Tarefa.imprimirListaTarefas();
        Tarefa.compararTarefa();
        Tarefa.imprimirListaTarefas();
        Tarefa.compararOrdem();
        Tarefa.imprimirListaTarefas();
    }
}