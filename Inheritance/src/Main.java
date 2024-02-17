import javax.xml.stream.events.Comment;
import java.util.concurrent.CompletionService;

public class Main {
    public static void main(String[] args){
        SalariedEmployee joeJones = new SalariedEmployee(2500, "Joe", "Jones", "111-11-1111");
        HourlyEmployee stephanieSmith = new HourlyEmployee(25, 32, "Stephanie", "Smith", "222-22-2222");
        HourlyEmployee maryQuinn = new HourlyEmployee(19, 47, "Mary", "Quinn", "333-33-3333");
        ComissionEmployee nicoleDior = new ComissionEmployee(.15, 50000, "Nicole", "Dior", "444-44-4444");
        SalariedEmployee renwaChanel = new SalariedEmployee(1700, "Renwa", "Chanel", "555-55-5555");
        BaseEmployee mikeDavenport = new BaseEmployee(95000, "Mike", "Davenport", "666-66-6666");
        ComissionEmployee mahnazVaziri = new ComissionEmployee(.22, 40000, "Mahnaz", "Vaziri", "777-77-7777");
    }
}
