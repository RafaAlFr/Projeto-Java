package been;

public class Sala {
	private String tipo;
	private int andar;
	private int numero;
	private int limitePessoas;
	private String temaSala;
	
	public Sala(String tipo, int andar, int numero, int limitePessoas, String temaSala) {
        this.tipo = tipo;
        this.andar = andar;
        this.numero = numero;
        this.limitePessoas = limitePessoas;
        this.temaSala = temaSala;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getLimitePessoas() {
        return limitePessoas;
    }

    public void setLimitePessoas(int limitePessoas) {
        this.limitePessoas = limitePessoas;
    }

    public String getTemaSala() {
        return temaSala;
    }

    public void setTemaSala(String temaSala) {
        this.temaSala = temaSala;
    }

    @Override
    public String toString() {
        return "Sala{" + "tipo=" + tipo + ", andar=" + andar + ", numero=" + numero + ", limitePessoas=" + limitePessoas + ", temaSala=" + temaSala + '}';
    }

        
    
}
