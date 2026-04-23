package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "indexer")
public class Indexer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index_id;

    private String name;
    private float valueMin;
    private float valueMax;

    // Getter & Setter
    public int getIndex_id() { return index_id; }
    public void setIndex_id(int index_id) { this.index_id = index_id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public float getValueMin() { return valueMin; }
    public void setValueMin(float valueMin) { this.valueMin = valueMin; }

    public float getValueMax() { return valueMax; }
    public void setValueMax(float valueMax) { this.valueMax = valueMax; }
}
