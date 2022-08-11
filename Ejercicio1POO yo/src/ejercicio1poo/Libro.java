
package ejercicio1poo;


public class Libro {
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int NumeroDePaginas;

    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autor, int NumeroDePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDePaginas = NumeroDePaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumeroDePaginas() {
        return NumeroDePaginas;
    }

    public void setNumeroDePaginas(int NumeroDePaginas) {
        this.NumeroDePaginas = NumeroDePaginas;
    }

    @Override
    public String toString() {
        return "Datos del Libro" + "\n"
                + "ISBN= " + ISBN + "\n"
                + ", Titulo= " + Titulo + "\n"
                + ", Autor= " + Autor + "\n"
                + ", NumeroDePaginas= " + NumeroDePaginas + "\n";
    }

    
}
