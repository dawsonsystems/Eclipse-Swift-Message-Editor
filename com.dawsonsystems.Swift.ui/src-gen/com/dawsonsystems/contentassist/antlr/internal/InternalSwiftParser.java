package com.dawsonsystems.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import com.dawsonsystems.services.SwiftGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalSwiftParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STR", "RULE_SIMPLEVMSTATEMENT", "RULE_QUOTEDSTRING", "RULE_SIMPLEVMENTRY", "RULE_BRACEDVMENTRY", "RULE_SPACE", "RULE_SYMBOLS", "RULE_ANY_OTHER", "'{'", "':\\n'", "'-}'", "':'", "'}'", "'\\n'", "'::'", "'/'", "'('", "')'", "'\"'"
    };
    public static final int RULE_SIMPLEVMSTATEMENT=5;
    public static final int RULE_QUOTEDSTRING=6;
    public static final int RULE_SIMPLEVMENTRY=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_BRACEDVMENTRY=8;
    public static final int RULE_STR=4;
    public static final int RULE_SYMBOLS=10;
    public static final int EOF=-1;
    public static final int RULE_SPACE=9;

        public InternalSwiftParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g"; }


     
     	private SwiftGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SwiftGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleMessage
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:60:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:60:18: ( ruleMessage EOF )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:61:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage60);
            ruleMessage();
            _fsp--;

             after(grammarAccess.getMessageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage67); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMessage


    // $ANTLR start ruleMessage
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:68:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:72:2: ( ( ( rule__Message__Group__0 ) ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:73:1: ( ( rule__Message__Group__0 ) )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:73:1: ( ( rule__Message__Group__0 ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:74:1: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:75:1: ( rule__Message__Group__0 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:75:2: rule__Message__Group__0
            {
            pushFollow(FOLLOW_rule__Message__Group__0_in_ruleMessage94);
            rule__Message__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMessage


    // $ANTLR start entryRuleComplexBeginningLine
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:87:1: entryRuleComplexBeginningLine : ruleComplexBeginningLine EOF ;
    public final void entryRuleComplexBeginningLine() throws RecognitionException {
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:87:31: ( ruleComplexBeginningLine EOF )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:88:1: ruleComplexBeginningLine EOF
            {
             before(grammarAccess.getComplexBeginningLineRule()); 
            pushFollow(FOLLOW_ruleComplexBeginningLine_in_entryRuleComplexBeginningLine120);
            ruleComplexBeginningLine();
            _fsp--;

             after(grammarAccess.getComplexBeginningLineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexBeginningLine127); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleComplexBeginningLine


    // $ANTLR start ruleComplexBeginningLine
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:95:1: ruleComplexBeginningLine : ( ( rule__ComplexBeginningLine__Group__0 ) ) ;
    public final void ruleComplexBeginningLine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:99:2: ( ( ( rule__ComplexBeginningLine__Group__0 ) ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:100:1: ( ( rule__ComplexBeginningLine__Group__0 ) )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:100:1: ( ( rule__ComplexBeginningLine__Group__0 ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:101:1: ( rule__ComplexBeginningLine__Group__0 )
            {
             before(grammarAccess.getComplexBeginningLineAccess().getGroup()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:102:1: ( rule__ComplexBeginningLine__Group__0 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:102:2: rule__ComplexBeginningLine__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexBeginningLine__Group__0_in_ruleComplexBeginningLine154);
            rule__ComplexBeginningLine__Group__0();
            _fsp--;


            }

             after(grammarAccess.getComplexBeginningLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleComplexBeginningLine


    // $ANTLR start entryRuleBeginningLine
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:114:1: entryRuleBeginningLine : ruleBeginningLine EOF ;
    public final void entryRuleBeginningLine() throws RecognitionException {
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:114:24: ( ruleBeginningLine EOF )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:115:1: ruleBeginningLine EOF
            {
             before(grammarAccess.getBeginningLineRule()); 
            pushFollow(FOLLOW_ruleBeginningLine_in_entryRuleBeginningLine180);
            ruleBeginningLine();
            _fsp--;

             after(grammarAccess.getBeginningLineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeginningLine187); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBeginningLine


    // $ANTLR start ruleBeginningLine
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:122:1: ruleBeginningLine : ( ( rule__BeginningLine__Group__0 ) ) ;
    public final void ruleBeginningLine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:126:2: ( ( ( rule__BeginningLine__Group__0 ) ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:127:1: ( ( rule__BeginningLine__Group__0 ) )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:127:1: ( ( rule__BeginningLine__Group__0 ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:128:1: ( rule__BeginningLine__Group__0 )
            {
             before(grammarAccess.getBeginningLineAccess().getGroup()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:129:1: ( rule__BeginningLine__Group__0 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:129:2: rule__BeginningLine__Group__0
            {
            pushFollow(FOLLOW_rule__BeginningLine__Group__0_in_ruleBeginningLine214);
            rule__BeginningLine__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBeginningLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBeginningLine


    // $ANTLR start entryRuleLine
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:141:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:141:15: ( ruleLine EOF )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:142:1: ruleLine EOF
            {
             before(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_ruleLine_in_entryRuleLine240);
            ruleLine();
            _fsp--;

             after(grammarAccess.getLineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLine247); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleLine


    // $ANTLR start ruleLine
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:149:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:153:2: ( ( ( rule__Line__Group__0 ) ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:154:1: ( ( rule__Line__Group__0 ) )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:154:1: ( ( rule__Line__Group__0 ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:155:1: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:156:1: ( rule__Line__Group__0 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:156:2: rule__Line__Group__0
            {
            pushFollow(FOLLOW_rule__Line__Group__0_in_ruleLine274);
            rule__Line__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLine


    // $ANTLR start entryRuleSimpleLine
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:168:1: entryRuleSimpleLine : ruleSimpleLine EOF ;
    public final void entryRuleSimpleLine() throws RecognitionException {
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:168:21: ( ruleSimpleLine EOF )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:169:1: ruleSimpleLine EOF
            {
             before(grammarAccess.getSimpleLineRule()); 
            pushFollow(FOLLOW_ruleSimpleLine_in_entryRuleSimpleLine300);
            ruleSimpleLine();
            _fsp--;

             after(grammarAccess.getSimpleLineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleLine307); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSimpleLine


    // $ANTLR start ruleSimpleLine
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:176:1: ruleSimpleLine : ( ( rule__SimpleLine__Group__0 ) ) ;
    public final void ruleSimpleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:180:2: ( ( ( rule__SimpleLine__Group__0 ) ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:181:1: ( ( rule__SimpleLine__Group__0 ) )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:181:1: ( ( rule__SimpleLine__Group__0 ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:182:1: ( rule__SimpleLine__Group__0 )
            {
             before(grammarAccess.getSimpleLineAccess().getGroup()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:183:1: ( rule__SimpleLine__Group__0 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:183:2: rule__SimpleLine__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleLine__Group__0_in_ruleSimpleLine334);
            rule__SimpleLine__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSimpleLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSimpleLine


    // $ANTLR start entryRuleComplexLine
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:195:1: entryRuleComplexLine : ruleComplexLine EOF ;
    public final void entryRuleComplexLine() throws RecognitionException {
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:195:22: ( ruleComplexLine EOF )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:196:1: ruleComplexLine EOF
            {
             before(grammarAccess.getComplexLineRule()); 
            pushFollow(FOLLOW_ruleComplexLine_in_entryRuleComplexLine360);
            ruleComplexLine();
            _fsp--;

             after(grammarAccess.getComplexLineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexLine367); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleComplexLine


    // $ANTLR start ruleComplexLine
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:203:1: ruleComplexLine : ( ( rule__ComplexLine__Group__0 ) ) ;
    public final void ruleComplexLine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:207:2: ( ( ( rule__ComplexLine__Group__0 ) ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:208:1: ( ( rule__ComplexLine__Group__0 ) )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:208:1: ( ( rule__ComplexLine__Group__0 ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:209:1: ( rule__ComplexLine__Group__0 )
            {
             before(grammarAccess.getComplexLineAccess().getGroup()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:210:1: ( rule__ComplexLine__Group__0 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:210:2: rule__ComplexLine__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexLine__Group__0_in_ruleComplexLine394);
            rule__ComplexLine__Group__0();
            _fsp--;


            }

             after(grammarAccess.getComplexLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleComplexLine


    // $ANTLR start entryRuleVmStatement
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:222:1: entryRuleVmStatement : ruleVmStatement EOF ;
    public final void entryRuleVmStatement() throws RecognitionException {
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:222:22: ( ruleVmStatement EOF )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:223:1: ruleVmStatement EOF
            {
             before(grammarAccess.getVmStatementRule()); 
            pushFollow(FOLLOW_ruleVmStatement_in_entryRuleVmStatement420);
            ruleVmStatement();
            _fsp--;

             after(grammarAccess.getVmStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVmStatement427); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleVmStatement


    // $ANTLR start ruleVmStatement
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:230:1: ruleVmStatement : ( ( rule__VmStatement__Alternatives ) ) ;
    public final void ruleVmStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:234:2: ( ( ( rule__VmStatement__Alternatives ) ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:235:1: ( ( rule__VmStatement__Alternatives ) )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:235:1: ( ( rule__VmStatement__Alternatives ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:236:1: ( rule__VmStatement__Alternatives )
            {
             before(grammarAccess.getVmStatementAccess().getAlternatives()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:237:1: ( rule__VmStatement__Alternatives )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:237:2: rule__VmStatement__Alternatives
            {
            pushFollow(FOLLOW_rule__VmStatement__Alternatives_in_ruleVmStatement454);
            rule__VmStatement__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getVmStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVmStatement


    // $ANTLR start entryRuleComplexVmStatement
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:249:1: entryRuleComplexVmStatement : ruleComplexVmStatement EOF ;
    public final void entryRuleComplexVmStatement() throws RecognitionException {
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:249:29: ( ruleComplexVmStatement EOF )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:250:1: ruleComplexVmStatement EOF
            {
             before(grammarAccess.getComplexVmStatementRule()); 
            pushFollow(FOLLOW_ruleComplexVmStatement_in_entryRuleComplexVmStatement480);
            ruleComplexVmStatement();
            _fsp--;

             after(grammarAccess.getComplexVmStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexVmStatement487); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleComplexVmStatement


    // $ANTLR start ruleComplexVmStatement
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:257:1: ruleComplexVmStatement : ( ( rule__ComplexVmStatement__Group__0 ) ) ;
    public final void ruleComplexVmStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:261:2: ( ( ( rule__ComplexVmStatement__Group__0 ) ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:262:1: ( ( rule__ComplexVmStatement__Group__0 ) )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:262:1: ( ( rule__ComplexVmStatement__Group__0 ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:263:1: ( rule__ComplexVmStatement__Group__0 )
            {
             before(grammarAccess.getComplexVmStatementAccess().getGroup()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:264:1: ( rule__ComplexVmStatement__Group__0 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:264:2: rule__ComplexVmStatement__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexVmStatement__Group__0_in_ruleComplexVmStatement514);
            rule__ComplexVmStatement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getComplexVmStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleComplexVmStatement


    // $ANTLR start entryRuleVmEntry
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:276:1: entryRuleVmEntry : ruleVmEntry EOF ;
    public final void entryRuleVmEntry() throws RecognitionException {
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:276:18: ( ruleVmEntry EOF )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:277:1: ruleVmEntry EOF
            {
             before(grammarAccess.getVmEntryRule()); 
            pushFollow(FOLLOW_ruleVmEntry_in_entryRuleVmEntry540);
            ruleVmEntry();
            _fsp--;

             after(grammarAccess.getVmEntryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVmEntry547); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleVmEntry


    // $ANTLR start ruleVmEntry
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:284:1: ruleVmEntry : ( ( rule__VmEntry__Alternatives ) ) ;
    public final void ruleVmEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:288:2: ( ( ( rule__VmEntry__Alternatives ) ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:289:1: ( ( rule__VmEntry__Alternatives ) )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:289:1: ( ( rule__VmEntry__Alternatives ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:290:1: ( rule__VmEntry__Alternatives )
            {
             before(grammarAccess.getVmEntryAccess().getAlternatives()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:291:1: ( rule__VmEntry__Alternatives )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:291:2: rule__VmEntry__Alternatives
            {
            pushFollow(FOLLOW_rule__VmEntry__Alternatives_in_ruleVmEntry574);
            rule__VmEntry__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getVmEntryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVmEntry


    // $ANTLR start entryRuleStatement
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:303:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:303:20: ( ruleStatement EOF )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:304:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement600);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:311:1: ruleStatement : ( ( rule__Statement__Alternatives )* ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:315:2: ( ( ( rule__Statement__Alternatives )* ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:316:1: ( ( rule__Statement__Alternatives )* )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:316:1: ( ( rule__Statement__Alternatives )* )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:317:1: ( rule__Statement__Alternatives )*
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:318:1: ( rule__Statement__Alternatives )*
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case RULE_SIMPLEVMENTRY:
                    {
                    alt1=1;
                    }
                    break;
                case RULE_BRACEDVMENTRY:
                    {
                    alt1=1;
                    }
                    break;
                case 22:
                    {
                    alt1=1;
                    }
                    break;
                case RULE_STR:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:318:2: rule__Statement__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement634);
            	    rule__Statement__Alternatives();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStatement


    // $ANTLR start rule__Message__ElementsAlternatives_0_0
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:330:1: rule__Message__ElementsAlternatives_0_0 : ( ( ruleBeginningLine ) | ( ruleComplexBeginningLine ) );
    public final void rule__Message__ElementsAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:334:1: ( ( ruleBeginningLine ) | ( ruleComplexBeginningLine ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_STR) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==15) ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3==12) ) {
                            alt2=2;
                        }
                        else if ( (LA2_3==RULE_STR||(LA2_3>=RULE_SIMPLEVMENTRY && LA2_3<=RULE_BRACEDVMENTRY)||LA2_3==16||LA2_3==22) ) {
                            alt2=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("330:1: rule__Message__ElementsAlternatives_0_0 : ( ( ruleBeginningLine ) | ( ruleComplexBeginningLine ) );", 2, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("330:1: rule__Message__ElementsAlternatives_0_0 : ( ( ruleBeginningLine ) | ( ruleComplexBeginningLine ) );", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("330:1: rule__Message__ElementsAlternatives_0_0 : ( ( ruleBeginningLine ) | ( ruleComplexBeginningLine ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("330:1: rule__Message__ElementsAlternatives_0_0 : ( ( ruleBeginningLine ) | ( ruleComplexBeginningLine ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:335:1: ( ruleBeginningLine )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:335:1: ( ruleBeginningLine )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:336:1: ruleBeginningLine
                    {
                     before(grammarAccess.getMessageAccess().getElementsBeginningLineParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_ruleBeginningLine_in_rule__Message__ElementsAlternatives_0_0671);
                    ruleBeginningLine();
                    _fsp--;

                     after(grammarAccess.getMessageAccess().getElementsBeginningLineParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:341:6: ( ruleComplexBeginningLine )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:341:6: ( ruleComplexBeginningLine )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:342:1: ruleComplexBeginningLine
                    {
                     before(grammarAccess.getMessageAccess().getElementsComplexBeginningLineParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_ruleComplexBeginningLine_in_rule__Message__ElementsAlternatives_0_0688);
                    ruleComplexBeginningLine();
                    _fsp--;

                     after(grammarAccess.getMessageAccess().getElementsComplexBeginningLineParserRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Message__ElementsAlternatives_0_0


    // $ANTLR start rule__Line__Alternatives_0
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:352:1: rule__Line__Alternatives_0 : ( ( ruleSimpleLine ) | ( ruleComplexLine ) | ( ruleVmStatement ) );
    public final void rule__Line__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:356:1: ( ( ruleSimpleLine ) | ( ruleComplexLine ) | ( ruleVmStatement ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                switch ( input.LA(2) ) {
                case RULE_SIMPLEVMENTRY:
                    {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==15) ) {
                        alt3=1;
                    }
                    else if ( (LA3_3==18) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("352:1: rule__Line__Alternatives_0 : ( ( ruleSimpleLine ) | ( ruleComplexLine ) | ( ruleVmStatement ) );", 3, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_BRACEDVMENTRY:
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==15) ) {
                        alt3=1;
                    }
                    else if ( (LA3_4==18) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("352:1: rule__Line__Alternatives_0 : ( ( ruleSimpleLine ) | ( ruleComplexLine ) | ( ruleVmStatement ) );", 3, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_STR:
                    {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==18) ) {
                        alt3=2;
                    }
                    else if ( (LA3_5==15) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("352:1: rule__Line__Alternatives_0 : ( ( ruleSimpleLine ) | ( ruleComplexLine ) | ( ruleVmStatement ) );", 3, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("352:1: rule__Line__Alternatives_0 : ( ( ruleSimpleLine ) | ( ruleComplexLine ) | ( ruleVmStatement ) );", 3, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA3_0==RULE_SIMPLEVMSTATEMENT) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("352:1: rule__Line__Alternatives_0 : ( ( ruleSimpleLine ) | ( ruleComplexLine ) | ( ruleVmStatement ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:357:1: ( ruleSimpleLine )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:357:1: ( ruleSimpleLine )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:358:1: ruleSimpleLine
                    {
                     before(grammarAccess.getLineAccess().getSimpleLineParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleSimpleLine_in_rule__Line__Alternatives_0720);
                    ruleSimpleLine();
                    _fsp--;

                     after(grammarAccess.getLineAccess().getSimpleLineParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:363:6: ( ruleComplexLine )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:363:6: ( ruleComplexLine )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:364:1: ruleComplexLine
                    {
                     before(grammarAccess.getLineAccess().getComplexLineParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleComplexLine_in_rule__Line__Alternatives_0737);
                    ruleComplexLine();
                    _fsp--;

                     after(grammarAccess.getLineAccess().getComplexLineParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:369:6: ( ruleVmStatement )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:369:6: ( ruleVmStatement )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:370:1: ruleVmStatement
                    {
                     before(grammarAccess.getLineAccess().getVmStatementParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleVmStatement_in_rule__Line__Alternatives_0754);
                    ruleVmStatement();
                    _fsp--;

                     after(grammarAccess.getLineAccess().getVmStatementParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Line__Alternatives_0


    // $ANTLR start rule__SimpleLine__Alternatives_1
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:380:1: rule__SimpleLine__Alternatives_1 : ( ( ruleVmEntry ) | ( RULE_STR ) );
    public final void rule__SimpleLine__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:384:1: ( ( ruleVmEntry ) | ( RULE_STR ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_SIMPLEVMENTRY && LA4_0<=RULE_BRACEDVMENTRY)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STR) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("380:1: rule__SimpleLine__Alternatives_1 : ( ( ruleVmEntry ) | ( RULE_STR ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:385:1: ( ruleVmEntry )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:385:1: ( ruleVmEntry )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:386:1: ruleVmEntry
                    {
                     before(grammarAccess.getSimpleLineAccess().getVmEntryParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleVmEntry_in_rule__SimpleLine__Alternatives_1786);
                    ruleVmEntry();
                    _fsp--;

                     after(grammarAccess.getSimpleLineAccess().getVmEntryParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:391:6: ( RULE_STR )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:391:6: ( RULE_STR )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:392:1: RULE_STR
                    {
                     before(grammarAccess.getSimpleLineAccess().getSTRTerminalRuleCall_1_1()); 
                    match(input,RULE_STR,FOLLOW_RULE_STR_in_rule__SimpleLine__Alternatives_1803); 
                     after(grammarAccess.getSimpleLineAccess().getSTRTerminalRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleLine__Alternatives_1


    // $ANTLR start rule__SimpleLine__Alternatives_3
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:402:1: rule__SimpleLine__Alternatives_3 : ( ( ruleVmEntry ) | ( RULE_STR ) );
    public final void rule__SimpleLine__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:406:1: ( ( ruleVmEntry ) | ( RULE_STR ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_SIMPLEVMENTRY && LA5_0<=RULE_BRACEDVMENTRY)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STR) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("402:1: rule__SimpleLine__Alternatives_3 : ( ( ruleVmEntry ) | ( RULE_STR ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:407:1: ( ruleVmEntry )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:407:1: ( ruleVmEntry )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:408:1: ruleVmEntry
                    {
                     before(grammarAccess.getSimpleLineAccess().getVmEntryParserRuleCall_3_0()); 
                    pushFollow(FOLLOW_ruleVmEntry_in_rule__SimpleLine__Alternatives_3835);
                    ruleVmEntry();
                    _fsp--;

                     after(grammarAccess.getSimpleLineAccess().getVmEntryParserRuleCall_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:413:6: ( RULE_STR )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:413:6: ( RULE_STR )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:414:1: RULE_STR
                    {
                     before(grammarAccess.getSimpleLineAccess().getSTRTerminalRuleCall_3_1()); 
                    match(input,RULE_STR,FOLLOW_RULE_STR_in_rule__SimpleLine__Alternatives_3852); 
                     after(grammarAccess.getSimpleLineAccess().getSTRTerminalRuleCall_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleLine__Alternatives_3


    // $ANTLR start rule__ComplexLine__Alternatives_1
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:424:1: rule__ComplexLine__Alternatives_1 : ( ( ruleVmEntry ) | ( RULE_STR ) );
    public final void rule__ComplexLine__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:428:1: ( ( ruleVmEntry ) | ( RULE_STR ) )
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
                    new NoViableAltException("424:1: rule__ComplexLine__Alternatives_1 : ( ( ruleVmEntry ) | ( RULE_STR ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:429:1: ( ruleVmEntry )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:429:1: ( ruleVmEntry )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:430:1: ruleVmEntry
                    {
                     before(grammarAccess.getComplexLineAccess().getVmEntryParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleVmEntry_in_rule__ComplexLine__Alternatives_1884);
                    ruleVmEntry();
                    _fsp--;

                     after(grammarAccess.getComplexLineAccess().getVmEntryParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:435:6: ( RULE_STR )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:435:6: ( RULE_STR )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:436:1: RULE_STR
                    {
                     before(grammarAccess.getComplexLineAccess().getSTRTerminalRuleCall_1_1()); 
                    match(input,RULE_STR,FOLLOW_RULE_STR_in_rule__ComplexLine__Alternatives_1901); 
                     after(grammarAccess.getComplexLineAccess().getSTRTerminalRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexLine__Alternatives_1


    // $ANTLR start rule__VmStatement__Alternatives
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:446:1: rule__VmStatement__Alternatives : ( ( RULE_SIMPLEVMSTATEMENT ) | ( ruleComplexVmStatement ) );
    public final void rule__VmStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:450:1: ( ( RULE_SIMPLEVMSTATEMENT ) | ( ruleComplexVmStatement ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_SIMPLEVMSTATEMENT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_SPACE||LA7_1==20) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||LA7_1==RULE_SIMPLEVMSTATEMENT||(LA7_1>=14 && LA7_1<=15)||LA7_1==17) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("446:1: rule__VmStatement__Alternatives : ( ( RULE_SIMPLEVMSTATEMENT ) | ( ruleComplexVmStatement ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("446:1: rule__VmStatement__Alternatives : ( ( RULE_SIMPLEVMSTATEMENT ) | ( ruleComplexVmStatement ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:451:1: ( RULE_SIMPLEVMSTATEMENT )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:451:1: ( RULE_SIMPLEVMSTATEMENT )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:452:1: RULE_SIMPLEVMSTATEMENT
                    {
                     before(grammarAccess.getVmStatementAccess().getSimpleVmStatementTerminalRuleCall_0()); 
                    match(input,RULE_SIMPLEVMSTATEMENT,FOLLOW_RULE_SIMPLEVMSTATEMENT_in_rule__VmStatement__Alternatives933); 
                     after(grammarAccess.getVmStatementAccess().getSimpleVmStatementTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:457:6: ( ruleComplexVmStatement )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:457:6: ( ruleComplexVmStatement )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:458:1: ruleComplexVmStatement
                    {
                     before(grammarAccess.getVmStatementAccess().getComplexVmStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComplexVmStatement_in_rule__VmStatement__Alternatives950);
                    ruleComplexVmStatement();
                    _fsp--;

                     after(grammarAccess.getVmStatementAccess().getComplexVmStatementParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VmStatement__Alternatives


    // $ANTLR start rule__ComplexVmStatement__Alternatives_4
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:468:1: rule__ComplexVmStatement__Alternatives_4 : ( ( ruleVmEntry ) | ( RULE_QUOTEDSTRING ) );
    public final void rule__ComplexVmStatement__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:472:1: ( ( ruleVmEntry ) | ( RULE_QUOTEDSTRING ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_SIMPLEVMENTRY && LA8_0<=RULE_BRACEDVMENTRY)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_QUOTEDSTRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("468:1: rule__ComplexVmStatement__Alternatives_4 : ( ( ruleVmEntry ) | ( RULE_QUOTEDSTRING ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:473:1: ( ruleVmEntry )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:473:1: ( ruleVmEntry )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:474:1: ruleVmEntry
                    {
                     before(grammarAccess.getComplexVmStatementAccess().getVmEntryParserRuleCall_4_0()); 
                    pushFollow(FOLLOW_ruleVmEntry_in_rule__ComplexVmStatement__Alternatives_4982);
                    ruleVmEntry();
                    _fsp--;

                     after(grammarAccess.getComplexVmStatementAccess().getVmEntryParserRuleCall_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:479:6: ( RULE_QUOTEDSTRING )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:479:6: ( RULE_QUOTEDSTRING )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:480:1: RULE_QUOTEDSTRING
                    {
                     before(grammarAccess.getComplexVmStatementAccess().getQUOTEDSTRINGTerminalRuleCall_4_1()); 
                    match(input,RULE_QUOTEDSTRING,FOLLOW_RULE_QUOTEDSTRING_in_rule__ComplexVmStatement__Alternatives_4999); 
                     after(grammarAccess.getComplexVmStatementAccess().getQUOTEDSTRINGTerminalRuleCall_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexVmStatement__Alternatives_4


    // $ANTLR start rule__ComplexVmStatement__Alternatives_8
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:490:1: rule__ComplexVmStatement__Alternatives_8 : ( ( ruleVmEntry ) | ( RULE_QUOTEDSTRING ) );
    public final void rule__ComplexVmStatement__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:494:1: ( ( ruleVmEntry ) | ( RULE_QUOTEDSTRING ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_SIMPLEVMENTRY && LA9_0<=RULE_BRACEDVMENTRY)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_QUOTEDSTRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("490:1: rule__ComplexVmStatement__Alternatives_8 : ( ( ruleVmEntry ) | ( RULE_QUOTEDSTRING ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:495:1: ( ruleVmEntry )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:495:1: ( ruleVmEntry )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:496:1: ruleVmEntry
                    {
                     before(grammarAccess.getComplexVmStatementAccess().getVmEntryParserRuleCall_8_0()); 
                    pushFollow(FOLLOW_ruleVmEntry_in_rule__ComplexVmStatement__Alternatives_81031);
                    ruleVmEntry();
                    _fsp--;

                     after(grammarAccess.getComplexVmStatementAccess().getVmEntryParserRuleCall_8_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:501:6: ( RULE_QUOTEDSTRING )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:501:6: ( RULE_QUOTEDSTRING )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:502:1: RULE_QUOTEDSTRING
                    {
                     before(grammarAccess.getComplexVmStatementAccess().getQUOTEDSTRINGTerminalRuleCall_8_1()); 
                    match(input,RULE_QUOTEDSTRING,FOLLOW_RULE_QUOTEDSTRING_in_rule__ComplexVmStatement__Alternatives_81048); 
                     after(grammarAccess.getComplexVmStatementAccess().getQUOTEDSTRINGTerminalRuleCall_8_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexVmStatement__Alternatives_8


    // $ANTLR start rule__VmEntry__Alternatives
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:512:1: rule__VmEntry__Alternatives : ( ( RULE_SIMPLEVMENTRY ) | ( RULE_BRACEDVMENTRY ) );
    public final void rule__VmEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:516:1: ( ( RULE_SIMPLEVMENTRY ) | ( RULE_BRACEDVMENTRY ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_SIMPLEVMENTRY) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_BRACEDVMENTRY) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("512:1: rule__VmEntry__Alternatives : ( ( RULE_SIMPLEVMENTRY ) | ( RULE_BRACEDVMENTRY ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:517:1: ( RULE_SIMPLEVMENTRY )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:517:1: ( RULE_SIMPLEVMENTRY )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:518:1: RULE_SIMPLEVMENTRY
                    {
                     before(grammarAccess.getVmEntryAccess().getSimpleVmEntryTerminalRuleCall_0()); 
                    match(input,RULE_SIMPLEVMENTRY,FOLLOW_RULE_SIMPLEVMENTRY_in_rule__VmEntry__Alternatives1080); 
                     after(grammarAccess.getVmEntryAccess().getSimpleVmEntryTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:523:6: ( RULE_BRACEDVMENTRY )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:523:6: ( RULE_BRACEDVMENTRY )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:524:1: RULE_BRACEDVMENTRY
                    {
                     before(grammarAccess.getVmEntryAccess().getBracedVmEntryTerminalRuleCall_1()); 
                    match(input,RULE_BRACEDVMENTRY,FOLLOW_RULE_BRACEDVMENTRY_in_rule__VmEntry__Alternatives1097); 
                     after(grammarAccess.getVmEntryAccess().getBracedVmEntryTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VmEntry__Alternatives


    // $ANTLR start rule__Statement__Alternatives
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:534:1: rule__Statement__Alternatives : ( ( ruleVmEntry ) | ( ( rule__Statement__Group_1__0 ) ) | ( RULE_STR ) | ( ( rule__Statement__Group_3__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:538:1: ( ( ruleVmEntry ) | ( ( rule__Statement__Group_1__0 ) ) | ( RULE_STR ) | ( ( rule__Statement__Group_3__0 ) ) )
            int alt11=4;
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
                alt11=2;
                }
                break;
            case RULE_STR:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("534:1: rule__Statement__Alternatives : ( ( ruleVmEntry ) | ( ( rule__Statement__Group_1__0 ) ) | ( RULE_STR ) | ( ( rule__Statement__Group_3__0 ) ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:539:1: ( ruleVmEntry )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:539:1: ( ruleVmEntry )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:540:1: ruleVmEntry
                    {
                     before(grammarAccess.getStatementAccess().getVmEntryParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVmEntry_in_rule__Statement__Alternatives1129);
                    ruleVmEntry();
                    _fsp--;

                     after(grammarAccess.getStatementAccess().getVmEntryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:545:6: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:545:6: ( ( rule__Statement__Group_1__0 ) )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:546:1: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:547:1: ( rule__Statement__Group_1__0 )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:547:2: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives1146);
                    rule__Statement__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:551:6: ( RULE_STR )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:551:6: ( RULE_STR )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:552:1: RULE_STR
                    {
                     before(grammarAccess.getStatementAccess().getSTRTerminalRuleCall_2()); 
                    match(input,RULE_STR,FOLLOW_RULE_STR_in_rule__Statement__Alternatives1164); 
                     after(grammarAccess.getStatementAccess().getSTRTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:557:6: ( ( rule__Statement__Group_3__0 ) )
                    {
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:557:6: ( ( rule__Statement__Group_3__0 ) )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:558:1: ( rule__Statement__Group_3__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_3()); 
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:559:1: ( rule__Statement__Group_3__0 )
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:559:2: rule__Statement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_3__0_in_rule__Statement__Alternatives1181);
                    rule__Statement__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Alternatives


    // $ANTLR start rule__Message__Group__0
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:570:1: rule__Message__Group__0 : ( ( ( rule__Message__ElementsAssignment_0 ) ) ( ( rule__Message__ElementsAssignment_0 )* ) ) rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:574:1: ( ( ( ( rule__Message__ElementsAssignment_0 ) ) ( ( rule__Message__ElementsAssignment_0 )* ) ) rule__Message__Group__1 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:575:1: ( ( ( rule__Message__ElementsAssignment_0 ) ) ( ( rule__Message__ElementsAssignment_0 )* ) ) rule__Message__Group__1
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:575:1: ( ( ( rule__Message__ElementsAssignment_0 ) ) ( ( rule__Message__ElementsAssignment_0 )* ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:576:1: ( ( rule__Message__ElementsAssignment_0 ) ) ( ( rule__Message__ElementsAssignment_0 )* )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:576:1: ( ( rule__Message__ElementsAssignment_0 ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:577:1: ( rule__Message__ElementsAssignment_0 )
            {
             before(grammarAccess.getMessageAccess().getElementsAssignment_0()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:578:1: ( rule__Message__ElementsAssignment_0 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:578:2: rule__Message__ElementsAssignment_0
            {
            pushFollow(FOLLOW_rule__Message__ElementsAssignment_0_in_rule__Message__Group__01218);
            rule__Message__ElementsAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMessageAccess().getElementsAssignment_0()); 

            }

            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:581:1: ( ( rule__Message__ElementsAssignment_0 )* )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:582:1: ( rule__Message__ElementsAssignment_0 )*
            {
             before(grammarAccess.getMessageAccess().getElementsAssignment_0()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:583:1: ( rule__Message__ElementsAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==12) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==RULE_STR) ) {
                        int LA12_2 = input.LA(3);

                        if ( (LA12_2==15) ) {
                            alt12=1;
                        }


                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:583:2: rule__Message__ElementsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Message__ElementsAssignment_0_in_rule__Message__Group__01230);
            	    rule__Message__ElementsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMessageAccess().getElementsAssignment_0()); 

            }


            }

            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__01242);
            rule__Message__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Message__Group__0


    // $ANTLR start rule__Message__Group__1
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:595:1: rule__Message__Group__1 : ( '{' ) rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:599:1: ( ( '{' ) rule__Message__Group__2 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:600:1: ( '{' ) rule__Message__Group__2
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:600:1: ( '{' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:601:1: '{'
            {
             before(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Message__Group__11271); 
             after(grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Message__Group__2_in_rule__Message__Group__11281);
            rule__Message__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Message__Group__1


    // $ANTLR start rule__Message__Group__2
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:615:1: rule__Message__Group__2 : ( RULE_STR ) rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:619:1: ( ( RULE_STR ) rule__Message__Group__3 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:620:1: ( RULE_STR ) rule__Message__Group__3
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:620:1: ( RULE_STR )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:621:1: RULE_STR
            {
             before(grammarAccess.getMessageAccess().getSTRTerminalRuleCall_2()); 
            match(input,RULE_STR,FOLLOW_RULE_STR_in_rule__Message__Group__21309); 
             after(grammarAccess.getMessageAccess().getSTRTerminalRuleCall_2()); 

            }

            pushFollow(FOLLOW_rule__Message__Group__3_in_rule__Message__Group__21317);
            rule__Message__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Message__Group__2


    // $ANTLR start rule__Message__Group__3
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:633:1: rule__Message__Group__3 : ( ':\\n' ) rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:637:1: ( ( ':\\n' ) rule__Message__Group__4 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:638:1: ( ':\\n' ) rule__Message__Group__4
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:638:1: ( ':\\n' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:639:1: ':\\n'
            {
             before(grammarAccess.getMessageAccess().getColonKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Message__Group__31346); 
             after(grammarAccess.getMessageAccess().getColonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Message__Group__4_in_rule__Message__Group__31356);
            rule__Message__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Message__Group__3


    // $ANTLR start rule__Message__Group__4
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:653:1: rule__Message__Group__4 : ( ( ( rule__Message__ElementsAssignment_4 ) ) ( ( rule__Message__ElementsAssignment_4 )* ) ) rule__Message__Group__5 ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:657:1: ( ( ( ( rule__Message__ElementsAssignment_4 ) ) ( ( rule__Message__ElementsAssignment_4 )* ) ) rule__Message__Group__5 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:658:1: ( ( ( rule__Message__ElementsAssignment_4 ) ) ( ( rule__Message__ElementsAssignment_4 )* ) ) rule__Message__Group__5
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:658:1: ( ( ( rule__Message__ElementsAssignment_4 ) ) ( ( rule__Message__ElementsAssignment_4 )* ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:659:1: ( ( rule__Message__ElementsAssignment_4 ) ) ( ( rule__Message__ElementsAssignment_4 )* )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:659:1: ( ( rule__Message__ElementsAssignment_4 ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:660:1: ( rule__Message__ElementsAssignment_4 )
            {
             before(grammarAccess.getMessageAccess().getElementsAssignment_4()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:661:1: ( rule__Message__ElementsAssignment_4 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:661:2: rule__Message__ElementsAssignment_4
            {
            pushFollow(FOLLOW_rule__Message__ElementsAssignment_4_in_rule__Message__Group__41386);
            rule__Message__ElementsAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getMessageAccess().getElementsAssignment_4()); 

            }

            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:664:1: ( ( rule__Message__ElementsAssignment_4 )* )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:665:1: ( rule__Message__ElementsAssignment_4 )*
            {
             before(grammarAccess.getMessageAccess().getElementsAssignment_4()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:666:1: ( rule__Message__ElementsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_SIMPLEVMSTATEMENT||LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:666:2: rule__Message__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Message__ElementsAssignment_4_in_rule__Message__Group__41398);
            	    rule__Message__ElementsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMessageAccess().getElementsAssignment_4()); 

            }


            }

            pushFollow(FOLLOW_rule__Message__Group__5_in_rule__Message__Group__41410);
            rule__Message__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Message__Group__4


    // $ANTLR start rule__Message__Group__5
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:678:1: rule__Message__Group__5 : ( '-}' ) ;
    public final void rule__Message__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:682:1: ( ( '-}' ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:683:1: ( '-}' )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:683:1: ( '-}' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:684:1: '-}'
            {
             before(grammarAccess.getMessageAccess().getHyphenMinusRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Message__Group__51439); 
             after(grammarAccess.getMessageAccess().getHyphenMinusRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Message__Group__5


    // $ANTLR start rule__ComplexBeginningLine__Group__0
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:709:1: rule__ComplexBeginningLine__Group__0 : ( '{' ) rule__ComplexBeginningLine__Group__1 ;
    public final void rule__ComplexBeginningLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:713:1: ( ( '{' ) rule__ComplexBeginningLine__Group__1 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:714:1: ( '{' ) rule__ComplexBeginningLine__Group__1
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:714:1: ( '{' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:715:1: '{'
            {
             before(grammarAccess.getComplexBeginningLineAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__ComplexBeginningLine__Group__01487); 
             after(grammarAccess.getComplexBeginningLineAccess().getLeftCurlyBracketKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ComplexBeginningLine__Group__1_in_rule__ComplexBeginningLine__Group__01497);
            rule__ComplexBeginningLine__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexBeginningLine__Group__0


    // $ANTLR start rule__ComplexBeginningLine__Group__1
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:729:1: rule__ComplexBeginningLine__Group__1 : ( RULE_STR ) rule__ComplexBeginningLine__Group__2 ;
    public final void rule__ComplexBeginningLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:733:1: ( ( RULE_STR ) rule__ComplexBeginningLine__Group__2 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:734:1: ( RULE_STR ) rule__ComplexBeginningLine__Group__2
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:734:1: ( RULE_STR )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:735:1: RULE_STR
            {
             before(grammarAccess.getComplexBeginningLineAccess().getSTRTerminalRuleCall_1()); 
            match(input,RULE_STR,FOLLOW_RULE_STR_in_rule__ComplexBeginningLine__Group__11525); 
             after(grammarAccess.getComplexBeginningLineAccess().getSTRTerminalRuleCall_1()); 

            }

            pushFollow(FOLLOW_rule__ComplexBeginningLine__Group__2_in_rule__ComplexBeginningLine__Group__11533);
            rule__ComplexBeginningLine__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexBeginningLine__Group__1


    // $ANTLR start rule__ComplexBeginningLine__Group__2
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:747:1: rule__ComplexBeginningLine__Group__2 : ( ':' ) rule__ComplexBeginningLine__Group__3 ;
    public final void rule__ComplexBeginningLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:751:1: ( ( ':' ) rule__ComplexBeginningLine__Group__3 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:752:1: ( ':' ) rule__ComplexBeginningLine__Group__3
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:752:1: ( ':' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:753:1: ':'
            {
             before(grammarAccess.getComplexBeginningLineAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__ComplexBeginningLine__Group__21562); 
             after(grammarAccess.getComplexBeginningLineAccess().getColonKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__ComplexBeginningLine__Group__3_in_rule__ComplexBeginningLine__Group__21572);
            rule__ComplexBeginningLine__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexBeginningLine__Group__2


    // $ANTLR start rule__ComplexBeginningLine__Group__3
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:767:1: rule__ComplexBeginningLine__Group__3 : ( ruleBeginningLine ) rule__ComplexBeginningLine__Group__4 ;
    public final void rule__ComplexBeginningLine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:771:1: ( ( ruleBeginningLine ) rule__ComplexBeginningLine__Group__4 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:772:1: ( ruleBeginningLine ) rule__ComplexBeginningLine__Group__4
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:772:1: ( ruleBeginningLine )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:773:1: ruleBeginningLine
            {
             before(grammarAccess.getComplexBeginningLineAccess().getBeginningLineParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleBeginningLine_in_rule__ComplexBeginningLine__Group__31600);
            ruleBeginningLine();
            _fsp--;

             after(grammarAccess.getComplexBeginningLineAccess().getBeginningLineParserRuleCall_3()); 

            }

            pushFollow(FOLLOW_rule__ComplexBeginningLine__Group__4_in_rule__ComplexBeginningLine__Group__31608);
            rule__ComplexBeginningLine__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexBeginningLine__Group__3


    // $ANTLR start rule__ComplexBeginningLine__Group__4
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:785:1: rule__ComplexBeginningLine__Group__4 : ( '}' ) ;
    public final void rule__ComplexBeginningLine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:789:1: ( ( '}' ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:790:1: ( '}' )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:790:1: ( '}' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:791:1: '}'
            {
             before(grammarAccess.getComplexBeginningLineAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__ComplexBeginningLine__Group__41637); 
             after(grammarAccess.getComplexBeginningLineAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexBeginningLine__Group__4


    // $ANTLR start rule__BeginningLine__Group__0
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:814:1: rule__BeginningLine__Group__0 : ( '{' ) rule__BeginningLine__Group__1 ;
    public final void rule__BeginningLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:818:1: ( ( '{' ) rule__BeginningLine__Group__1 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:819:1: ( '{' ) rule__BeginningLine__Group__1
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:819:1: ( '{' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:820:1: '{'
            {
             before(grammarAccess.getBeginningLineAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__BeginningLine__Group__01683); 
             after(grammarAccess.getBeginningLineAccess().getLeftCurlyBracketKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__BeginningLine__Group__1_in_rule__BeginningLine__Group__01693);
            rule__BeginningLine__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BeginningLine__Group__0


    // $ANTLR start rule__BeginningLine__Group__1
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:834:1: rule__BeginningLine__Group__1 : ( RULE_STR ) rule__BeginningLine__Group__2 ;
    public final void rule__BeginningLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:838:1: ( ( RULE_STR ) rule__BeginningLine__Group__2 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:839:1: ( RULE_STR ) rule__BeginningLine__Group__2
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:839:1: ( RULE_STR )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:840:1: RULE_STR
            {
             before(grammarAccess.getBeginningLineAccess().getSTRTerminalRuleCall_1()); 
            match(input,RULE_STR,FOLLOW_RULE_STR_in_rule__BeginningLine__Group__11721); 
             after(grammarAccess.getBeginningLineAccess().getSTRTerminalRuleCall_1()); 

            }

            pushFollow(FOLLOW_rule__BeginningLine__Group__2_in_rule__BeginningLine__Group__11729);
            rule__BeginningLine__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BeginningLine__Group__1


    // $ANTLR start rule__BeginningLine__Group__2
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:852:1: rule__BeginningLine__Group__2 : ( ':' ) rule__BeginningLine__Group__3 ;
    public final void rule__BeginningLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:856:1: ( ( ':' ) rule__BeginningLine__Group__3 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:857:1: ( ':' ) rule__BeginningLine__Group__3
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:857:1: ( ':' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:858:1: ':'
            {
             before(grammarAccess.getBeginningLineAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__BeginningLine__Group__21758); 
             after(grammarAccess.getBeginningLineAccess().getColonKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__BeginningLine__Group__3_in_rule__BeginningLine__Group__21768);
            rule__BeginningLine__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BeginningLine__Group__2


    // $ANTLR start rule__BeginningLine__Group__3
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:872:1: rule__BeginningLine__Group__3 : ( ruleStatement ) rule__BeginningLine__Group__4 ;
    public final void rule__BeginningLine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:876:1: ( ( ruleStatement ) rule__BeginningLine__Group__4 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:877:1: ( ruleStatement ) rule__BeginningLine__Group__4
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:877:1: ( ruleStatement )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:878:1: ruleStatement
            {
             before(grammarAccess.getBeginningLineAccess().getStatementParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__BeginningLine__Group__31796);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getBeginningLineAccess().getStatementParserRuleCall_3()); 

            }

            pushFollow(FOLLOW_rule__BeginningLine__Group__4_in_rule__BeginningLine__Group__31804);
            rule__BeginningLine__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BeginningLine__Group__3


    // $ANTLR start rule__BeginningLine__Group__4
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:890:1: rule__BeginningLine__Group__4 : ( '}' ) ;
    public final void rule__BeginningLine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:894:1: ( ( '}' ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:895:1: ( '}' )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:895:1: ( '}' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:896:1: '}'
            {
             before(grammarAccess.getBeginningLineAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__BeginningLine__Group__41833); 
             after(grammarAccess.getBeginningLineAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BeginningLine__Group__4


    // $ANTLR start rule__Line__Group__0
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:919:1: rule__Line__Group__0 : ( ( rule__Line__Alternatives_0 ) ) rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:923:1: ( ( ( rule__Line__Alternatives_0 ) ) rule__Line__Group__1 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:924:1: ( ( rule__Line__Alternatives_0 ) ) rule__Line__Group__1
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:924:1: ( ( rule__Line__Alternatives_0 ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:925:1: ( rule__Line__Alternatives_0 )
            {
             before(grammarAccess.getLineAccess().getAlternatives_0()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:926:1: ( rule__Line__Alternatives_0 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:926:2: rule__Line__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Line__Alternatives_0_in_rule__Line__Group__01878);
            rule__Line__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getLineAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__Line__Group__1_in_rule__Line__Group__01887);
            rule__Line__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Line__Group__0


    // $ANTLR start rule__Line__Group__1
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:937:1: rule__Line__Group__1 : ( ( '\\n' )? ) ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:941:1: ( ( ( '\\n' )? ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:942:1: ( ( '\\n' )? )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:942:1: ( ( '\\n' )? )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:943:1: ( '\\n' )?
            {
             before(grammarAccess.getLineAccess().getKeyword_1()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:944:1: ( '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:945:2: '\\n'
                    {
                    match(input,17,FOLLOW_17_in_rule__Line__Group__11917); 

                    }
                    break;

            }

             after(grammarAccess.getLineAccess().getKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Line__Group__1


    // $ANTLR start rule__SimpleLine__Group__0
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:960:1: rule__SimpleLine__Group__0 : ( ':' ) rule__SimpleLine__Group__1 ;
    public final void rule__SimpleLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:964:1: ( ( ':' ) rule__SimpleLine__Group__1 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:965:1: ( ':' ) rule__SimpleLine__Group__1
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:965:1: ( ':' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:966:1: ':'
            {
             before(grammarAccess.getSimpleLineAccess().getColonKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__SimpleLine__Group__01959); 
             after(grammarAccess.getSimpleLineAccess().getColonKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleLine__Group__1_in_rule__SimpleLine__Group__01969);
            rule__SimpleLine__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleLine__Group__0


    // $ANTLR start rule__SimpleLine__Group__1
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:980:1: rule__SimpleLine__Group__1 : ( ( rule__SimpleLine__Alternatives_1 ) ) rule__SimpleLine__Group__2 ;
    public final void rule__SimpleLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:984:1: ( ( ( rule__SimpleLine__Alternatives_1 ) ) rule__SimpleLine__Group__2 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:985:1: ( ( rule__SimpleLine__Alternatives_1 ) ) rule__SimpleLine__Group__2
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:985:1: ( ( rule__SimpleLine__Alternatives_1 ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:986:1: ( rule__SimpleLine__Alternatives_1 )
            {
             before(grammarAccess.getSimpleLineAccess().getAlternatives_1()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:987:1: ( rule__SimpleLine__Alternatives_1 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:987:2: rule__SimpleLine__Alternatives_1
            {
            pushFollow(FOLLOW_rule__SimpleLine__Alternatives_1_in_rule__SimpleLine__Group__11997);
            rule__SimpleLine__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getSimpleLineAccess().getAlternatives_1()); 

            }

            pushFollow(FOLLOW_rule__SimpleLine__Group__2_in_rule__SimpleLine__Group__12006);
            rule__SimpleLine__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleLine__Group__1


    // $ANTLR start rule__SimpleLine__Group__2
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:998:1: rule__SimpleLine__Group__2 : ( ':' ) rule__SimpleLine__Group__3 ;
    public final void rule__SimpleLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1002:1: ( ( ':' ) rule__SimpleLine__Group__3 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1003:1: ( ':' ) rule__SimpleLine__Group__3
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1003:1: ( ':' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1004:1: ':'
            {
             before(grammarAccess.getSimpleLineAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__SimpleLine__Group__22035); 
             after(grammarAccess.getSimpleLineAccess().getColonKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__SimpleLine__Group__3_in_rule__SimpleLine__Group__22045);
            rule__SimpleLine__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleLine__Group__2


    // $ANTLR start rule__SimpleLine__Group__3
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1018:1: rule__SimpleLine__Group__3 : ( ( rule__SimpleLine__Alternatives_3 ) ) ;
    public final void rule__SimpleLine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1022:1: ( ( ( rule__SimpleLine__Alternatives_3 ) ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1023:1: ( ( rule__SimpleLine__Alternatives_3 ) )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1023:1: ( ( rule__SimpleLine__Alternatives_3 ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1024:1: ( rule__SimpleLine__Alternatives_3 )
            {
             before(grammarAccess.getSimpleLineAccess().getAlternatives_3()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1025:1: ( rule__SimpleLine__Alternatives_3 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1025:2: rule__SimpleLine__Alternatives_3
            {
            pushFollow(FOLLOW_rule__SimpleLine__Alternatives_3_in_rule__SimpleLine__Group__32073);
            rule__SimpleLine__Alternatives_3();
            _fsp--;


            }

             after(grammarAccess.getSimpleLineAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleLine__Group__3


    // $ANTLR start rule__ComplexLine__Group__0
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1043:1: rule__ComplexLine__Group__0 : ( ':' ) rule__ComplexLine__Group__1 ;
    public final void rule__ComplexLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1047:1: ( ( ':' ) rule__ComplexLine__Group__1 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1048:1: ( ':' ) rule__ComplexLine__Group__1
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1048:1: ( ':' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1049:1: ':'
            {
             before(grammarAccess.getComplexLineAccess().getColonKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__ComplexLine__Group__02116); 
             after(grammarAccess.getComplexLineAccess().getColonKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ComplexLine__Group__1_in_rule__ComplexLine__Group__02126);
            rule__ComplexLine__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexLine__Group__0


    // $ANTLR start rule__ComplexLine__Group__1
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1063:1: rule__ComplexLine__Group__1 : ( ( rule__ComplexLine__Alternatives_1 ) ) rule__ComplexLine__Group__2 ;
    public final void rule__ComplexLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1067:1: ( ( ( rule__ComplexLine__Alternatives_1 ) ) rule__ComplexLine__Group__2 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1068:1: ( ( rule__ComplexLine__Alternatives_1 ) ) rule__ComplexLine__Group__2
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1068:1: ( ( rule__ComplexLine__Alternatives_1 ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1069:1: ( rule__ComplexLine__Alternatives_1 )
            {
             before(grammarAccess.getComplexLineAccess().getAlternatives_1()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1070:1: ( rule__ComplexLine__Alternatives_1 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1070:2: rule__ComplexLine__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ComplexLine__Alternatives_1_in_rule__ComplexLine__Group__12154);
            rule__ComplexLine__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getComplexLineAccess().getAlternatives_1()); 

            }

            pushFollow(FOLLOW_rule__ComplexLine__Group__2_in_rule__ComplexLine__Group__12163);
            rule__ComplexLine__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexLine__Group__1


    // $ANTLR start rule__ComplexLine__Group__2
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1081:1: rule__ComplexLine__Group__2 : ( '::' ) rule__ComplexLine__Group__3 ;
    public final void rule__ComplexLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1085:1: ( ( '::' ) rule__ComplexLine__Group__3 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1086:1: ( '::' ) rule__ComplexLine__Group__3
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1086:1: ( '::' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1087:1: '::'
            {
             before(grammarAccess.getComplexLineAccess().getColonColonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__ComplexLine__Group__22192); 
             after(grammarAccess.getComplexLineAccess().getColonColonKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__ComplexLine__Group__3_in_rule__ComplexLine__Group__22202);
            rule__ComplexLine__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexLine__Group__2


    // $ANTLR start rule__ComplexLine__Group__3
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1101:1: rule__ComplexLine__Group__3 : ( ruleStatement ) rule__ComplexLine__Group__4 ;
    public final void rule__ComplexLine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1105:1: ( ( ruleStatement ) rule__ComplexLine__Group__4 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1106:1: ( ruleStatement ) rule__ComplexLine__Group__4
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1106:1: ( ruleStatement )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1107:1: ruleStatement
            {
             before(grammarAccess.getComplexLineAccess().getStatementParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__ComplexLine__Group__32230);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getComplexLineAccess().getStatementParserRuleCall_3()); 

            }

            pushFollow(FOLLOW_rule__ComplexLine__Group__4_in_rule__ComplexLine__Group__32238);
            rule__ComplexLine__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexLine__Group__3


    // $ANTLR start rule__ComplexLine__Group__4
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1119:1: rule__ComplexLine__Group__4 : ( '/' ) rule__ComplexLine__Group__5 ;
    public final void rule__ComplexLine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1123:1: ( ( '/' ) rule__ComplexLine__Group__5 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1124:1: ( '/' ) rule__ComplexLine__Group__5
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1124:1: ( '/' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1125:1: '/'
            {
             before(grammarAccess.getComplexLineAccess().getSolidusKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__ComplexLine__Group__42267); 
             after(grammarAccess.getComplexLineAccess().getSolidusKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__ComplexLine__Group__5_in_rule__ComplexLine__Group__42277);
            rule__ComplexLine__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexLine__Group__4


    // $ANTLR start rule__ComplexLine__Group__5
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1139:1: rule__ComplexLine__Group__5 : ( ( ruleStatement )? ) rule__ComplexLine__Group__6 ;
    public final void rule__ComplexLine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1143:1: ( ( ( ruleStatement )? ) rule__ComplexLine__Group__6 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1144:1: ( ( ruleStatement )? ) rule__ComplexLine__Group__6
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1144:1: ( ( ruleStatement )? )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1145:1: ( ruleStatement )?
            {
             before(grammarAccess.getComplexLineAccess().getStatementParserRuleCall_5()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1146:1: ( ruleStatement )?
            int alt15=2;
            switch ( input.LA(1) ) {
                case RULE_SIMPLEVMENTRY:
                    {
                    alt15=1;
                    }
                    break;
                case RULE_BRACEDVMENTRY:
                    {
                    alt15=1;
                    }
                    break;
                case 22:
                    {
                    alt15=1;
                    }
                    break;
                case RULE_STR:
                    {
                    alt15=1;
                    }
                    break;
                case 19:
                    {
                    alt15=1;
                    }
                    break;
                case EOF:
                    {
                    alt15=1;
                    }
                    break;
                case 17:
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
                case 14:
                    {
                    alt15=1;
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1146:3: ruleStatement
                    {
                    pushFollow(FOLLOW_ruleStatement_in_rule__ComplexLine__Group__52306);
                    ruleStatement();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexLineAccess().getStatementParserRuleCall_5()); 

            }

            pushFollow(FOLLOW_rule__ComplexLine__Group__6_in_rule__ComplexLine__Group__52316);
            rule__ComplexLine__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexLine__Group__5


    // $ANTLR start rule__ComplexLine__Group__6
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1157:1: rule__ComplexLine__Group__6 : ( ( '/' )? ) rule__ComplexLine__Group__7 ;
    public final void rule__ComplexLine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1161:1: ( ( ( '/' )? ) rule__ComplexLine__Group__7 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1162:1: ( ( '/' )? ) rule__ComplexLine__Group__7
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1162:1: ( ( '/' )? )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1163:1: ( '/' )?
            {
             before(grammarAccess.getComplexLineAccess().getSolidusKeyword_6()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1164:1: ( '/' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1165:2: '/'
                    {
                    match(input,19,FOLLOW_19_in_rule__ComplexLine__Group__62346); 

                    }
                    break;

            }

             after(grammarAccess.getComplexLineAccess().getSolidusKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__ComplexLine__Group__7_in_rule__ComplexLine__Group__62358);
            rule__ComplexLine__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexLine__Group__6


    // $ANTLR start rule__ComplexLine__Group__7
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1177:1: rule__ComplexLine__Group__7 : ( ( ruleStatement )? ) rule__ComplexLine__Group__8 ;
    public final void rule__ComplexLine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1181:1: ( ( ( ruleStatement )? ) rule__ComplexLine__Group__8 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1182:1: ( ( ruleStatement )? ) rule__ComplexLine__Group__8
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1182:1: ( ( ruleStatement )? )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1183:1: ( ruleStatement )?
            {
             before(grammarAccess.getComplexLineAccess().getStatementParserRuleCall_7()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1184:1: ( ruleStatement )?
            int alt17=2;
            switch ( input.LA(1) ) {
                case RULE_SIMPLEVMENTRY:
                    {
                    alt17=1;
                    }
                    break;
                case RULE_BRACEDVMENTRY:
                    {
                    alt17=1;
                    }
                    break;
                case 22:
                    {
                    alt17=1;
                    }
                    break;
                case RULE_STR:
                    {
                    alt17=1;
                    }
                    break;
                case 19:
                    {
                    alt17=1;
                    }
                    break;
                case EOF:
                    {
                    alt17=1;
                    }
                    break;
                case 17:
                    {
                    alt17=1;
                    }
                    break;
                case 15:
                    {
                    alt17=1;
                    }
                    break;
                case RULE_SIMPLEVMSTATEMENT:
                    {
                    alt17=1;
                    }
                    break;
                case 14:
                    {
                    alt17=1;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1184:3: ruleStatement
                    {
                    pushFollow(FOLLOW_ruleStatement_in_rule__ComplexLine__Group__72387);
                    ruleStatement();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexLineAccess().getStatementParserRuleCall_7()); 

            }

            pushFollow(FOLLOW_rule__ComplexLine__Group__8_in_rule__ComplexLine__Group__72397);
            rule__ComplexLine__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexLine__Group__7


    // $ANTLR start rule__ComplexLine__Group__8
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1195:1: rule__ComplexLine__Group__8 : ( ( '/' )? ) rule__ComplexLine__Group__9 ;
    public final void rule__ComplexLine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1199:1: ( ( ( '/' )? ) rule__ComplexLine__Group__9 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1200:1: ( ( '/' )? ) rule__ComplexLine__Group__9
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1200:1: ( ( '/' )? )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1201:1: ( '/' )?
            {
             before(grammarAccess.getComplexLineAccess().getSolidusKeyword_8()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1202:1: ( '/' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1203:2: '/'
                    {
                    match(input,19,FOLLOW_19_in_rule__ComplexLine__Group__82427); 

                    }
                    break;

            }

             after(grammarAccess.getComplexLineAccess().getSolidusKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__ComplexLine__Group__9_in_rule__ComplexLine__Group__82439);
            rule__ComplexLine__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexLine__Group__8


    // $ANTLR start rule__ComplexLine__Group__9
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1215:1: rule__ComplexLine__Group__9 : ( ( ruleStatement )? ) rule__ComplexLine__Group__10 ;
    public final void rule__ComplexLine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1219:1: ( ( ( ruleStatement )? ) rule__ComplexLine__Group__10 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1220:1: ( ( ruleStatement )? ) rule__ComplexLine__Group__10
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1220:1: ( ( ruleStatement )? )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1221:1: ( ruleStatement )?
            {
             before(grammarAccess.getComplexLineAccess().getStatementParserRuleCall_9()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1222:1: ( ruleStatement )?
            int alt19=2;
            switch ( input.LA(1) ) {
                case RULE_SIMPLEVMENTRY:
                    {
                    alt19=1;
                    }
                    break;
                case RULE_BRACEDVMENTRY:
                    {
                    alt19=1;
                    }
                    break;
                case 22:
                    {
                    alt19=1;
                    }
                    break;
                case RULE_STR:
                    {
                    alt19=1;
                    }
                    break;
                case 19:
                    {
                    alt19=1;
                    }
                    break;
                case EOF:
                    {
                    alt19=1;
                    }
                    break;
                case 17:
                    {
                    alt19=1;
                    }
                    break;
                case 15:
                    {
                    alt19=1;
                    }
                    break;
                case RULE_SIMPLEVMSTATEMENT:
                    {
                    alt19=1;
                    }
                    break;
                case 14:
                    {
                    alt19=1;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1222:3: ruleStatement
                    {
                    pushFollow(FOLLOW_ruleStatement_in_rule__ComplexLine__Group__92468);
                    ruleStatement();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexLineAccess().getStatementParserRuleCall_9()); 

            }

            pushFollow(FOLLOW_rule__ComplexLine__Group__10_in_rule__ComplexLine__Group__92478);
            rule__ComplexLine__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexLine__Group__9


    // $ANTLR start rule__ComplexLine__Group__10
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1233:1: rule__ComplexLine__Group__10 : ( ( '/' )? ) rule__ComplexLine__Group__11 ;
    public final void rule__ComplexLine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1237:1: ( ( ( '/' )? ) rule__ComplexLine__Group__11 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1238:1: ( ( '/' )? ) rule__ComplexLine__Group__11
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1238:1: ( ( '/' )? )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1239:1: ( '/' )?
            {
             before(grammarAccess.getComplexLineAccess().getSolidusKeyword_10()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1240:1: ( '/' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1241:2: '/'
                    {
                    match(input,19,FOLLOW_19_in_rule__ComplexLine__Group__102508); 

                    }
                    break;

            }

             after(grammarAccess.getComplexLineAccess().getSolidusKeyword_10()); 

            }

            pushFollow(FOLLOW_rule__ComplexLine__Group__11_in_rule__ComplexLine__Group__102520);
            rule__ComplexLine__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexLine__Group__10


    // $ANTLR start rule__ComplexLine__Group__11
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1253:1: rule__ComplexLine__Group__11 : ( ( ruleStatement )? ) ;
    public final void rule__ComplexLine__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1257:1: ( ( ( ruleStatement )? ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1258:1: ( ( ruleStatement )? )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1258:1: ( ( ruleStatement )? )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1259:1: ( ruleStatement )?
            {
             before(grammarAccess.getComplexLineAccess().getStatementParserRuleCall_11()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1260:1: ( ruleStatement )?
            int alt21=2;
            switch ( input.LA(1) ) {
                case RULE_STR:
                case RULE_SIMPLEVMENTRY:
                case RULE_BRACEDVMENTRY:
                case 22:
                    {
                    alt21=1;
                    }
                    break;
                case EOF:
                    {
                    alt21=1;
                    }
                    break;
                case 17:
                    {
                    alt21=1;
                    }
                    break;
                case 15:
                    {
                    alt21=1;
                    }
                    break;
                case RULE_SIMPLEVMSTATEMENT:
                    {
                    alt21=1;
                    }
                    break;
                case 14:
                    {
                    alt21=1;
                    }
                    break;
            }

            switch (alt21) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1260:3: ruleStatement
                    {
                    pushFollow(FOLLOW_ruleStatement_in_rule__ComplexLine__Group__112549);
                    ruleStatement();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexLineAccess().getStatementParserRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexLine__Group__11


    // $ANTLR start rule__ComplexVmStatement__Group__0
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1294:1: rule__ComplexVmStatement__Group__0 : ( RULE_SIMPLEVMSTATEMENT ) rule__ComplexVmStatement__Group__1 ;
    public final void rule__ComplexVmStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1298:1: ( ( RULE_SIMPLEVMSTATEMENT ) rule__ComplexVmStatement__Group__1 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1299:1: ( RULE_SIMPLEVMSTATEMENT ) rule__ComplexVmStatement__Group__1
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1299:1: ( RULE_SIMPLEVMSTATEMENT )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1300:1: RULE_SIMPLEVMSTATEMENT
            {
             before(grammarAccess.getComplexVmStatementAccess().getSimpleVmStatementTerminalRuleCall_0()); 
            match(input,RULE_SIMPLEVMSTATEMENT,FOLLOW_RULE_SIMPLEVMSTATEMENT_in_rule__ComplexVmStatement__Group__02608); 
             after(grammarAccess.getComplexVmStatementAccess().getSimpleVmStatementTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__ComplexVmStatement__Group__1_in_rule__ComplexVmStatement__Group__02616);
            rule__ComplexVmStatement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexVmStatement__Group__0


    // $ANTLR start rule__ComplexVmStatement__Group__1
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1312:1: rule__ComplexVmStatement__Group__1 : ( ( RULE_SPACE )? ) rule__ComplexVmStatement__Group__2 ;
    public final void rule__ComplexVmStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1316:1: ( ( ( RULE_SPACE )? ) rule__ComplexVmStatement__Group__2 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1317:1: ( ( RULE_SPACE )? ) rule__ComplexVmStatement__Group__2
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1317:1: ( ( RULE_SPACE )? )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1318:1: ( RULE_SPACE )?
            {
             before(grammarAccess.getComplexVmStatementAccess().getSPACETerminalRuleCall_1()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1319:1: ( RULE_SPACE )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_SPACE) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1319:3: RULE_SPACE
                    {
                    match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_rule__ComplexVmStatement__Group__12645); 

                    }
                    break;

            }

             after(grammarAccess.getComplexVmStatementAccess().getSPACETerminalRuleCall_1()); 

            }

            pushFollow(FOLLOW_rule__ComplexVmStatement__Group__2_in_rule__ComplexVmStatement__Group__12655);
            rule__ComplexVmStatement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexVmStatement__Group__1


    // $ANTLR start rule__ComplexVmStatement__Group__2
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1330:1: rule__ComplexVmStatement__Group__2 : ( '(' ) rule__ComplexVmStatement__Group__3 ;
    public final void rule__ComplexVmStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1334:1: ( ( '(' ) rule__ComplexVmStatement__Group__3 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1335:1: ( '(' ) rule__ComplexVmStatement__Group__3
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1335:1: ( '(' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1336:1: '('
            {
             before(grammarAccess.getComplexVmStatementAccess().getLeftParenthesisKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__ComplexVmStatement__Group__22684); 
             after(grammarAccess.getComplexVmStatementAccess().getLeftParenthesisKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__ComplexVmStatement__Group__3_in_rule__ComplexVmStatement__Group__22694);
            rule__ComplexVmStatement__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexVmStatement__Group__2


    // $ANTLR start rule__ComplexVmStatement__Group__3
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1350:1: rule__ComplexVmStatement__Group__3 : ( ( RULE_SPACE )? ) rule__ComplexVmStatement__Group__4 ;
    public final void rule__ComplexVmStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1354:1: ( ( ( RULE_SPACE )? ) rule__ComplexVmStatement__Group__4 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1355:1: ( ( RULE_SPACE )? ) rule__ComplexVmStatement__Group__4
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1355:1: ( ( RULE_SPACE )? )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1356:1: ( RULE_SPACE )?
            {
             before(grammarAccess.getComplexVmStatementAccess().getSPACETerminalRuleCall_3()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1357:1: ( RULE_SPACE )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_SPACE) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1357:3: RULE_SPACE
                    {
                    match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_rule__ComplexVmStatement__Group__32723); 

                    }
                    break;

            }

             after(grammarAccess.getComplexVmStatementAccess().getSPACETerminalRuleCall_3()); 

            }

            pushFollow(FOLLOW_rule__ComplexVmStatement__Group__4_in_rule__ComplexVmStatement__Group__32733);
            rule__ComplexVmStatement__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexVmStatement__Group__3


    // $ANTLR start rule__ComplexVmStatement__Group__4
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1368:1: rule__ComplexVmStatement__Group__4 : ( ( rule__ComplexVmStatement__Alternatives_4 ) ) rule__ComplexVmStatement__Group__5 ;
    public final void rule__ComplexVmStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1372:1: ( ( ( rule__ComplexVmStatement__Alternatives_4 ) ) rule__ComplexVmStatement__Group__5 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1373:1: ( ( rule__ComplexVmStatement__Alternatives_4 ) ) rule__ComplexVmStatement__Group__5
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1373:1: ( ( rule__ComplexVmStatement__Alternatives_4 ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1374:1: ( rule__ComplexVmStatement__Alternatives_4 )
            {
             before(grammarAccess.getComplexVmStatementAccess().getAlternatives_4()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1375:1: ( rule__ComplexVmStatement__Alternatives_4 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1375:2: rule__ComplexVmStatement__Alternatives_4
            {
            pushFollow(FOLLOW_rule__ComplexVmStatement__Alternatives_4_in_rule__ComplexVmStatement__Group__42761);
            rule__ComplexVmStatement__Alternatives_4();
            _fsp--;


            }

             after(grammarAccess.getComplexVmStatementAccess().getAlternatives_4()); 

            }

            pushFollow(FOLLOW_rule__ComplexVmStatement__Group__5_in_rule__ComplexVmStatement__Group__42770);
            rule__ComplexVmStatement__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexVmStatement__Group__4


    // $ANTLR start rule__ComplexVmStatement__Group__5
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1386:1: rule__ComplexVmStatement__Group__5 : ( ( RULE_SPACE )? ) rule__ComplexVmStatement__Group__6 ;
    public final void rule__ComplexVmStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1390:1: ( ( ( RULE_SPACE )? ) rule__ComplexVmStatement__Group__6 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1391:1: ( ( RULE_SPACE )? ) rule__ComplexVmStatement__Group__6
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1391:1: ( ( RULE_SPACE )? )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1392:1: ( RULE_SPACE )?
            {
             before(grammarAccess.getComplexVmStatementAccess().getSPACETerminalRuleCall_5()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1393:1: ( RULE_SPACE )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_SPACE) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1393:3: RULE_SPACE
                    {
                    match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_rule__ComplexVmStatement__Group__52799); 

                    }
                    break;

            }

             after(grammarAccess.getComplexVmStatementAccess().getSPACETerminalRuleCall_5()); 

            }

            pushFollow(FOLLOW_rule__ComplexVmStatement__Group__6_in_rule__ComplexVmStatement__Group__52809);
            rule__ComplexVmStatement__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexVmStatement__Group__5


    // $ANTLR start rule__ComplexVmStatement__Group__6
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1404:1: rule__ComplexVmStatement__Group__6 : ( ( RULE_SYMBOLS )? ) rule__ComplexVmStatement__Group__7 ;
    public final void rule__ComplexVmStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1408:1: ( ( ( RULE_SYMBOLS )? ) rule__ComplexVmStatement__Group__7 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1409:1: ( ( RULE_SYMBOLS )? ) rule__ComplexVmStatement__Group__7
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1409:1: ( ( RULE_SYMBOLS )? )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1410:1: ( RULE_SYMBOLS )?
            {
             before(grammarAccess.getComplexVmStatementAccess().getSYMBOLSTerminalRuleCall_6()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1411:1: ( RULE_SYMBOLS )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_SYMBOLS) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1411:3: RULE_SYMBOLS
                    {
                    match(input,RULE_SYMBOLS,FOLLOW_RULE_SYMBOLS_in_rule__ComplexVmStatement__Group__62838); 

                    }
                    break;

            }

             after(grammarAccess.getComplexVmStatementAccess().getSYMBOLSTerminalRuleCall_6()); 

            }

            pushFollow(FOLLOW_rule__ComplexVmStatement__Group__7_in_rule__ComplexVmStatement__Group__62848);
            rule__ComplexVmStatement__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexVmStatement__Group__6


    // $ANTLR start rule__ComplexVmStatement__Group__7
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1422:1: rule__ComplexVmStatement__Group__7 : ( ( RULE_SPACE )? ) rule__ComplexVmStatement__Group__8 ;
    public final void rule__ComplexVmStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1426:1: ( ( ( RULE_SPACE )? ) rule__ComplexVmStatement__Group__8 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1427:1: ( ( RULE_SPACE )? ) rule__ComplexVmStatement__Group__8
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1427:1: ( ( RULE_SPACE )? )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1428:1: ( RULE_SPACE )?
            {
             before(grammarAccess.getComplexVmStatementAccess().getSPACETerminalRuleCall_7()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1429:1: ( RULE_SPACE )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_SPACE) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1429:3: RULE_SPACE
                    {
                    match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_rule__ComplexVmStatement__Group__72877); 

                    }
                    break;

            }

             after(grammarAccess.getComplexVmStatementAccess().getSPACETerminalRuleCall_7()); 

            }

            pushFollow(FOLLOW_rule__ComplexVmStatement__Group__8_in_rule__ComplexVmStatement__Group__72887);
            rule__ComplexVmStatement__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexVmStatement__Group__7


    // $ANTLR start rule__ComplexVmStatement__Group__8
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1440:1: rule__ComplexVmStatement__Group__8 : ( ( rule__ComplexVmStatement__Alternatives_8 )? ) rule__ComplexVmStatement__Group__9 ;
    public final void rule__ComplexVmStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1444:1: ( ( ( rule__ComplexVmStatement__Alternatives_8 )? ) rule__ComplexVmStatement__Group__9 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1445:1: ( ( rule__ComplexVmStatement__Alternatives_8 )? ) rule__ComplexVmStatement__Group__9
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1445:1: ( ( rule__ComplexVmStatement__Alternatives_8 )? )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1446:1: ( rule__ComplexVmStatement__Alternatives_8 )?
            {
             before(grammarAccess.getComplexVmStatementAccess().getAlternatives_8()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1447:1: ( rule__ComplexVmStatement__Alternatives_8 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_QUOTEDSTRING && LA27_0<=RULE_BRACEDVMENTRY)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1447:2: rule__ComplexVmStatement__Alternatives_8
                    {
                    pushFollow(FOLLOW_rule__ComplexVmStatement__Alternatives_8_in_rule__ComplexVmStatement__Group__82915);
                    rule__ComplexVmStatement__Alternatives_8();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexVmStatementAccess().getAlternatives_8()); 

            }

            pushFollow(FOLLOW_rule__ComplexVmStatement__Group__9_in_rule__ComplexVmStatement__Group__82925);
            rule__ComplexVmStatement__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexVmStatement__Group__8


    // $ANTLR start rule__ComplexVmStatement__Group__9
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1458:1: rule__ComplexVmStatement__Group__9 : ( ( RULE_SPACE )? ) rule__ComplexVmStatement__Group__10 ;
    public final void rule__ComplexVmStatement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1462:1: ( ( ( RULE_SPACE )? ) rule__ComplexVmStatement__Group__10 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1463:1: ( ( RULE_SPACE )? ) rule__ComplexVmStatement__Group__10
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1463:1: ( ( RULE_SPACE )? )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1464:1: ( RULE_SPACE )?
            {
             before(grammarAccess.getComplexVmStatementAccess().getSPACETerminalRuleCall_9()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1465:1: ( RULE_SPACE )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_SPACE) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1465:3: RULE_SPACE
                    {
                    match(input,RULE_SPACE,FOLLOW_RULE_SPACE_in_rule__ComplexVmStatement__Group__92954); 

                    }
                    break;

            }

             after(grammarAccess.getComplexVmStatementAccess().getSPACETerminalRuleCall_9()); 

            }

            pushFollow(FOLLOW_rule__ComplexVmStatement__Group__10_in_rule__ComplexVmStatement__Group__92964);
            rule__ComplexVmStatement__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexVmStatement__Group__9


    // $ANTLR start rule__ComplexVmStatement__Group__10
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1476:1: rule__ComplexVmStatement__Group__10 : ( ')' ) ;
    public final void rule__ComplexVmStatement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1480:1: ( ( ')' ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1481:1: ( ')' )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1481:1: ( ')' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1482:1: ')'
            {
             before(grammarAccess.getComplexVmStatementAccess().getRightParenthesisKeyword_10()); 
            match(input,21,FOLLOW_21_in_rule__ComplexVmStatement__Group__102993); 
             after(grammarAccess.getComplexVmStatementAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComplexVmStatement__Group__10


    // $ANTLR start rule__Statement__Group_1__0
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1517:1: rule__Statement__Group_1__0 : ( '\"' ) rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1521:1: ( ( '\"' ) rule__Statement__Group_1__1 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1522:1: ( '\"' ) rule__Statement__Group_1__1
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1522:1: ( '\"' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1523:1: '\"'
            {
             before(grammarAccess.getStatementAccess().getQuotationMarkKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Statement__Group_1__03051); 
             after(grammarAccess.getStatementAccess().getQuotationMarkKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__03061);
            rule__Statement__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group_1__0


    // $ANTLR start rule__Statement__Group_1__1
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1537:1: rule__Statement__Group_1__1 : ( RULE_STR ) rule__Statement__Group_1__2 ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1541:1: ( ( RULE_STR ) rule__Statement__Group_1__2 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1542:1: ( RULE_STR ) rule__Statement__Group_1__2
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1542:1: ( RULE_STR )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1543:1: RULE_STR
            {
             before(grammarAccess.getStatementAccess().getSTRTerminalRuleCall_1_1()); 
            match(input,RULE_STR,FOLLOW_RULE_STR_in_rule__Statement__Group_1__13089); 
             after(grammarAccess.getStatementAccess().getSTRTerminalRuleCall_1_1()); 

            }

            pushFollow(FOLLOW_rule__Statement__Group_1__2_in_rule__Statement__Group_1__13097);
            rule__Statement__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group_1__1


    // $ANTLR start rule__Statement__Group_1__2
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1555:1: rule__Statement__Group_1__2 : ( '\"' ) ;
    public final void rule__Statement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1559:1: ( ( '\"' ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1560:1: ( '\"' )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1560:1: ( '\"' )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1561:1: '\"'
            {
             before(grammarAccess.getStatementAccess().getQuotationMarkKeyword_1_2()); 
            match(input,22,FOLLOW_22_in_rule__Statement__Group_1__23126); 
             after(grammarAccess.getStatementAccess().getQuotationMarkKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group_1__2


    // $ANTLR start rule__Statement__Group_3__0
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1580:1: rule__Statement__Group_3__0 : ( ( RULE_STR )? ) rule__Statement__Group_3__1 ;
    public final void rule__Statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1584:1: ( ( ( RULE_STR )? ) rule__Statement__Group_3__1 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1585:1: ( ( RULE_STR )? ) rule__Statement__Group_3__1
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1585:1: ( ( RULE_STR )? )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1586:1: ( RULE_STR )?
            {
             before(grammarAccess.getStatementAccess().getSTRTerminalRuleCall_3_0()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1587:1: ( RULE_STR )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STR) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1587:3: RULE_STR
                    {
                    match(input,RULE_STR,FOLLOW_RULE_STR_in_rule__Statement__Group_3__03168); 

                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getSTRTerminalRuleCall_3_0()); 

            }

            pushFollow(FOLLOW_rule__Statement__Group_3__1_in_rule__Statement__Group_3__03178);
            rule__Statement__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group_3__0


    // $ANTLR start rule__Statement__Group_3__1
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1598:1: rule__Statement__Group_3__1 : ( RULE_BRACEDVMENTRY ) rule__Statement__Group_3__2 ;
    public final void rule__Statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1602:1: ( ( RULE_BRACEDVMENTRY ) rule__Statement__Group_3__2 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1603:1: ( RULE_BRACEDVMENTRY ) rule__Statement__Group_3__2
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1603:1: ( RULE_BRACEDVMENTRY )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1604:1: RULE_BRACEDVMENTRY
            {
             before(grammarAccess.getStatementAccess().getBracedVmEntryTerminalRuleCall_3_1()); 
            match(input,RULE_BRACEDVMENTRY,FOLLOW_RULE_BRACEDVMENTRY_in_rule__Statement__Group_3__13206); 
             after(grammarAccess.getStatementAccess().getBracedVmEntryTerminalRuleCall_3_1()); 

            }

            pushFollow(FOLLOW_rule__Statement__Group_3__2_in_rule__Statement__Group_3__13214);
            rule__Statement__Group_3__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group_3__1


    // $ANTLR start rule__Statement__Group_3__2
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1616:1: rule__Statement__Group_3__2 : ( ( RULE_STR )? ) ;
    public final void rule__Statement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1620:1: ( ( ( RULE_STR )? ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1621:1: ( ( RULE_STR )? )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1621:1: ( ( RULE_STR )? )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1622:1: ( RULE_STR )?
            {
             before(grammarAccess.getStatementAccess().getSTRTerminalRuleCall_3_2()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1623:1: ( RULE_STR )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STR) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1623:3: RULE_STR
                    {
                    match(input,RULE_STR,FOLLOW_RULE_STR_in_rule__Statement__Group_3__23243); 

                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getSTRTerminalRuleCall_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group_3__2


    // $ANTLR start rule__Message__ElementsAssignment_0
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1639:1: rule__Message__ElementsAssignment_0 : ( ( rule__Message__ElementsAlternatives_0_0 ) ) ;
    public final void rule__Message__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1643:1: ( ( ( rule__Message__ElementsAlternatives_0_0 ) ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1644:1: ( ( rule__Message__ElementsAlternatives_0_0 ) )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1644:1: ( ( rule__Message__ElementsAlternatives_0_0 ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1645:1: ( rule__Message__ElementsAlternatives_0_0 )
            {
             before(grammarAccess.getMessageAccess().getElementsAlternatives_0_0()); 
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1646:1: ( rule__Message__ElementsAlternatives_0_0 )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1646:2: rule__Message__ElementsAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Message__ElementsAlternatives_0_0_in_rule__Message__ElementsAssignment_03284);
            rule__Message__ElementsAlternatives_0_0();
            _fsp--;


            }

             after(grammarAccess.getMessageAccess().getElementsAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Message__ElementsAssignment_0


    // $ANTLR start rule__Message__ElementsAssignment_4
    // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1655:1: rule__Message__ElementsAssignment_4 : ( ruleLine ) ;
    public final void rule__Message__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1659:1: ( ( ruleLine ) )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1660:1: ( ruleLine )
            {
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1660:1: ( ruleLine )
            // ../com.dawsonsystems.Swift.ui/src-gen/com/dawsonsystems/contentassist/antlr/internal/InternalSwift.g:1661:1: ruleLine
            {
             before(grammarAccess.getMessageAccess().getElementsLineParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleLine_in_rule__Message__ElementsAssignment_43317);
            ruleLine();
            _fsp--;

             after(grammarAccess.getMessageAccess().getElementsLineParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Message__ElementsAssignment_4


 

    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0_in_ruleMessage94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexBeginningLine_in_entryRuleComplexBeginningLine120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexBeginningLine127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexBeginningLine__Group__0_in_ruleComplexBeginningLine154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeginningLine_in_entryRuleBeginningLine180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeginningLine187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeginningLine__Group__0_in_ruleBeginningLine214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_entryRuleLine240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLine247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__Group__0_in_ruleLine274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleLine_in_entryRuleSimpleLine300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleLine307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleLine__Group__0_in_ruleSimpleLine334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexLine_in_entryRuleComplexLine360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexLine367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexLine__Group__0_in_ruleComplexLine394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVmStatement_in_entryRuleVmStatement420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVmStatement427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VmStatement__Alternatives_in_ruleVmStatement454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexVmStatement_in_entryRuleComplexVmStatement480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexVmStatement487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexVmStatement__Group__0_in_ruleComplexVmStatement514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVmEntry_in_entryRuleVmEntry540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVmEntry547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VmEntry__Alternatives_in_ruleVmEntry574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement634 = new BitSet(new long[]{0x0000000000400192L});
    public static final BitSet FOLLOW_ruleBeginningLine_in_rule__Message__ElementsAlternatives_0_0671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexBeginningLine_in_rule__Message__ElementsAlternatives_0_0688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleLine_in_rule__Line__Alternatives_0720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexLine_in_rule__Line__Alternatives_0737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVmStatement_in_rule__Line__Alternatives_0754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVmEntry_in_rule__SimpleLine__Alternatives_1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STR_in_rule__SimpleLine__Alternatives_1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVmEntry_in_rule__SimpleLine__Alternatives_3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STR_in_rule__SimpleLine__Alternatives_3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVmEntry_in_rule__ComplexLine__Alternatives_1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STR_in_rule__ComplexLine__Alternatives_1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIMPLEVMSTATEMENT_in_rule__VmStatement__Alternatives933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexVmStatement_in_rule__VmStatement__Alternatives950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVmEntry_in_rule__ComplexVmStatement__Alternatives_4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUOTEDSTRING_in_rule__ComplexVmStatement__Alternatives_4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVmEntry_in_rule__ComplexVmStatement__Alternatives_81031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUOTEDSTRING_in_rule__ComplexVmStatement__Alternatives_81048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIMPLEVMENTRY_in_rule__VmEntry__Alternatives1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACEDVMENTRY_in_rule__VmEntry__Alternatives1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVmEntry_in_rule__Statement__Alternatives1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STR_in_rule__Statement__Alternatives1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__0_in_rule__Statement__Alternatives1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__ElementsAssignment_0_in_rule__Message__Group__01218 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Message__ElementsAssignment_0_in_rule__Message__Group__01230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__01242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Message__Group__11271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Message__Group__2_in_rule__Message__Group__11281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STR_in_rule__Message__Group__21309 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Message__Group__3_in_rule__Message__Group__21317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Message__Group__31346 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_rule__Message__Group__4_in_rule__Message__Group__31356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__ElementsAssignment_4_in_rule__Message__Group__41386 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_rule__Message__ElementsAssignment_4_in_rule__Message__Group__41398 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_rule__Message__Group__5_in_rule__Message__Group__41410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Message__Group__51439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ComplexBeginningLine__Group__01487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ComplexBeginningLine__Group__1_in_rule__ComplexBeginningLine__Group__01497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STR_in_rule__ComplexBeginningLine__Group__11525 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ComplexBeginningLine__Group__2_in_rule__ComplexBeginningLine__Group__11533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ComplexBeginningLine__Group__21562 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ComplexBeginningLine__Group__3_in_rule__ComplexBeginningLine__Group__21572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeginningLine_in_rule__ComplexBeginningLine__Group__31600 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ComplexBeginningLine__Group__4_in_rule__ComplexBeginningLine__Group__31608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ComplexBeginningLine__Group__41637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BeginningLine__Group__01683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BeginningLine__Group__1_in_rule__BeginningLine__Group__01693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STR_in_rule__BeginningLine__Group__11721 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__BeginningLine__Group__2_in_rule__BeginningLine__Group__11729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BeginningLine__Group__21758 = new BitSet(new long[]{0x0000000000410190L});
    public static final BitSet FOLLOW_rule__BeginningLine__Group__3_in_rule__BeginningLine__Group__21768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__BeginningLine__Group__31796 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BeginningLine__Group__4_in_rule__BeginningLine__Group__31804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BeginningLine__Group__41833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__Alternatives_0_in_rule__Line__Group__01878 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Line__Group__1_in_rule__Line__Group__01887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Line__Group__11917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SimpleLine__Group__01959 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rule__SimpleLine__Group__1_in_rule__SimpleLine__Group__01969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleLine__Alternatives_1_in_rule__SimpleLine__Group__11997 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SimpleLine__Group__2_in_rule__SimpleLine__Group__12006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SimpleLine__Group__22035 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rule__SimpleLine__Group__3_in_rule__SimpleLine__Group__22045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleLine__Alternatives_3_in_rule__SimpleLine__Group__32073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ComplexLine__Group__02116 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rule__ComplexLine__Group__1_in_rule__ComplexLine__Group__02126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexLine__Alternatives_1_in_rule__ComplexLine__Group__12154 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ComplexLine__Group__2_in_rule__ComplexLine__Group__12163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ComplexLine__Group__22192 = new BitSet(new long[]{0x0000000000480190L});
    public static final BitSet FOLLOW_rule__ComplexLine__Group__3_in_rule__ComplexLine__Group__22202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ComplexLine__Group__32230 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ComplexLine__Group__4_in_rule__ComplexLine__Group__32238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ComplexLine__Group__42267 = new BitSet(new long[]{0x0000000000480192L});
    public static final BitSet FOLLOW_rule__ComplexLine__Group__5_in_rule__ComplexLine__Group__42277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ComplexLine__Group__52306 = new BitSet(new long[]{0x0000000000480192L});
    public static final BitSet FOLLOW_rule__ComplexLine__Group__6_in_rule__ComplexLine__Group__52316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ComplexLine__Group__62346 = new BitSet(new long[]{0x0000000000480192L});
    public static final BitSet FOLLOW_rule__ComplexLine__Group__7_in_rule__ComplexLine__Group__62358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ComplexLine__Group__72387 = new BitSet(new long[]{0x0000000000480192L});
    public static final BitSet FOLLOW_rule__ComplexLine__Group__8_in_rule__ComplexLine__Group__72397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ComplexLine__Group__82427 = new BitSet(new long[]{0x0000000000480192L});
    public static final BitSet FOLLOW_rule__ComplexLine__Group__9_in_rule__ComplexLine__Group__82439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ComplexLine__Group__92468 = new BitSet(new long[]{0x0000000000480192L});
    public static final BitSet FOLLOW_rule__ComplexLine__Group__10_in_rule__ComplexLine__Group__92478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ComplexLine__Group__102508 = new BitSet(new long[]{0x0000000000400192L});
    public static final BitSet FOLLOW_rule__ComplexLine__Group__11_in_rule__ComplexLine__Group__102520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ComplexLine__Group__112549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIMPLEVMSTATEMENT_in_rule__ComplexVmStatement__Group__02608 = new BitSet(new long[]{0x0000000000100200L});
    public static final BitSet FOLLOW_rule__ComplexVmStatement__Group__1_in_rule__ComplexVmStatement__Group__02616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SPACE_in_rule__ComplexVmStatement__Group__12645 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ComplexVmStatement__Group__2_in_rule__ComplexVmStatement__Group__12655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ComplexVmStatement__Group__22684 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__ComplexVmStatement__Group__3_in_rule__ComplexVmStatement__Group__22694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SPACE_in_rule__ComplexVmStatement__Group__32723 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_rule__ComplexVmStatement__Group__4_in_rule__ComplexVmStatement__Group__32733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexVmStatement__Alternatives_4_in_rule__ComplexVmStatement__Group__42761 = new BitSet(new long[]{0x00000000002007C0L});
    public static final BitSet FOLLOW_rule__ComplexVmStatement__Group__5_in_rule__ComplexVmStatement__Group__42770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SPACE_in_rule__ComplexVmStatement__Group__52799 = new BitSet(new long[]{0x00000000002007C0L});
    public static final BitSet FOLLOW_rule__ComplexVmStatement__Group__6_in_rule__ComplexVmStatement__Group__52809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOLS_in_rule__ComplexVmStatement__Group__62838 = new BitSet(new long[]{0x00000000002003C0L});
    public static final BitSet FOLLOW_rule__ComplexVmStatement__Group__7_in_rule__ComplexVmStatement__Group__62848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SPACE_in_rule__ComplexVmStatement__Group__72877 = new BitSet(new long[]{0x00000000002003C0L});
    public static final BitSet FOLLOW_rule__ComplexVmStatement__Group__8_in_rule__ComplexVmStatement__Group__72887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexVmStatement__Alternatives_8_in_rule__ComplexVmStatement__Group__82915 = new BitSet(new long[]{0x0000000000200200L});
    public static final BitSet FOLLOW_rule__ComplexVmStatement__Group__9_in_rule__ComplexVmStatement__Group__82925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SPACE_in_rule__ComplexVmStatement__Group__92954 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ComplexVmStatement__Group__10_in_rule__ComplexVmStatement__Group__92964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ComplexVmStatement__Group__102993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Statement__Group_1__03051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__03061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STR_in_rule__Statement__Group_1__13089 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__2_in_rule__Statement__Group_1__13097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Statement__Group_1__23126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STR_in_rule__Statement__Group_3__03168 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__1_in_rule__Statement__Group_3__03178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACEDVMENTRY_in_rule__Statement__Group_3__13206 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__2_in_rule__Statement__Group_3__13214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STR_in_rule__Statement__Group_3__23243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__ElementsAlternatives_0_0_in_rule__Message__ElementsAssignment_03284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_rule__Message__ElementsAssignment_43317 = new BitSet(new long[]{0x0000000000000002L});

}