package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: https://www.nobre.pt/626/fibra-alimentar.htm
 * Fibras soluveis, sao aquelas que se diluem em agua, e o caso das pectinas, gomas e mucilagens presentes em maiores quantidades nas polpas dos frutos, legumes e das leguminosas.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Fibra"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Fibra_Soluvel")
public interface Fibra_Soluvel extends Fibra {
}
