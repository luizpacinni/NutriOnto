package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fontes: http://portaldocoracao.uol.com.br/nutrico/propriedades-nutricionais-das-frutas-secas-mais-consumidas
 * http://ecocheervegan.com/nutricao-vegetariana/71-o-poder-das-nozescastanhasfrutas-secas-e-sementes
 * Excelente fonte de vitaminas e minerais. Sao realmente muito nutritivas, porem seu consumo deve ser moderado, pois sao muito caloricas. A vantagem e que, em pequenas porcoes (30 a 40 gramas), ideais para um lanchinho, viram aliadas na hora de emagrecer. Isso acontece porque elas carregam doses importantes de fibras, proteinas e gorduras boas que formam uma composicao perfeita para manter estavel o nivel de acucar no sangue. E isso segura a fome.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Frutas"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Frutas_Secas")
public interface Frutas_Secas extends Frutas {
}
