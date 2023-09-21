public class Personagem { //classe modelo, descrição, projeto
    //atributos ou propriedades
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 8;
    //comportamentos (métodos, funcao)
    void cacar(){
        if(energia >= 2){
            System.out.println(nome + " Cacando...");
            energia -= 2; //energia = energia -2;
        }
        else{
            System.out.println(nome + " sem energia para cacar...");
        }
        fome = Math.min(fome + 1, 10); //calcula o minimo entre 1 e 10
        sono = Math.min(sono + 1, 10);
    }

    void comer(){
        if(fome>=1){
            System.out.println(nome + " Comendo...");

            //operador ternário
            energia = energia + 1 > 10 ? 10 : energia + 1; //mesma coisa que fome -= 1; 
            energia = Math.min(energia + 1, 10);
        }
        else{
            System.out.println(nome + " Esta sem fome...");
        }
        
    }

    void dormir(){
        if(sono>=1){
            System.out.println(nome + " Dormindo...");
            sono  -= 1;
            energia  = Math.min(10, energia + 1);
        }
        else{
            System.out.println(nome + " Sem sono");
        }
    }
}