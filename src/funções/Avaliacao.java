package funções;
import java.util.ArrayList;
import java.util.List;

public class Avaliacao {

       

    private final List<Double> notas = new ArrayList<>();

    public void adicionarNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Erro, a nota deve estar entre 0 e 10");
        }
        notas.add(nota);

    }

    public double media() {
        if (notas.isEmpty()) {
            return 0.0;

            
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

   

    @Override
    public String toString() {
        return "media das avaliações:" + media();
    }
}


