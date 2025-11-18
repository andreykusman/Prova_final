package Questao2;

public class ConservativeRisk implements RiskStrategy {
    @Override
    public String calculateRisk(Client c) {
        return "Risco calculado (conservador): " + (c.getScore() * 0.8);
    }
}
