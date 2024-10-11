import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int total = 0;

    public void adicionar(Aluno aluno) {
        this.alunos[total] = aluno;
        this.total++;
    }

    
    public void adicionar(int posicao, Aluno aluno) {
        verificaPosicaoInsercao(posicao);
        for (int i = total - 1; i >= posicao; i--) {
            alunos[i + 1] = alunos[i];
        }
        alunos[posicao] = aluno;
        total++;
    }

    public Aluno pega(int posicao) {
        verifica(posicao);
        return alunos[posicao];
    }

    public void remove(int posicao) {
        verifica(posicao);
        for (int i = posicao; i < total - 1; i++) {
            alunos[i] = alunos[i + 1];
        }
        alunos[total - 1] = null; 
        total--;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < total; i++) {
            if (alunos[i].equals(aluno)) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return this.total;
    }

    @Override
    public String toString() {
        Aluno[] alunosPresentes = Arrays.copyOfRange(alunos, 0, total);
        return Arrays.toString(alunosPresentes);
    }

    private void verifica(int posicao) {
        if (posicao < 0 || posicao >= total) {
            throw new IllegalArgumentException("Posição inválida");
        }
    }

    private void verificaPosicaoInsercao(int posicao) {
        if (posicao < 0 || posicao > total) {
            throw new IllegalArgumentException("Posição de inserção inválida");
        }
    }
}