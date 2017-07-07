package br.com.senac.pet;

/**
 * ESTUDO DAS CLASSES - EXEMPLO DE CRIAÇÃO DE UM OBJETO
 * PROGRAMAÇÃO ORIENTADA A OBJETO - CRIAÇÃO DE UM DALMATA
 * @author thiago.lsasantos
 */
public class Pingo {
    public static void main(String[] args) {
        Cachorro pingo = new Cachorro();
        pingo.raca = "dalmata";
        pingo.tamanho = 80;
        pingo.cor = "branco com pintas pretas";
        System.out.println("NOME: PINGO");
        System.out.println("RAÇA: " + pingo.raca);
        System.out.println("COR: " + pingo.cor);
        System.out.println("PORTE: " + pingo.tamanho + " CM" );
        pingo.latir();
        
    }
}
