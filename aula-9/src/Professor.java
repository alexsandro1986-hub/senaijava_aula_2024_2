public class Professor extends Pessoa{
    private String area;

    public Professor(String nome, int id, String senha, String area) {
        super(nome, id, senha);
        this.area = area;
    }

    public void fazerChamada(String area){
        System.out.println("Zuma");
        System.out.println("Andrey");
        System.out.println("....");
        System.out.println("Alexsandro");



        //setArea(area);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
