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
 * - The revenue to appreciate are many: parmigiana, meatballs in in blanquette in osso buco, casserole ...
 * - Its liver, his heart and kidneys, softer and less powerful flavor than beef, are particularly appreciated by gourmets.
 * -This is lean meat, which fits well to a diet to prevent cardiovascular disease.
 * - Veal is a major source of several essential vitamins and minerals, including iron, zinc and B vitamins.
 * 
 * Small cow zootechnical standpoint, the calf is in butchery, a male or female cattle shipped to slaughter when it is between 18 and 35 weeks. We distinguish various categories, by age, type of food and breeding method:
 * 
 * Calf milk throughout his life, he is fed milk or rather "milk replacer" formulas composed of powdered milk, milk solids or whey, which are added various supplements.
 * 
 * Grain-Fed Veal: Veal like the milk, it is weaned from his mother in the early days of its existence and fed the "milk replacer" for six to eight weeks. Then he received a diet of feed and supplements.
 * 
 * Fed veal: he nurses his mother until the age of three months or more. It is rarely found in commerce. In France, it has a red label while in Quebec, only the organic certification can guarantee that the farmer has respected this practice.
 * 
 * Broutard calf: it is fed by the mother and then weaned and put out to pasture. Her pink-red flesh is tastier than that of calf milk or grain.
 * 
 * veal contains little fat and saturated fatty acids, which advantageously positions the relative to other meats, in preventing cardiovascular disease. Furthermore, the calf contains oleic acid, a monounsaturated fatty acid which may lead to better control of certain risk factors for cardiovascular disease. It also contains selenium, which confers advantages for the protection of the heart.
 * 
 * Active ingredients and properties
 * 
 * Cardiovascular disease. The calf, due to its low fat content, is considered a lean meat and even extra lean, according to different cuts available on the market. It contains little saturated fat (less than 30% of the total lipid content), which joined the recommendations that suggest a decrease in fat and saturated fatty acids to prevent cardiovasculaires1 diseases. In an intervention study, 191 men and women with high cholesterol were subjected to a diet low in fat and saturated fatty acids. The consumption of lean meats like veal for 36 weeks resulted in a decrease in LDL cholesterol ("bad") cholesterol levels similar to that seen with a similar consumption of chicken or poisson2,3. The calf also contains some palmitic acid, a saturated fatty acid that contributes to rising sanguin4 cholesterol, a major risk factor for cardiovascular disease. Furthermore, the calf contains higher levels of oleic acid (a monounsaturated fatty acid) that palmitic acid, which could maintain cardiovascular health. Indeed, oleic acid does not carry the negative effects associated with palmitic acid, which are to disrupt blood clotting and cause caillots5 training, factors often associated with thrombosis. In addition, in a clinical study in 43 young adults, it has been shown that, contrary to the palmitic acid, oleic acid favors fat oxidation (that is to say the use of fat reserves as an energy source) and increased energy expenditure. The authors concluded that high consumption of palmitic acid could contribute to an increased risk of obesity and insulin resistance that are frequently associated with the development of cardiovasculaires6 diseases. Therefore, veal consumption, due to its low palmitic acid content and its content of oleic acid, could bring some benefits compared to other types of meat.
 * 
 * The calf also contains selenium, a mineral associated with the prevention of cardiovascular diseases. Selenium protects against oxidative damage (or oxidative stress) that can disrupt the arteries and thus cause cardiovasculaires7 diseases. Selenium also reduces blood levels of homocysteine, a protein considered to be a risk factor for cardiovascular disease.
 * 
 * Source: http://www.passeportsante.net/fr/Nutrition/EncyclopedieAliments/Fiche.aspx?doc=veau_nu
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Carne"})
public class VermelhaImpl extends JOINTResource implements Vermelha, Serializable {

public VermelhaImpl(){
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
