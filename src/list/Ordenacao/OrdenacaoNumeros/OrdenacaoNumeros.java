package list.Ordenacao.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<Integer>();
    }

    //Método que adiciona um número à lista.
    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    // Método que ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
    public List<Integer> ordenarAscendente(){
        List<Integer> ordemAscendente = new ArrayList<Integer>(numeros);
        Collections.sort(ordemAscendente);
        return ordemAscendente;
    }

    // Método que ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
    public List<Integer> ordenarDescendente(){
        List<Integer> ordemDescendente = new ArrayList<Integer>(numeros);
        Collections.sort(ordemDescendente, Collections.reverseOrder());
        return ordemDescendente;
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "numeros=" + numeros +
                '}';
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
        System.out.println(numeros);

        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros);

        System.out.println(numeros.ordenarDescendente());
        System.out.println(numeros);
    }
}
