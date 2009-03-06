/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.text.Format;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Andre Luis
 */
public class FormattedTextDataOpcional extends JFormattedTextField {

    public FormattedTextDataOpcional() {
        super();
        try {
            MaskFormatter mask = new MaskFormatter("**/**/****");
            mask.setValidCharacters(" 0123456789");
            setFormatterFactory(new DefaultFormatterFactory(mask));
        } catch (ParseException p) {
        }
    }

    public FormattedTextDataOpcional(AbstractFormatterFactory factory, Object currentValue) {
        super(factory, currentValue);
    }

    public FormattedTextDataOpcional(AbstractFormatterFactory factory) {
        super(factory);
    }

    public FormattedTextDataOpcional(AbstractFormatter formatter) {
        super(formatter);
    }

    public FormattedTextDataOpcional(Format format) {
        super(format);
    }

    public FormattedTextDataOpcional(Object value) {
        super(value);
    }

}
