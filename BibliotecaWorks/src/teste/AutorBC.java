package teste;

import java.util.ArrayList;
import java.util.List;

public class AutorBC{
     private static ArrayList<Autor> autores =new ArrayList<Autor>();
	
    public void load() {
       if(autores.size()==0) {    
       salvar(new Autor("Julio Verne", "França"));
  	   salvar(new Autor("J.R.R Tolkien", "África do Sul"));
       }
     
    }

    public List<Autor> find(String filter) {
    	   
    	  return autores;
    }

   
    public Autor salvar(Autor autor) {
    	 if (autor.getId() != 0) {
   
             autores.remove(autor.getId());
             autores.add(autor.getId(), autor);
   		  
         } else {
        	 autor.setId(autores.size());	
        	 autores.add(autor);
             	
                 
             }
   	  return autores.get(autor.getId());   
    }

    
}