package joint.codegen.owl;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import wwwc.nees.joint.compiler.annotations.Iri;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE, ElementType.PACKAGE})
public @interface intersectionOf {
	@Iri("http://www.w3.org/2002/07/owl#intersectionOf")
	String[] value();

}
