package joint.codegen.rdfs;

import java.lang.Object;
import java.util.Set;
import wwwc.nees.joint.compiler.annotations.Iri;

@Iri("http://www.w3.org/2000/01/rdf-schema#Resource")
public interface Resource {
	@Iri("http://www.w3.org/2002/07/owl#topObjectProperty")
	Set<Object> getOwlTopObjectProperty();
	@Iri("http://www.w3.org/2002/07/owl#topObjectProperty")
	void setOwlTopObjectProperty(Set<?> owlTopObjectProperty);

}
