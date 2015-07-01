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
 * Common name: chicken.
 * Scientific names: Gallus gallus domesticus G., G. bankiva.
 * Family: gallinaceous
 * 
 * WHY PUT THE CHICKEN MENU?
 * 
 * - Eaten without the skin, chicken is low in calories. From a delicate flavor, its flesh is about a thousand ways.
 * - It fills our daily protein requirements without too high a fat intake
 * 
 * The consumption of chicken has increased by 113% from 1973 to 2003. Deprived of his skin, this popular poultry in Canada, contains less fat than some cuts of red meat. Its white flesh is less fatty than its brown meat, but both provide more than a dozen vitamins and minerals.
 * 
 * Active ingredients and properties
 * The virtues of chicken soup:
 * When the hay is on the loose, a good hot soup is often a source of comfort. But chicken soup could provide more than just a soothing effect. The heat it gives off would accelerate the liquefaction of mucus more effectively than chaude15 water, according to results of a study conducted in the 1970s Chicken soup also result in a relief of cold symptoms. It promotes hydration and removal of secretions while reducing inflammation (effect observed in vitro) 15-17. Note that these studies were conducted with soup made from a traditional recipe, so with the "real" chicken.
 * 
 * Cardiovascular disease. Studies in humans indicate that the privileging less rich in saturated fat meats, such as chicken, resulting in improved blood lipid levels, a positive element in the prevention of diseases cardiovasculaires1-4. This effect was observed in people with various health problems, including blood cholesterol too eleve3,4, a surplus of weight1 or type 2 diabetes with renal complications.
 * 
 * Type 2 diabetes:
 *  It is well known that to have diabetes carries a risk of complications to the kidneys, and the nature as well as the amount of protein consumed may affect renal function. In people with type 2 diabetes, researchers have in particular observed that by substituting chicken for red meat for four weeks, various parameters of renal function were significantly in ameliores5. The mechanism explaining this effect are however not yet clearly understood.
 * 
 * Proteins.:
 * In general, the chicken is an excellent source of complete protein because it contains all nine essential amino acids to the body. These are not produced by the body and must therefore come from the diet. Proteins are used primarily to train, repair and maintain the integrity of tissues such as skin, muscles and bones. They are also used for training of digestive enzymes and hormones.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Carne"})
public class AvesImpl extends JOINTResource implements Aves, Serializable {

public AvesImpl(){
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
