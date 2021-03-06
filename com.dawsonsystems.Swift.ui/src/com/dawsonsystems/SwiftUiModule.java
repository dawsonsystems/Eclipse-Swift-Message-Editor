/*
 * generated by Xtext
 */
package com.dawsonsystems;

import org.eclipse.xtext.ui.common.editor.syntaxcoloring.ILexicalHighlightingConfiguration;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.ISemanticHighlightingConfiguration;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.antlr.AbstractAntlrTokenToAttributeIdMapper;


/**
 * Use this class to register components to be used within the IDE.
 */
public class SwiftUiModule extends com.dawsonsystems.AbstractSwiftUiModule {

	public Class<? extends ILexicalHighlightingConfiguration> bindILexicalHighlightingConfiguration() {
		return SwiftHighlightingConfiguration.class;
	}
	
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return SwiftTokenMapper.class;
	}
}
