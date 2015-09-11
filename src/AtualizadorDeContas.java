/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ronnison
 */
public class AtualizadorDeContas {
    
    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
    
        this.selic = selic;
    
    }
    
    void roda (Conta c) {
        System.out.println("Saldo Anterior: " + c.getSaldo() + "\n");
        c.atualiza(selic);
        System.out.println("Saldo Final: " + c.getSaldo() + "\n");
        this.saldoTotal += c.getSaldo();
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

   
}
