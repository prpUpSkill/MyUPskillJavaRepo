g/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upskill.upskilljava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prp
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String Grupos[][] = {
            {  
                "André Filipe Oliveira Aguiar",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome", 
            }, 
            {  
                "José Fonseca",
<<<<<<< HEAD
                "Paulo Lima",
=======
<<<<<<< HEAD
                "Vânia Figueira",
=======
                "Daniel Junior",
>>>>>>> 698df9a7748b9aff6ec6c57d6b37a34db9df7eb5
>>>>>>> 002b1cd60094e440b83d625ac2de4814f35ca866
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome", 
            },
            {  
                "Diana Ferreira Matos",
                "Marco Pereira",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome", 
            },            
            {  
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome", 
            },            
            {  
                "Coloque aqui o seu nome",
                "Bruno Filipe Feição Cardoso Barbosa",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome", 
            },            
            {  
                "Bárbara Leston Bandeira",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome", 
            },            
            {  
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome", 
            },            
            {  
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome", 
            },            
            {  
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Fernando Crista", 
            }
        };
        
        for (int x = 0; x < Grupos.length; x ++) {
            String Grupo[] = Grupos[x]; 
            System.out.println( "Grupo " + (x+1));
            for (int y = 0; y < Grupo.length; y ++) {
                String formando = Grupo[y];
                System.out.println( "\t" + formando );
            }
            System.out.println("-------");
        }    
    }
}
