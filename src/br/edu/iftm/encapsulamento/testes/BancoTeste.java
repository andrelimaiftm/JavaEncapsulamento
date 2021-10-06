package br.edu.iftm.encapsulamento.testes;

import br.edu.iftm.encapsulamento.classes.Conta;

public class BancoTeste{
    public static void main(String[] args) {
        Conta conta1 = new Conta("Antonio Carlos");
        Conta conta2 = new Conta(2, "Mariamar");
        conta1.setNumero(1);           
        System.out.println(conta1.getTitular());
        System.out.println(conta1.getNumero());
        System.out.println(conta2.getTitular());
        System.out.println(conta2.getNumero());
        conta1.depositar(100d);
        System.out.println(conta1.sacar(50d));
    }
}