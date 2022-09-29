package aula01;

import.java.
public class ContaCorrente {
    Integer numeroConta;
    Integer numeroAgencia;
    String nomeCliente;
    Date dataNascimento;
    Double saldo;

    void setNumeroConta(Integer numeroConta){
        //O if com null garante que um número seja atribuído SOMENTE
        //se o objeto ou argumento estiver vazio
        if (this.numeroConta == null) {
            //Atribuir o número de fora do método (escopo global) ao
            //número dentro do método (escopo local), que possui this
            this.numeroConta = numeroConta;
        }
        else {
            System.out.println("Cliente, o número de sua conta não pode ser alterado");
        }
    }

    Integer getNumeroConta (){
        return numeroConta;
    }
}
