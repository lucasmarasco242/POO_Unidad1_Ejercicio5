public class Contador {
    int valor;

    // Constructores
    public Contador() {
        this.valor = 0;
    }

    public Contador(int valor) {
        this.valor = valor;
    }

    // Métodos
    public void incrementar() {
        this.valor = valor + 1;
    }

    public void decrementar() {
        if (valor > 0) {
            this.valor = valor - 1;
        } else {
            valor = 0;
        }
    }

    public void resetear() {
        this.valor = 0;
    }

    public int getValor() {
        return this.valor;
    }
}
