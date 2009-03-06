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
public class FormattedTextTelefone extends JFormattedTextField {

    public FormattedTextTelefone() {
        super();
        try {
            MaskFormatter mask = new MaskFormatter("(**) ****-****");
            mask.setValidCharacters(" 0123456789");
            setFormatterFactory(new DefaultFormatterFactory(mask));
            addFocusListener(new FocusListener() {

                public void focusGained(FocusEvent e) {
                }

                public void focusLost(FocusEvent e) {
                    if (!validarTel()) {
                        setValue(null);
                    }
                }
            });
        } catch (ParseException ex) {
            Logger.getLogger(FormattedTextTelefone.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    //Checa a validade de um telefone.
    public boolean validarTel() {
        String tel = getText().replaceAll("[()-]", "").replace(" ", "");
        if (tel.length() == 10 || tel.length() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
