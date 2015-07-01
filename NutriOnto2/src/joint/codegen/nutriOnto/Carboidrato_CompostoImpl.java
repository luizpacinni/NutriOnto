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
 * Fonte: http://www.nutricao.org/carboidratos/composto
 * Carboidratos compostos sao os acucares e os amido, sao os componentes mais abundantes e amplamente distribuidos entre os alimentos. Sua determinacao nos alimentos e importante porque eles tem varias funcoes: nutricionais, adocantes naturais, materia-prima para produtos fermentados, principal ingrediente dos cereais, propriedades reologicas da maioria dos alimentos de origem vegetal (polissacarideos), responsaveis pela reacao de escurecimento em muitos alimentos fornecem energia facilmente utilizadas para diversas funcoes organicas.
 * Quando em excesso armazena-se em forma de gorduras. Alimentos com amido tais como batata, arroz e macarrao contem carboidratos compostos, encontrados tambem no leite e nas frutas. Alguns vegetais tambem o contem, porem, voce tem que ingerir uma grande quantidade para que sua glicemia se alterem. Quando voce consome esses alimentos, todos os carboidratos sao quebrados em pequenas moleculas e sao absorvidos na corrente sanguinea transformados em energias (calorias). Tambem conhecidos como hidratos de carbono, carboidratos ou acucares, os glicideos sao considerados alimentos energeticos, destinados a gerar calorias quando queimados pelo organismo, e o que ocorre durante o exercicio fisico. Quando os glicideos nao sao aproveitados transforman-se em gorduras.
 * Os glicideos simples, chamados monossacarideos (como a glicose e a frutose), sao absorvidos diretamente pelo organismo (pelo intestino). O mais complexos, como a sacarose(acucar comum da cana e da beterraba),a lactose (do leite), o amido (batata, trigo, arroz), antes de serem absorvidos,precisam ser transfomados em monossacarideos, pela acao de determinados fermentos digestivo. Os alimentos ricos em glicideostem a prioridade de fazer engordar. Ao contrario, a alimentacao pobre em glicidios provoca emagrecimento.
 * Fontes:
 * Cereais: arroz, milho, trigo, centeio, cevada.
 * Leguminosas: soja, feijao, lentilha, ervilha, grao-de-bico.
 * Raizes: batata, mandioca, cara, beterraba.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Carboidrato"})
public class Carboidrato_CompostoImpl extends JOINTResource implements Carboidrato_Composto, Serializable {

public Carboidrato_CompostoImpl(){
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
