package componentes;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFormattedTextField;

/**
 *
 * @author Táizel Girão
 */
public class FormattedTextEmail extends JFormattedTextField{

    public FormattedTextEmail() {
        super();
        addFocusListener(new FocusListener() {

            public void focusGained(FocusEvent e) {
                
            }

            public void focusLost(FocusEvent e) {
                if(!validarEmail()){
                    setText("");
                }
            }
        });
    }

    //Checa a validade de um e-mail.
    public boolean validarEmail() {
        String email = getText();

        if (email.equals("")) {
            return true;
        }
        //Set the email pattern string
        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");

        //Match the given string with the pattern
        Matcher m = p.matcher(email);

        //check whether match is found
        return m.matches();
    }

    

}
