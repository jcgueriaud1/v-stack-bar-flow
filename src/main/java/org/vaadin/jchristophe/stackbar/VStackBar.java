package org.vaadin.jchristophe.stackbar;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stack bar for Vaadin
 */
@Tag("v-stack-bar")
@NpmPackage(value="@jcgueriaud/v-stack-bar",version = "1.2.3")
@JsModule("@jcgueriaud/v-stack-bar/src/v-stack-bar.js")
public class VStackBar extends PolymerTemplate<VStackBar.StackBarModel> {

    /**
     * Creates a new StackBar.
     */
    public VStackBar() {
        setColors("var(--stack-color-1)","var(--stack-color-2)","var(--stack-color-3)","var(--stack-color-4)");
        setBackgroundColors("var(--stack-background-color-1)","var(--stack-background-color-2)","var(--stack-background-color-3)","var(--stack-background-color-4)");
    }

    public void setThemeVariant(VStackBarVariant theme) {
        getElement().setAttribute("theme", theme.getVariantName());
    }
    public void setTheme(String theme) {
        getElement().setAttribute("theme", theme);
    }

    public void setBars(int... bars){
        getModel().setBars(Arrays.stream(bars).boxed().collect(Collectors.toList()));
    }

    public void setColors(String... colors)
    {
        getModel().setColors(Arrays.asList(colors));

    }
    public void setBackgroundColors(String... backgroundColors){
        getModel().setBackgroundColors(Arrays.asList(backgroundColors));
    }

    public void setDescriptions(String... descriptions) {
        getModel().setDescriptions(Arrays.asList(descriptions));
    }

    /**
     * This model binds properties between StackBar and stack-bar
     */
    public interface StackBarModel extends TemplateModel {
        // Add setters and getters for template properties here.

        void setBars(List<Integer> bars);
        void setBackgroundColors(List<String> backgroundColors);
        void setColors(List<String> colors);
        void setDescriptions(List<String> descriptions);
    }
}
