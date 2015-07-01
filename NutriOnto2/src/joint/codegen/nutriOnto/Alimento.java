package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: http://www.maisequilibrio.com.br/bem-estar/nutricao-e-alimentacao-7-1-6-202.html
 * Alimentos sao substancias introduzidas no organismo visando promover o crescimento, a reparacao dos tecidos, a producao de energia e o equilibrio das diversas funcoes organicas. Estes sao de origem animal, vegetal e mineral. Sao classificados de acordo com suas propriedades fisicas e quimicas e sobre sua forma de atuacao no nosso organismo.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Causa"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Alimento")
public interface Alimento extends Causa {
}
