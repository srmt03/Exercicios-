class Exercicio4 {
    public static void main(String[] args) {
        int valor = 100;
        int desconto = 20;

        int valorDesconto = (valor/100) * desconto;
        int valorFinal = valor - valorDesconto;
        System.out.println("A compra com descono fica: " + valorFinal);

    }
}