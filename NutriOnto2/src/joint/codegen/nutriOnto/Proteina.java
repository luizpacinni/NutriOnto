package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: http://www.nutricao.org/proteinas
 * As proteinas de origem vegetal ou animal e sao formadas por aminoacidos essenciais encontrados nos cereais e nas carnes.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Macronutrientes"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Proteina")
public interface Proteina extends Macronutrientes {
}
