package joint.codegen.nutriOnto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import joint.codegen.rdfs.subClassOf;
import joint.codegen.rdfs.subPropertyOf;
import wwwc.nees.joint.compiler.annotations.Iri;
import wwwc.nees.joint.model.JOINTResource;
import wwwc.nees.joint.module.kao.LazyLoader;

/** 
 * Fonte: https://www.nobre.pt/620/hidratos-de-carbono.htm
 * Os carboidratos sao uma importante fonte de glicose e a principal fonte de energia do nosso organismo. Por cada grama deste nutriente o corpo humano obtem 4 Kcal.
 * Os carboidratos podem ser simples ou complexos (compostos). 
 * Chamamos acucares aos carboidratos simples, constituidos apenas por duas moleculas. Estao presentes de forma natural em muitos alimentos, na fruta, rica em frutose, ou no leite cujo acucar e a lactose. 
 * Os carboidratos complexos sao os amidos, formados por cadeias mais longas, precisam de mais tempo para serem digeridos e absorvidos. 
 * Os principais fornecedores de hidratos de carbono complexos sao a batata, o pao, os cereais e leguminosas.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Macronutrientes"})
public class CarboidratoImpl extends JOINTResource implements Carboidrato, Serializable {

public CarboidratoImpl(){
	this.innerModifiedFields = new ArrayList<String>();
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
