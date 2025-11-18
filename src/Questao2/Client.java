package Questao2;

public class Client {
    private String name;
    private double score;

    public Client(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
