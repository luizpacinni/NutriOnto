package joint.codegen.rdfs;

import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import wwwc.nees.joint.compiler.annotations.Iri;
import wwwc.nees.joint.model.JOINTResource;
import wwwc.nees.joint.module.kao.LazyLoader;

public class ResourceImpl extends JOINTResource implements Resource, Serializable {

public ResourceImpl(){
	this.innerModifiedFields = new ArrayList<String>();
}
	private Set<Object> owlTopObjectProperty;

	@Iri("http://www.w3.org/2002/07/owl#topObjectProperty")
	public Set<Object> getOwlTopObjectProperty(){
		if(!this.isLazyLoaded())
			 LazyLoader.loadObject(this, this.getClass().getName());
		return this.owlTopObjectProperty;
	}
	@Iri("http://www.w3.org/2002/07/owl#topObjectProperty")
	public void setOwlTopObjectProperty(Set<?> owlTopObjectProperty){
		if(!this.isLazyLoaded())
			 LazyLoader.loadObject(this, this.getClass().getName());
		 this.innerModifiedFields.add("OwlTopObjectProperty");
		 this.owlTopObjectProperty = (Set<Object>) owlTopObjectProperty;
	}

}
