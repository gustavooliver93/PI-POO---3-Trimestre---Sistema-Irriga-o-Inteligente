import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista de Talhões Fazenda
        List<Cultura> talhoes = new ArrayList<>();

        // Instanciando talhões com Soja e Milho
        talhoes.add(new Soja("Talhão 01 - Soja Norte", 10.0, 25.0));
        talhoes.add(new Soja("Talhão 02 - Soja Sul", 15.0, 45.0));
        talhoes.add(new Milho("Talhão 03 - Milho Central", 8.0, 30.0));
        talhoes.add(new Milho("Talhão 04 - Milho Leste", 12.0, 55.0));

        // Variáveis para consolidação de dados
        double consumoTotalAgua = 0.0;
        int talhoesIrrigados = 0;

        System.out.println("=== RELATÓRIO DE IRRIGACÃO DOS TALHÕES SITIO CAPITUBA ===\n");

        // Laço de repetição para processar cada talhão
        for (int i = 0; i < talhoes.size(); i++) {
            Cultura talhao = talhoes.get(i);

            System.out.printf("Talhão: %s | Área: %.1f ha | Umidade: %.1f%%\n",
                    talhao.getNomeTalhao(), talhao.getAreaHectares(), talhao.getUmidadeSolo());

            // Estrutura condicional
            if (talhao.precisaIrrigar()) {
                double aguaNecessaria = talhao.calcularConsumoAguaLitros();
                consumoTotalAgua += aguaNecessaria;
                talhoesIrrigados++;

                System.out.printf(" -> Status: NECESSITA IRRIGACÃO | Consumo: %.2f Litros\n\n", aguaNecessaria);
            } else {
                System.out.println(" -> Status: OK (Umidade Adequada - Sem Irrigação)\n");
            }
        }

        // Resumo geral das operações
        System.out.println("==============================================");
        System.out.println("RESUMO DE CONSUMO HÍDRICO DA FAZENDA");
        System.out.println("==============================================");
        System.out.println("Total de Talhões Monitorados: " + talhoes.size());
        System.out.println("Talhões que Exigem Irrigação: " + talhoesIrrigados);
        System.out.printf("Consumo Total de Água       : %.2f Litros\n", consumoTotalAgua);
        System.out.println("==============================================");
    }
}