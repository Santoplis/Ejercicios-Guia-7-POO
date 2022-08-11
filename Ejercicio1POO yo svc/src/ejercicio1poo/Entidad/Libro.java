
package ejercicio1poo.Entidad;


public class Libro {
   
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int NroDePaginas;

    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autor, int NroDePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NroDePaginas = NroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NroDePaginas=" + NroDePaginas + '}';
    }

      
    
}
