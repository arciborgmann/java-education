import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatosSelecionados = new String[5];
        candidatosSelecionados = selecaoCandidatos();
        imprimirSelecionados(candidatosSelecionados);
        for(String candidato: candidatosSelecionados) {
            if(candidato != null)
                entrandoEmContato(candidato);
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    static void imprimirSelecionados(String [] candidatos) {
        for(String candidato: candidatos) {
            if(candidato != null) {
                System.out.println("O candidato selecionado foi: " + candidato);
            } 
        }
    }
    
    static String[] selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "DANIELA", "MIRELA", "JOAO"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        String [] arrCandidatosSelecionados = new String[5];
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " tem a pretensão salario de R$" + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " se enquadra nos requisitos salariais da vaga disponível");
                arrCandidatosSelecionados[candidatosSelecionados] = candidato;
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
        
        return arrCandidatosSelecionados;

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Método auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) 
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso");
        } while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu) 
            System.out.println("Conseguimos contato com o " + candidato + " na tentativa nº " + tentativasRealizadas + ".");
        else
            System.out.println("Não conseguimos contato com o " + candidato + ". Tentativas realizadas: " + tentativasRealizadas + ".");
    }
}
