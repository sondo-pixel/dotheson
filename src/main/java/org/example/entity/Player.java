package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int player_id;

    private String name;
    private String full_name;
    private String age;

    @ManyToOne
    @JoinColumn(name = "index_id")
    private Indexer indexer;

    // Getter & Setter
    public int getPlayer_id() { return player_id; }
    public void setPlayer_id(int player_id) { this.player_id = player_id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getFull_name() { return full_name; }
    public void setFull_name(String full_name) { this.full_name = full_name; }

    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }

    public Indexer getIndexer() { return indexer; }
    public void setIndexer(Indexer indexer) { this.indexer = indexer; }
}
