package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * - These foods provide mainly animal protein but also fat, iron and B vitamins including vitamin B12 (little or no present in other food groups.
 * - Recommended consumption: 1-2 times a day.
 * - Consume in quantities less than the accompaniment.
 * - Regarding meat, vary the species and favor less fatty pieces.
 * - Remember to eat fish at least twice a week, once a week fatty fish (salmon, sardines, tuna, mackerel ...) for their richness in essential fatty acids.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Alimento"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Carne")
public interface Carne extends Alimento {
}
