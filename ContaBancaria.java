public class ContaBancaria {
    private float saldo;
    private int numConta;
    private String titularConta;

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public int getNumConta(){
        return numConta;
    }

    public void setTitularConta(String titularConta){
        this.titularConta = titularConta;
    }

    public String getTitularConta(){
        return titularConta;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public float getsaldo(){
        return saldo;
    }

    public void sacar(float valor){
        saldo -= valor;
        System.out.println("\nsaldo atual eh: " + saldo);
    }
    public void depositar(float valor){
        saldo += valor;
        System.out.println("\nsaldo atual eh: " + saldo);
    }
    public void exibirInfo(){
        System.out.println("TIRULAR DA CONTA: " + titularConta);
        System.out.println("NUMERO DA CONTA: " + numConta);
        System.err.println("SALDO DA CONTA: " + saldo);
    }

}
