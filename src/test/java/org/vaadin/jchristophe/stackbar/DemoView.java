package org.vaadin.jchristophe.stackbar;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends VerticalLayout {

    public DemoView() {
        VStackBar stackBar = new VStackBar();
        stackBar.setBars(1,2,3,5);
        add(stackBar);
        VStackBar stackBar2 = new VStackBar();
        stackBar2.setBars(10,2,3,5);
        stackBar2.setDescriptions("First description","Second description","Third description","Last description");
        stackBar2.setTheme("lumo-success");
        add(stackBar2);
        VStackBar stackBar3 = new VStackBar();
        stackBar3.setBars(2,0,3,5);
        stackBar3.setDescriptions("First description","Second description","Third description","Last description");
        stackBar3.setThemeVariant(VStackBarVariant.LUMO_ERROR);
        add(stackBar3);


        VStackBar stackBar4 = new VStackBar();
        stackBar4.setBars(2,0,3,5);
        stackBar4.setBackgroundColors("red","pink","var(--stack-background-color-2)");
        stackBar4.setColors("red","var(--stack-color-2)");
        add(stackBar4);
    }
}
