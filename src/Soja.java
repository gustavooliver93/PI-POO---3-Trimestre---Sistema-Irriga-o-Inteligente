/**
 * Subclasse que representa a cultura da Soja no Talhão.
 * Aplicando Herança e Polimorfismo.
 */
public class Soja extends Cultura {

    public Soja(String nomeTalhao, double areaHectares, double umidadeSolo) {
        super(nomeTalhao, areaHectares, umidadeSolo);
    }

    // Cálculo polimórfico específico para o consumo da Soja (4.500L por hectare)
    @Override
    public double calcularConsumoAguaLitros() {
        if (precisaIrrigar()) {
            return getAreaHectares() * 4500.0;
        }
        return 0.0;
    }
}