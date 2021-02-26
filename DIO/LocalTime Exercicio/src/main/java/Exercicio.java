import java.time.LocalDateTime;


//adicione 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00.
public class Exercicio {
    public static void main(String[] args){

        LocalDateTime agora = LocalDateTime.of(2010,05,15,10,00,00);
        System.out.println(agora);

        LocalDateTime futuro = agora.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(futuro);


    }
}
