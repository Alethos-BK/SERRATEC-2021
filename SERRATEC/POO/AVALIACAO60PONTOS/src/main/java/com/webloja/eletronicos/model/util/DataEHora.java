package util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DataEHora {
    

    public static String dataEHoraFormatadas(Date dataAbertura){

        var formatador = new SimpleDateFormat("dd/MM/yyy hh:mm:ss");
        
        Date data = formatador.parse(Date data1);
   
        return formatador.format(dataAbertura);
    }

    // static String dateString = LocalDate.parse(dataEHoraFormatadas(dataAbertura));

}
