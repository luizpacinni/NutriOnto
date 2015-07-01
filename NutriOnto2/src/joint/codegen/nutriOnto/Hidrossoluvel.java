package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: https://www.nobre.pt/624/vitaminas.htm
 * Hidrossoluveis: Vitaminas do Complexo B e vitamina C
 * 
 * Fonte: http://www.brasilescola.com/saude-na-escola/conteudo/vitaminas.htm
 * As vitaminas hidrossoluveis sao soluveis em agua e sao representadas pelas vitaminas C e as vitaminas do complexo B (B1, B2, B6, B12, niacina, acido folico, biotina e acido pantotenico). As vitaminas hidrossoluveis geralmente sao encontradas nos vegetais, sendo a vitamina B12 praticamente exclusiva de alimentos animais. Como sao vitaminas soluveis em agua, o nosso organismo elimina o seu excesso pela urina. Por esse motivo, elas devem ser ingeridas com maior regularidade.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Vitamina"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Hidrossoluvel")
public interface Hidrossoluvel extends Vitamina {
}
