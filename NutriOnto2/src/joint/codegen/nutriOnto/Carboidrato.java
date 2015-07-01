package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: https://www.nobre.pt/620/hidratos-de-carbono.htm
 * Os carboidratos sao uma importante fonte de glicose e a principal fonte de energia do nosso organismo. Por cada grama deste nutriente o corpo humano obtem 4 Kcal.
 * Os carboidratos podem ser simples ou complexos (compostos). 
 * Chamamos acucares aos carboidratos simples, constituidos apenas por duas moleculas. Estao presentes de forma natural em muitos alimentos, na fruta, rica em frutose, ou no leite cujo acucar e a lactose. 
 * Os carboidratos complexos sao os amidos, formados por cadeias mais longas, precisam de mais tempo para serem digeridos e absorvidos. 
 * Os principais fornecedores de hidratos de carbono complexos sao a batata, o pao, os cereais e leguminosas.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Macronutrientes"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Carboidrato")
public interface Carboidrato extends Macronutrientes {
}
