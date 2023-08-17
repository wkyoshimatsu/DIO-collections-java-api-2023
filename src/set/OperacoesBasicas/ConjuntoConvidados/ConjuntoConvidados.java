package set.OperacoesBasicas.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<Convidado>();
    }

    // Método que adiciona um convidado ao conjunto
    public void adicionarConvidado(String nome, int codigoConvite){
        this.convidados.add(new Convidado(nome, codigoConvite));
    }

    //Método que remove um convidado do conjunto com base no código do convite.
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        if (!this.convidados.isEmpty()){
            for(Convidado convidado : this.convidados){
                if(convidado.getCondigoConvite() == codigoConvite){
                    convidadoParaRemover = convidado;
                    break;
                }
            }
        }
        convidados.remove(convidadoParaRemover);
    }

    //Método que conta o número total de convidados no Set.
    public int contarConvidados(){
        return this.convidados.size();
    }

    //Método que exibe todos os convidados do conjunto.
    public void exibirConvidados(){
        System.out.println(convidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();
    }

}
