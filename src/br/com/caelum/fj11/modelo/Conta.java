package caelum.fj11.modelo;

import caelum.fj11.excecao.SaldoInsuficienteException;

public class Conta implements Comparable<Conta> {

    private double limite;
    private double saldo;
    private Cliente titular;
    private int agencia;
    private int numero;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void saca(double valor){
        if (saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        }else{
           throw new SaldoInsuficienteException();
        }

    }

    public synchronized void deposita(double valor){
        this.saldo += valor;
    }

    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta com saldo " + saldo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(saldo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Conta)) return false;
        Conta outraConta = (Conta) obj;
        return outraConta.getSaldo() == this.getSaldo();
    }

    @Override
    public int compareTo(Conta outra) {
        if (this.saldo < outra.getSaldo()) return -1;
        if (this.saldo > outra.getSaldo()) return 1;
        return 0;
    }
}
