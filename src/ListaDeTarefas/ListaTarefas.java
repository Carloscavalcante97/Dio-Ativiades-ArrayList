package ListaDeTarefas;

import CarrinhoDeCompras.Item;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }
  public void adicionarTarefa(int ordem, String descricao) {
        boolean ordemExistente = false;
        for (Tarefa t: listaTarefas){
            if(t.getOrdem() == ordem){
                ordemExistente = true;
                break;
            }
        }
        if(!ordemExistente){
        this.listaTarefas.add(new Tarefa(ordem, descricao));}
        else System.out.print("Impossivel gerara tarefas com mesmo codigo \n");
  }
  public void removerTarefa(String descricao) {
        if (!listaTarefas.isEmpty()) {
            listaTarefas.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
        }else System.out.print("Lista de tarefas Vázia");
  }
  public int imprimirTamanhoLista() {
        return listaTarefas.size();
  }
  public void compararTarefa(){
       listaTarefas.sort(Comparator.comparing(Tarefa::getDescricao));
    }
  public void compararOrdem(){
  listaTarefas.sort(Comparator.comparing(Tarefa::getOrdem));
  }
    public void compararOrdemInverso(){
        listaTarefas.sort(Comparator.comparing(Tarefa::getOrdem).reversed());
    }
  public void imprimirListaTarefas() {
        if (!listaTarefas.isEmpty()) {
                System.out.print(listaTarefas);
            } else{
            System.out.print("Lista de tarefas vazia");}
        }
  }

