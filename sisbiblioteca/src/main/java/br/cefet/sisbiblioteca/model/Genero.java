package br.cefet.sisbiblioteca.model;

public enum Genero {
    FICCAO_CIENTIFICA("Ficção Científica"),
    FANTASIA("Fantasia"),
    ROMANCE("Romance"),
    TERROR("Terror"),
    MISTERIO("Mistério"),
    THRILLER("Thriller"),
    AUTOAJUDA("Autoajuda"),
    BIOGRAFIA("Biografia"),
    MEMOIR("Memórias"),
    HISTORIA("História"),
    CLASSICO("Clássico"),
    GRAFIC_NOVEL("Novela Gráfica"),
    REALISMO_MAGICO("Realismo Mágico"),
    DISTOPIA("Distopia"),
    HISTORIA_EM_QUADRINHOS("História em Quadrinhos"),
    CRIME("Crime"),
    AVENTURA("Aventura"),
    POESIA("Poesia"),
    DRAMA("Drama"),
    HUMOR("Humor");

    private final String displayName;

    Genero(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
