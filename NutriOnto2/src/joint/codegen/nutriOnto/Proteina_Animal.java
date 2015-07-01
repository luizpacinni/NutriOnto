package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: http://www.nutricao.org/proteinas/animal/5-proteina-animal
 * Sao elementos estruturais imprescindiveis a todas as celulas. Na falta de carboidratos e gorduras, as proteinas agem como elementos energeticos, mas de baixo rendimento. Dentre todas as moleculas organicas, as proteinas estao entre as mais abundantes e as maiores importancia, daa a sua grande diversidade estrutural e a suas diversas funcoes biologicas.
 * As proteinas sao compostas por vinte aminoacidos, dos quais oito nao sao sintetizados pelo organismo humano, chamados “essenciais” (triptofano, lisina,
 * metionina, valina, leucina, isoleucina, finilalanina, treonina). Por este motivo, quanto mais aminoacidos essenciais a proteina tiver, mais “nobre” sera o alimento. Os produtos de origem animal sao, neste sentido os mais nobres. Sao fundamentais na constituicao e construcao do ser humano.Formam o arcabouco de todo o corpo (esqueleto, musculo, pele, etc).Sao constituintes basicos dos orgaos (coracao, pulmoes, rins, intestino,etc) e do sangue. Sao essenciais no crescimento.Constituem componente importante do leite materno. Repoem o desgaste natural dos tecidos (perda proteica diaria). Formam substancias capazes de auxiliar o organismo tanto no seu funcionamento como em sua defesa contra as enfermidades (enzimas e anticorpos).
 * Fontes: carnes, visceras, peixes, ovos, leite e derivados (queijos, iogurtes, colhadas, etc.).
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Proteina"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Proteina_Animal")
public interface Proteina_Animal extends Proteina {
}
