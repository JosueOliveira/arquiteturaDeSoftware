package teste;

import java.util.ArrayList;
import java.util.List;

public class LivroBC {

   
    private AutorBC autorBC = new AutorBC();
    private static ArrayList<Livro> livros = new ArrayList<Livro>();

    
    public void load() {
            autorBC.load();
            Autor jv = autorBC.find("Julio Verne").get(0);	
            Autor jrrt = autorBC.find("J.R.R Tolkien").get(1);
            salvar(new Livro("Viagem ao Centro da Terra", 200, "A história de jovens que viajam ao centro da terra.", jv));
            salvar(new Livro("A Volta ao Mundo em 80 dias", 320, "Uma competição ao redor do mundo", jv));
            salvar(new Livro("O Hobbit", 295, "Pequenos seres de pés peludos ajudando anões a enfrentar um dragão.", jrrt));
            salvar(new Livro("O Senhor dos Anéis", 1200, "Uma jornada épica contra o mal.", jrrt));

        
    }

    public List<Livro> find(String filter) {
    
        return livros;
    }

   
    public Livro salvar(Livro livro) {
          
    	   livro.setAutor(autorBC.find("").get(livro.getAutor().getId()));
    	  if (livro.getId() != 0) {
    		 livros.remove(livro.getId());
    		 livros.add(livro.getId(), livro);
              
    		  
          } else {
        	  livro.setId(livros.size());	
        	  livros.add(livro);
              	
                  
              }
    	  return livros.get(livro.getId());
    	
    }
}
