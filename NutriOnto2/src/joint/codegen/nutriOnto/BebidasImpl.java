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
 * Does drinking alcohol affect your blood pressure?
 * 
 * Drinking too much alcohol can raise blood pressure to unhealthy levels. Having more than three drinks in one sitting temporarily increases your blood pressure, but repeated binge drinking can lead to long-term increases.
 * 
 * Heavy drinkers who cut back to moderate drinking can lower their systolic blood pressure (the top number in a blood pressure reading) by 2 to 4 millimeters of mercury (mm Hg) and their diastolic blood pressure (the bottom number in a blood pressure reading) by 1 to 2 mm Hg. Heavy drinkers who want to lower blood pressure should slowly reduce how much they drink over one to two weeks. Heavy drinkers who stop suddenly risk developing severe high blood pressure for several days.
 * 
 * If you have high blood pressure, avoid alcohol or drink alcohol only in moderation. Moderate drinking is generally considered to be:
 * - Two drinks a day for men younger than age 65
 * - One drink a day for men age 65 and older
 * - One drink a day for women of any age
 * 
 * A drink is 12 ounces (355 milliliters) of beer, 5 ounces (148 milliliters) of wine or 1.5 ounces (44 milliliters) of 80-proof distilled spirits.
 * 
 * Keep in mind that alcohol contains calories and may contribute to unwanted weight gain — a risk factor for high blood pressure. Also, alcohol can interfere with the effectiveness and increase the side effects of some blood pressure medications.
 * Answers from Sheldon G. Sheps, M.D.
 * 
 * Drinking Wine Or Beer Has Same Result: Higher Blood Pressure
 * 
 * DALLAS, April 19 – Whether the drink of choice is a frosty beer or a full-bodied red wine, the effect is the same – higher blood pressure, according to research reported in Hypertension: Journal of the American Heart Association.
 * 
 * “A positive relationship between alcohol consumption and blood pressure is well established, but the relative effect of specific alcoholic beverages is controversial,” said lead researcher Renate R. Zilkens, Ph.D., research fellow in the School of Medicine and Pharmacology at University of Western Australia.
 * 
 * Red wine appears to have a dual effect on blood vessels. The alcohol in it may raise blood pressure, but the polyphenolic compounds in red wine may have antioxidant effects and help relax blood vessels. There may be subtle differences between wine, beer and spirits on heart rate and other cardiovascular measurements.
 * 
 * Researchers investigated whether red wine has less of an impact on blood pressure than other alcoholic beverages and whether it improved vascular function. They studied 24 healthy, non-smoking men aged 20 to 65. All the men were daily drinkers, with normal blood pressure and no history of heart disease.
 * 
 * The men abstained from all alcohol during a two-week run-in period and then were randomized to four different interventions for four weeks: no alcohol, 375 ml (13 ounces) of red wine, or de-alcoholized red wine, or 1,125 ml (38 ounces) of beer. At the end of the four-week intervention, the volunteers switched to a different intervention, until they had completed all four. The men maintained their normal diets during the 16-week study, but restricted tea to less than two cups a day, and avoided antioxidant supplements and all over-the-counter medications.
 * 
 * Volunteers were evaluated with 24-hour ambulatory blood pressure monitoring, ultrasound measurement of blood vessel or “endothelial function,” as well as urine and blood tests.
 * 
 * Researchers found that drinking beer increased waking systolic blood pressure (the first number in a blood pressure reading) by 2.9 millimeters of mercury (mm Hg), while wine increased systolic pressure by an average of 1.9 mm Hg. Beer also increased sleeping heart rate by 5.0 beats-per-minute (bpm) and wine increased it by 4.4 bpm.
 * 
 * Removing alcohol from red wine did not lower blood pressure either, Zilkens said.
 * 
 * In addition, neither de-alcoholized red wine, red wine nor beer influenced vascular function, suggesting that red wine polyphenols do not have a significant role in mitigating blood pressure-elevating effects of alcohol in men.
 * 
 * This study was conducted in healthy men with normal blood pressure, so it is unclear if beer and wine will have the same effect on men with high blood pressure, she noted.
 * 
 * “The advice to drinking men ‘at risk’ of hypertension and those with hypertension is to drink less than two drinks per day. At that level they will still benefit from the HDL-cholesterol raising effect and anti-coagulant properties of alcohol which are considered to be protective of the heart,” Zilkens said.
 * 
 * The American Heart Association recommends that if you drink alcohol, do so in moderation, i.e, no more than to two drinks per day for men and one drink per day for women. But the association cautions that people should NOT start drinking if they do not already drink alcohol.
 * 
 * Co-authors are Valerie Burke, Jonathan M. Hodgson, Anne Barden, Lawrence J. Beilin, and Ian B. Puddey.
 * 
 * Story Source:http://www.sciencedaily.com/releases/2005/04/050419105236.htm
 * 
 * The above story is based on materials provided by American Heart Association. Note: Materials may be edited for content and length.
 * 
 * Source: http://www.mayoclinic.org/diseases-conditions/high-blood-pressure/expert-answers/blood-pressure/faq-20058254
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Alimento"})
public class BebidasImpl extends JOINTResource implements Bebidas, Serializable {

public BebidasImpl(){
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
