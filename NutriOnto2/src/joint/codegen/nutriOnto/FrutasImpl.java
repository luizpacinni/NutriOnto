package joint.codegen.nutriOnto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.xml.datatype.XMLGregorianCalendar;
import joint.codegen.rdfs.subClassOf;
import joint.codegen.rdfs.subPropertyOf;
import wwwc.nees.joint.compiler.annotations.Iri;
import wwwc.nees.joint.model.JOINTResource;
import wwwc.nees.joint.module.kao.LazyLoader;

/** 
 * Fonte: http://www.alimentacaosaudavel.org/Fruta.html
 * A palavra fruta tem muitos significados diferentes, dependendo do contexto em que se utiliza. Em botanica, um fruto e o ovario e sementes amadurecidas de uma planta em flor, e em muitas especies, o fruto incorpora o ovario e os tecidos circundantes. Os frutos sao assim, em botanica, os meios pelos quais as plantas florescem e disseminam as sementes.
 * Na cozinha, quando os alimentos sao denominados frutos, o termo e mais utilizado para designar os frutos de plantas comestiveis, doces e carnudos, e que incluem, como exemplo, ameixas, macas e laranjas.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Alimento"})
public class FrutasImpl extends JOINTResource implements Frutas, Serializable {

public FrutasImpl(){
	this.innerModifiedFields = new ArrayList<String>();
}
	private Set<XMLGregorianCalendar> nutriOntoSazonalidade;

	@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Sazonalidade")
	public Set<XMLGregorianCalendar> getNutriOntoSazonalidade(){
		if(!this.isLazyLoaded())
			 LazyLoader.loadObject(this, this.getClass().getName());
		return this.nutriOntoSazonalidade;
	}
	@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Sazonalidade")
	public void setNutriOntoSazonalidade(Set<? extends XMLGregorianCalendar> nutriOntoSazonalidade){
		if(!this.isLazyLoaded())
			 LazyLoader.loadObject(this, this.getClass().getName());
		 this.innerModifiedFields.add("NutriOntoSazonalidade");
		 this.nutriOntoSazonalidade = (Set<XMLGregorianCalendar>) nutriOntoSazonalidade;
	}

	private Set<CausaEfeito> nutriOntoPontoNegativo;

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
	public Set<CausaEfeito> getNutriOntoPontoNegativo(){
		if(!this.isLazyLoaded())
			 LazyLoader.loadObject(this, this.getClass().getName());
		return this.nutriOntoPontoNegativo;
	}
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
	public void setNutriOntoPontoNegativo(Set<? extends CausaEfeito> nutriOntoPontoNegativo){
		if(!this.isLazyLoaded())
			 LazyLoader.loadObject(this, this.getClass().getName());
		 this.innerModifiedFields.add("NutriOntoPontoNegativo");
		 this.nutriOntoPontoNegativo = (Set<CausaEfeito>) nutriOntoPontoNegativo;
	}

	private Set<CausaEfeito> nutriOntoPontoPositivo;

	@subPropertyOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#PontoPositivo", "http://www.w3.org/2002/07/owl#topObjectProperty"})
	@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#PontoPositivo")
	public Set<CausaEfeito> getNutriOntoPontoPositivo(){
		if(!this.isLazyLoaded())
			 LazyLoader.loadObject(this, this.getClass().getName());
		return this.nutriOntoPontoPositivo;
	}
	@subPropertyOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#PontoPositivo", "http://www.w3.org/2002/07/owl#topObjectProperty"})
	@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#PontoPositivo")
	public void setNutriOntoPontoPositivo(Set<? extends CausaEfeito> nutriOntoPontoPositivo){
		if(!this.isLazyLoaded())
			 LazyLoader.loadObject(this, this.getClass().getName());
		 this.innerModifiedFields.add("NutriOntoPontoPositivo");
		 this.nutriOntoPontoPositivo = (Set<CausaEfeito>) nutriOntoPontoPositivo;
	}

}
