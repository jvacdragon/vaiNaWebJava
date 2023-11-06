package backend.desafio;
//Verificar saldo
//        Depositar dinheiro
//        Sacar dinheiro
//        Sair
public class CaixaEletronico {
    private double valor;
    public CaixaEletronico(double valor){
        this.valor=valor;
    }

    public void deposito(double valor){
        this.valor+=valor;
        System.out.printf("Valor atual: %.2f\n", this.valor);
    }

    public void sacar(double valor){
        if(this.valor>=valor){
            this.valor-=valor;
            System.out.printf("Valor atual: %.2f\n", this.valor);
        } else {
            System.out.println("Valor em conta insuficiente para saque.\n");
        }
    }
}
