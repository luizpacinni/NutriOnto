package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: https://www.nobre.pt/624/vitaminas.htm
 * Podem ser hidrossoluveis ou lipossoluveis, consoante se encontram dissolvidas em agua ou em gordura. 
 * Hidrossoluveis: Vitaminas do Complexo B e vitamina C
 * Lipossoluveis: Vitamina A, Vitamina D, Vitamina E, Vitamina K
 * Os alimentos apresentam uma grande diversidade na sua composicao relativamente ao tipo e a quantidade de vitaminas. Como estes nutrientes desempenham funcoes muito importantes no organismo, e essencial ter uma alimentacao variada.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Micronutrientes"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Vitamina")
public interface Vitamina extends Micronutrientes {
}
