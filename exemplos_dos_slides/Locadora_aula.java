interface LocadoraCarros {
    // Método para alugar um carro
    void alugarCarro(String modelo, int dias);

    // Método para devolver um carro
    void devolverCarro(String modelo);

    // Método para calcular o custo do aluguel
    double calcularCusto(String modelo, int dias);
}

class LocadoraCarrosImp implements LocadoraCarros {
    @Override
    public void alugarCarro(String modelo, int dias) {
        System.out.println("Aluguel do carro " + modelo + " por " + dias + " dias realizado com sucesso.");
    }

    @Override
    public void devolverCarro(String modelo) {
        System.out.println("Carro " + modelo + " devolvido com sucesso.");
    }

    @Override
    public double calcularCusto(String modelo, int dias) {
        double precoPorDia = 0;
        
        switch (modelo.toLowerCase()) {
            case "hatchback":
                precoPorDia = 50.0;
                break;
            case "sedan":
                precoPorDia = 75.0;
                break;
            case "suv":
                precoPorDia = 100.0;
                break;
            default:
                System.out.println("Modelo de carro inválido.");
                return 0;
        }
        
        double custoTotal = precoPorDia * dias;
        System.out.println("Custo do aluguel do carro " + modelo + ": R$ " + custoTotal);
        return custoTotal;
    }
}

public class Locadora_aula {
    public static void main(String[] args) {
        LocadoraCarros locadora = new LocadoraCarrosImp();

        locadora.alugarCarro("SUV", 5);
        locadora.calcularCusto("SUV", 5);
        locadora.devolverCarro("SUV");
    }
}