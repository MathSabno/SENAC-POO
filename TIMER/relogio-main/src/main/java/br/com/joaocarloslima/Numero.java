package br.com.joaocarloslima;

public class Numero {
    private int numero;
    private int limite;

    public Numero(int numero) {
        this.numero = numero;
    }

    public Numero(int numero, int limite) {
        this.numero = numero;
        this.limite = limite;
    }

    public void incrementar (){
        //outra forma de realizar o metodo incrementar
        //numero = (numero + 1) % limite;

        numero++;
        if (numero == limite) {
            numero = 0;
        }

    }
    public void decrementar(){
        numero--;
        if (numero < 0){
            numero = limite;
        }
    }
    public String getValorFormatado(){
        if (numero < 10){
            return "0" + numero;
        }
        return "" + numero;
    }

    public int getNumero() {
        return numero;
    }

    public int getLimite() {
        return limite;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
}
