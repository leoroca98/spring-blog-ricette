package spring.blog.ricette.controller.main;

import jakarta.persistence.*;

public class Ricette {
    @Entity
    @Table(name = "db_ricette")
    public class Ricetta {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String titolo;
        private String ingredienti;
        private String foto;
        private int tempoDiPreparazione;
        private int porzioni;
        private String testoRicetta;

        // getter e setter



        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getIngredienti() {
            return ingredienti;
        }

        public void setIngredienti(String ingredienti) {
            this.ingredienti = ingredienti;
        }

        public int getTempoDiPreparazione() {
            return tempoDiPreparazione;
        }

        public void setTempoDiPreparazione(int tempoDiPreparazione) {
            this.tempoDiPreparazione = tempoDiPreparazione;
        }

        public String getTitolo() {
            return titolo;
        }

        public void setTitolo(String titolo) {
            this.titolo = titolo;
        }

        public String getFoto() {
            return foto;
        }

        public void setFoto(String foto) {
            this.foto = foto;
        }

        public int getPorzioni() {
            return porzioni;
        }

        public void setPorzioni(int porzioni) {
            this.porzioni = porzioni;
        }

        public String getTestoRicetta() {
            return testoRicetta;
        }

        public void setTestoRicetta(String testoRicetta) {
            this.testoRicetta = testoRicetta;
        }
    }
    {

    }

}


