lexer grammar InternalSwift;
@header {
package com.dawsonsystems.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
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

// $ANTLR src "../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g" 833
RULE_QUOTEDSTRING : ('"'|'\'') .* ('"'|'\'');

// $ANTLR src "../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g" 835
RULE_STR : ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g" 837
RULE_SYMBOLS : ('='|'-'|'_'|'+'|'<'|'>'|'!')*;

// $ANTLR src "../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g" 839
RULE_SIMPLEVMENTRY : '$' RULE_STR;

// $ANTLR src "../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g" 841
RULE_SIMPLEVMSTATEMENT : '#' RULE_STR RULE_SPACE?;

// $ANTLR src "../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g" 843
RULE_BRACEDVMENTRY : '$' '{' RULE_STR '}';

// $ANTLR src "../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g" 845
RULE_SPACE : ' ';

// $ANTLR src "../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g" 847
RULE_ANY_OTHER : .;


