package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Common Names: pig, hog, boar, wild boar.
 * Scientific name: Sus scrofa domesticus Sus scrofa.
 * Family: Suidae.
 * 
 * WHY PUT THE PIG AND WILD BOAR THE MENU?
 * 
 * - They are preparing all the sauces, savory as sweet. 
 * - The many cuts offered possible to prepare a wide variety of dishes.
 * - The pig is full of minerals and vitamins, especially vitamin B complex
 * - Some cuts, such as tenderloin and trimmed loin, are very meager.
 * 
 * Pork contains many nutrients essential to health. It contains high quality protein. It is also rich in zinc, selenium and B vitamins, especially vitamin B1 (thiamine) whose rates exceed those of other meats. Its fat content varies according to the cut, but generally, pork is considered a lean meat.
 * 
 * Active ingredients and properties
 * 
 * Cardiovascular disease. Meat is a major source of fat that we consume, especially saturated fatty acids, which are implicated in several chronic diseases associated with modern life. In the United States and Canada, the recommendations for cardiovascular health advise a reduction in total fat intake, especially satures1,2 fat. Saturated fatty acids are associated with elevated blood levels of LDL cholesterol, commonly called "bad cholesterol" 3. People with high levels of LDL cholesterol in the blood have an increased risk of suffering from diseases cardiovasculaires4. A recent review study in which were listed the results of fifty research has shown that the consumption of lean devoid of visible fat red meat does not increase blood cholesterol and cholesterol-LDL5 rates. In addition, lean red meat, consumed within a diet low in saturated fat, could even help lower cholesterol sanguin6 and thus the risk of cardiovascular disease.
 * 
 * Monounsaturated and polyunsaturated fatty acids are in turn associated with decreased plasma concentrations of LDL cholesterol when substituted for saturated fatty acids in the diet, which reduces the risk of cardiovasculaires3,7 diseases. It is recommended to have a relationship "polyunsaturated fatty acids in saturated fatty acids" high to encourage lower levels of LDL cholesterol.
 * 
 * In pigs, intramuscular lipids represent a report "polyunsaturated fatty acids in saturated fatty acids" higher than in ruminants (cattle and sheep), mainly because of relatively high levels of essential fatty acids including linoleic acid and alpha-linolenic acid (omega-3). These elements give this meat interessantes8 nutritional qualities. Compared to chicken, pork contains less than polyunsaturated fat, but a greater proportion of oleic acid, a monounsaturated fat. The fatty acid profile of pork is therefore between the profile of the beef and the chicken.
 * 
 * The pig is a monogastric animal, which can change Nutritionally the meat fatty acid composition to meet consumer demand and nutritionists seeking a lipid profile offering benefits to health8. In this regard, researchers have shown that the consumption of pork with a high content of polyunsaturated fatty acids (obtained by modifying the animal's diet) decreased blood cholesterol-LDL in women, compared to consumption pork having a content of polyunsaturated fatty standard.
 * 
 * Cancer:
 *  Consumption of red meat and processed meat was associated with increased risk of colorectal cancer in several studies epidemiologiques10-13. Some researchers, however, have not observed such negatives14-16 associations. An epidemiological study conducted in Montreal in 2005 showed no significant association between the consumption of a diet of pork and processed meat and the risk of breast and colon cancer in a population of Canadian women francaises17. A diet of pork, processed meat and potatoes would also not associated with the risk of developing cancer sein17. However, the results of a recent study show that meat consumption would be transformed associated with increased risk of cancer colon12. Processed meat contains preservatives such as salt, smoke, nitrites and nitrates. High consumption of such meat may increase exposure to nitrosamines and their precurseurs8, compounds potentially damaging to health.
 * 
 * Source: http://www.passeportsante.net/fr/Nutrition/EncyclopedieAliments/Fiche.aspx?doc=porc_sanglier_nu
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Carne"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Porco")
public interface Porco extends Carne {
}
