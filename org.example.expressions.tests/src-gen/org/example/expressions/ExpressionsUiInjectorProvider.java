/*
* generated by Xtext
*/
package org.example.expressions;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ExpressionsUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.example.expressions.ui.internal.ExpressionsActivator.getInstance().getInjector("org.example.expressions.Expressions");
	}
	
}