package Views;

import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Created by FiratUlgay on 19.12.2019.
 */
public class ContentView1 extends VerticalLayout {
    Panel panel ;

    public ContentView1() {
        


        Label label8 = new Label();
        label8.setValue("Normal type for plain text. Etiam at risus et justo dignissim congue. " +
                "Donec congue lacinia dui, a porttitor lectus condimentum laoreet. " +
                "Nunc eu.Normal type for plain text. Etiam at risus et justo dignissim congue. " +
                "Nunc eu.Normal type for plain text. Etiam at risus et justo dignissim congue. " +
                "Nunc eu.Normal type for plain text. Etiam at risus et justo dignissim congue. " +
                "Nunc eu.Normal type for plain text. Etiam at risus et justo dignissim congue. " +
                "Nunc eu.Normal type for plain text. Etiam at risus et justo dignissim congue. " +
                "Nunc eu.Normal type for plain text. Etiam at risus et justo dignissim congue. " +
                "Nunc eu.Normal type for plain text. Etiam at risus et justo dignissim congue. " +
                "Nunc eu.Normal type for plain text. Etiam at risus et justo dignissim congue. " +
                "Nunc eu.Normal type for plain text. Etiam at risus et justo dignissim congue. " +
                "Nunc eu.Normal type for plain text. Etiam at risus et justo dignissim congue. " +
                "Donec congue lacinia dui, a porttitor lectus condimentum laoreet. Nunc eu.");

        panel = new Panel();
        panel.getScrollLeft();
        panel.setCaption("PANEL");
        panel.getScrollTop();
        panel.addStyleName(ValoTheme.PANEL_SCROLL_INDICATOR);
        panel.setContent(label8);

        addComponent(panel);
    }

}
