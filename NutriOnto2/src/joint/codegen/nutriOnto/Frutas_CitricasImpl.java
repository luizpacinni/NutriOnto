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
 * Fonte: http://www.suapesquisa.com/frutas/frutas_citricas.htm
 * Sao frutas que possuem altas concentracoes de acido citrico e vitamina C. O acido citrico e responsavel pelo sabor acido destas frutas. Sao originarias das regioes tropicais e subtropicais da asia. Grande parte das frutas citricas tambem apresentam boas quantidades de potassio, vitamina A e flavonoides.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Frutas"})
public class Frutas_CitricasImpl extends JOINTResource implements Frutas_Citricas, Serializable {

public Frutas_CitricasImpl(){
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
