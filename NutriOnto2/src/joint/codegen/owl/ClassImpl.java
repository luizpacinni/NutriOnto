package joint.codegen.owl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import wwwc.nees.joint.model.JOINTResource;
import wwwc.nees.joint.module.kao.LazyLoader;

public class ClassImpl extends JOINTResource implements Class, Serializable {

public ClassImpl(){
	this.innerModifiedFields = new ArrayList<String>();
}
}
