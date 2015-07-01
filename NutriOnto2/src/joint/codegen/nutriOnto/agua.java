package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: https://www.nobre.pt/627/agua.htm
 * O nosso organismo e composto por cerca de 60% de agua, logo, o consumo deste nutriente torna-se imprescindivel diariamente, e em maior quantidade. 
 * A agua desempenha muitas funcoes no corpo humano: dissolve e transporta os nutrientes por todas as celulas, transporta os residuos toxicos que sao eliminados pelo rim atraves da urina, e ajudam na manutencao da temperatura corporal e na hidratacao de todas as celulas e tecidos. 
 * Diariamente perdemos grandes quantidades de agua atraves do suor, respiracao, urina e fezes. Para assegurar a sua reposicao e recomendavel a ingestao de 1.5 a 3 litros de agua todos os dias.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Micronutrientes"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#agua")
public interface agua extends Micronutrientes {
}
