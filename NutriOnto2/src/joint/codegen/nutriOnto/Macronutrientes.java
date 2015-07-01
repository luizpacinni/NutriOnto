package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: https://www.nobre.pt/637/nutrientes-energeticos.htm
 * As Proteinas, os Carboidratos e as Gorduras (Lipideos) sao os nutrientes energeticos (macronutrientes). e a partir destes nutrientes que o nosso organismo obtem a energia de que necessita.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Nutriente"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Macronutrientes")
public interface Macronutrientes extends Nutriente {
}
