import java.util.ArrayList;

public class Main {

   public static boolean testarClasseExata(Object o, Class<?> classe){
       return o.getClass() == classe;
   };

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        //Aluno
        Aluno aluno = new Aluno("Dalisson", 1, "1234", "Des. de Sistema");
        aluno.fazerMatricula("Mecánica");
        pessoas.add(aluno);
       /* System.out.println(pessoas.getFirst().getSenha());
        System.out.println(aluno.getNome());
        System.out.println(aluno.getCurso());*/

        aluno = new Aluno("Breno", 3, "1234", "des. de sistema");
        pessoas.add(aluno);

        //Professor
        Professor professor = new Professor("Likas", 2, "12354", "Sistema");
        pessoas.add(professor);
        professor = new Professor("Jack", pessoas.size() + 1, "1234", "IOT");
        pessoas.add(professor);
        professor.fazerChamada();


        //Funcionario
        Funcionario funcionario = new Funcionario("Goku", 1, "123", "Manutenção");
        pessoas.add(funcionario);
        //System.out.println(funcionario.getNome());

        //Estagiario
        Estagiario estagiario= new Estagiario("Borregar", 50, "1235", "Desivolvimento de sistema", 1000f);
        pessoas.add(estagiario);


       /* Aluno a = (Aluno) pessoas.getFirst();
        System.out.println(a.getCurso());*/

        System.out.println("============");
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome());
            System.out.println(p.getId());
            System.out.println(p.getSenha());

            if (testarClasseExata(pessoas,Aluno.class)){
                Aluno a = (Aluno) p;
                System.out.println("Curso: "+ a.getCurso());
            } else if (testarClasseExata(pessoas,Professor.class)) {
                Professor pr = (Professor) p;
                System.out.println("Area: " + pr.getArea());
            } else if (testarClasseExata(pessoas,Funcionario.class)) {
                Funcionario f =(Funcionario) p;
                System.out.println("Manutenção funcionario:"+f.getCetor());
            } else if (testarClasseExata(pessoas,Estagiario.class)) {
                Estagiario e = (Estagiario) p;
                System.out.println("Curso" + e.getCurso());
                System.out.println("Bolsa: R$ " + e.getBolsa() );
            }



          /*  if (p instanceof Funcionario) {
                Funcionario f = (Funcionario) p;
                System.out.println(f.getCetor());
            } else if (p.getClass() == Professor.class) {
                Professor profe = (Professor) p;
                System.out.println(profe.getArea());
            }*/



            //Aluno
           /* if (p instanceof Aluno) {
                Aluno a = (Aluno) p;
                System.out.println(a.getCurso());
            } else if (p.getClass() == Professor.class) {
                Professor profe = (Professor) p;
                System.out.println(profe.getArea());
            }*/

            System.out.println("-------------");

        }

    }


}
