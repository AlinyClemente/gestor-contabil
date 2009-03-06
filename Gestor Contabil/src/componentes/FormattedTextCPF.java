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
public class FormattedTextCPF extends JFormattedTextField {

    public FormattedTextCPF() {
        super();
        try {
            MaskFormatter mask = new MaskFormatter("###.###.###-##");
            setFormatterFactory(new DefaultFormatterFactory(mask));
            addFocusListener(new FocusListener() {

                public void focusGained(FocusEvent e) {
                }

                public void focusLost(FocusEvent e) {
                    if (!validarCPF()) {
                        setValue(null);
                    }
                }
            });
        } catch (ParseException ex) {
            Logger.getLogger(FormattedTextCPF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Checa a validade de um CPF.
    public boolean validarCPF() {
//------- Rotina para CPF
        String cpf = getText().replaceAll("[.-]", "").replace(" ", "");
        if (cpf.length() == 11) {
            int d1, d2;
            int digito1, digito2, resto;
            int digitoCPF;
            String nDigResult;
            d1 = d2 = 0;
            digito1 = digito2 = resto = 0;
            for (int i = 1; i < cpf.length() - 1; i++) {
                digitoCPF = Integer.valueOf(cpf.substring(i - 1, i)).intValue();
//--------- Multiplique a ultima casa por 2 a seguinte por 3 a seguinte por 4 e assim por diante.
                d1 = d1 + (11 - i) * digitoCPF;
//--------- Para o segundo digito repita o procedimento incluindo o primeiro digito calculado no passo anterior.
                d2 = d2 + (12 - i) * digitoCPF;
            }
//--------- Primeiro resto da divisão por 11.
            resto = (d1 % 11);
//--------- Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.
            if (resto < 2) {
                digito1 = 0;
            } else {
                digito1 = 11 - resto;
            }
            d2 += 2 * digito1;
//--------- Segundo resto da divisão por 11.
            resto = (d2 % 11);
//--------- Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.
            if (resto < 2) {
                digito2 = 0;
            } else {
                digito2 = 11 - resto;
//--------- Digito verificador do CPF que está sendo validado.
            }
            String nDigVerific = cpf.substring(cpf.length() - 2, cpf.length());
//--------- Concatenando o primeiro resto com o segundo.
            nDigResult = String.valueOf(digito1) + String.valueOf(digito2);
//--------- Comparar o digito verificador do cpf com o primeiro resto + o segundo resto.
            return nDigVerific.equals(nDigResult);
        } //-------- Rotina para CNPJ
        else {
            return false;
        }
    }
}
