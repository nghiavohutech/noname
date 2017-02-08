package liam.base.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by nghiavo on 2/7/17.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationContext {
}
