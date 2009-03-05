package janelas;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Táizel Girão
 */
public class ftxtCPF extends JFormattedTextField {

    public ftxtCPF() {
        super();
        try {
            MaskFormatter mask = new MaskFormatter("###.###.###-##");
            setFormatterFactory(new DefaultFormatterFactory(mask));
        } catch (ParseException p) {
        }
    }
}
