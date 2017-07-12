package ro.teamnet.zth.api.annotations;



/**
 * Created by Andreea.Puscasu on 7/12/2017.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
@Target(TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface Table {
    String name() default "";
}
