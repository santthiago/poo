package br.com.senac.pet;

/**
* ESTUDO DAS CLASSES - EXEMPLO DE CRIAÇÃO DE UM OBJETO
 * PROGRAMAÇÃO ORIENTADA A OBJETO - CRIAÇÃO DE UM PITBULL REDNOSE
 * @author thiago.lsasantos
 */
public class Zeus {
    public static void main(String[] args) {
        Cachorro zeus = new Cachorro();
        zeus.cor = "castanho com nariz vermelho";
        zeus.raca = "pitbull";
        zeus.tamanho = 60;
        zeus.peso = 50;
        System.out.println("NOME: ZEUS");
        System.out.println("RAÇA: " + zeus.raca);
        System.out.println("PORTE: " + zeus.tamanho + " CM");
        System.out.println("PESO: " + zeus.peso + " KG");
        zeus.latir();
    }
}
