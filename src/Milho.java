/**
 * Subclasse que representa a cultura do Milho no Talhão.
 * Aplicando Herança e Polimorfismo.
 */
public class Milho extends Cultura {

    public Milho(String nomeTalhao, double areaHectares, double umidadeSolo) {
        super(nomeTalhao, areaHectares, umidadeSolo);
    }

    // Cálculo polimórfico específico para o consumo do Milho (5.000L por hectare)
    @Override
    public double calcularConsumoAguaLitros() {
        if (precisaIrrigar()) {
            return getAreaHectares() * 5000.0;
        }
        return 0.0;
    }
}