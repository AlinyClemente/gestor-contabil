/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * Componente que consiste em um JFormattedTextField formatado para receber um CNPJ válido.
 * @author Táizel Girão
 */
public class FormattedTextCNPJ extends JFormattedTextField {
    /**Construtor que inicializa o componente. */
    public FormattedTextCNPJ() {
        super();
        try {
            MaskFormatter mask = new MaskFormatter("##.###.###/####-##");
            setFormatterFactory(new DefaultFormatterFactory(mask));
            addFocusListener(new FocusListener() {

                public void focusGained(FocusEvent e) {
                }

                public void focusLost(FocusEvent e) {
                    if (!validarCNPJ()) {
                        setValue(null);
                    }
                }

            });
        } catch (ParseException ex) {
            Logger.getLogger(FormattedTextCPF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**Captura o texto do componente através do método getText() e indica se ele é um CNPJ válido.
     * @return True se o texto no componente for um CNPJ válido, se não retorna falso.
     */
    public boolean validarCNPJ() {
        String s = getText().replace(".", "").replace("/", "").replace("-", "");
        if (s.length() == 14) {
            int soma = 0, dig;
            String cnpj_calc = s.substring(0, 12);
            char[] chr_cnpj = s.toCharArray();
//--------- Primeira parte
            for (int i = 0; i < 4; i++) {
                if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
                    soma += (chr_cnpj[i] - 48) * (6 - (i + 1));
                }
            }
            for (int i = 0; i < 8; i++) {
                if (chr_cnpj[i + 4] - 48 >= 0 && chr_cnpj[i + 4] - 48 <= 9) {
                    soma += (chr_cnpj[i + 4] - 48) * (10 - (i + 1));
                }
            }
            dig = 11 - (soma % 11);
            cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(dig);
//--------- Segunda parte
            soma = 0;
            for (int i = 0; i < 5; i++) {
                if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
                    soma += (chr_cnpj[i] - 48) * (7 - (i + 1));
                }
            }
            for (int i = 0; i < 8; i++) {
                if (chr_cnpj[i + 5] - 48 >= 0 && chr_cnpj[i + 5] - 48 <= 9) {
                    soma += (chr_cnpj[i + 5] - 48) * (10 - (i + 1));
                }
            }
            dig = 11 - (soma % 11);
            cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(dig);
            return s.equals(cnpj_calc);
        } else {
            return false;
        }
    }
}
