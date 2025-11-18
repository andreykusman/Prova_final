package Questao1;

public class DailyReport extends Report {
    @Override
    public void generateContent() {
        System.out.println("Preparando dados do relatório diário...");
    }

    @Override
    public void finish() {
        System.out.println("Relatório Diário Gerado");
    }
}
