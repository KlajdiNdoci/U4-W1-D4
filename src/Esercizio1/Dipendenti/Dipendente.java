package src.Esercizio1.Dipendenti;

import src.Esercizio1.Dipendenti.Enums.Dipartimento;
import src.Esercizio1.Dipendenti.Enums.Livello;

public class Dipendente {
    protected double stipendioBase = 1000;

    protected double stipendio;
    protected int matricola;
    protected double importoOrarioStraordinario;
    protected Livello livello;
    protected Dipartimento dipartimento;

    public Dipendente(int matricola, Dipartimento dipartimento) {
        stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
        this.matricola = matricola;
        this.dipartimento = dipartimento;

    }

    public Dipendente(double stipendioBase, double stipendio, int matricola, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.stipendioBase = stipendioBase;
        this.stipendio = stipendio;
        this.matricola = matricola;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "stipendioBase=" + stipendioBase +
                ", stipendio=" + stipendio +
                ", matricola=" + matricola +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }
}
