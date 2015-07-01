package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Diabetes is characterized by too much sugar in the blood: hyperglycemia linked to a malfunction of the pancreas.
 * Undetected or poorly controlled diabetes damages the functioning of vital organs and leads to serious health problems: blindness, kidney failure, heart disease or amputation.
 * Sugar corrodes the walls of blood vessels that nourish all tissues with oxygen and nutrients. Without support, the consequences of diabetes are involved in decreasing life expectancy.
 * Today, for example, 4 million French have it.
 * 
 * How to prevent?
 * 
 * Unlike genetic predisposing factors or age, it is possible to preserve diabetes by adapting eating habits and practicing regular physical activity.
 * The results of a scientific test have shown that in people who have changed their lifestyle, the onset of diabetes fell by almost 60%.
 * 
 * Food Tips:
 * 
 * Gradually change your eating habits is to have a varied and balanced diet to reduce weight gain. He is not about to stick to a strict diet!
 * A good diet is based, first, on very simple dietary principles:
 * - Do 3 meals a day and eat at regular times. This helps to better manage their hunger and avoid the "cravings" sources snacking.
 * - Limit consumption of sugary and high fat foods. With the fats of good quality.
 * - Consume at each meal: fruits and vegetables, protein foods, starchy foods, dairy products, water, in suitable proportions.
 * 
 * What to do for eating well?
 * 
 * - Fruits and vegetables: at least 5 times a day
 * - Dairy: 3 times a day (3-4 for children and adolescents)
 * - Starches: at every meal according to appetite
 * - Meat, fish, egg: 1 to 2 times per day
 * - Sweet products: to (with) limit
 * - Salt: to (with) limit
 * - Water: no limit
 * - Smoking: should you make yourself advised to stop
 * - Alcohol: to (with) limit
 * 
 * PHYSICAL ACTIVITY TIPS
 * Physical activity is not synonymous with sport!
 * Some examples:
 * - walk fast,
 * - climbing stairs,
 * - do the cleaning,
 * - gardening,
 * - pick up the kids to school on foot,
 * - make a family outing,
 * - fetch bread bike instead of driving ...
 * The equivalent of at least 30 minutes of brisk walking per day can reduce the risk of developing type 2 diabetes.
 * 
 * Some foods against diabetes
 * 1. Apple
 * 2. Avocado
 * 3. Barley
 * 4. Legumes
 * 5. Beef
 * 6. Berry
 * 7. Broccoli
 * 8. Carrots
 * 9. Turkey or chicken
 * 10. Eggs
 * 11. Fish
 * 12. Linseed
 * 13. Milk and Yogurt
 * 14. Nuts
 * 
 * Sources: 
 * - http://www.contrelediabete.fr/quest-ce-que-le-diabete.html
 * - http://www.contrelediabete.fr/des-conseils-protegez-vous.html
 * 
 * Other factors for preventing type 2 diabetes include:
 * 
 * Eating minimal amounts of processed foods
 * Eating fresh vegetables regularly through the day
 * Including physical activity into each day
 * Not smoking
 * Keeping alcohol intake low
 * 
 * Diabetes: High blood pressure
 * People with diabetes are more likely to also have high blood pressure or hypertension.
 * 
 * High blood pressure can increase the risk of diabetes complications such as diabetic eye and kidney problems.
 * 
 * Managing blood pressure will be a part of a person's overall diabetes care plan.
 * 
 * Diabetes and high blood pressure complications
 * 
 * Diabetes also affects the arteries, making them more likely to develop atherosclerosis, or narrowing of the arteries. Atherosclerosis can cause high blood pressure, which if not treated, can lead to blood vessel damage, stroke, heart failure, heart attack or kidney failure.
 * 
 * Having diabetes increases your risk of developing high blood pressure and other cardiovascular problems, because diabetes adversely affects the arteries, predisposing them to atherosclerosis (narrowing of the arteries). Atherosclerosis can cause high blood pressure, which if not treated, can lead to blood vessel damage, stroke, heart failure, heart attack or kidney failure.
 * 
 * Compared with people with normal blood pressure readings, men and women with hypertension have an increased risk of:
 * 
 * Coronary artery disease ( heart disease)
 * Strokes
 * Peripheral vascular disease (narrowing of the arteries in the legs and feet)
 * Heart failure
 * Even high yet normal blood pressure or pre-hypertension (defined as 120-139/ 80-89 millimetres of mercury or mmHg) has an impact on your health. Studies show that people with normal yet high range blood pressure readings, over a 10 year period of follow up time, had a two to three-fold increased risk of heart disease.
 * 
 * What should blood pressure be if you have diabetes?
 * 
 * Blood pressure readings vary, but in general your blood pressure should be less than 130/80 mmHg. The first number is the "systolic pressure" or the pressure in the arteries when your heart beats and fills the arteries with blood. The second number is the "diastolic pressure" or the pressure in the arteries when your heart rests between beats, filling itself with blood for the next contraction.
 * 
 * Having normal blood pressure is as important in managing diabetes as having good control of your blood sugar when it comes to preventing diabetes complications.
 * 
 * How do you prevent high blood pressure?
 * 
 * To help prevent high blood pressure:
 * 
 * Stop smoking
 * Eat healthily
 * Maintain a healthy body weight
 * Exercise
 * Limit salt intake in the diet
 * 
 * Source: http://www.webmd.boots.com/hypertension-high-blood-pressure/guide/diabetes-bp
 * Type 2 diabetes, diabetes that lives hidden
 * 
 * Type 2 diabetes is the most common form and the most insidious disease. Insulin produced by the pancreas does evil (insulin resistance) and over time the pancreas becomes exhausted and no longer able to produce sufficient amount of insulin (insulin deficiency). Sugar levels in the blood (blood sugar) is irregular. The consequences of this failure can go undetected. In France, 700,000 people ignore their diabetes. It appears in middle age, usually from 40 years and in old age.
 * 
 * Its origin is often genetic. The presence of diabetes in the immediate family circle predisposes to disease and should prompt conduct regular screenings. Diabetes also has environmental and cultural causes. Eating habits too rich or unbalanced increase the risk. Overweight and obesity are aggravating factors of the disease, as they are responsible for insulin resistance, more so if any physical activity is absent.
 * 
 * Source: http://www.contrelediabete.fr/quest-ce-que-le-diabete.html
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Patologia"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Diabetes")
public interface Diabetes extends Patologia {
}
