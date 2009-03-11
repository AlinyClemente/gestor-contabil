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
 * Componente que consiste em um JFormattedTextField formatado para receber apenas números de até 16 dígitos.
 * @author Táizel Girão
 */
public class FormattedTextNumero extends JFormattedTextField{

    /**Construtor que inicializa o componente. */
    public FormattedTextNumero() {
        super();
        try {
            MaskFormatter mask = new MaskFormatter("****************");
            mask.setValidCharacters(" 0123456789");
            setFormatterFactory(new DefaultFormatterFactory(mask));
            addFocusListener(new FocusListener() {

                public void focusGained(FocusEvent e) {
                }

                public void focusLost(FocusEvent e) {
                    setText(getText().replace(" ", ""));
                }
            });
        } catch (ParseException ex) {
            Logger.getLogger(FormattedTextCPF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
