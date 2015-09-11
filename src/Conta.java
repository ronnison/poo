/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ronnison
 */
public class Conta {
    protected double saldo;
    
    public double getSaldo () {
        return this.saldo;
    }
    
    public void deposita (double valor) {
        this.saldo += valor;
    }
    
    public void saca (double valor) {
        this.saldo -= valor;
    }
    
    public void atualiza (double taxa) {
        this.saldo += this.saldo * taxa;
    }
}
