package componentes;

import enums.Sexo;
import javax.swing.JComboBox;

/**
 *
 * @author Táizel Girão
 */
public class ComboBoxSexo extends JComboBox{

    public ComboBoxSexo() {
        super();
        addItem(Sexo.MASCULINO);
        addItem(Sexo.FEMININO);
    }

}
