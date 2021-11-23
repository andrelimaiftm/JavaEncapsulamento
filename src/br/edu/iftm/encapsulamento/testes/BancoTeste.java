package br.edu.iftm.encapsulamento.testes;

import br.edu.iftm.encapsulamento.classes.Banco;

public class BancoTeste {
    public static void main(String[] args) {

        Banco banco = new Banco("CAIXA", 10);
        banco.iniciar();
       
        /*banco.abrirConta();
        Conta c1 = banco.buscarConta(1);
        banco.realizaOperacao("deposito", c1, null, 100d);
        System.out.println(c1.getSaldo());
        c1 = banco.buscarConta(1);
        System.out.println(c1.getSaldo());*/

        /*
         * Cliente c1 = new Cliente("Antonio","Carlos","12345678912", 27, 01, 1980);
         * Cliente c2 = new Cliente("Mariamar", null, "14578996214", 12, 15, 2005);
         * 
         * Conta conta1 = new Conta(c1); System.out.println("Total de Contas: "+
         * conta1.getTotalDeContas() ); Conta conta2 = new Conta(2, c2);
         * System.out.println("Total de Contas: "+ conta2.getTotalDeContas() );
         * 
         * 
         * conta1.setNumero(1); Cliente aux = conta1.getCliente();
         * System.out.println(aux.getNome());
         * //System.out.println((conta1.getCliente()).getNome());
         * System.out.println(conta1.getNumero());
         * System.out.println((conta2.getCliente()).getNome());
         * System.out.println(conta2.getNumero()); conta1.depositar(100d);
         * System.out.println(conta1.sacar(50d));
         * System.out.println("Saldo da conta 1: "+ conta1.getSaldo());
         * System.out.println("Saldo da conta 2: "+ conta2.getSaldo());
         * conta1.transferir(conta2, 50d);
         * System.out.println("Valor após a transferencia.");
         * System.out.println("Saldo da conta 1: "+ conta1.getSaldo());
         * System.out.println("Saldo da conta 2: "+ conta2.getSaldo());
         */
    }
}