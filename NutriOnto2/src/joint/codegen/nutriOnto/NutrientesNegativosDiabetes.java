package joint.codegen.nutriOnto;

import java.util.Set;
import joint.codegen.owl.equivalentClass;
import joint.codegen.owl.hasValue;
import joint.codegen.rdfs.subClassOf;
import joint.codegen.rdfs.subPropertyOf;
import wwwc.nees.joint.compiler.annotations.Iri;

@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Nutriente"})
@equivalentClass({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#NutrientesNegativosDiabetes"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#NutrientesNegativosDiabetes")
public interface NutrientesNegativosDiabetes extends Nutriente {
	/** 
	 * Fontes:
	 * 	http://www.sitemedico.com.br
	 * 	http://www.comerbembarato.com
	 * 	http://pressao-arterial.info
	 * 	http://www.abc.med.br
	 * http://www.tuasaude.com
	 */
	@subPropertyOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#PontoNegativo", "http://www.w3.org/2002/07/owl#topObjectProperty"})
	@hasValue("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Diabetes")
	@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#PontoNegativo")
	Set<CausaEfeito> getNutriOntoPontoNegativo();
	/** 
	 * Fontes:
	 * 	http://www.sitemedico.com.br
	 * 	http://www.comerbembarato.com
	 * 	http://pressao-arterial.info
	 * 	http://www.abc.med.br
	 * http://www.tuasaude.com
	 */
	@subPropertyOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#PontoNegativo", "http://www.w3.org/2002/07/owl#topObjectProperty"})
	@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#PontoNegativo")
	void setNutriOntoPontoNegativo(Set<? extends CausaEfeito> nutriOntoPontoNegativo);

}
