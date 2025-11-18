package Questao2;

public class AggressiveRisk implements RiskStrategy {
    @Override
    public String calculateRisk(Client c) {
        return "Risco calculado (agressivo): " + (c.getScore() * 2);
    }
}
