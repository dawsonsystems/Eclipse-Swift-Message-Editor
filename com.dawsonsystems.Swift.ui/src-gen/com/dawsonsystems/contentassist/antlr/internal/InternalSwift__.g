lexer grammar InternalSwift;
@header {
package com.dawsonsystems.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T12 : '{' ;
T13 : ':\n' ;
T14 : '-}' ;
T15 : ':' ;
T16 : '}' ;
T17 : '\n' ;
T18 : '::' ;
T19 : '/' ;
T20 : '(' ;
T21 : ')' ;
T22 : '"' ;

// $ANTLR src "../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g" 1671
RULE_QUOTEDSTRING : ('"'|'\'') .* ('"'|'\'');

// $ANTLR src "../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g" 1673
RULE_STR : ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g" 1675
RULE_SYMBOLS : ('='|'-'|'_'|'+'|'<'|'>'|'!')*;

// $ANTLR src "../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g" 1677
RULE_SIMPLEVMENTRY : '$' RULE_STR;

// $ANTLR src "../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g" 1679
RULE_SIMPLEVMSTATEMENT : '#' RULE_STR RULE_SPACE?;

// $ANTLR src "../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g" 1681
RULE_BRACEDVMENTRY : '$' '{' RULE_STR '}';

// $ANTLR src "../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g" 1683
RULE_SPACE : ' ';

// $ANTLR src "../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g" 1685
RULE_ANY_OTHER : .;


