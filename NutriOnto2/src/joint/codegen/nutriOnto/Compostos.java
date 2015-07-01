package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: http://pratolegal.com.br/blog/dicas-de-vida-saudavel/voce-sabe-o-que-sao-os-compostos-bioativos-descubra-os-beneficios-para-a-saude.html
 * Compostos bioativos sao substancias presentes em verduras, legumes e frutas que favorecem a nossa saude e contribuem para o bom funcionamento dos orgaos ou ate no combate de doencas.
 * 
 * Dentre eles, podemos citar os polifenois, que sao responsaveis pela diminuicao do processo inflamatorio do organismo, alem de impedirem a absorcao de radicais livres nas celulas e reduzirem os riscos do desenvolvimento de doencas como o cancer. Estao presentes nas frutas (maca, cereja, amora, mirtilo, uva), em hortalicas (brocolis, couve-flor, cebola, beterraba), nas ervas (manjericao, alecrim, gengibre, acafrao), nas oleaginosas (nozes, amendoas) e nos chocolates com maior teor de cacau (acima de 50%).
 * 
 * As isoflavonas estao presentes em maior abundancia na soja. Possuem acao benefica na saude dos ossos, aliviam as ondas de calor nas mulheres, melhoram a saude da pele e reduzem o risco de cancer de mama.
 * 
 * Outro componente importante e o resveratrol, presente nos sucos integrais de uva escura, amora, no chocolate amargo e tambem no vinho tinto. Ele ajuda a retardar o envelhecimento das celulas, diminui os niveis de LDL (colesterol ruim), diminui o risco de doencas cardiovasculares e inibe a absorcao de radicais livres.
 * 
 * e preciso lembrar tambem das catequinas, que estao presentes em maior abundancia no cha verde e branco e possuem poder anti-inflamatorio nas celulas, reduzem as taxas de triglicerides, diminuem o apetite, previnem o cancer e auxiliam na reducao de gordura abdominal.
 * 
 * Os carotenoides tambem fazem parte desses compostos. Sao responsaveis por dar as cores, vermelha, laranja e amarela nos alimentos. No organismo eles atuam como antioxidantes, protetores contra cancer (pulmao, pele, utero), protegem contra o desenvolvimento de catarata, degeneracao da visao e melhoram a funcao imunologica. As principais fontes sao: cenoura, abobora, pimentao vermelho e amarelo, tomate, manga, mamao, batata doce, beterraba, melancia, gema do ovo, marisco, brocolis e folhas verdes escuras. Lembrando que quanto mais forte a coloracao no alimento for, maior e a concentracao de carotenoides.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Nutriente"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Compostos")
public interface Compostos extends Nutriente {
}
