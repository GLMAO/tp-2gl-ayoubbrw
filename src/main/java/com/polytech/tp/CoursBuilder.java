package com.polytech.tp;

public class CoursBuilder {
    // TODO: Implémenter le pattern Builder
    private String matiere;
    private String enseignant;
    private String salle;
    private String date;
    private String heureDebut;
    private boolean estOptionnel;
    private String niveau;
    private boolean necessiteProjecteur;
    
    
    public CoursBuilder setMatiere(String matiere) { this.matiere = matiere;
        return this; }
    public CoursBuilder setEnseignant(String enseignant) { this.enseignant = enseignant;
        return this; }
    
    
    public Cours build() {
        return new Cours(matiere, enseignant, salle, date, heureDebut,
                estOptionnel, niveau, necessiteProjecteur);
    }
}