package org.robolectric.annotation;

/**
 * Indicates that a method is intended to be called by
 * {@link org.robolectric.RobolectricBase#reset()} to reset
 * the shadow's static state.
 */
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
public @interface Resetter {
}
