package componentes;

import enums.EstadoCivil;
import javax.swing.JComboBox;

/**
 * Componente que consiste em um JComboBox com os enumerados para estado civil inseridos.
 * @author Táizel Girão
 */
public class ComboBoxEstadoCivil extends JComboBox{
    /**Construtor que inicializa o componente.*/
    public ComboBoxEstadoCivil() {
        super();
        addItem(EstadoCivil.SOLTEIRO);
        addItem(EstadoCivil.CASADO);
        addItem(EstadoCivil.DIVORCIADO);
        addItem(EstadoCivil.VIUVO);
    }

}
