package FilmDemo.LyssnareAdapterklasser;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseAdapterDemo extends MouseAdapter {


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouse clicket");
    }
}
