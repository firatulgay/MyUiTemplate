package Views;

import Buttons.MyTextField;
import Buttons.SaveButton;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.VerticalLayout;


/**
 * Created by FiratUlgay on 19.12.2019.
 */
public class ContentView2 extends VerticalLayout {

    private MyTextField idField;
    private MyTextField nameField;
    private FormLayout mainLayout;

    public ContentView2() {

        buildMainLayout();
    }

    private void buildMainLayout() {
        mainLayout = new FormLayout();
        addComponent(mainLayout);

        idField = new MyTextField("Id");
        idField.setEnabled(false);
        mainLayout.addComponent(idField);

        nameField = new MyTextField("Name");
        mainLayout.addComponent(nameField);

        SaveButton saveButton = new SaveButton();
        saveButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {

                Long idFieldValue = null;
                if (idField.getValue() != "") {
                    idFieldValue = Long.parseLong(idField.getValue());
                }
                String nameFieldValue = nameField.getValue();


            }
        });
        mainLayout.addComponent(saveButton);





    }
}
