 class Exextra {
    public static void main(String[] args) {
        double tempo = 3;
        double velocidade = 80; 
        
        double vmedio = velocidade/tempo;
        double kms = tempo * velocidade;
        double litros_usados = kms/12;
        
        System.out.println("Voçe usou " + litros_usados + " litros, \nandou " + kms + " kilometros \nem " + tempo + " horas e \nsua Velocidade média foi de " + vmedio);
    }
}