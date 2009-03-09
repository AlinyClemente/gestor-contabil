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
public class FormattedTextCEP extends JFormattedTextField{

    public FormattedTextCEP() {
        super();
        try {
            MaskFormatter mask = new MaskFormatter("#####-###");
            setFormatterFactory(new DefaultFormatterFactory(mask));
            addFocusListener(new FocusListener() {

                public void focusGained(FocusEvent e) {
                }

                public void focusLost(FocusEvent e) {
                    if (!validarCEP()) {
                        setValue(null);
                    }
                }

            });
        } catch (ParseException ex) {
            Logger.getLogger(FormattedTextTelefone.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    //Checa a validade de um telefone.
    public boolean validarCEP() {
        String tel = getText().replace("-", "");
        if (tel.length() == 8) {
            return true;
        } else {
            return false;
        }
    }

}
