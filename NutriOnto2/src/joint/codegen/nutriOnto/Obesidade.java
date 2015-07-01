package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Obesity
 * 
 * According to the World Health Organization (WHO), obesity is characterized by "abnormal or excessive fat accumulation that may impair health."
 * Basically, obesity resulting from excessive intake of calories relative to energy expenditure for several years.
 * Obesity overweight must be distinguished, which is also overweight, but less important. For its part, morbid obesity is a very advanced form of obesity. It would be so damaging to health that she would lose from August to October years of life.
 * 
 * Diagnosing obesity
 * 
 * We can not rely only on the weight of a person to determine if it is obese or if it is overweight. Various measures are used to provide additional information and to predict the impact of obesity on health.
 * 
 * Body mass index (BMI). According to WHO, this is the most useful tool, although approximate, to measure overweight and obesity in adults. This index is calculated by dividing weight (kg) by height squared (m2). We speak of overweight or overweight when it is between 25 and 29.9; obesity when it equals or exceeds 30; and morbidly obese if it equals or exceeds 40. The healthy weight is a BMI between 18.5 and 25. Click here to calculate your body mass index (BMI).
 * Remarks
 * - The main disadvantage of this measuring tool is that it gives no information on the breakdown of fat stores. But when the fat is mainly concentrated in the belly area, the risk of diabetes and cardiovascular disease is higher than if it is concentrated in the hips and thighs, for example.
 * - In addition, BMI does not distinguish between the mass of bones, muscles (muscle mass) and fat (body fat). Therefore, BMI is not accurate for people with a big frame or are very muscular, as athletes and bodybuilders;
 * 
 * - Waist circumference. Often used in conjunction with BMI, it can detect excess fat in the abdomen. There is talk of abdominal obesity when waist circumference exceeds 88 cm (34.5 inches) for women and 102 cm (40 inches) for men. In this case, the health risks (diabetes, hypertension, dyslipidemia, cardiovascular disease, etc.) are considerably accrus.Cliquez here to learn how to measure your waistline.
 * - Around ratio waist / hips. This measure provides an even more precise idea of ​​the distribution of fat in the body. The report is considered high when the result is greater than 1 in men, and greater than 0.85 in women.
 * - Researchers are working to develop new tools for measuring the excess fat. One of them, called fat mass index, or IMA, is based on the measurement of the hip circumference and grandeur16. However, so it has not been proven and is not used in medicine for now.
 * 
 * In assessing the existence of risk factors of diseases, blood tests (especially the lipid profile) gives valuable information to the physician.
 * 
 * Obesity in numbers
 * 
 * The proportion of obese people has increased over the last 30 years. According to the World Health Organization (WHO), the prevalence of obesity has reached epidemic proportions worldwide. The increase in the average weight is observed in all age groups in all socio-economiques1 groups.
 * 
 * Here are some data.
 * 
 * Worldwide, 1.5 billion adults 20 years and older are overweight and at least 500 million of them are obeses2,3. Developing countries are not spared;
 * In Canada, according to the most recent data, 36% of adults are overweight (BMI> 25) and 25% are obese (BMI> 30) 5;
 * In the US, about one third of people aged 20 and over is obese and another third due to embonpoint49;
 * In France, nearly 15% of the adult population is obese, and about a third is surpoids50.
 * 
 * Multiple causes
 * 
 * When trying to understand why obesity is so widespread, it is observed that multiple causes and are not based solely on the individual. The government, municipalities, schools, the food industry, etc. also bear some responsibility in creating the obesogenic environments.
 * We use the term to describe an obesogenic environment living environment that contributes to obesity:
 * accessibility to foods high in fat, salt and sugar, high-calorie and low-nutrient (junk food);
 * sedentary and stressful lifestyle;
 * living environment not conducive to active transportation (walking, cycling).
 * This obesogenic environment has become the norm in many industrialized countries and is found in developing countries as and as the population adopts a lifestyle to Western.
 * People whose genetic makeup makes it easier weight gain are more likely to be victims of the obesogenic environment. However, susceptibility-related genes can lead to obesity alone. For example, 80% of Pima Indians of Arizona are obese today. But when followed a traditional lifestyle, obesity was much rarer.
 * 
 * Consequences
 * 
 * Obesity can increase the risk of several chronic diseases. Health problems begin to show after about 10 years of excess poids7.
 * 
 * Risk greatly accru1:
 * type 2 diabetes (90% of people with this type of diabetes have a problem of overweight or obesite3);
 * hypertension;
 * gallstones and other gallbladder problems;
 * dyslipidemia (abnormal levels of lipids in the blood);
 * shortness of breath and sweating;
 * sleep apnea.
 * 
 * Moderately increased risk:
 * cardiovascular problems: coronary heart disease, stroke (stroke), heart failure, cardiac arrhythmia;
 * knee osteoarthritis;
 * drop.
 * 
 * Slightly increased risk:
 * certain cancers: hormone-dependent cancers (in women, endometrial cancer, breast, ovarian, cervical, in men, prostate cancer) and the system-related cancers digestive (colon cancer, gall bladder, pancreas, liver, kidney);
 * Fertility decline in the 2 sexes;
 * dementia, back pain, phlebitis and gastroesophageal reflux.
 * 
 * How fat is distributed on the body, rather in the abdomen or hips, plays a decisive role in the onset of diseases. The accumulation of fat in the abdomen, typical of abdominal obesity, is much more risky than the more uniform distribution (gynoid obesity). Men have on average 2 times more abdominal fat than non menopausees1 women.
 * 
 * Worryingly, some of these chronic diseases, such as type 2 diabetes, now occur in adolescence, given the growing number of young people who are overweight and obese.
 * 
 * Obese people have a lower quality of life as they age and a shorter life expectancy than people who have a healthy weight. Moreover, health professionals predict that today's youth will be the first generation of children whose life expectancy does not exceed that of their parents, mainly because of the increasing incidence of obesity infant.
 * 
 * Finally, obesity can become a psychological burden. Some people will feel excluded from society because of the beauty of criteria proposed by the fashion industry and the media. Given the difficulty to lose their excess weight, others will live great distress or anxiety, which may be up to depression.
 * 
 * Source: http://www.passeportsante.net/fr/Maux/Problemes/Fiche.aspx?doc=obesite_pm
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Patologia"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Obesidade")
public interface Obesidade extends Patologia {
}
