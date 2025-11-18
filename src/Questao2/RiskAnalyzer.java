package Questao2;

public class RiskAnalyzer {
    private RiskStrategy strategy;

    public void setStrategy(RiskStrategy strategy) {
        this.strategy = strategy;
    }

    public void analyze(Client c) {
        System.out.println(strategy.calculateRisk(c));
    }
}
