/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutrionto2;

import java.util.List;
import joint.codegen.nutriOnto.*;
import wwwc.nees.joint.facade.RepositoryFacade;

/**
 *
 * @author Debora
 */
public class NutriOnto2 {

    public static void main(String[] args) {
        System.out.println("NutriOnto!");

        String ontology_path = "/home/luiz/Desktop/nossaOntovinf2.owl";
        String ontology_uri = "http://www.semanticweb.org/debora/ontologies/2015/5/26/untitled-ontology-40#";
        RepositoryFacade facade = new RepositoryFacade();
        facade.addOntology(ontology_path, ontology_uri);

        nutriOntoKAO kao = new nutriOntoKAO(Alimento.class);

        System.out.println(kao.ehAlimentoNegativoDiabetes("Sal"));

//Recupera todas as instâncias do tipo "Massa"
//        System.out.println("Massas");
//        List<Massa> massa = kao.getTodasAsMassas();
//        for (int i = 0; i < massa.size(); i++) {
//            System.out.println(massa.get(i));
//        }
//Recupera todas as instâncias do tipo "AlimentosNegativosDiabetes"
//        System.out.println("Alimentos Negativos para Diabetes");
//        List<AlimentosNegativosDiabetes> alimento = kao.getTodosAlimentosNegativosDiabetes();
//        for (int i = 0; i < alimento.size(); i++) {
//            System.out.println(alimento.get(i));
//        }
//        List<AlimentosNegativosDiabetes> alimentos = kao.getTodosAlimentosNegativosDiabetes();
//        for (int i = 0; i < alimentos.size(); i++) {
//            String ingrediente = alimentos.get(i)+"";
//            System.out.println(ingrediente);
//        }
    }
}
