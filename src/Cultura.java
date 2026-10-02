/**
 * Classe base que representa uma Cultura em um Talhão.
 * Contém Encapsulamento e a regra base de verificação de umidade.
 */
public abstract class Cultura {
    private String nomeTalhao;
    private double areaHectares;
    private double umidadeSolo; // Percentual de 0 a 100%

    public Cultura(String nomeTalhao, double areaHectares, double umidadeSolo) {
        this.nomeTalhao = nomeTalhao;
        setAreaHectares(areaHectares);
        setUmidadeSolo(umidadeSolo);
    }

    // Encapsulamento com validação dos dados de entrada
    public void setUmidadeSolo(double umidadeSolo) {
        if (umidadeSolo < 0.0) {
            this.umidadeSolo = 0.0;
        } else if (umidadeSolo > 100.0) {
            this.umidadeSolo = 100.0;
        } else {
            this.umidadeSolo = umidadeSolo;
        }
    }

    public void setAreaHectares(double areaHectares) {
        if (areaHectares <= 0) {
            this.areaHectares = 1.0; // Valor padrão mínimo
        } else {
            this.areaHectares = areaHectares;
        }
    }

    public String getNomeTalhao() { return nomeTalhao; }
    public double getAreaHectares() { return areaHectares; }
    public double getUmidadeSolo() { return umidadeSolo; }

    // Lógica de verificação da necessidade de irrigação (umidade abaixo de 40%)
    public boolean precisaIrrigar() {
        return this.umidadeSolo < 40.0;
    }

    // Metodo abstrato para o cálculo específico de consumo de água (Polimorfismo)
    public abstract double calcularConsumoAguaLitros();
}