package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: http://www.rgnutri.com.br/sqv/saude/fofs.php
 * As frutas oleaginosas, como nozes, amendoas, castanhas, avelas, entre outras, sao bastante conhecidas pelo seu alto teor calorico, porem podem trazer tambem diversos beneficios para a saude, nao devendo ser excluidas das dietas do dia a dia, pois fornecem gorduras mono e polinsaturadas, que sao fundamentais para o bom funcionamento do organismo.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Alimento"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Oleaginosas")
public interface Oleaginosas extends Alimento {
}
