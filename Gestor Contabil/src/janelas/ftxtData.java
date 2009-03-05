/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Andre Luis
 */
public class ftxtData extends JFormattedTextField {

    public ftxtData() {
        super();
        try {
            MaskFormatter mask = new MaskFormatter("**/**/****");
            mask.setValidCharacters(" 0123456789");
            setFormatterFactory(new DefaultFormatterFactory(mask));
        } catch (ParseException p) {
        }
    }
}
