package joint.codegen.nutriOnto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.model.JOINTResource;
import wwwc.nees.joint.module.kao.LazyLoader;

/** 
 * Pathology : the science of the causes and effects of diseases, especially the branch of medicine that deals with the laboratory examination of samples of body tissue for diagnostic or forensic purposes.
 * 
 * MEDICINE
 * pathological features considered collectively; the typical behavior of a disease.
 * "the pathology of Huntington's disease"
 * MEDICINE
 * a pathological condition.
 * "the dominant pathology is multiple sclerosis"
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#CausaEfeito"})
public class PatologiaImpl extends JOINTResource implements Patologia, Serializable {

public PatologiaImpl(){
	this.innerModifiedFields = new ArrayList<String>();
}
}
