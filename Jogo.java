import java.util.Random;
public class Jogo {
    public static void main(String[] args) throws Exception{
        var gerador = new Random();
        var personagem = new Personagem();
        personagem.nome = "John";
        var soneca = new Personagem();
        //nasce com muito sono e sem energia. fome mais ou menos
        //ele tem probabilidade 80% de dormir
        //10% de caçar
        //10% de comer
        while(true){
            int oQueFazer = gerador.nextInt(10); //[0..3[
            switch(oQueFazer){
                case 0:
                    personagem.cacar();
                    break;
                case 1:
                    personagem.comer();
                    break;
                case 2:
                    personagem.dormir();
                    break;
            }
            personagem.cacar();
            personagem.comer();
            personagem.dormir();
            System.out.printf("energia: %d, fome: %d, sono: %d\n", 
                personagem.energia,
                personagem.fome,
                personagem.sono
                );
            System.out.println("********************");
            Thread.sleep(8000);
        }
    }
}
