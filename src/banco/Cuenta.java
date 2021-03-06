package banco;
import java.util.ArrayList;
import java.util.Calendar;
import java.io.Serializable;


public abstract class Cuenta implements Credito, OperacionesBancaLinea, Serializable{
    protected long numero;
    protected Calendar fechaContrato;
    protected double saldoActual;
    protected ArrayList<Movimiento> movtos  = new ArrayList();
    protected Cliente titular;
    

    public Cuenta(long numero, Calendar fechaContrato, Cliente titular) {
        this.numero = numero;
        this.fechaContrato = fechaContrato;
    }
    
    @Override
    public boolean retiro(double cantidad){
        if(getSaldoActual() >= cantidad){
            setSaldoActual(getSaldoActual() - cantidad);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean deposito(double cantidad){
        setSaldoActual(getSaldoActual() + cantidad);
        return true;
    }
    
    @Override
    public void generarEstadoCuenta(int mes, int anio) {
   ///aqui va la implementacion de escribir la informacion de los movimientos a un archivo
    
    }

    @Override
    public abstract boolean pagoServicios(long numReferencia,double cantidad);
    
   

    public String verFechaCorte(){
        return null;
    }

    /**
     * @return the saldoActual
     */
    public double getSaldoActual() {
        return saldoActual;
    }

    /**
     * @param saldoActual the saldoActual to set
     */
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void registrarMovtos(Movimiento movto){
        getMovtos().add(movto);
    }
    
    public void imprimeMovtos(){
    
    }

    /**
     * @return the numero
     */
    public long getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(long numero) {
        this.numero = numero;
    }

    /**
     * @return the fechaContrato
     */
    public Calendar getFechaContrato() {
        return fechaContrato;
    }

    /**
     * @param fechaContrato the fechaContrato to set
     */
    public void setFechaContrato(Calendar fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    /**
     * @return the movtos
     */
    public ArrayList<Movimiento> getMovtos() {
        return movtos;
    }

    /**
     * @param movtos the movtos to set
     */
    public void setMovtos(ArrayList<Movimiento> movtos) {
        this.movtos = movtos;
    }

    /**
     * @return the titular
     */
    public Cliente getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public abstract boolean transferencia(Cuenta cuentaDestino, double cantidad);
    
    
}


