package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: http://www.nutricao.org/proteinas/vegetal
 * As proteinas de origem vegetal sao formadas por aminoacidos essenciais encontrados na soja, contem um bom balanceamento desses aminoacidos quando comparadas a outros vegetais. Quando utilizamos a soja com farinha de trigo, arroz ou milho temos uma melhoria na qualidade das proteinas da soja, podendo equipara-las com as proteinas de origem animal.
 * Fonte: soja.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Proteina"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Proteina_Vegetal")
public interface Proteina_Vegetal extends Proteina {
}
