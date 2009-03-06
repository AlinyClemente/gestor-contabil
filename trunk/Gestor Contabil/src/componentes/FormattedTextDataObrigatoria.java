package componentes;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Táizel Girão
 */
public class FormattedTextDataObrigatoria extends JFormattedTextField{

    public FormattedTextDataObrigatoria() {
        super();
        try {
            MaskFormatter mask = new MaskFormatter("**/**/****");
            mask.setValidCharacters(" 0123456789");
            setFormatterFactory(new DefaultFormatterFactory(mask));
            addFocusListener(new FocusListener() {

                public void focusGained(FocusEvent e) {
                    
                }

                public void focusLost(FocusEvent e) {
                    if(!validarData()){
                        setValue(null);
                    }
                }
            });
        } catch (ParseException ex) {
            Logger.getLogger(FormattedTextDataObrigatoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Checa a validade de uma data.
    public boolean validarData() {
        String dt = getText().replace("/", "").replace(" ", "");

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
