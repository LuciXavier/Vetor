public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Hugo");
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Giulia");
        Aluno aluno3 = new Aluno();
        aluno3.setNome("Giulia");

        System.out.println(aluno2.getNome());// imprime o nome 

        System.out.println(aluno1.equals(aluno2)); //esta comparando o nome 1 com o 2
        System.out.println(aluno2.equals(aluno3));// comparando entre 2 e 3

        Vetor vetor = new Vetor();
        vetor.adicionar(aluno1);
        vetor.adicionar(3,aluno2);
        
        System.out.println(vetor.toString());

        vetor.adicionar(56,aluno3);


    }
}
