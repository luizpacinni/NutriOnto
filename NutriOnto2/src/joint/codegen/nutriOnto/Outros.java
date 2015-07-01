package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** Alimentos que nao foram classificados em nenhuma outra classe ou subclasse */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Alimento"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Outros")
public interface Outros extends Alimento {
}
