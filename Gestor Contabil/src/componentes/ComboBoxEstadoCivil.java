package componentes;

import enums.EstadoCivil;
import javax.swing.JComboBox;

/**
 *
 * @author Táizel Girão
 */
public class ComboBoxEstadoCivil extends JComboBox{

    public ComboBoxEstadoCivil() {
        super();
        addItem(EstadoCivil.SOLTEIRO);
        addItem(EstadoCivil.CASADO);
        addItem(EstadoCivil.DIVORCIADO);
        addItem(EstadoCivil.VIUVO);
    }

}
