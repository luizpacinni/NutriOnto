package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: http://www.suapesquisa.com/frutas/frutas_citricas.htm
 * Sao frutas que possuem altas concentracoes de acido citrico e vitamina C. O acido citrico e responsavel pelo sabor acido destas frutas. Sao originarias das regioes tropicais e subtropicais da asia. Grande parte das frutas citricas tambem apresentam boas quantidades de potassio, vitamina A e flavonoides.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Frutas"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Frutas_Citricas")
public interface Frutas_Citricas extends Frutas {
}
