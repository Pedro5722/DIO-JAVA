import java.text.SimpleDateFormat;
import java.util.Date;


// Formatar a data em DD/MM/AAAA HH:MM:SS:MSS
public class Exemplo1 {

    public static void main(String[] Args ){
        Date agora = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss:SSS z");
        String DataFormatada = formatter.format(agora);
        System.out.println(DataFormatada);
    }
}
