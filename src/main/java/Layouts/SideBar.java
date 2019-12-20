package Layouts;

import Buttons.SideBarButton;
import Views.ContentView1;
import Views.ContentView2;
import Views.ContentView3;
import Views.ContentView4;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

import javax.swing.text.LabelView;

/**
 * Created by FiratUlgay on 19.12.2019.
 */
public class SideBar extends VerticalLayout {


    private Header header;
    private Content content;

    private SideBarButton sideBarButton1;
    private SideBarButton sideBarButton2;
    private SideBarButton sideBarButton3;
    private SideBarButton sideBarButton4;


    public SideBar(Header header, Content content) {

        this.header = header;
        this.content = content;

        setSpacing(true);
        setMargin(true);

        sideBarButton1 = new SideBarButton("MENU1");
        sideBarButton1.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {

                Label label1 = new Label("MENU1");
                header.setHeaderOzellik(label1);

                ContentView1 contentView1 = new ContentView1();
                content.setContent(contentView1);
                header.setHeader(label1);

                header.addMenuBar();
                header.getItem1().setEnabled(true);
                header.getItem2().setEnabled(false);
                header.getItem3().setEnabled(false);
                header.getItem4().setEnabled(false);

            }
        });
        addComponent(sideBarButton1);

        sideBarButton2 = new SideBarButton("MENU2");
        sideBarButton2.setIcon(FontAwesome.LIST);
        sideBarButton2.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {

                Label label1 = new Label("MENU2");
                header.setHeaderOzellik(label1);

                ContentView2 contentView2 = new ContentView2();
                content.setContent(contentView2);
                header.setHeader(label1);

                header.addMenuBar();
                header.getItem1().setEnabled(false);
                header.getItem2().setEnabled(true);
                header.getItem3().setEnabled(false);
                header.getItem4().setEnabled(false);


            }
        });
        addComponent(sideBarButton2);

        sideBarButton3 = new SideBarButton("MENU3");
        sideBarButton3.setIcon(FontAwesome.LIST);
        sideBarButton3.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                Label label1 = new Label("MENU3");
                header.setHeaderOzellik(label1);

                ContentView3 contentView3 = new ContentView3();
                content.setContent(contentView3);
                header.setHeader(label1);

                header.addMenuBar();
                header.getItem1().setEnabled(false);
                header.getItem2().setEnabled(false);
                header.getItem3().setEnabled(true);
                header.getItem4().setEnabled(false);



            }
        });
        addComponent(sideBarButton3);

        sideBarButton4 = new SideBarButton("MENU4");
        sideBarButton4.setIcon(FontAwesome.LIST);
        sideBarButton4.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {

                Label label1 = new Label("MENU4");
                header.setHeaderOzellik(label1);

                ContentView4 contentView4 = new ContentView4();
                content.setContent(contentView4);
                header.setHeader(label1);

                header.addMenuBar();
                header.getItem1().setEnabled(false);
                header.getItem2().setEnabled(false);
                header.getItem3().setEnabled(false);
                header.getItem4().setEnabled(true);
            }
        });
        addComponent(sideBarButton4);

    }
}