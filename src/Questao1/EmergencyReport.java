package Questao1;

public class EmergencyReport extends Report {
    @Override
    public void generateContent() {
        System.out.println("Preparando dados emergenciais...");
    }

    @Override
    public void finish() {
        System.out.println("Relatório Emergencial Gerado");
    }
}
