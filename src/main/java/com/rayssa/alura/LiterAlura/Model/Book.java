package com.rayssa.alura.LiterAlura.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "livros")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String name;
    private int downloads;
    private String languages;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Authors authors;

    public Book() {}

    public Book(String titulo, List<String> languages, int downloads, Authors authors) {
        this.titulo = titulo;
        this.authors = authors;
        this.name = authors.getNome();
        this.languages =  languages.get(0);
        this.downloads = downloads;
    }

    public Book(Book bookEncontrado) {
        this.titulo = bookEncontrado.titulo;
        this.name = bookEncontrado.getAuthors().getNome();
        this.languages = bookEncontrado.languages;
        this.downloads = bookEncontrado.downloads;
    }

    public Authors getAuthors() {
        return authors;
    }

    public void setAuthors(Authors authors) {
        this.authors = authors;
    }

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

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return """ 
                -------- LIVRO --------
                Título: %s
                Autor: %s
                Idioma: %s
                Número de Downloads: %d
                
                """.formatted(titulo, name, languages, downloads);
    }
}