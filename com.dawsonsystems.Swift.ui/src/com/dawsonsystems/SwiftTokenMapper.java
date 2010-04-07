package com.dawsonsystems;

import java.util.regex.Pattern;

import org.eclipse.xtext.ui.common.editor.syntaxcoloring.antlr.AbstractAntlrTokenToAttributeIdMapper;

public class SwiftTokenMapper extends AbstractAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		System.out.println("TOKEN=" + tokenName);
//		if(PUNCTUATION.matcher(tokenName).matches()) {
//			return SwiftHighlightingConfiguration.PUNCTUATION_ID;
//		}
		/*if(QUOTED.matcher(tokenName).matches()) {
			return SwiftHighlightingConfiguration.KEYWORD_ID;
		}*/
		/*if("RULE_STRING".equals(tokenName)) {
			return SwiftHighlightingConfiguration.STRING_ID;
		}
		if("RULE_INT".equals(tokenName)) {
			return SwiftHighlightingConfiguration.NUMBER_ID;
		}*/
		/*if("RULE_ML_COMMENT".equals(tokenName) | "RULE_SL_COMMENT".equals(tokenName)) {
			return SwiftHighlightingConfiguration.COMMENT_ID;
		}*/
		
		if("RULE_ID".equals(tokenName)) {
			return SwiftHighlightingConfiguration.STR_ID;
		}
		if("'/'".equals(tokenName)) {
			return SwiftHighlightingConfiguration.SEPERATOR_ID;
		}
		
		if("':'".equals(tokenName)) {
			return SwiftHighlightingConfiguration.SEPERATOR_ID;
		}
		if("'::'".equals(tokenName)) {
			return SwiftHighlightingConfiguration.SEPERATOR_ID;
		}
		if("RULE_SIMPLEVMENTRY".equals(tokenName) || "RULE_BRACEDVMENTRY".equals(tokenName)) {
			return SwiftHighlightingConfiguration.VM_ID;
		}
		if("RULE_QUOTEDSTRING".equals(tokenName)) {
			return SwiftHighlightingConfiguration.QUOTEDSTR_ID;
		}
		if ("RULE_SIMPLEVMSTATEMENT".equals(tokenName) || "RULE_BRACEDEVMSTATEMENT".equals(tokenName)) {
			return SwiftHighlightingConfiguration.VM_STATEMENT;
		}
		
		return SwiftHighlightingConfiguration.DEFAULT_ID;
	}
}
