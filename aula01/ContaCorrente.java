package aula01;

public class ContaCorrente {
    //Valor padrão para os primitivos é 0
    //Valor padrão para os wrappers é null (nulo)

    private Integer numeroConta;
    Integer numeroAgencia;
    String nomeCliente;
    //Date dataNascimento;
    //Double pode ser declarado 0.0 ou 0d
    private Double saldo = 0.0;

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

    void sacar(Double valor){
        this.saldo = this.saldo - valor;
    }

    void depositar(Double valor){
        this.saldo = this.saldo + valor;
    }

    Double consultarSaldo(){
        return saldo;
    }
}
