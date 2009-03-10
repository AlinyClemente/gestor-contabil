package componentes;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 * Componente que consiste em um JFormattedTextField formatado para receber uma data válida ou então não ser preenchido.
 * @author Táizel Girão
 */
public class FormattedTextDataOpcional extends JFormattedTextField {
    /**Construtor que inicializa o componente. */
    public FormattedTextDataOpcional() {
        super();
        try {
            MaskFormatter mask = new MaskFormatter("**/**/****");
            mask.setValidCharacters(" 0123456789");
            setFormatterFactory(new DefaultFormatterFactory(mask));
        } catch (ParseException ex) {
            Logger.getLogger(FormattedTextDataObrigatoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**Captura o texto do componente através do método getText() e indica se ele é uma data válida se o campo estiver vazio ele também retorna true.
     * @return True se o texto no componente for uma data válida ou estiver em branco, se não retorna falso.
     */
    public static boolean validarData(String dt) {
        dt = dt.replace("/", "").replace(" ", "");

        if(dt.length()==0){
            return true;
        }

        if (dt.length() == 8) {

            int dia = Integer.parseInt(dt.substring(0, 2));
            int mes = Integer.parseInt(dt.substring(2, 4));
            int ano = Integer.parseInt(dt.substring(4, 8));

            int diasFevereiro;

            if (ano % 4 == 0) {
                diasFevereiro = 29;
            } else {
                diasFevereiro = 28;
            }

            if (mes > 12 || mes <= 0 || ano <= 0 || dia <= 0 || dia > 31) {
                return false;
            } else {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    return dia <= 31;
                } else {
                    if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                        return dia <= 30;
                    } else {
                        return dia <= diasFevereiro;
                    }
                }
            }
        } else {
            return false;
        }
    }
}
