/**
 * Created on Sep 20, 2011
 */
package com.apress.prospring3.ch4;

/**
 * @author Clarence
 *
 */
public class ConstructorInjection {

    private Dependency dependency;
    
    public ConstructorInjection(Dependency dependency) {
        this.dependency = dependency;
    }	
	
}
