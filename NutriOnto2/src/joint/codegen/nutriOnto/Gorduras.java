package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: http://www.alimentacaosaudavel.org/Gordura-Total.html
 * As gorduras presentes nos alimentos sao formadas essencialmente (entre 96% e 98%) por trigliceridos, um tipo de lipidos simples formados por acidos gordos e glicerina. A qualidade e propriedades das gorduras dependem fortemente do tipo de acidos gordos que contem. Na sua grande generalidade, os alimentos de origem vegetal possuem poucas gorduras, com excepcao dos frutos secos oleaginosos. Este tipo de gordura de origem vegetal tem vantagens sobre as de origem animal, ja que predominam o tipo de acidos gordos insaturados (um tipo de acidos que reduz o colesterol no sangue) e contem varias substancias que sao beneficas para o organismo, como a lecitina, os fitosterois ou a vitamina E.
 * Os produtos de origem animal sao todos ricos em gordura, exceptuando o leite e produtos lacteos desnatados, o peixe branco e a carne muito magra. A gordura animal, com uma elevada proporcao e acidos gordos saturados, apresenta varios inconvenientes, como aumentar a producao de colesterol no organismo e no sangue.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Alimento"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Gorduras")
public interface Gorduras extends Alimento {
}
