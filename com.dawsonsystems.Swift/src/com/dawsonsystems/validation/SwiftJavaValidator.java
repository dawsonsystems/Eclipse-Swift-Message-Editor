package com.dawsonsystems.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
 

public class SwiftJavaValidator extends AbstractDeclarativeValidator {
	@Override
    protected List<? extends EPackage> getEPackages() {
        List<EPackage> result = new ArrayList<EPackage>();
        //result.add(com.dawsonsystems.swift.SwiftPackage.eINSTANCE);
        return result;
    }
//	@Check
//	public void checkTypeNameStartsWithCapital(Type type) {
//		if (!Character.isUpperCase(type.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.TYPE__NAME);
//		}
//	}

}
