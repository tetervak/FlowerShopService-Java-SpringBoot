package ca.tetervak.flowershopservice.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Flower {

    @Id
    private String id = "";

    private String label = "";
    private Double price = 0.0;
    private String description = "";

    private String image = null;

    public Flower() {
    }

    public Flower(
            String id,
            String label,
            Double price,
            String description,
            String image
    ) {
        this.id = id;
        this.label = label;
        this.price = price;
        this.description = description;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String text) {
        this.description = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
