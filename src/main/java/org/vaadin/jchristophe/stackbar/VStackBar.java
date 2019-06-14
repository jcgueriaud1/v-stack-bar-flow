package org.vaadin.jchristophe.stackbar;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasTheme;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.internal.JsonSerializer;

/**
 * Stack bar for Vaadin
 */
@Tag("v-stack-bar")
@NpmPackage(value="@jcgueriaud/v-stack-bar",version = "1.2.5")
@JsModule("@jcgueriaud/v-stack-bar/src/v-stack-bar.js")
public class VStackBar extends Component implements HasTheme {

    /**
     * Creates a new StackBar.
     */
    public VStackBar() {
        setColors("var(--stack-color-1)","var(--stack-color-2)","var(--stack-color-3)","var(--stack-color-4)");
        setBackgroundColors("var(--stack-background-color-1)","var(--stack-background-color-2)","var(--stack-background-color-3)","var(--stack-background-color-4)");
    }

    public void setThemeVariant(VStackBarVariant theme) {
        setThemeName(theme.getVariantName());
    }

    public void setBars(int... bars){
        getElement().setPropertyJson("bars",JsonSerializer.toJson(bars));
    }

    public void setColors(String... colors)
    {
        getElement().setPropertyJson("colors",JsonSerializer.toJson(colors));
    }

    /**
     *
     * @param backgroundColors
     */
    public void setBackgroundColors(String... backgroundColors){
        getElement().setPropertyJson("backgroundColors",JsonSerializer.toJson(backgroundColors));
    }

    /**
     *
     * @param descriptions
     */
    public void setDescriptions(String... descriptions) {
        getElement().setPropertyJson("descriptions",JsonSerializer.toJson(descriptions));
    }
}
