package com.example.crud.models;

/**
 * An enumeration representing the condition of a coin.
 *
 * @Author Konstantin Kokoshnikov
 * @Date 19.11.2023
 * @Version 1.0
 */
public enum Condition {
    /**
     * Good condition.
     */
    GOOD("Good"),

    /**
     * Very Good condition.
     */
    VERY_GOOD("Very Good"),

    /**
     * Fine condition.
     */
    FINE("Fine"),

    /**
     * Very Fine condition.
     */
    VERY_FINE("Very Fine"),

    /**
     * Extremely Fine condition.
     */
    EXTREMELY_FINE("Extremely Fine"),

    /**
     * About Uncirculated condition.
     */
    ABOUT_UNCIRCULATED("About Uncirculated"),

    /**
     * Uncirculated condition.
     */
    UNCIRCULATED("Uncirculated");

    /**
     * The label associated with the condition.
     */
    private final String label;

    /**
     * Constructor for the Condition enumeration.
     *
     * @param label The label associated with the condition.
     */
    Condition(String label) {
        this.label = label;
    }

    /**
     * Returns the label associated with the condition.
     *
     * @return The label of the condition.
     */
    @Override
    public String toString() {
        return label;
    }
}
