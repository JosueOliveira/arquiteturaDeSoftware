package teste;


public class Livro{



    private int id;


    private String titulo;

    private Integer paginas;

    private String resumo;


    private Autor autor;

    public Livro() {
    }

    public Livro(String titulo, Integer paginas, String resumo, Autor autor) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.resumo = resumo;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

  
  

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}