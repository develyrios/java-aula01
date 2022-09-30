package aula01;

//import java.util.List;
//import java.util.List;
public class ContaCorrente {
    //Valor padrão (default) para os primitivos é 0
    //Valor padrão (default) para os wrappers é null (nulo)

    private Integer numeroConta;
    public Integer numeroAgencia;
    public String nomeCliente;
    //public Date dataNascimento;
    //Double pode ser declarado 0.0 ou 0d
    private Double saldo = 0.0;

    public void setNumeroConta(Integer numeroConta){
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

    public Integer getNumeroConta (){
        return numeroConta;
    }

    public void sacar(Double valor){
        this.saldo = this.saldo - valor;
    }

    public void depositar(Double valor){
        this.saldo = this.saldo + valor;
    }

    public Double consultarSaldo(){
        return saldo;
    }
}
