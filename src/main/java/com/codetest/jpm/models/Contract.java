package com.codetest.jpm.models;

/**
 *
 * @author Uche Powers
 */
public class Contract {

    private int id;
    private String description;

    public Contract() {
    }

    public Contract(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Contract{" + "id=" + id + ", description=" + description + '}';
    }

}
