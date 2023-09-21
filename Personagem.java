public class Personagem { //classe modelo, descrição, projeto
    //atributos ou propriedades
    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    //construtor padrão: lista de parâmetros vazia
    //Personagem(){   
    //}
    Personagem(String nome){   
        this.nome = nome;
    }

    Personagem(String nome, int energia, int fome, int sono){   
        this.nome = nome;
        if(energia >=0 && energia <= 10)
            this.energia = energia;
        if(fome >= 0 && fome <= 10)    
            this.fome = fome;
        if(sono >= 0 && sono <= 10)
            this.sono = sono;
    }

    //comportamentos (métodos)
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

void exibirEstado(){
    System.out.printf("%s: energia: %d, fome: %d, sono: %d\n", nome, energia, fome, sono);
    }
}


