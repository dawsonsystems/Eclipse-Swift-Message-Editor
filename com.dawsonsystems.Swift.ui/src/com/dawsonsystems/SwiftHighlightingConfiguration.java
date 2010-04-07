package com.dawsonsystems;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.ILexicalHighlightingConfiguration;
import org.eclipse.xtext.ui.core.editor.utils.TextStyle;

public class SwiftHighlightingConfiguration implements
	ILexicalHighlightingConfiguration {

	public static final String SEPERATOR_ID = "keyword";
	public static final String VM_STATEMENT = "vmStatement";
	
	public static final String VM_ID = "velocity";
	
	public static final String STR_ID = "string";
	public static final String QUOTEDSTR_ID = "quotedstring";
	
	public static final String DEFAULT_ID = "default";

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(SEPERATOR_ID, "Seperators", keywordTextStyle());
		acceptor.acceptDefaultHighlighting(VM_ID, "Velocity Variables", velocityTextStyle());
		acceptor.acceptDefaultHighlighting(STR_ID, "Static Text", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(VM_STATEMENT, "Velocity Syntax", velocitySyntaxTextStyle());
		acceptor.acceptDefaultHighlighting(QUOTEDSTR_ID, "Velocity String", velocityStringTextStyle());

	}

	public TextStyle keywordTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setStyle(SWT.BOLD);
		textStyle.setBackgroundColor(new RGB(231, 231, 231));
		return textStyle;
	}
	
	public TextStyle velocityStringTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(20, 20, 200));
		return textStyle;
	}
	
	
	public TextStyle velocitySyntaxTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(20, 200, 20));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	public TextStyle velocityTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(200, 20,20 ));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle defaultTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(150, 150, 150));
		return textStyle;
	}
	
}
