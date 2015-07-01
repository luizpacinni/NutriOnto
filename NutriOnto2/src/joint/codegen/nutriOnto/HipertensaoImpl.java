package joint.codegen.nutriOnto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.model.JOINTResource;
import wwwc.nees.joint.module.kao.LazyLoader;

/** 
 * Hypertension, or high blood pressure, is characterized by abnormally high blood pressure in the artery walls. Under stress or during physical exertion, it is normal that blood pressure rises. But in people with high blood pressure, tension remains high at all times, even at rest or in the absence of stress.
 * 
 * The long-term high blood pressure is a major risk factor for several diseases
 * 
 * - Heart and vascular disorders (angina, myocardial infarction and stroke). High blood pressure means that blood exerts more pressure on the artery walls, making them fragile and increases the risk that the artery is blocked by atherosclerosis.
 * - Heart failure. By imposing extra work in the heart, high blood pressure can cause a depletion of the heart muscle.
 * - Problems with the kidneys (renal failure) and eyes (damage to the retina can lead to blindness). Again, due to the weakening of blood vessels.
 * 
 * Like high blood pressure usually accompanied by no symptoms, a significant number of hypertensive patients are unaware of their condition - this is why it is nicknamed the "silent killer."
 * 
 * Prevalence
 * 
 * According to the World Health Organization, 30% of men and 50% of women aged 65 to 75 years have high blood pressure. Its frequency increases with age, but nowadays, it affects populations increasingly younger. According to the organization Hypertension Canada, more than 9 in 10 Canadians will develop hypertension if they do not change their lifestyle. If the situation does not improve, it is estimated that in 2025, the number of hypertensive patients in the world will have reached 1.56 billion people, a prevalence of 60% increase 75.
 * 
 * The types of blood pressure and its causes
 * 
 * - Primary hypertension (or "essential") represents approximately 90% of cases. It is caused by a multitude of factors whose effects accumulate over the years. The main ones are related to age, heredity (especially for men) and living habits. Thus, obesity, sedentary lifestyle, smoking, alcohol abuse and stress contribute to high blood pressure. This type of hypertension most often appears gradually from age 50, but can also occur before that age.
 * 
 * A high salt intake is also associated with elevated blood pressure. According to a survey conducted by Statistics Canada, over 85% of men and 60% of women have a salt or sodium intake exceeding the recommended upper limit of 2,300 mg per day1. See complete picture of the maximum tolerated intake of sodium.
 * - Secondary hypertension may result from another health problem, such as a kidney or endocrine problem or birth defect of the aorta. It can also come from the frequent use of some drugs, for example anti-inflammatory, which create a water and salt retention, bronchodilators, which have a stimulating effect on the heart and the nasal decongestant, due to they contain ephedrine (a substance whose effect resembles that of adrenaline secreted under stress). It can also come from the use of illegal drugs such as cocaine and amphetamines. Secondary hypertension appears suddenly and blood pressure is often higher.
 * 
 * Understanding the extent of blood pressure
 * 
 * Blood pressure consists of systolic and diastolic pressures, which are measured in millimeters of mercury, or mmHg.
 * 
 * - The systolic pressure is the blood pressure when the heart contracts and pumps blood into the arteries. It provides a blood supply around the body.
 * - Diastolic pressure is the pressure that continues to be exerted on the arteries between each contraction. At this point, the heart expands and resumes its volume, which allows the cardiac chambers to fill with blood. This pressure tends to increase with age, but passed the sixties, it gradually decreases due to the weakening of the blood vessels of the body.
 * 
 * Diagnostic
 * 
 * Before making a diagnosis of hypertension, the physician measures the blood pressure a few times during successive visits. Indeed, it can vary during the day depending on the activities and vary from one time to another. It is quite common that, as a result of stress or nervousness, tension rises significantly when a patient enters the doctor's office and its voltage back down when it comes out. This is called the "white coat syndrome". To avoid this type of reaction, the doctor may suggest the patient to measure his own blood pressure at home, using a sphygmomanometer. The doctor may also prescribe the patient an ambulatory blood pressure monitor (ABPM). The MAPA is a compact device that records the measurement of blood pressure at specific times over a period of 24 hours.
 * 
 * Once reliable values, the doctor can make a diagnosis: a person whose pressure is equal to or greater than 140/90 has high blood pressure. Note that people with diabetes or kidney disease should ideally maintain a blood pressure that does not exceed 130/80.
 * 
 * Source: http://www.passeportsante.net/fr/Maux/Problemes/Fiche.aspx?doc=hypertension_pm
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Patologia"})
public class HipertensaoImpl extends JOINTResource implements Hipertensao, Serializable {

public HipertensaoImpl(){
	this.innerModifiedFields = new ArrayList<String>();
}
}
