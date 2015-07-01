package joint.codegen.nutriOnto;

import java.util.Set;
import javax.xml.datatype.XMLGregorianCalendar;
import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: http://www.alimentacaosaudavel.org/Legumes.html
 * O termo “legume” significa geralmente as partes comestiveis das plantas, sendo, contudo esta definicao tradicional e nao cientifica. Por isso o uso da palavra legume e algo arbitraria e subjetiva, sendo determinada pelos costumes culturais e de seleccao na preparacao de alimentos. De uma forma geral, uma planta ou parte de uma planta que e consumida pelos humanos e considerada como um legume.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Alimento"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Legumes")
public interface Legumes extends Alimento {
	@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Sazonalidade")
	Set<XMLGregorianCalendar> getNutriOntoSazonalidade();
	@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Sazonalidade")
	void setNutriOntoSazonalidade(Set<? extends XMLGregorianCalendar> nutriOntoSazonalidade);

}
