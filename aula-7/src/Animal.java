class Animal {
    private String nome;
    private int idade;
    private String habitat;

    public Animal(String nome, int idade, String habitat) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public void fazerBarulho() {
        System.out.println("O animal faz algum barulho");
    }
}

// Subclasse para representar um leão
class Leao extends Animal {
    private String jubaColorida;

    public Leao(String nome, int idade, String habitat, String jubaColorida) {
        super(nome, idade, habitat);
        this.jubaColorida = jubaColorida;
    }

    public String getJubaColorida() {
        return jubaColorida;
    }

    @Override
    public void fazerBarulho() {
        System.out.println("O leão ruge!");
    }
}

// Subclasse para representar um elefante
class Elefante extends Animal {

    public Elefante(String nome, int idade, String habitat) {
        super(nome, idade, habitat);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("O elefante emite um som de trombeta!");
    }

    public void usarTromba() {
        System.out.println("O elefante usa sua tromba.");
    }
}