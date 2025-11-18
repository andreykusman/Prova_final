package Questao2;

public class MainQ2 {
    public static void main(String[] args) {
        Client c = new Client("João", 80);
        RiskAnalyzer analyzer = new RiskAnalyzer();

        analyzer.setStrategy(new AggressiveRisk());
        analyzer.analyze(c);

        analyzer.setStrategy(new ModerateRisk());
        analyzer.analyze(c);

        analyzer.setStrategy(new ConservativeRisk());
        analyzer.analyze(c);
    }
}
