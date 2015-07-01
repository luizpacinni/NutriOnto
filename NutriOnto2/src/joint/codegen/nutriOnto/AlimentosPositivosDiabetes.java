package joint.codegen.nutriOnto;

import java.util.Set;
import joint.codegen.owl.equivalentClass;
import joint.codegen.owl.hasValue;
import joint.codegen.rdfs.subClassOf;
import joint.codegen.rdfs.subPropertyOf;
import wwwc.nees.joint.compiler.annotations.Iri;

@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Alimento"})
@equivalentClass({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#AlimentosPositivosDiabetes"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#AlimentosPositivosDiabetes")
public interface AlimentosPositivosDiabetes extends Alimento {
	@subPropertyOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#PontoPositivo", "http://www.w3.org/2002/07/owl#topObjectProperty"})
	@hasValue("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Diabetes")
	@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#PontoPositivo")
	Set<CausaEfeito> getNutriOntoPontoPositivo();
	@subPropertyOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#PontoPositivo", "http://www.w3.org/2002/07/owl#topObjectProperty"})
	@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#PontoPositivo")
	void setNutriOntoPontoPositivo(Set<? extends CausaEfeito> nutriOntoPontoPositivo);

}
