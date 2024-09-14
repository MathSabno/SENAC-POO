package br.com.joaocarloslima;

public class Timer {
    private Numero hora;
    private Numero minutos;
    private Numero segundos;
    private boolean ligado;
    private boolean regressivo;

    public Timer (int minutos){
        setTempo(minutos);

    }
    public void setTempo (int minutos){
        this.hora = new Numero (minutos/60,20);
        this.segundos = new Numero (0, 60);
        this.minutos = new Numero (minutos % 60, 60);
    }

    public void start(){
        ligado = true;
    }

    public void stop(){
        ligado = false;
    }

    public void tick(){
        if (!ligado){
            return;
        }
        if (regressivo){
            tickRegressivo();
            return;
        }
    }

    private void tickRegressivo() {
        decrementarSegundos();
    }

    private void decrementarSegundos() {
        segundos.decrementar();
        if(segundos.getNumero() == 0){
            decrementarMinutos();
        }
    }

    private void decrementarMinutos() {
        minutos.decrementar();
        if (minutos.getNumero() == 0){
            hora.decrementar();
        }
    }

    public Numero getHora() {
        return hora;
    }

    public Numero getMinutos() {
        return minutos;
    }

    public Numero getSegundos() {
        return segundos;
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean isRegressivo() {
        return regressivo;
    }

    public void setHora(Numero hora) {
        this.hora = hora;
    }

    public void setMinutos(Numero minutos) {
        this.minutos = minutos;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setSegundos(Numero segundos) {
        this.segundos = segundos;
    }

    public void setRegressivo(boolean regressivo) {
        this.regressivo = regressivo;
    }
}
