package componentes;

import enums.Sexo;
import javax.swing.JComboBox;

/**
 * Componente que consiste em um JComboBox com os enumerados para sexo inseridos.
 * @author Táizel Girão
 * 
 */
public class ComboBoxSexo extends JComboBox{
    /**Construtor que inicializa o componente. */
    public ComboBoxSexo() {
        super();
        addItem(Sexo.MASCULINO);
        addItem(Sexo.FEMININO);
    }

}
