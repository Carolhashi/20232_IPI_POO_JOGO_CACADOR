public class Personagem { //classe modelo, descrição, projeto
    //atributos ou propriedades
    String nome;
    int energia;
    int fome;
    int sono;
    //comportamentos (métodos, funcao)
    void cacar(){
        System.out.println(nome + " Cacando...");
    }

    void comer(){
        System.out.println(nome + " Comendo...");
    }
    
    void dormir(){
        System.out.println(nome + " Dormir...");
    }
}