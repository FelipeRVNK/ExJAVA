public class Jogador {
    String nome;
    int nivel;
    int pontuacao;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    public void setPontuacao(int pontuacao){
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }
    public int getNivel() {
        return nivel;
    }
    public int getPontuacao() {
        return pontuacao;
    }

    public void subirNivel(int valor){
        System.out.println("O JOGADOR " + nome + " SUBIU " + valor + " NIVEIS");
        nivel += valor;
    }
    public void mudarPontuacao(int valor){
        System.out.println("O JOGADOR " + nome + " SUBIU A PONTUACAO PARA " + pontuacao);
        pontuacao += valor;
    }
    public void exibirInfo(){
        System.out.println("Nome do jogador: " + nome);
        System.out.println("nivel do jogador: " + nivel);
        System.err.println("pontuacao do jogador: " + pontuacao);
    }
}
