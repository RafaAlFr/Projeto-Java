package been;

public class Sessao {
	private int tempoSessao;
	private int tempoApresentacao;
	private int idSessao;
	private String anfiteatro;

    public Sessao(int tempoSessao, int tempoApresentacao, int idSessao, String anfiteatro) {
        this.tempoSessao = tempoSessao;
        this.tempoApresentacao = tempoApresentacao;
        this.idSessao = idSessao;
        this.anfiteatro = anfiteatro;
    }

    public int getTempoSessao() {
        return tempoSessao;
    }

    public void setTempoSessao(int tempoSessao) {
        this.tempoSessao = tempoSessao;
    }

    public int getTempoApresentacao() {
        return tempoApresentacao;
    }

    public void setTempoApresentacao(int tempoApresentacao) {
        this.tempoApresentacao = tempoApresentacao;
    }

    public int getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(int idSessao) {
        this.idSessao = idSessao;
    }

    public String getAnfiteatro() {
        return anfiteatro;
    }

    public void setAnfiteatro(String anfiteatro) {
        this.anfiteatro = anfiteatro;
    }

    @Override
    public String toString() {
        return "Sessao{" + "tempoSessao=" + tempoSessao + ", tempoApresentacao=" + tempoApresentacao + ", idSessao=" + idSessao + ", anfiteatro=" + anfiteatro + '}';
    }
	
}
