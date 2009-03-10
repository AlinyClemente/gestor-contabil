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
 * Componente que consiste em um JFormattedTextField formatado para receber um cep válido.
 * @author Táizel Girão
 */
public class FormattedTextCEP extends JFormattedTextField{
    /**Construtor que inicializa o componente. */
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

    /**Captura o texto do componente através do método getText() e indica se ele é um cep válido.
     * @return True se o texto no componente for um cep válido, se não retorna falso.
     */
    public boolean validarCEP() {
        String tel = getText().replace("-", "");
        if (tel.length() == 8) {
            return true;
        } else {
            return false;
        }
    }

}
