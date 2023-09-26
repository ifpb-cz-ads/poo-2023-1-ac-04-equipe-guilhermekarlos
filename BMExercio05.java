import java.util.ArrayList;
import java.util.List;

public class TimeFutebol {
    private String nomeTime;
    private List<String> nomeJogadores;
    private int anoInicio;
    private int classificacao;
    private int pontuacao;
    private String nomeTecnico;
    private int partidas;
    private int quantidadeGols;

    // Construtor para inicializar os atributos
    public TimeFutebol(String nomeTime, int anoInicio, String nomeTecnico) {
        this.nomeTime = nomeTime;
        this.anoInicio = anoInicio;
        this.nomeTecnico = nomeTecnico;
        this.nomeJogadores = new ArrayList<>();
        this.classificacao = 0;
        this.pontuacao = 0;
        this.partidas = 0;
        this.quantidadeGols = 0;
    }

    // Método para ver a quantidade de partidas
    public int verPartidas() {
        return partidas;
    }

    // Método para somar a pontuação do time
    public void somarPontuacao(int pontos) {
        pontuacao += pontos;
    }

    // Método para ver a posição/classificação do time
    public int verPosicao() {
        return classificacao;
    }

    // Método para adicionar um jogador ao time
    public void adicionarJogador(String nomeJogador) {
        nomeJogadores.add(nomeJogador);
    }

    // Método para remover um jogador do time
    public void removerJogador(String nomeJogador) {
        nomeJogadores.remove(nomeJogador);
    }

    // Getters e setters para os atributos
    public String getNomeTime() {
        return nomeTime;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public List<String> getNomeJogadores() {
        return nomeJogadores;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
    

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getPartidas() {
        return partidas;
    }

    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }

    public int getQuantidadeGols() {
        return quantidadeGols;
    }

    public void setQuantidadeGols(int quantidadeGols) {
        this.quantidadeGols = quantidadeGols;
    }
}
