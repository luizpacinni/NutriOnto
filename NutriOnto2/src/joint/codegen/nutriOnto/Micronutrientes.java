package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: https://www.nobre.pt/623/nutrientes-reguladores.htm
 * As vitaminas, os sais minerais, a fibra alimentar e a agua sao os nutrientes reguladores (micronutrientes). Estes nutrientes, sao, de formas distintas, essenciais para a regulacao do bom funcionamento do organismo.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Nutriente"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Micronutrientes")
public interface Micronutrientes extends Nutriente {
}
