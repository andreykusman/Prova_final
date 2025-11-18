package Questao2;

public class ModerateRisk implements RiskStrategy {
    @Override
    public String calculateRisk(Client c) {
        return "Risco calculado (moderado): " + (c.getScore() * 1.2);
    }
}
