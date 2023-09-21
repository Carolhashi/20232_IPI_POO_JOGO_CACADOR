public class Personagem { //classe modelo, descrição, projeto
    //atributos ou propriedades
    String nome;
    int energia;
    int fome;
    int sono;
    //comportamentos (métodos, funcao)
    void cacar(){
        if(energia >= 2){
            System.out.println(nome + " Cacando...");
            energia -= 2; //energia = energia -2;
        }
        else{
            System.out.println(nome + "sem energia para cacar...");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
    }

    void comer(){
        System.out.println(nome + " Comendo...");
    }

    void dormir(){
        System.out.println(nome + " Dormir...");
    }
}