package componentes;

import java.text.Format;
import java.text.ParseException;
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
        } catch (ParseException p) {
        }
    }

    public FormattedTextDataObrigatoria(AbstractFormatterFactory factory, Object currentValue) {
        super(factory, currentValue);
    }

    public FormattedTextDataObrigatoria(AbstractFormatterFactory factory) {
        super(factory);
    }

    public FormattedTextDataObrigatoria(AbstractFormatter formatter) {
        super(formatter);
    }

    public FormattedTextDataObrigatoria(Format format) {
        super(format);
    }

    public FormattedTextDataObrigatoria(Object value) {
        super(value);
    }

}
