public class Aluno {
    private String nome;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome=nome;
        }

    @Override
     public String toString() {
      return this.nome;
    }

    @Override
     public boolean equals(Object o) {
      Aluno oAluno = (Aluno)o;
       return this.nome.equals(oAluno.nome);
    }

}

    