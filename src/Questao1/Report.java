package Questao1;

public abstract class Report {
    public abstract void generateContent();
    public abstract void finish();

    public void generate() {
        generateContent();
        finish();
    }
}
