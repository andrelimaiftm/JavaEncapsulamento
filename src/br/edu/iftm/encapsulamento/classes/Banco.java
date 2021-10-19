package br.edu.iftm.encapsulamento.classes;

import javax.swing.JOptionPane;

public class Banco {

    private int indice;

    private String nome;
    private Conta[] vetorContas;

    public Banco(){
        vetorContas = new Conta[10];
    }

    public Banco(String nome, int numeroDeContas){
        this.nome = nome;
        vetorContas = new Conta[numeroDeContas];
    }

    public void abrirConta(){
        Cliente cl =  cadastroCliente();
        Conta c = new Conta(cl);
        c.setNumero(c.getTotalDeContas());
        this.vetorContas[indice] = c;
        indice++;       
    }

    private String inputDados(String msg){
        String temp = JOptionPane.showInputDialog(null,msg);
        return temp;
    }

    private Cliente cadastroCliente(){
        String nome = inputDados("Digite o nome do Cliente:");
        String sobrenome = inputDados("Digite o sobrenome do Cliente:");
        String cpf = inputDados("Digite o cpf do Cliente:");
        String temp = inputDados("Digite o dia de nascimento do Cliente:");
        int dia = Integer.parseInt(temp);
        temp = inputDados("Digite o mês de nascimento do Cliente:");
        int mes = Integer.parseInt(temp);
        temp = inputDados("Digite o ano de nascimento do Cliente:");
        int ano = Integer.parseInt(temp);
        Cliente c = new Cliente(nome, sobrenome, cpf, dia, mes, ano);
        return c;
    }
    
    public Conta buscarConta(int numero){
        for (Conta conta : vetorContas) {
            if(conta.getNumero() == numero){
                return conta;
            }
        }
        return null;
    }

    public void realizaOperacao(String operacao,Conta conta, Conta destino, double valor){
        switch (operacao) {
            case "saque":
                conta.sacar(valor);                
                break;
            case "deposito":
                conta.depositar(valor);
                break;
            case "tranferir":
                conta.transferir(destino, valor);
                break;
            default:
                break;
        }
    }
    

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Conta[] return the vetorContas
     */
    public Conta[] getVetorContas() {
        return vetorContas;
    }

    /**
     * @param vetorContas the vetorContas to set
     */
    public void setVetorContas(Conta[] vetorContas) {
        this.vetorContas = vetorContas;
    }

}
