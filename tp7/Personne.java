import java.io.*;

public class Personne implements Serializable {
    String nom="skander";
    String prenom="menzli";
    String classe="GL2";
public String getNom() { return nom; }
public void setNom(String nom) { this.nom = nom; }
public String getclasse() { return classe; }
public void setTaille(String classe) { this.classe = classe; }
public String getPrenom() { return prenom; }
public void setPrenom(String prenom) { this.prenom =prenom; }
}
