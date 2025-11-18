package Questao1;

public class MainQ1 {
    public static void main(String[] args) {
        ReportFactory daily = new DailyReportFactory();
        daily.generate();

        ReportFactory emergency = new EmergencyReportFactory();
        emergency.generate();
    }
}
