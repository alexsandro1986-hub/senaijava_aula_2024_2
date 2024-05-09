public class Main {
    public static void main(String[] args) {
        // Criando um leão
        Leao leao = new Leao("Leão", 5, "Savana", "Dourada");
        System.out.println("Nome: " + leao.getNome());
        System.out.println("Idade: " + leao.getIdade());
        System.out.println("Habitat: " + leao.getHabitat());
        System.out.println("Juba: " + leao.getJubaColorida());
        leao.fazerBarulho();

        System.out.println();

        // Criando um elefante
        Elefante elefante = new Elefante("Elefante", 10, "Floresta");
        System.out.println("Nome: " + elefante.getNome());
        System.out.println("Idade: " + elefante.getIdade());
        System.out.println("Habitat: " + elefante.getHabitat());
        elefante.fazerBarulho();
        elefante.usarTromba();
    }
}