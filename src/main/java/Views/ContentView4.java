package Views;

import com.vaadin.data.util.IndexedContainer;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.shared.ui.MultiSelectMode;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by FiratUlgay on 19.12.2019.
 */
public class ContentView4 extends VerticalLayout {

    private Table table;
    private IndexedContainer indexedContainer;

    public ContentView4() {

        buildTableContainer();
        buildTable();
    }

    private void buildTableContainer() {

        indexedContainer = new IndexedContainer();
        indexedContainer.addContainerProperty("id", Long.class, null);
        indexedContainer.addContainerProperty("isim", String.class, null);
        indexedContainer.addContainerProperty("adres", String.class, null);
        indexedContainer.addContainerProperty("meslek", String.class, null);
    }


    private void buildTable() {
        table = new Table();
        table.setContainerDataSource(indexedContainer);
        table.setColumnHeaders("NO", "İSİM","ADRES","MESLEK");
        table.setSelectable(true);
        table.setMultiSelectMode(MultiSelectMode.SIMPLE);
        table.setMultiSelect(false);
        table.addItemClickListener(new ItemClickEvent.ItemClickListener() {
            @Override
            public void itemClick(ItemClickEvent itemClickEvent) {


            }
            });addComponent(table);
        }
}
