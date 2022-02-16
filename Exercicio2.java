class Exercicio2 {
    public static void main(String[] args) {
        int numero1 = 4;
        int numero2 = 8;

        double expo1 = Math.pow(numero1, 5);
        double expo2 = Math.pow(numero2, 5);

        int divisao = numero1 / numero2;

        int modulo = numero1 % numero2;

        double raiz1 = Math.sqrt(numero1);
        double raiz2 = Math.sqrt(numero2);

        System.out.println("Potência do numero 1:" + expo1 + 
        "\nPotência do numero 2:" + expo2 + 
        "\nO resultado da divisão é:" + divisao + 
        "\nO módulo é:" + modulo + 
        "\nRaiz quadrada do numero 1:" + raiz1 + 
        "\nRaiz quadrada do numero 2:" + raiz2);
    }
    
}