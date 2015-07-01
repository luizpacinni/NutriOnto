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
 * Fonte: http://www.nutricao.org/lipideos
 * As gorduras ou lipideos sao nutrientes responsaveis por inumeras funcoes importantes para o organismo, alem de sua funcao energetica, liberam maior quantidade de calorias por grama, as gorduras sao tambem excelentes veiculos de vitaminas lipossoluveis (soluveis em gorduras). Fornecem moleculas fundamentais para o organismo (prostaglandinas, lipoproteinas e colesterol) e acidos graxos essenciais (imcapases de serem sintetizados pelo organismo,
 * necessitando serem introduzidos pela alimentacao), incermentam o paladar dos alimentos e protegem contra variacoes de temperatura e contra a excessiva perda de agua por transpiracao. Quimicamente os lipideos simples sao esteres de glicerol, moleculas constituidas por glicerol (que e um alcool) mais acidos graxos. O glicerol contem tres grupos hidroxila (OH), sucetiveis de reagirem com um, dois ou tres acidos graxos para formar as gorduras, que serao respectivamente mono, di ou triglicerides. A quase totalidade das gorduras alimentares sao triglicerides. Com a fracao glicerol a mesma em todos os tipos de lipideos simples, a diferenca entre eles reside entao nos acidos graxos, que podem vairiar segundo comprimento da cadeia carbonica, cadeia curta (quatro atomos de carbono), cadeia media ou cadeia longa (dezesseis a vinte atomos de carbono). Importantes como involucro e fator de sustentacao de orgaos do corpo, estende-se sob a pele constituindo verdadeira barreira termica (mantem o calor). Reserva e fornecimento de energia nos periodos longos sem alimentacao, principal fonte de tecidos adiposos.
 * Fontes:
 * Origem vegetal: Devem ser preferidos: Soja, azeite de oliva, margarina vegetal, oleos (girassol, soja, canola, milho, etc.) abacate, nozes, coco, avela, castanha de caju, amendoim, amendoas.
 * Origem animal: Devem ser evitados por serem ricos em colesterol, manteiga, nata, creme de leite, banha, toucinho e bacon.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Macronutrientes"})
public class LipideoImpl extends JOINTResource implements Lipideo, Serializable {

public LipideoImpl(){
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
