package janelas;

import java.awt.AWTEvent;
import java.awt.ActiveEvent;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.MenuComponent;
import java.awt.event.MouseEvent;
import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;

/**Classe que extende a classe JInternalFrame, possui métodos adicionais para que possa ser colocada como modal. Essa classe é uma classe experimental sujeita a bugs de comportamento.*/
public class ModalInternalFrame extends JInternalFrame {

    //indica se a janela é modal ou não.
    boolean modal = false;

    @Override
    public void show() {
        super.show();
        if (this.modal) {
            startModal();
        }
    }

    @Override
    public void setVisible(boolean value) {
        super.setVisible(value);
        if (modal) {
            if (value) {
                startModal();
            } else {
                stopModal();
            }
        }
    }
    /**Faz o componente ter um comportamento modal. */
    private synchronized void startModal() {

        try {
            if (SwingUtilities.isEventDispatchThread()) {
                EventQueue theQueue = getToolkit().getSystemEventQueue();

                while (isVisible()) {

                    AWTEvent event = theQueue.getNextEvent();
                    Object source = event.getSource();
                    boolean dispatch = true;

                    if (event instanceof MouseEvent) {
                        MouseEvent e = (MouseEvent) event;
                        MouseEvent m = SwingUtilities.convertMouseEvent((Component) e.getSource(), e, this);
                        if (!e.getSource().getClass().getName().equals("javax.swing.Popup$HeavyWeightWindow") && !this.contains(m.getPoint()) && e.getID() != MouseEvent.MOUSE_DRAGGED && e.getID() != MouseEvent.MOUSE_RELEASED) {
                            dispatch = false;
                        }
                    }

                    if (dispatch) {
                        if (event instanceof ActiveEvent) {
                            ((ActiveEvent) event).dispatch();
                        } else if (source instanceof Component) {
                            ((Component) source).dispatchEvent(event);
                        } else if (source instanceof MenuComponent) {
                            ((MenuComponent) source).dispatchEvent(event);
                        } else {
                            System.err.println("Unable to dispatch: " + event);
                        }
                    }
                }
            } else {
                while (isVisible()) {
                    wait();
                }
            }
        } catch (InterruptedException ignored) {
            System.err.println(ignored);
        }

    }

    /**Faz o componente parar de ter um comportamento modal.*/
    private synchronized void stopModal() {
        notifyAll();
    }

    /**Seta o comportamento do componente para modal.*/
    public void setModal(boolean modal) {
        this.modal = modal;
    }
    /**Indica se o comportamento do componente é modal.
     * @return True se o componente é modal, se não retorna false.
     */
    public boolean isModal() {
        return this.modal;
    }
}

