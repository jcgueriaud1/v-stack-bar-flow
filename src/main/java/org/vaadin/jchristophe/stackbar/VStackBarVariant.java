package org.vaadin.jchristophe.stackbar;

public enum VStackBarVariant {
    LUMO_PRIMARY("lumo-primary"),
    LUMO_ERROR("lumo-error"),
    LUMO_SUCCESS("lumo-success"),
    LUMO_SHADE("lumo-shade"), ;

    private final String variant;

    VStackBarVariant(String variant) {
        this.variant = variant;
    }

    /**
     * Gets the variant name.
     *
     * @return variant name
     */
    public String getVariantName() {
        return variant;
    }
}