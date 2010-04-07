package com.dawsonsystems.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalSwiftLexer extends Lexer {
    public static final int RULE_QUOTEDSTRING=6;
    public static final int RULE_SIMPLEVMSTATEMENT=5;
    public static final int RULE_SIMPLEVMENTRY=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_BRACEDVMENTRY=8;
    public static final int Tokens=23;
    public static final int EOF=-1;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_STR=4;
    public static final int T12=12;
    public static final int T13=13;
    public static final int RULE_SYMBOLS=10;
    public static final int T14=14;
    public static final int T15=15;
    public static final int T16=16;
    public static final int RULE_SPACE=9;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalSwiftLexer() {;} 
    public InternalSwiftLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:10:5: ( '{' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:10:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:11:5: ( ':\\n' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:11:7: ':\\n'
            {
            match(":\n"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:12:5: ( '-}' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:12:7: '-}'
            {
            match("-}"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:13:5: ( ':' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:13:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:14:5: ( '}' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:14:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:15:5: ( '\\n' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:15:7: '\\n'
            {
            match('\n'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:16:5: ( '::' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:16:7: '::'
            {
            match("::"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:17:5: ( '/' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:17:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:18:5: ( '(' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:18:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:19:5: ( ')' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:19:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:20:5: ( '\"' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:20:7: '\"'
            {
            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start RULE_QUOTEDSTRING
    public final void mRULE_QUOTEDSTRING() throws RecognitionException {
        try {
            int _type = RULE_QUOTEDSTRING;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1671:19: ( ( '\"' | '\\'' ) ( . )* ( '\"' | '\\'' ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1671:21: ( '\"' | '\\'' ) ( . )* ( '\"' | '\\'' )
            {
            if ( input.LA(1)=='\"'||input.LA(1)=='\'' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1671:32: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\"'||LA1_0=='\'') ) {
                    alt1=2;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1671:32: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( input.LA(1)=='\"'||input.LA(1)=='\'' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_QUOTEDSTRING

    // $ANTLR start RULE_STR
    public final void mRULE_STR() throws RecognitionException {
        try {
            int _type = RULE_STR;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1673:10: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1673:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1673:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STR

    // $ANTLR start RULE_SYMBOLS
    public final void mRULE_SYMBOLS() throws RecognitionException {
        try {
            int _type = RULE_SYMBOLS;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1675:14: ( ( '=' | '-' | '_' | '+' | '<' | '>' | '!' )* )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1675:16: ( '=' | '-' | '_' | '+' | '<' | '>' | '!' )*
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1675:16: ( '=' | '-' | '_' | '+' | '<' | '>' | '!' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='!'||LA3_0=='+'||LA3_0=='-'||(LA3_0>='<' && LA3_0<='>')||LA3_0=='_') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:
            	    {
            	    if ( input.LA(1)=='!'||input.LA(1)=='+'||input.LA(1)=='-'||(input.LA(1)>='<' && input.LA(1)<='>')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SYMBOLS

    // $ANTLR start RULE_SIMPLEVMENTRY
    public final void mRULE_SIMPLEVMENTRY() throws RecognitionException {
        try {
            int _type = RULE_SIMPLEVMENTRY;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1677:20: ( '$' RULE_STR )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1677:22: '$' RULE_STR
            {
            match('$'); 
            mRULE_STR(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SIMPLEVMENTRY

    // $ANTLR start RULE_SIMPLEVMSTATEMENT
    public final void mRULE_SIMPLEVMSTATEMENT() throws RecognitionException {
        try {
            int _type = RULE_SIMPLEVMSTATEMENT;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1679:24: ( '#' RULE_STR ( RULE_SPACE )? )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1679:26: '#' RULE_STR ( RULE_SPACE )?
            {
            match('#'); 
            mRULE_STR(); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1679:39: ( RULE_SPACE )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==' ') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1679:39: RULE_SPACE
                    {
                    mRULE_SPACE(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SIMPLEVMSTATEMENT

    // $ANTLR start RULE_BRACEDVMENTRY
    public final void mRULE_BRACEDVMENTRY() throws RecognitionException {
        try {
            int _type = RULE_BRACEDVMENTRY;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1681:20: ( '$' '{' RULE_STR '}' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1681:22: '$' '{' RULE_STR '}'
            {
            match('$'); 
            match('{'); 
            mRULE_STR(); 
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_BRACEDVMENTRY

    // $ANTLR start RULE_SPACE
    public final void mRULE_SPACE() throws RecognitionException {
        try {
            int _type = RULE_SPACE;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1683:12: ( ' ' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1683:14: ' '
            {
            match(' '); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SPACE

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1685:16: ( . )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1685:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | RULE_QUOTEDSTRING | RULE_STR | RULE_SYMBOLS | RULE_SIMPLEVMENTRY | RULE_SIMPLEVMSTATEMENT | RULE_BRACEDVMENTRY | RULE_SPACE | RULE_ANY_OTHER )
        int alt5=19;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:54: RULE_QUOTEDSTRING
                {
                mRULE_QUOTEDSTRING(); 

                }
                break;
            case 13 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:72: RULE_STR
                {
                mRULE_STR(); 

                }
                break;
            case 14 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:81: RULE_SYMBOLS
                {
                mRULE_SYMBOLS(); 

                }
                break;
            case 15 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:94: RULE_SIMPLEVMENTRY
                {
                mRULE_SIMPLEVMENTRY(); 

                }
                break;
            case 16 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:113: RULE_SIMPLEVMSTATEMENT
                {
                mRULE_SIMPLEVMSTATEMENT(); 

                }
                break;
            case 17 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:136: RULE_BRACEDVMENTRY
                {
                mRULE_BRACEDVMENTRY(); 

                }
                break;
            case 18 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:155: RULE_SPACE
                {
                mRULE_SPACE(); 

                }
                break;
            case 19 :
                // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1:166: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\14\1\uffff\1\26\1\30\5\uffff\1\36\1\22\1\14\3\uffff\1\42\20\uffff"+
        "\1\14\4\uffff";
    static final String DFA5_eofS =
        "\45\uffff";
    static final String DFA5_minS =
        "\1\0\1\uffff\1\12\1\175\5\uffff\2\0\1\41\3\uffff\1\173\20\uffff"+
        "\1\41\4\uffff";
    static final String DFA5_maxS =
        "\1\ufffe\1\uffff\1\72\1\175\5\uffff\2\ufffe\1\137\3\uffff\1\173"+
        "\20\uffff\1\137\4\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\2\uffff\1\5\1\6\1\10\1\11\1\12\3\uffff\2\15\1\16\1"+
        "\uffff\1\20\1\22\1\23\1\1\1\2\1\7\1\4\1\3\1\16\1\5\1\6\1\10\1\11"+
        "\1\12\1\13\1\14\1\uffff\1\21\1\17\1\20\1\22";
    static final String DFA5_specialS =
        "\45\uffff}>";
    static final String[] DFA5_transitionS = {
            "\12\22\1\5\25\22\1\21\1\16\1\11\1\20\1\17\2\22\1\12\1\7\1\10"+
            "\1\22\1\16\1\22\1\3\1\22\1\6\12\15\1\2\1\22\3\16\2\22\32\15"+
            "\4\22\1\13\1\22\32\15\1\1\1\22\1\4\uff81\22",
            "",
            "\1\24\57\uffff\1\25",
            "\1\27",
            "",
            "",
            "",
            "",
            "",
            "\uffff\37",
            "\uffff\37",
            "\1\30\11\uffff\1\30\1\uffff\1\30\16\uffff\3\30\40\uffff\1\40",
            "",
            "",
            "",
            "\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\30\11\uffff\1\30\1\uffff\1\30\16\uffff\3\30\40\uffff\1\40",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | RULE_QUOTEDSTRING | RULE_STR | RULE_SYMBOLS | RULE_SIMPLEVMENTRY | RULE_SIMPLEVMSTATEMENT | RULE_BRACEDVMENTRY | RULE_SPACE | RULE_ANY_OTHER );";
        }
    }
 

}