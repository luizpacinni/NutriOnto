package joint.codegen.nutriOnto;

import java.util.Set;
import joint.codegen.rdfs.subPropertyOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * A classe Causa e composta pelas classes Alimento e Nutriente. Os Alimentos causam o transporte dos nutrientes positivos, representados pela propriedade PontoPositivo, ou negativos, representados pela propriedade PontoNegativo para o corpo.  Ja os nutrientes causam impactos positivos (propriedade PontoPositivo) ou negativos (propriedade PontoNegativo) em relacao a determinadas patologias. Por isso os nutrientes tambem estao presentes na classe CausaEfeito.
 * 
 * Razao tecnica para a criacao dessa classe:
 * 
 * Super classe criada para ser usada no Dominio das propriedades PontoNegativo e PontoPositivo, a fim de realizar um agrupamento e evitar inferencias incorretas de classes nas instancias.
 * 
 * Fonte da informacao: http://lpis.csd.auth.gr/mtpx/sw/Things%20to%20be%20careful%20about-OWL.pdf
 * 
 * Many domains
 * ...When you need a property for several classes, instead of having a property with several domains (which is wrong; it means intersection and not union), it’s advisable to create a new class, which is superclass of all those classes and then the domain of the property would be the new superclass. In this way, the property is inherited to all classes you want to.
 * E.g. both “Employees” and “Customers” have “names”. But we don’t create the “name” property having both classes as a domain, because this means that only objects that belong to BOTH classes (intersection) can have names. Instead we should create a class “Person” as a superclass of “Employee” and “Customer” and use that new class as the domain of property “name”...
 */
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Causa")
public interface Causa {
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

	@subPropertyOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#PontoPositivo", "http://www.w3.org/2002/07/owl#topObjectProperty"})
	@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#PontoPositivo")
	Set<CausaEfeito> getNutriOntoPontoPositivo();
	@subPropertyOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#PontoPositivo", "http://www.w3.org/2002/07/owl#topObjectProperty"})
	@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#PontoPositivo")
	void setNutriOntoPontoPositivo(Set<? extends CausaEfeito> nutriOntoPontoPositivo);

}
