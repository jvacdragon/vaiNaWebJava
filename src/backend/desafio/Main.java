package backend.desafio;

public class Main {
    public static void main(String[] args) {
        CaixaEletronico banco = new CaixaEletronico(1000);
        banco.deposito(200);
        banco.sacar(350);
        banco.sacar(890);
    }
}
