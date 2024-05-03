package com.example.demo;
import jakarta.persistence.*;

@Entity
public class ProgrammingLanguage {

    @Id
    @GeneratedValue (strategy =  GenerationType.IDENTITY)

    private Long id;

    @Column ( nullable = false)
    private String name;

    @Column (nullable = true)
    private Integer firstAppearance;


    @Column(nullable = false)
    private String inventor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(Integer firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}


