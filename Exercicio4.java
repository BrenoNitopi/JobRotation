public class ex4 {
    public static void main(String[] args) {

        String[] estados = {"SP","RJ","MG","ES","Outros"};
        double[] faturamento = {67836.43,36678.66,29229.88,27165.48,19849.53};

        double soma = 0;
        for (double valor: faturamento){
            soma += valor;
        }
        
        for (int i = 0; i < faturamento.length; i++){
            double percentual = (faturamento[i] * 100)/soma;
            System.out.printf("Percentual de %s: %.2f%%\n",estados[i],percentual);
        }
    }
}
