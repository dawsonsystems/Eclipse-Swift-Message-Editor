package com.dawsonsystems.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import com.dawsonsystems.services.SwiftGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalSwiftParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STR", "RULE_SIMPLEVMSTATEMENT", "RULE_SPACE", "RULE_QUOTEDSTRING", "RULE_SYMBOLS", "RULE_SIMPLEVMENTRY", "RULE_BRACEDVMENTRY", "RULE_ANY_OTHER", "'{'", "':\\n'", "'-}'", "':'", "'}'", "'\\n'", "'::'", "'/'", "'('", "')'", "'\"'"
    };
    public static final int RULE_SIMPLEVMSTATEMENT=5;
    public static final int RULE_QUOTEDSTRING=7;
    public static final int RULE_SIMPLEVMENTRY=9;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_BRACEDVMENTRY=10;
    public static final int RULE_STR=4;
    public static final int RULE_SYMBOLS=8;
    public static final int EOF=-1;
    public static final int RULE_SPACE=6;

        public InternalSwiftParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g"; }


     
     	private SwiftGrammarAccess grammarAccess;
     	
        public InternalSwiftParser(TokenStream input, IAstFactory factory, SwiftGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("com/dawsonsystems/parser/antlr/internal/InternalSwift.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Message";	
       	} 



    // $ANTLR start entryRuleMessage
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:72:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:72:49: (iv_ruleMessage= ruleMessage EOF )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:73:2: iv_ruleMessage= ruleMessage EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMessageRule(), currentNode); 
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage73);
            iv_ruleMessage=ruleMessage();
            _fsp--;

             current =iv_ruleMessage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage83); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMessage


    // $ANTLR start ruleMessage
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:80:1: ruleMessage returns [EObject current=null] : ( (lv_elements_0= ( ruleBeginningLine | ruleComplexBeginningLine ) )+ '{' RULE_STR ':\\n' (lv_elements_4= ruleLine )+ '-}' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token lv_elements_0=null;
        AntlrDatatypeRuleToken lv_elements_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:85:6: ( ( (lv_elements_0= ( ruleBeginningLine | ruleComplexBeginningLine ) )+ '{' RULE_STR ':\\n' (lv_elements_4= ruleLine )+ '-}' ) )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:86:1: ( (lv_elements_0= ( ruleBeginningLine | ruleComplexBeginningLine ) )+ '{' RULE_STR ':\\n' (lv_elements_4= ruleLine )+ '-}' )
            {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:86:1: ( (lv_elements_0= ( ruleBeginningLine | ruleComplexBeginningLine ) )+ '{' RULE_STR ':\\n' (lv_elements_4= ruleLine )+ '-}' )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:86:2: (lv_elements_0= ( ruleBeginningLine | ruleComplexBeginningLine ) )+ '{' RULE_STR ':\\n' (lv_elements_4= ruleLine )+ '-}'
            {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:86:2: (lv_elements_0= ( ruleBeginningLine | ruleComplexBeginningLine ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==RULE_STR) ) {
                        int LA2_2 = input.LA(3);

                        if ( (LA2_2==15) ) {
                            alt2=1;
                        }


                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:88:6: lv_elements_0= ( ruleBeginningLine | ruleComplexBeginningLine )
            	    {
            	    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:88:20: ( ruleBeginningLine | ruleComplexBeginningLine )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==12) ) {
            	        int LA1_1 = input.LA(2);

            	        if ( (LA1_1==RULE_STR) ) {
            	            int LA1_2 = input.LA(3);

            	            if ( (LA1_2==15) ) {
            	                int LA1_3 = input.LA(4);

            	                if ( (LA1_3==RULE_STR||(LA1_3>=RULE_SIMPLEVMENTRY && LA1_3<=RULE_BRACEDVMENTRY)||LA1_3==16||LA1_3==22) ) {
            	                    alt1=1;
            	                }
            	                else if ( (LA1_3==12) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("88:20: ( ruleBeginningLine | ruleComplexBeginningLine )", 1, 3, input);

            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("88:20: ( ruleBeginningLine | ruleComplexBeginningLine )", 1, 2, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("88:20: ( ruleBeginningLine | ruleComplexBeginningLine )", 1, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("88:20: ( ruleBeginningLine | ruleComplexBeginningLine )", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:88:22: ruleBeginningLine
            	            {
            	             
            	                    currentNode=createCompositeNode(grammarAccess.getMessageAccess().getElementsBeginningLineParserRuleCall_0_0_0(), currentNode); 
            	                
            	            pushFollow(FOLLOW_ruleBeginningLine_in_ruleMessage134);
            	            ruleBeginningLine();
            	            _fsp--;

            	             
            	                    currentNode = currentNode.getParent();
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:95:7: ruleComplexBeginningLine
            	            {
            	             
            	                    currentNode=createCompositeNode(grammarAccess.getMessageAccess().getElementsComplexBeginningLineParserRuleCall_0_0_1(), currentNode); 
            	                
            	            pushFollow(FOLLOW_ruleComplexBeginningLine_in_ruleMessage148);
            	            ruleComplexBeginningLine();
            	            _fsp--;

            	             
            	                    currentNode = currentNode.getParent();
            	                

            	            }
            	            break;

            	    }


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMessageRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "elements", lv_elements_0, null, lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match(input,12,FOLLOW_12_in_ruleMessage167); 

                    createLeafNode(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            match(input,RULE_STR,FOLLOW_RULE_STR_in_ruleMessage176); 
             
                createLeafNode(grammarAccess.getMessageAccess().getSTRTerminalRuleCall_2(), null); 
                
            match(input,13,FOLLOW_13_in_ruleMessage184); 

                    createLeafNode(grammarAccess.getMessageAccess().getColonKeyword_3(), null); 
                
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:128:1: (lv_elements_4= ruleLine )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_SIMPLEVMSTATEMENT||LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:131:6: lv_elements_4= ruleLine
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMessageAccess().getElementsLineParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLine_in_ruleMessage218);
            	    lv_elements_4=ruleLine();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMessageRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "elements", lv_elements_4, "Line", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match(input,14,FOLLOW_14_in_ruleMessage232); 

                    createLeafNode(grammarAccess.getMessageAccess().getHyphenMinusRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMessage


    // $ANTLR start entryRuleComplexBeginningLine
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:160:1: entryRuleComplexBeginningLine returns [String current=null] : iv_ruleComplexBeginningLine= ruleComplexBeginningLine EOF ;
    public final String entryRuleComplexBeginningLine() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComplexBeginningLine = null;


        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:160:61: (iv_ruleComplexBeginningLine= ruleComplexBeginningLine EOF )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:161:2: iv_ruleComplexBeginningLine= ruleComplexBeginningLine EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComplexBeginningLineRule(), currentNode); 
            pushFollow(FOLLOW_ruleComplexBeginningLine_in_entryRuleComplexBeginningLine266);
            iv_ruleComplexBeginningLine=ruleComplexBeginningLine();
            _fsp--;

             current =iv_ruleComplexBeginningLine.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexBeginningLine277); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleComplexBeginningLine


    // $ANTLR start ruleComplexBeginningLine
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:168:1: ruleComplexBeginningLine returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_STR_1= RULE_STR kw= ':' this_BeginningLine_3= ruleBeginningLine kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleComplexBeginningLine() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STR_1=null;
        AntlrDatatypeRuleToken this_BeginningLine_3 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:174:6: ( (kw= '{' this_STR_1= RULE_STR kw= ':' this_BeginningLine_3= ruleBeginningLine kw= '}' ) )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:175:1: (kw= '{' this_STR_1= RULE_STR kw= ':' this_BeginningLine_3= ruleBeginningLine kw= '}' )
            {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:175:1: (kw= '{' this_STR_1= RULE_STR kw= ':' this_BeginningLine_3= ruleBeginningLine kw= '}' )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:176:2: kw= '{' this_STR_1= RULE_STR kw= ':' this_BeginningLine_3= ruleBeginningLine kw= '}'
            {
            kw=(Token)input.LT(1);
            match(input,12,FOLLOW_12_in_ruleComplexBeginningLine315); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getComplexBeginningLineAccess().getLeftCurlyBracketKeyword_0(), null); 
                
            this_STR_1=(Token)input.LT(1);
            match(input,RULE_STR,FOLLOW_RULE_STR_in_ruleComplexBeginningLine330); 

            		current.merge(this_STR_1);
                
             
                createLeafNode(grammarAccess.getComplexBeginningLineAccess().getSTRTerminalRuleCall_1(), null); 
                
            kw=(Token)input.LT(1);
            match(input,15,FOLLOW_15_in_ruleComplexBeginningLine348); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getComplexBeginningLineAccess().getColonKeyword_2(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getComplexBeginningLineAccess().getBeginningLineParserRuleCall_3(), currentNode); 
                
            pushFollow(FOLLOW_ruleBeginningLine_in_ruleComplexBeginningLine370);
            this_BeginningLine_3=ruleBeginningLine();
            _fsp--;


            		current.merge(this_BeginningLine_3);
                
             
                    currentNode = currentNode.getParent();
                
            kw=(Token)input.LT(1);
            match(input,16,FOLLOW_16_in_ruleComplexBeginningLine388); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getComplexBeginningLineAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleComplexBeginningLine


    // $ANTLR start entryRuleBeginningLine
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:219:1: entryRuleBeginningLine returns [String current=null] : iv_ruleBeginningLine= ruleBeginningLine EOF ;
    public final String entryRuleBeginningLine() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBeginningLine = null;


        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:219:54: (iv_ruleBeginningLine= ruleBeginningLine EOF )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:220:2: iv_ruleBeginningLine= ruleBeginningLine EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBeginningLineRule(), currentNode); 
            pushFollow(FOLLOW_ruleBeginningLine_in_entryRuleBeginningLine427);
            iv_ruleBeginningLine=ruleBeginningLine();
            _fsp--;

             current =iv_ruleBeginningLine.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeginningLine438); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBeginningLine


    // $ANTLR start ruleBeginningLine
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:227:1: ruleBeginningLine returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_STR_1= RULE_STR kw= ':' this_Statement_3= ruleStatement kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleBeginningLine() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STR_1=null;
        AntlrDatatypeRuleToken this_Statement_3 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:233:6: ( (kw= '{' this_STR_1= RULE_STR kw= ':' this_Statement_3= ruleStatement kw= '}' ) )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:234:1: (kw= '{' this_STR_1= RULE_STR kw= ':' this_Statement_3= ruleStatement kw= '}' )
            {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:234:1: (kw= '{' this_STR_1= RULE_STR kw= ':' this_Statement_3= ruleStatement kw= '}' )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:235:2: kw= '{' this_STR_1= RULE_STR kw= ':' this_Statement_3= ruleStatement kw= '}'
            {
            kw=(Token)input.LT(1);
            match(input,12,FOLLOW_12_in_ruleBeginningLine476); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getBeginningLineAccess().getLeftCurlyBracketKeyword_0(), null); 
                
            this_STR_1=(Token)input.LT(1);
            match(input,RULE_STR,FOLLOW_RULE_STR_in_ruleBeginningLine491); 

            		current.merge(this_STR_1);
                
             
                createLeafNode(grammarAccess.getBeginningLineAccess().getSTRTerminalRuleCall_1(), null); 
                
            kw=(Token)input.LT(1);
            match(input,15,FOLLOW_15_in_ruleBeginningLine509); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getBeginningLineAccess().getColonKeyword_2(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getBeginningLineAccess().getStatementParserRuleCall_3(), currentNode); 
                
            pushFollow(FOLLOW_ruleStatement_in_ruleBeginningLine531);
            this_Statement_3=ruleStatement();
            _fsp--;


            		current.merge(this_Statement_3);
                
             
                    currentNode = currentNode.getParent();
                
            kw=(Token)input.LT(1);
            match(input,16,FOLLOW_16_in_ruleBeginningLine549); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getBeginningLineAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBeginningLine


    // $ANTLR start entryRuleLine
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:278:1: entryRuleLine returns [String current=null] : iv_ruleLine= ruleLine EOF ;
    public final String entryRuleLine() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLine = null;


        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:278:45: (iv_ruleLine= ruleLine EOF )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:279:2: iv_ruleLine= ruleLine EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLineRule(), currentNode); 
            pushFollow(FOLLOW_ruleLine_in_entryRuleLine588);
            iv_ruleLine=ruleLine();
            _fsp--;

             current =iv_ruleLine.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLine599); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLine


    // $ANTLR start ruleLine
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:286:1: ruleLine returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_SimpleLine_0= ruleSimpleLine | this_ComplexLine_1= ruleComplexLine | this_VmStatement_2= ruleVmStatement ) (kw= '\\n' )? ) ;
    public final AntlrDatatypeRuleToken ruleLine() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SimpleLine_0 = null;

        AntlrDatatypeRuleToken this_ComplexLine_1 = null;

        AntlrDatatypeRuleToken this_VmStatement_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:292:6: ( ( (this_SimpleLine_0= ruleSimpleLine | this_ComplexLine_1= ruleComplexLine | this_VmStatement_2= ruleVmStatement ) (kw= '\\n' )? ) )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:293:1: ( (this_SimpleLine_0= ruleSimpleLine | this_ComplexLine_1= ruleComplexLine | this_VmStatement_2= ruleVmStatement ) (kw= '\\n' )? )
            {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:293:1: ( (this_SimpleLine_0= ruleSimpleLine | this_ComplexLine_1= ruleComplexLine | this_VmStatement_2= ruleVmStatement ) (kw= '\\n' )? )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:293:2: (this_SimpleLine_0= ruleSimpleLine | this_ComplexLine_1= ruleComplexLine | this_VmStatement_2= ruleVmStatement ) (kw= '\\n' )?
            {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:293:2: (this_SimpleLine_0= ruleSimpleLine | this_ComplexLine_1= ruleComplexLine | this_VmStatement_2= ruleVmStatement )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                switch ( input.LA(2) ) {
                case RULE_SIMPLEVMENTRY:
                    {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==18) ) {
                        alt4=2;
                    }
                    else if ( (LA4_3==15) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("293:2: (this_SimpleLine_0= ruleSimpleLine | this_ComplexLine_1= ruleComplexLine | this_VmStatement_2= ruleVmStatement )", 4, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_BRACEDVMENTRY:
                    {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==18) ) {
                        alt4=2;
                    }
                    else if ( (LA4_4==15) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("293:2: (this_SimpleLine_0= ruleSimpleLine | this_ComplexLine_1= ruleComplexLine | this_VmStatement_2= ruleVmStatement )", 4, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_STR:
                    {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==15) ) {
                        alt4=1;
                    }
                    else if ( (LA4_5==18) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("293:2: (this_SimpleLine_0= ruleSimpleLine | this_ComplexLine_1= ruleComplexLine | this_VmStatement_2= ruleVmStatement )", 4, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("293:2: (this_SimpleLine_0= ruleSimpleLine | this_ComplexLine_1= ruleComplexLine | this_VmStatement_2= ruleVmStatement )", 4, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA4_0==RULE_SIMPLEVMSTATEMENT) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("293:2: (this_SimpleLine_0= ruleSimpleLine | this_ComplexLine_1= ruleComplexLine | this_VmStatement_2= ruleVmStatement )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:294:5: this_SimpleLine_0= ruleSimpleLine
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLineAccess().getSimpleLineParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleLine_in_ruleLine647);
                    this_SimpleLine_0=ruleSimpleLine();
                    _fsp--;


                    		current.merge(this_SimpleLine_0);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:306:5: this_ComplexLine_1= ruleComplexLine
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLineAccess().getComplexLineParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleComplexLine_in_ruleLine680);
                    this_ComplexLine_1=ruleComplexLine();
                    _fsp--;


                    		current.merge(this_ComplexLine_1);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:318:5: this_VmStatement_2= ruleVmStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLineAccess().getVmStatementParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVmStatement_in_ruleLine713);
                    this_VmStatement_2=ruleVmStatement();
                    _fsp--;


                    		current.merge(this_VmStatement_2);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:328:2: (kw= '\\n' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:329:2: kw= '\\n'
                    {
                    kw=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleLine733); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getLineAccess().getKeyword_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLine


    // $ANTLR start entryRuleSimpleLine
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:342:1: entryRuleSimpleLine returns [String current=null] : iv_ruleSimpleLine= ruleSimpleLine EOF ;
    public final String entryRuleSimpleLine() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleLine = null;


        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:342:51: (iv_ruleSimpleLine= ruleSimpleLine EOF )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:343:2: iv_ruleSimpleLine= ruleSimpleLine EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleLineRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleLine_in_entryRuleSimpleLine774);
            iv_ruleSimpleLine=ruleSimpleLine();
            _fsp--;

             current =iv_ruleSimpleLine.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleLine785); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimpleLine


    // $ANTLR start ruleSimpleLine
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:350:1: ruleSimpleLine returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' (this_VmEntry_1= ruleVmEntry | this_STR_2= RULE_STR ) kw= ':' (this_VmEntry_4= ruleVmEntry | this_STR_5= RULE_STR ) ) ;
    public final AntlrDatatypeRuleToken ruleSimpleLine() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STR_2=null;
        Token this_STR_5=null;
        AntlrDatatypeRuleToken this_VmEntry_1 = null;

        AntlrDatatypeRuleToken this_VmEntry_4 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:356:6: ( (kw= ':' (this_VmEntry_1= ruleVmEntry | this_STR_2= RULE_STR ) kw= ':' (this_VmEntry_4= ruleVmEntry | this_STR_5= RULE_STR ) ) )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:357:1: (kw= ':' (this_VmEntry_1= ruleVmEntry | this_STR_2= RULE_STR ) kw= ':' (this_VmEntry_4= ruleVmEntry | this_STR_5= RULE_STR ) )
            {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:357:1: (kw= ':' (this_VmEntry_1= ruleVmEntry | this_STR_2= RULE_STR ) kw= ':' (this_VmEntry_4= ruleVmEntry | this_STR_5= RULE_STR ) )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:358:2: kw= ':' (this_VmEntry_1= ruleVmEntry | this_STR_2= RULE_STR ) kw= ':' (this_VmEntry_4= ruleVmEntry | this_STR_5= RULE_STR )
            {
            kw=(Token)input.LT(1);
            match(input,15,FOLLOW_15_in_ruleSimpleLine823); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getSimpleLineAccess().getColonKeyword_0(), null); 
                
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:363:1: (this_VmEntry_1= ruleVmEntry | this_STR_2= RULE_STR )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_SIMPLEVMENTRY && LA6_0<=RULE_BRACEDVMENTRY)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STR) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("363:1: (this_VmEntry_1= ruleVmEntry | this_STR_2= RULE_STR )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:364:5: this_VmEntry_1= ruleVmEntry
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSimpleLineAccess().getVmEntryParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVmEntry_in_ruleSimpleLine846);
                    this_VmEntry_1=ruleVmEntry();
                    _fsp--;


                    		current.merge(this_VmEntry_1);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:375:10: this_STR_2= RULE_STR
                    {
                    this_STR_2=(Token)input.LT(1);
                    match(input,RULE_STR,FOLLOW_RULE_STR_in_ruleSimpleLine872); 

                    		current.merge(this_STR_2);
                        
                     
                        createLeafNode(grammarAccess.getSimpleLineAccess().getSTRTerminalRuleCall_1_1(), null); 
                        

                    }
                    break;

            }

            kw=(Token)input.LT(1);
            match(input,15,FOLLOW_15_in_ruleSimpleLine891); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getSimpleLineAccess().getColonKeyword_2(), null); 
                
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:388:1: (this_VmEntry_4= ruleVmEntry | this_STR_5= RULE_STR )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_SIMPLEVMENTRY && LA7_0<=RULE_BRACEDVMENTRY)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STR) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("388:1: (this_VmEntry_4= ruleVmEntry | this_STR_5= RULE_STR )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:389:5: this_VmEntry_4= ruleVmEntry
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSimpleLineAccess().getVmEntryParserRuleCall_3_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVmEntry_in_ruleSimpleLine914);
                    this_VmEntry_4=ruleVmEntry();
                    _fsp--;


                    		current.merge(this_VmEntry_4);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:400:10: this_STR_5= RULE_STR
                    {
                    this_STR_5=(Token)input.LT(1);
                    match(input,RULE_STR,FOLLOW_RULE_STR_in_ruleSimpleLine940); 

                    		current.merge(this_STR_5);
                        
                     
                        createLeafNode(grammarAccess.getSimpleLineAccess().getSTRTerminalRuleCall_3_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSimpleLine


    // $ANTLR start entryRuleComplexLine
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:415:1: entryRuleComplexLine returns [String current=null] : iv_ruleComplexLine= ruleComplexLine EOF ;
    public final String entryRuleComplexLine() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComplexLine = null;


        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:415:52: (iv_ruleComplexLine= ruleComplexLine EOF )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:416:2: iv_ruleComplexLine= ruleComplexLine EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComplexLineRule(), currentNode); 
            pushFollow(FOLLOW_ruleComplexLine_in_entryRuleComplexLine985);
            iv_ruleComplexLine=ruleComplexLine();
            _fsp--;

             current =iv_ruleComplexLine.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexLine996); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleComplexLine


    // $ANTLR start ruleComplexLine
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:423:1: ruleComplexLine returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' (this_VmEntry_1= ruleVmEntry | this_STR_2= RULE_STR ) kw= '::' this_Statement_4= ruleStatement kw= '/' (this_Statement_6= ruleStatement )? (kw= '/' )? (this_Statement_8= ruleStatement )? (kw= '/' )? (this_Statement_10= ruleStatement )? (kw= '/' )? (this_Statement_12= ruleStatement )? ) ;
    public final AntlrDatatypeRuleToken ruleComplexLine() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STR_2=null;
        AntlrDatatypeRuleToken this_VmEntry_1 = null;

        AntlrDatatypeRuleToken this_Statement_4 = null;

        AntlrDatatypeRuleToken this_Statement_6 = null;

        AntlrDatatypeRuleToken this_Statement_8 = null;

        AntlrDatatypeRuleToken this_Statement_10 = null;

        AntlrDatatypeRuleToken this_Statement_12 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:429:6: ( (kw= ':' (this_VmEntry_1= ruleVmEntry | this_STR_2= RULE_STR ) kw= '::' this_Statement_4= ruleStatement kw= '/' (this_Statement_6= ruleStatement )? (kw= '/' )? (this_Statement_8= ruleStatement )? (kw= '/' )? (this_Statement_10= ruleStatement )? (kw= '/' )? (this_Statement_12= ruleStatement )? ) )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:430:1: (kw= ':' (this_VmEntry_1= ruleVmEntry | this_STR_2= RULE_STR ) kw= '::' this_Statement_4= ruleStatement kw= '/' (this_Statement_6= ruleStatement )? (kw= '/' )? (this_Statement_8= ruleStatement )? (kw= '/' )? (this_Statement_10= ruleStatement )? (kw= '/' )? (this_Statement_12= ruleStatement )? )
            {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:430:1: (kw= ':' (this_VmEntry_1= ruleVmEntry | this_STR_2= RULE_STR ) kw= '::' this_Statement_4= ruleStatement kw= '/' (this_Statement_6= ruleStatement )? (kw= '/' )? (this_Statement_8= ruleStatement )? (kw= '/' )? (this_Statement_10= ruleStatement )? (kw= '/' )? (this_Statement_12= ruleStatement )? )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:431:2: kw= ':' (this_VmEntry_1= ruleVmEntry | this_STR_2= RULE_STR ) kw= '::' this_Statement_4= ruleStatement kw= '/' (this_Statement_6= ruleStatement )? (kw= '/' )? (this_Statement_8= ruleStatement )? (kw= '/' )? (this_Statement_10= ruleStatement )? (kw= '/' )? (this_Statement_12= ruleStatement )?
            {
            kw=(Token)input.LT(1);
            match(input,15,FOLLOW_15_in_ruleComplexLine1034); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getComplexLineAccess().getColonKeyword_0(), null); 
                
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:436:1: (this_VmEntry_1= ruleVmEntry | this_STR_2= RULE_STR )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_SIMPLEVMENTRY && LA8_0<=RULE_BRACEDVMENTRY)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STR) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("436:1: (this_VmEntry_1= ruleVmEntry | this_STR_2= RULE_STR )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:437:5: this_VmEntry_1= ruleVmEntry
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getComplexLineAccess().getVmEntryParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVmEntry_in_ruleComplexLine1057);
                    this_VmEntry_1=ruleVmEntry();
                    _fsp--;


                    		current.merge(this_VmEntry_1);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:448:10: this_STR_2= RULE_STR
                    {
                    this_STR_2=(Token)input.LT(1);
                    match(input,RULE_STR,FOLLOW_RULE_STR_in_ruleComplexLine1083); 

                    		current.merge(this_STR_2);
                        
                     
                        createLeafNode(grammarAccess.getComplexLineAccess().getSTRTerminalRuleCall_1_1(), null); 
                        

                    }
                    break;

            }

            kw=(Token)input.LT(1);
            match(input,18,FOLLOW_18_in_ruleComplexLine1102); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getComplexLineAccess().getColonColonKeyword_2(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getComplexLineAccess().getStatementParserRuleCall_3(), currentNode); 
                
            pushFollow(FOLLOW_ruleStatement_in_ruleComplexLine1124);
            this_Statement_4=ruleStatement();
            _fsp--;


            		current.merge(this_Statement_4);
                
             
                    currentNode = currentNode.getParent();
                
            kw=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_ruleComplexLine1142); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getComplexLineAccess().getSolidusKeyword_4(), null); 
                
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:478:1: (this_Statement_6= ruleStatement )?
            int alt9=2;
            switch ( input.LA(1) ) {
                case RULE_SIMPLEVMENTRY:
                    {
                    alt9=1;
                    }
                    break;
                case RULE_BRACEDVMENTRY:
                    {
                    alt9=1;
                    }
                    break;
                case 22:
                    {
                    alt9=1;
                    }
                    break;
                case RULE_STR:
                    {
                    alt9=1;
                    }
                    break;
                case 19:
                    {
                    alt9=1;
                    }
                    break;
                case 17:
                    {
                    alt9=1;
                    }
                    break;
                case 14:
                    {
                    alt9=1;
                    }
                    break;
                case 15:
                    {
                    alt9=1;
                    }
                    break;
                case RULE_SIMPLEVMSTATEMENT:
                    {
                    alt9=1;
                    }
                    break;
                case EOF:
                    {
                    alt9=1;
                    }
                    break;
            }

            switch (alt9) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:479:5: this_Statement_6= ruleStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getComplexLineAccess().getStatementParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStatement_in_ruleComplexLine1165);
                    this_Statement_6=ruleStatement();
                    _fsp--;


                    		current.merge(this_Statement_6);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:489:3: (kw= '/' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:490:2: kw= '/'
                    {
                    kw=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleComplexLine1186); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getComplexLineAccess().getSolidusKeyword_6(), null); 
                        

                    }
                    break;

            }

            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:495:3: (this_Statement_8= ruleStatement )?
            int alt11=2;
            switch ( input.LA(1) ) {
                case RULE_SIMPLEVMENTRY:
                    {
                    alt11=1;
                    }
                    break;
                case RULE_BRACEDVMENTRY:
                    {
                    alt11=1;
                    }
                    break;
                case 22:
                    {
                    alt11=1;
                    }
                    break;
                case RULE_STR:
                    {
                    alt11=1;
                    }
                    break;
                case 19:
                    {
                    alt11=1;
                    }
                    break;
                case 17:
                    {
                    alt11=1;
                    }
                    break;
                case 14:
                    {
                    alt11=1;
                    }
                    break;
                case 15:
                    {
                    alt11=1;
                    }
                    break;
                case RULE_SIMPLEVMSTATEMENT:
                    {
                    alt11=1;
                    }
                    break;
                case EOF:
                    {
                    alt11=1;
                    }
                    break;
            }

            switch (alt11) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:496:5: this_Statement_8= ruleStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getComplexLineAccess().getStatementParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStatement_in_ruleComplexLine1211);
                    this_Statement_8=ruleStatement();
                    _fsp--;


                    		current.merge(this_Statement_8);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:506:3: (kw= '/' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:507:2: kw= '/'
                    {
                    kw=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleComplexLine1232); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getComplexLineAccess().getSolidusKeyword_8(), null); 
                        

                    }
                    break;

            }

            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:512:3: (this_Statement_10= ruleStatement )?
            int alt13=2;
            switch ( input.LA(1) ) {
                case RULE_SIMPLEVMENTRY:
                    {
                    alt13=1;
                    }
                    break;
                case RULE_BRACEDVMENTRY:
                    {
                    alt13=1;
                    }
                    break;
                case 22:
                    {
                    alt13=1;
                    }
                    break;
                case RULE_STR:
                    {
                    alt13=1;
                    }
                    break;
                case 19:
                    {
                    alt13=1;
                    }
                    break;
                case 17:
                    {
                    alt13=1;
                    }
                    break;
                case 14:
                    {
                    alt13=1;
                    }
                    break;
                case 15:
                    {
                    alt13=1;
                    }
                    break;
                case RULE_SIMPLEVMSTATEMENT:
                    {
                    alt13=1;
                    }
                    break;
                case EOF:
                    {
                    alt13=1;
                    }
                    break;
            }

            switch (alt13) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:513:5: this_Statement_10= ruleStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getComplexLineAccess().getStatementParserRuleCall_9(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStatement_in_ruleComplexLine1257);
                    this_Statement_10=ruleStatement();
                    _fsp--;


                    		current.merge(this_Statement_10);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:523:3: (kw= '/' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:524:2: kw= '/'
                    {
                    kw=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleComplexLine1278); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getComplexLineAccess().getSolidusKeyword_10(), null); 
                        

                    }
                    break;

            }

            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:529:3: (this_Statement_12= ruleStatement )?
            int alt15=2;
            switch ( input.LA(1) ) {
                case RULE_STR:
                case RULE_SIMPLEVMENTRY:
                case RULE_BRACEDVMENTRY:
                case 22:
                    {
                    alt15=1;
                    }
                    break;
                case 17:
                    {
                    alt15=1;
                    }
                    break;
                case 14:
                    {
                    alt15=1;
                    }
                    break;
                case 15:
                    {
                    alt15=1;
                    }
                    break;
                case RULE_SIMPLEVMSTATEMENT:
                    {
                    alt15=1;
                    }
                    break;
                case EOF:
                    {
                    alt15=1;
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:530:5: this_Statement_12= ruleStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getComplexLineAccess().getStatementParserRuleCall_11(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStatement_in_ruleComplexLine1303);
                    this_Statement_12=ruleStatement();
                    _fsp--;


                    		current.merge(this_Statement_12);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleComplexLine


    // $ANTLR start entryRuleVmStatement
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:548:1: entryRuleVmStatement returns [String current=null] : iv_ruleVmStatement= ruleVmStatement EOF ;
    public final String entryRuleVmStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVmStatement = null;


        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:548:52: (iv_ruleVmStatement= ruleVmStatement EOF )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:549:2: iv_ruleVmStatement= ruleVmStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVmStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleVmStatement_in_entryRuleVmStatement1349);
            iv_ruleVmStatement=ruleVmStatement();
            _fsp--;

             current =iv_ruleVmStatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVmStatement1360); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVmStatement


    // $ANTLR start ruleVmStatement
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:556:1: ruleVmStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SimpleVmStatement_0= RULE_SIMPLEVMSTATEMENT | this_ComplexVmStatement_1= ruleComplexVmStatement ) ;
    public final AntlrDatatypeRuleToken ruleVmStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SimpleVmStatement_0=null;
        AntlrDatatypeRuleToken this_ComplexVmStatement_1 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:562:6: ( (this_SimpleVmStatement_0= RULE_SIMPLEVMSTATEMENT | this_ComplexVmStatement_1= ruleComplexVmStatement ) )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:563:1: (this_SimpleVmStatement_0= RULE_SIMPLEVMSTATEMENT | this_ComplexVmStatement_1= ruleComplexVmStatement )
            {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:563:1: (this_SimpleVmStatement_0= RULE_SIMPLEVMSTATEMENT | this_ComplexVmStatement_1= ruleComplexVmStatement )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_SIMPLEVMSTATEMENT) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==RULE_SPACE||LA16_1==20) ) {
                    alt16=2;
                }
                else if ( (LA16_1==EOF||LA16_1==RULE_SIMPLEVMSTATEMENT||(LA16_1>=14 && LA16_1<=15)||LA16_1==17) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("563:1: (this_SimpleVmStatement_0= RULE_SIMPLEVMSTATEMENT | this_ComplexVmStatement_1= ruleComplexVmStatement )", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("563:1: (this_SimpleVmStatement_0= RULE_SIMPLEVMSTATEMENT | this_ComplexVmStatement_1= ruleComplexVmStatement )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:563:6: this_SimpleVmStatement_0= RULE_SIMPLEVMSTATEMENT
                    {
                    this_SimpleVmStatement_0=(Token)input.LT(1);
                    match(input,RULE_SIMPLEVMSTATEMENT,FOLLOW_RULE_SIMPLEVMSTATEMENT_in_ruleVmStatement1400); 

                    		current.merge(this_SimpleVmStatement_0);
                        
                     
                        createLeafNode(grammarAccess.getVmStatementAccess().getSimpleVmStatementTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:572:5: this_ComplexVmStatement_1= ruleComplexVmStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getVmStatementAccess().getComplexVmStatementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleComplexVmStatement_in_ruleVmStatement1433);
                    this_ComplexVmStatement_1=ruleComplexVmStatement();
                    _fsp--;


                    		current.merge(this_ComplexVmStatement_1);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVmStatement


    // $ANTLR start entryRuleComplexVmStatement
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:590:1: entryRuleComplexVmStatement returns [String current=null] : iv_ruleComplexVmStatement= ruleComplexVmStatement EOF ;
    public final String entryRuleComplexVmStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComplexVmStatement = null;


        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:590:59: (iv_ruleComplexVmStatement= ruleComplexVmStatement EOF )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:591:2: iv_ruleComplexVmStatement= ruleComplexVmStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComplexVmStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleComplexVmStatement_in_entryRuleComplexVmStatement1477);
            iv_ruleComplexVmStatement=ruleComplexVmStatement();
            _fsp--;

             current =iv_ruleComplexVmStatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexVmStatement1488); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleComplexVmStatement


    // $ANTLR start ruleComplexVmStatement
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:598:1: ruleComplexVmStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SimpleVmStatement_0= RULE_SIMPLEVMSTATEMENT (this_SPACE_1= RULE_SPACE )? kw= '(' (this_SPACE_3= RULE_SPACE )? (this_VmEntry_4= ruleVmEntry | this_QUOTEDSTRING_5= RULE_QUOTEDSTRING ) (this_SPACE_6= RULE_SPACE )? (this_SYMBOLS_7= RULE_SYMBOLS )? (this_SPACE_8= RULE_SPACE )? (this_VmEntry_9= ruleVmEntry | this_QUOTEDSTRING_10= RULE_QUOTEDSTRING )? (this_SPACE_11= RULE_SPACE )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleComplexVmStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SimpleVmStatement_0=null;
        Token this_SPACE_1=null;
        Token kw=null;
        Token this_SPACE_3=null;
        Token this_QUOTEDSTRING_5=null;
        Token this_SPACE_6=null;
        Token this_SYMBOLS_7=null;
        Token this_SPACE_8=null;
        Token this_QUOTEDSTRING_10=null;
        Token this_SPACE_11=null;
        AntlrDatatypeRuleToken this_VmEntry_4 = null;

        AntlrDatatypeRuleToken this_VmEntry_9 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:604:6: ( (this_SimpleVmStatement_0= RULE_SIMPLEVMSTATEMENT (this_SPACE_1= RULE_SPACE )? kw= '(' (this_SPACE_3= RULE_SPACE )? (this_VmEntry_4= ruleVmEntry | this_QUOTEDSTRING_5= RULE_QUOTEDSTRING ) (this_SPACE_6= RULE_SPACE )? (this_SYMBOLS_7= RULE_SYMBOLS )? (this_SPACE_8= RULE_SPACE )? (this_VmEntry_9= ruleVmEntry | this_QUOTEDSTRING_10= RULE_QUOTEDSTRING )? (this_SPACE_11= RULE_SPACE )? kw= ')' ) )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:605:1: (this_SimpleVmStatement_0= RULE_SIMPLEVMSTATEMENT (this_SPACE_1= RULE_SPACE )? kw= '(' (this_SPACE_3= RULE_SPACE )? (this_VmEntry_4= ruleVmEntry | this_QUOTEDSTRING_5= RULE_QUOTEDSTRING ) (this_SPACE_6= RULE_SPACE )? (this_SYMBOLS_7= RULE_SYMBOLS )? (this_SPACE_8= RULE_SPACE )? (this_VmEntry_9= ruleVmEntry | this_QUOTEDSTRING_10= RULE_QUOTEDSTRING )? (this_SPACE_11= RULE_SPACE )? kw= ')' )
            {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:605:1: (this_SimpleVmStatement_0= RULE_SIMPLEVMSTATEMENT (this_SPACE_1= RULE_SPACE )? kw= '(' (this_SPACE_3= RULE_SPACE )? (this_VmEntry_4= ruleVmEntry | this_QUOTEDSTRING_5= RULE_QUOTEDSTRING ) (this_SPACE_6= RULE_SPACE )? (this_SYMBOLS_7= RULE_SYMBOLS )? (this_SPACE_8= RULE_SPACE )? (this_VmEntry_9= ruleVmEntry | this_QUOTEDSTRING_10= RULE_QUOTEDSTRING )? (this_SPACE_11= RULE_SPACE )? kw= ')' )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:605:6: this_SimpleVmStatement_0= RULE_SIMPLEVMSTATEMENT (this_SPACE_1= RULE_SPACE )? kw= '(' (this_SPACE_3= RULE_SPACE )? (this_VmEntry_4= ruleVmEntry | this_QUOTEDSTRING_5= RULE_QUOTEDSTRING ) (this_SPACE_6= RULE_SPACE )? (this_SYMBOLS_7= RULE_SYMBOLS )? (this_SPACE_8= RULE_SPACE )? (this_VmEntry_9= ruleVmEntry | this_QUOTEDSTRING_10= RULE_QUOTEDSTRING )? (this_SPACE_11= RULE_SPACE )? kw= ')'
            {
            this_SimpleVmStatement_0=(Token)input.LT(1);
            match(input,RULE_SIMPLEVMSTATEMENT,FOLLOW_RULE_SIMPLEVMSTATEMENT_in_ruleComplexVmStatement1528); 

            		current.merge(this_SimpleVmStatement_0);
                
             
                createLeafNode(grammarAccess.getComplexVmStatementAccess().getSimpleVmStatementTerminalRuleCall_0(), null); 
                
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:612:1: (this_SPACE_1= RULE_SPACE )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_SPACE) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:612:6: this_SPACE_1= RULE_SPACE
                    {
                    this_SPACE_1=(Token)input.LT(1);
                    match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_ruleComplexVmStatement1549); 

                    		current.merge(this_SPACE_1);
                        
                     
                        createLeafNode(grammarAccess.getComplexVmStatementAccess().getSPACETerminalRuleCall_1(), null); 
                        

                    }
                    break;

            }

            kw=(Token)input.LT(1);
            match(input,20,FOLLOW_20_in_ruleComplexVmStatement1569); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getComplexVmStatementAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:625:1: (this_SPACE_3= RULE_SPACE )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_SPACE) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:625:6: this_SPACE_3= RULE_SPACE
                    {
                    this_SPACE_3=(Token)input.LT(1);
                    match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_ruleComplexVmStatement1585); 

                    		current.merge(this_SPACE_3);
                        
                     
                        createLeafNode(grammarAccess.getComplexVmStatementAccess().getSPACETerminalRuleCall_3(), null); 
                        

                    }
                    break;

            }

            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:632:3: (this_VmEntry_4= ruleVmEntry | this_QUOTEDSTRING_5= RULE_QUOTEDSTRING )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_SIMPLEVMENTRY && LA19_0<=RULE_BRACEDVMENTRY)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_QUOTEDSTRING) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("632:3: (this_VmEntry_4= ruleVmEntry | this_QUOTEDSTRING_5= RULE_QUOTEDSTRING )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:633:5: this_VmEntry_4= ruleVmEntry
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getComplexVmStatementAccess().getVmEntryParserRuleCall_4_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVmEntry_in_ruleComplexVmStatement1615);
                    this_VmEntry_4=ruleVmEntry();
                    _fsp--;


                    		current.merge(this_VmEntry_4);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:644:10: this_QUOTEDSTRING_5= RULE_QUOTEDSTRING
                    {
                    this_QUOTEDSTRING_5=(Token)input.LT(1);
                    match(input,RULE_QUOTEDSTRING,FOLLOW_RULE_QUOTEDSTRING_in_ruleComplexVmStatement1641); 

                    		current.merge(this_QUOTEDSTRING_5);
                        
                     
                        createLeafNode(grammarAccess.getComplexVmStatementAccess().getQUOTEDSTRINGTerminalRuleCall_4_1(), null); 
                        

                    }
                    break;

            }

            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:651:2: (this_SPACE_6= RULE_SPACE )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_SPACE) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:651:7: this_SPACE_6= RULE_SPACE
                    {
                    this_SPACE_6=(Token)input.LT(1);
                    match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_ruleComplexVmStatement1663); 

                    		current.merge(this_SPACE_6);
                        
                     
                        createLeafNode(grammarAccess.getComplexVmStatementAccess().getSPACETerminalRuleCall_5(), null); 
                        

                    }
                    break;

            }

            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:658:3: (this_SYMBOLS_7= RULE_SYMBOLS )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_SYMBOLS) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:658:8: this_SYMBOLS_7= RULE_SYMBOLS
                    {
                    this_SYMBOLS_7=(Token)input.LT(1);
                    match(input,RULE_SYMBOLS,FOLLOW_RULE_SYMBOLS_in_ruleComplexVmStatement1686); 

                    		current.merge(this_SYMBOLS_7);
                        
                     
                        createLeafNode(grammarAccess.getComplexVmStatementAccess().getSYMBOLSTerminalRuleCall_6(), null); 
                        

                    }
                    break;

            }

            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:665:3: (this_SPACE_8= RULE_SPACE )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_SPACE) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:665:8: this_SPACE_8= RULE_SPACE
                    {
                    this_SPACE_8=(Token)input.LT(1);
                    match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_ruleComplexVmStatement1709); 

                    		current.merge(this_SPACE_8);
                        
                     
                        createLeafNode(grammarAccess.getComplexVmStatementAccess().getSPACETerminalRuleCall_7(), null); 
                        

                    }
                    break;

            }

            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:672:3: (this_VmEntry_9= ruleVmEntry | this_QUOTEDSTRING_10= RULE_QUOTEDSTRING )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_SIMPLEVMENTRY && LA23_0<=RULE_BRACEDVMENTRY)) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_QUOTEDSTRING) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:673:5: this_VmEntry_9= ruleVmEntry
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getComplexVmStatementAccess().getVmEntryParserRuleCall_8_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVmEntry_in_ruleComplexVmStatement1739);
                    this_VmEntry_9=ruleVmEntry();
                    _fsp--;


                    		current.merge(this_VmEntry_9);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:684:10: this_QUOTEDSTRING_10= RULE_QUOTEDSTRING
                    {
                    this_QUOTEDSTRING_10=(Token)input.LT(1);
                    match(input,RULE_QUOTEDSTRING,FOLLOW_RULE_QUOTEDSTRING_in_ruleComplexVmStatement1765); 

                    		current.merge(this_QUOTEDSTRING_10);
                        
                     
                        createLeafNode(grammarAccess.getComplexVmStatementAccess().getQUOTEDSTRINGTerminalRuleCall_8_1(), null); 
                        

                    }
                    break;

            }

            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:691:3: (this_SPACE_11= RULE_SPACE )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_SPACE) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:691:8: this_SPACE_11= RULE_SPACE
                    {
                    this_SPACE_11=(Token)input.LT(1);
                    match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_ruleComplexVmStatement1788); 

                    		current.merge(this_SPACE_11);
                        
                     
                        createLeafNode(grammarAccess.getComplexVmStatementAccess().getSPACETerminalRuleCall_9(), null); 
                        

                    }
                    break;

            }

            kw=(Token)input.LT(1);
            match(input,21,FOLLOW_21_in_ruleComplexVmStatement1808); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getComplexVmStatementAccess().getRightParenthesisKeyword_10(), null); 
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleComplexVmStatement


    // $ANTLR start entryRuleVmEntry
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:712:1: entryRuleVmEntry returns [String current=null] : iv_ruleVmEntry= ruleVmEntry EOF ;
    public final String entryRuleVmEntry() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVmEntry = null;


        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:712:48: (iv_ruleVmEntry= ruleVmEntry EOF )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:713:2: iv_ruleVmEntry= ruleVmEntry EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVmEntryRule(), currentNode); 
            pushFollow(FOLLOW_ruleVmEntry_in_entryRuleVmEntry1847);
            iv_ruleVmEntry=ruleVmEntry();
            _fsp--;

             current =iv_ruleVmEntry.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVmEntry1858); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVmEntry


    // $ANTLR start ruleVmEntry
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:720:1: ruleVmEntry returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SimpleVmEntry_0= RULE_SIMPLEVMENTRY | this_BracedVmEntry_1= RULE_BRACEDVMENTRY ) ;
    public final AntlrDatatypeRuleToken ruleVmEntry() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SimpleVmEntry_0=null;
        Token this_BracedVmEntry_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:726:6: ( (this_SimpleVmEntry_0= RULE_SIMPLEVMENTRY | this_BracedVmEntry_1= RULE_BRACEDVMENTRY ) )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:727:1: (this_SimpleVmEntry_0= RULE_SIMPLEVMENTRY | this_BracedVmEntry_1= RULE_BRACEDVMENTRY )
            {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:727:1: (this_SimpleVmEntry_0= RULE_SIMPLEVMENTRY | this_BracedVmEntry_1= RULE_BRACEDVMENTRY )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_SIMPLEVMENTRY) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_BRACEDVMENTRY) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("727:1: (this_SimpleVmEntry_0= RULE_SIMPLEVMENTRY | this_BracedVmEntry_1= RULE_BRACEDVMENTRY )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:727:6: this_SimpleVmEntry_0= RULE_SIMPLEVMENTRY
                    {
                    this_SimpleVmEntry_0=(Token)input.LT(1);
                    match(input,RULE_SIMPLEVMENTRY,FOLLOW_RULE_SIMPLEVMENTRY_in_ruleVmEntry1898); 

                    		current.merge(this_SimpleVmEntry_0);
                        
                     
                        createLeafNode(grammarAccess.getVmEntryAccess().getSimpleVmEntryTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:735:10: this_BracedVmEntry_1= RULE_BRACEDVMENTRY
                    {
                    this_BracedVmEntry_1=(Token)input.LT(1);
                    match(input,RULE_BRACEDVMENTRY,FOLLOW_RULE_BRACEDVMENTRY_in_ruleVmEntry1924); 

                    		current.merge(this_BracedVmEntry_1);
                        
                     
                        createLeafNode(grammarAccess.getVmEntryAccess().getBracedVmEntryTerminalRuleCall_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVmEntry


    // $ANTLR start entryRuleStatement
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:750:1: entryRuleStatement returns [String current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final String entryRuleStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatement = null;


        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:750:50: (iv_ruleStatement= ruleStatement EOF )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:751:2: iv_ruleStatement= ruleStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1968);
            iv_ruleStatement=ruleStatement();
            _fsp--;

             current =iv_ruleStatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1979); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:758:1: ruleStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VmEntry_0= ruleVmEntry | (kw= '\"' this_STR_2= RULE_STR kw= '\"' ) | this_STR_4= RULE_STR | ( (this_STR_5= RULE_STR )? this_BracedVmEntry_6= RULE_BRACEDVMENTRY (this_STR_7= RULE_STR )? ) )* ;
    public final AntlrDatatypeRuleToken ruleStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STR_2=null;
        Token this_STR_4=null;
        Token this_STR_5=null;
        Token this_BracedVmEntry_6=null;
        Token this_STR_7=null;
        AntlrDatatypeRuleToken this_VmEntry_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:764:6: ( (this_VmEntry_0= ruleVmEntry | (kw= '\"' this_STR_2= RULE_STR kw= '\"' ) | this_STR_4= RULE_STR | ( (this_STR_5= RULE_STR )? this_BracedVmEntry_6= RULE_BRACEDVMENTRY (this_STR_7= RULE_STR )? ) )* )
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:765:1: (this_VmEntry_0= ruleVmEntry | (kw= '\"' this_STR_2= RULE_STR kw= '\"' ) | this_STR_4= RULE_STR | ( (this_STR_5= RULE_STR )? this_BracedVmEntry_6= RULE_BRACEDVMENTRY (this_STR_7= RULE_STR )? ) )*
            {
            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:765:1: (this_VmEntry_0= ruleVmEntry | (kw= '\"' this_STR_2= RULE_STR kw= '\"' ) | this_STR_4= RULE_STR | ( (this_STR_5= RULE_STR )? this_BracedVmEntry_6= RULE_BRACEDVMENTRY (this_STR_7= RULE_STR )? ) )*
            loop28:
            do {
                int alt28=5;
                switch ( input.LA(1) ) {
                case RULE_SIMPLEVMENTRY:
                    {
                    alt28=1;
                    }
                    break;
                case RULE_BRACEDVMENTRY:
                    {
                    alt28=1;
                    }
                    break;
                case 22:
                    {
                    alt28=2;
                    }
                    break;
                case RULE_STR:
                    {
                    alt28=3;
                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:766:5: this_VmEntry_0= ruleVmEntry
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getVmEntryParserRuleCall_0(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleVmEntry_in_ruleStatement2026);
            	    this_VmEntry_0=ruleVmEntry();
            	    _fsp--;


            	    		current.merge(this_VmEntry_0);
            	        
            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:777:6: (kw= '\"' this_STR_2= RULE_STR kw= '\"' )
            	    {
            	    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:777:6: (kw= '\"' this_STR_2= RULE_STR kw= '\"' )
            	    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:778:2: kw= '\"' this_STR_2= RULE_STR kw= '\"'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,22,FOLLOW_22_in_ruleStatement2051); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getStatementAccess().getQuotationMarkKeyword_1_0(), null); 
            	        
            	    this_STR_2=(Token)input.LT(1);
            	    match(input,RULE_STR,FOLLOW_RULE_STR_in_ruleStatement2066); 

            	    		current.merge(this_STR_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getStatementAccess().getSTRTerminalRuleCall_1_1(), null); 
            	        
            	    kw=(Token)input.LT(1);
            	    match(input,22,FOLLOW_22_in_ruleStatement2084); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getStatementAccess().getQuotationMarkKeyword_1_2(), null); 
            	        

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:797:10: this_STR_4= RULE_STR
            	    {
            	    this_STR_4=(Token)input.LT(1);
            	    match(input,RULE_STR,FOLLOW_RULE_STR_in_ruleStatement2106); 

            	    		current.merge(this_STR_4);
            	        
            	     
            	        createLeafNode(grammarAccess.getStatementAccess().getSTRTerminalRuleCall_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:805:6: ( (this_STR_5= RULE_STR )? this_BracedVmEntry_6= RULE_BRACEDVMENTRY (this_STR_7= RULE_STR )? )
            	    {
            	    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:805:6: ( (this_STR_5= RULE_STR )? this_BracedVmEntry_6= RULE_BRACEDVMENTRY (this_STR_7= RULE_STR )? )
            	    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:805:7: (this_STR_5= RULE_STR )? this_BracedVmEntry_6= RULE_BRACEDVMENTRY (this_STR_7= RULE_STR )?
            	    {
            	    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:805:7: (this_STR_5= RULE_STR )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==RULE_STR) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:805:12: this_STR_5= RULE_STR
            	            {
            	            this_STR_5=(Token)input.LT(1);
            	            match(input,RULE_STR,FOLLOW_RULE_STR_in_ruleStatement2134); 

            	            		current.merge(this_STR_5);
            	                
            	             
            	                createLeafNode(grammarAccess.getStatementAccess().getSTRTerminalRuleCall_3_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    this_BracedVmEntry_6=(Token)input.LT(1);
            	    match(input,RULE_BRACEDVMENTRY,FOLLOW_RULE_BRACEDVMENTRY_in_ruleStatement2156); 

            	    		current.merge(this_BracedVmEntry_6);
            	        
            	     
            	        createLeafNode(grammarAccess.getStatementAccess().getBracedVmEntryTerminalRuleCall_3_1(), null); 
            	        
            	    // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:819:1: (this_STR_7= RULE_STR )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==RULE_STR) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../com.dawsonsystems.Swift/src-gen/com/dawsonsystems/parser/antlr/internal/InternalSwift.g:819:6: this_STR_7= RULE_STR
            	            {
            	            this_STR_7=(Token)input.LT(1);
            	            match(input,RULE_STR,FOLLOW_RULE_STR_in_ruleStatement2177); 

            	            		current.merge(this_STR_7);
            	                
            	             
            	                createLeafNode(grammarAccess.getStatementAccess().getSTRTerminalRuleCall_3_2(), null); 
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStatement


 

    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeginningLine_in_ruleMessage134 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleComplexBeginningLine_in_ruleMessage148 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMessage167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STR_in_ruleMessage176 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMessage184 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleLine_in_ruleMessage218 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_14_in_ruleMessage232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexBeginningLine_in_entryRuleComplexBeginningLine266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexBeginningLine277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleComplexBeginningLine315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STR_in_ruleComplexBeginningLine330 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleComplexBeginningLine348 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleBeginningLine_in_ruleComplexBeginningLine370 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleComplexBeginningLine388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeginningLine_in_entryRuleBeginningLine427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeginningLine438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleBeginningLine476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STR_in_ruleBeginningLine491 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBeginningLine509 = new BitSet(new long[]{0x0000000000410610L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleBeginningLine531 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBeginningLine549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_entryRuleLine588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLine599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleLine_in_ruleLine647 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleComplexLine_in_ruleLine680 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleVmStatement_in_ruleLine713 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleLine733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleLine_in_entryRuleSimpleLine774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleLine785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSimpleLine823 = new BitSet(new long[]{0x0000000000000610L});
    public static final BitSet FOLLOW_ruleVmEntry_in_ruleSimpleLine846 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_STR_in_ruleSimpleLine872 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSimpleLine891 = new BitSet(new long[]{0x0000000000000610L});
    public static final BitSet FOLLOW_ruleVmEntry_in_ruleSimpleLine914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STR_in_ruleSimpleLine940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexLine_in_entryRuleComplexLine985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexLine996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleComplexLine1034 = new BitSet(new long[]{0x0000000000000610L});
    public static final BitSet FOLLOW_ruleVmEntry_in_ruleComplexLine1057 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_STR_in_ruleComplexLine1083 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleComplexLine1102 = new BitSet(new long[]{0x0000000000480610L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleComplexLine1124 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleComplexLine1142 = new BitSet(new long[]{0x0000000000480612L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleComplexLine1165 = new BitSet(new long[]{0x0000000000480612L});
    public static final BitSet FOLLOW_19_in_ruleComplexLine1186 = new BitSet(new long[]{0x0000000000480612L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleComplexLine1211 = new BitSet(new long[]{0x0000000000480612L});
    public static final BitSet FOLLOW_19_in_ruleComplexLine1232 = new BitSet(new long[]{0x0000000000480612L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleComplexLine1257 = new BitSet(new long[]{0x0000000000480612L});
    public static final BitSet FOLLOW_19_in_ruleComplexLine1278 = new BitSet(new long[]{0x0000000000400612L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleComplexLine1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVmStatement_in_entryRuleVmStatement1349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVmStatement1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIMPLEVMSTATEMENT_in_ruleVmStatement1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexVmStatement_in_ruleVmStatement1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexVmStatement_in_entryRuleComplexVmStatement1477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexVmStatement1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIMPLEVMSTATEMENT_in_ruleComplexVmStatement1528 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_RULE_SPACE_in_ruleComplexVmStatement1549 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleComplexVmStatement1569 = new BitSet(new long[]{0x00000000000006C0L});
    public static final BitSet FOLLOW_RULE_SPACE_in_ruleComplexVmStatement1585 = new BitSet(new long[]{0x0000000000000680L});
    public static final BitSet FOLLOW_ruleVmEntry_in_ruleComplexVmStatement1615 = new BitSet(new long[]{0x00000000002007C0L});
    public static final BitSet FOLLOW_RULE_QUOTEDSTRING_in_ruleComplexVmStatement1641 = new BitSet(new long[]{0x00000000002007C0L});
    public static final BitSet FOLLOW_RULE_SPACE_in_ruleComplexVmStatement1663 = new BitSet(new long[]{0x00000000002007C0L});
    public static final BitSet FOLLOW_RULE_SYMBOLS_in_ruleComplexVmStatement1686 = new BitSet(new long[]{0x00000000002006C0L});
    public static final BitSet FOLLOW_RULE_SPACE_in_ruleComplexVmStatement1709 = new BitSet(new long[]{0x00000000002006C0L});
    public static final BitSet FOLLOW_ruleVmEntry_in_ruleComplexVmStatement1739 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_RULE_QUOTEDSTRING_in_ruleComplexVmStatement1765 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_RULE_SPACE_in_ruleComplexVmStatement1788 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleComplexVmStatement1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVmEntry_in_entryRuleVmEntry1847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVmEntry1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIMPLEVMENTRY_in_ruleVmEntry1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACEDVMENTRY_in_ruleVmEntry1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVmEntry_in_ruleStatement2026 = new BitSet(new long[]{0x0000000000400612L});
    public static final BitSet FOLLOW_22_in_ruleStatement2051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STR_in_ruleStatement2066 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStatement2084 = new BitSet(new long[]{0x0000000000400612L});
    public static final BitSet FOLLOW_RULE_STR_in_ruleStatement2106 = new BitSet(new long[]{0x0000000000400612L});
    public static final BitSet FOLLOW_RULE_STR_in_ruleStatement2134 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_BRACEDVMENTRY_in_ruleStatement2156 = new BitSet(new long[]{0x0000000000400612L});
    public static final BitSet FOLLOW_RULE_STR_in_ruleStatement2177 = new BitSet(new long[]{0x0000000000400612L});

}