package componentes;

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
public class FormattedTextDataOpcional extends JFormattedTextField {

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
}
