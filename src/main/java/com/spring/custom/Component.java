package com.spring.custom;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Indexed;

/**
 * Indicates that an annotated class is a "component". Such classes are
 * considered as candidates for auto-detection when using annotation-based
 * configuration and classpath scanning.
 *
 * <p>
 * Other class-level annotations may be considered as identifying a component as
 * well, typically a special kind of component: e.g. the
 * {@link Repository @Repository} annotation or AspectJ's
 * {@link org.aspectj.lang.annotation.Aspect @Aspect} annotation.
 *
 * @author Mark Fisher
 * @since 2.5
 * @see Repository
 * @see Service
 * @see Controller
 * @see org.springframework.context.annotation.ClassPathBeanDefinitionScanner
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Indexed
public @interface Component {

	/**
	 * The value may indicate a suggestion for a logical component name, to be
	 * turned into a Spring bean in case of an autodetected component.
	 * 
	 * @return the suggested component name, if any (or empty String otherwise)
	 */
	String value() default "";

}
