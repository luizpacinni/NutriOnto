package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: https://www.nobre.pt/626/fibra-alimentar.htm
 * As fibras insoluveis, como a celulose ou a lenhina, encontram-se presentes nas cascas dos frutos e leguminosas, cereais completos e partes fibrosas dos legumes.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Fibra"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Fibra_Insoluvel")
public interface Fibra_Insoluvel extends Fibra {
}
