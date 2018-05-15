// Generated from /home/rastakhan/Documents/UFSCar/CC1-T1/src/t1/Lua.g4 by ANTLR 4.7
package t1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, CARACTERE=3, INTEIRO=4, FUNCTION=5, NOMEVARIAVEL=6, NOMEFUNCAO=7, 
		IF=8, THEN=9, ELSE=10, COMPARACAO=11, COMENTARIO=12, LPAREN=13, RPAREN=14, 
		END=15, RETURN=16, OPERADOR=17;
	public static final int
		RULE_programa = 0, RULE_conjunto_codigos = 1, RULE_comando = 2, RULE_declaracao = 3, 
		RULE_expressao_logica = 4, RULE_calculo = 5, RULE_comando_if = 6, RULE_declaracao_funcao = 7, 
		RULE_chamada_funcao = 8, RULE_funcao_nome = 9, RULE_var = 10, RULE_comentario = 11, 
		RULE_retorno = 12;
	public static final String[] ruleNames = {
		"programa", "conjunto_codigos", "comando", "declaracao", "expressao_logica", 
		"calculo", "comando_if", "declaracao_funcao", "chamada_funcao", "funcao_nome", 
		"var", "comentario", "retorno"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'\n'", null, null, "'function'", "'n'", "'func'", "'if'", 
		"'then'", "'else'", "'=='", null, "'('", "')'", "'end'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "CARACTERE", "INTEIRO", "FUNCTION", "NOMEVARIAVEL", 
		"NOMEFUNCAO", "IF", "THEN", "ELSE", "COMPARACAO", "COMENTARIO", "LPAREN", 
		"RPAREN", "END", "RETURN", "OPERADOR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Lua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   public static String grupo="<<Digite os RAs do grupo aqui>>";

	public LuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public Conjunto_codigosContext conjunto_codigos() {
			return getRuleContext(Conjunto_codigosContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(26);
				declaracao();
				}
				break;
			}
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << NOMEVARIAVEL) | (1L << IF) | (1L << COMENTARIO))) != 0)) {
				{
				setState(29);
				conjunto_codigos();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conjunto_codigosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public Conjunto_codigosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunto_codigos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterConjunto_codigos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitConjunto_codigos(this);
		}
	}

	public final Conjunto_codigosContext conjunto_codigos() throws RecognitionException {
		Conjunto_codigosContext _localctx = new Conjunto_codigosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_conjunto_codigos);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				comando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				comentario();
				setState(34);
				comando();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				comando();
				setState(37);
				comentario();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public Comando_ifContext comando_if() {
			return getRuleContext(Comando_ifContext.class,0);
		}
		public CalculoContext calculo() {
			return getRuleContext(CalculoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				declaracao();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				comando_if();
				}
				break;
			case NOMEVARIAVEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				calculo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public Declaracao_funcaoContext declaracao_funcao() {
			return getRuleContext(Declaracao_funcaoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			declaracao_funcao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao_logicaContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode COMPARACAO() { return getToken(LuaParser.COMPARACAO, 0); }
		public TerminalNode INTEIRO() { return getToken(LuaParser.INTEIRO, 0); }
		public Expressao_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpressao_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpressao_logica(this);
		}
	}

	public final Expressao_logicaContext expressao_logica() throws RecognitionException {
		Expressao_logicaContext _localctx = new Expressao_logicaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressao_logica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			var();
			setState(49);
			match(COMPARACAO);
			setState(50);
			match(INTEIRO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalculoContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode OPERADOR() { return getToken(LuaParser.OPERADOR, 0); }
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public TerminalNode INTEIRO() { return getToken(LuaParser.INTEIRO, 0); }
		public CalculoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCalculo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCalculo(this);
		}
	}

	public final CalculoContext calculo() throws RecognitionException {
		CalculoContext _localctx = new CalculoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_calculo);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				var();
				setState(53);
				match(OPERADOR);
				setState(54);
				chamada_funcao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				var();
				setState(57);
				match(OPERADOR);
				setState(58);
				match(INTEIRO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comando_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LuaParser.IF, 0); }
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public TerminalNode THEN() { return getToken(LuaParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(LuaParser.ELSE, 0); }
		public TerminalNode END() { return getToken(LuaParser.END, 0); }
		public Comando_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterComando_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitComando_if(this);
		}
	}

	public final Comando_ifContext comando_if() throws RecognitionException {
		Comando_ifContext _localctx = new Comando_ifContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comando_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IF);
			{
			setState(63);
			match(T__0);
			}
			setState(64);
			expressao_logica();
			{
			setState(65);
			match(T__0);
			}
			setState(66);
			match(THEN);
			setState(67);
			match(ELSE);
			setState(68);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_funcaoContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(LuaParser.FUNCTION, 0); }
		public Funcao_nomeContext funcao_nome() {
			return getRuleContext(Funcao_nomeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LuaParser.LPAREN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LuaParser.RPAREN, 0); }
		public Conjunto_codigosContext conjunto_codigos() {
			return getRuleContext(Conjunto_codigosContext.class,0);
		}
		public TerminalNode END() { return getToken(LuaParser.END, 0); }
		public Declaracao_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterDeclaracao_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitDeclaracao_funcao(this);
		}
	}

	public final Declaracao_funcaoContext declaracao_funcao() throws RecognitionException {
		Declaracao_funcaoContext _localctx = new Declaracao_funcaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracao_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(FUNCTION);
			{
			setState(71);
			match(T__0);
			}
			setState(72);
			funcao_nome();
			{
			setState(73);
			match(T__0);
			}
			setState(74);
			match(LPAREN);
			setState(75);
			var();
			setState(76);
			match(RPAREN);
			{
			setState(77);
			match(T__1);
			}
			setState(78);
			conjunto_codigos();
			setState(79);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chamada_funcaoContext extends ParserRuleContext {
		public Funcao_nomeContext funcao_nome() {
			return getRuleContext(Funcao_nomeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LuaParser.LPAREN, 0); }
		public CalculoContext calculo() {
			return getRuleContext(CalculoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LuaParser.RPAREN, 0); }
		public Chamada_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterChamada_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitChamada_funcao(this);
		}
	}

	public final Chamada_funcaoContext chamada_funcao() throws RecognitionException {
		Chamada_funcaoContext _localctx = new Chamada_funcaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_chamada_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			funcao_nome();
			setState(82);
			match(LPAREN);
			setState(83);
			calculo();
			setState(84);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funcao_nomeContext extends ParserRuleContext {
		public Token NOMEFUNCAO;
		public TerminalNode NOMEFUNCAO() { return getToken(LuaParser.NOMEFUNCAO, 0); }
		public Funcao_nomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncao_nome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncao_nome(this);
		}
	}

	public final Funcao_nomeContext funcao_nome() throws RecognitionException {
		Funcao_nomeContext _localctx = new Funcao_nomeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcao_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			((Funcao_nomeContext)_localctx).NOMEFUNCAO = match(NOMEFUNCAO);
			TabelaDeSimbolos.adicionarSimbolo((((Funcao_nomeContext)_localctx).NOMEFUNCAO!=null?((Funcao_nomeContext)_localctx).NOMEFUNCAO.getText():null), Tipo.FUNCAO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public Token NOMEVARIAVEL;
		public TerminalNode NOMEVARIAVEL() { return getToken(LuaParser.NOMEVARIAVEL, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((VarContext)_localctx).NOMEVARIAVEL = match(NOMEVARIAVEL);
			TabelaDeSimbolos.adicionarSimbolo((((VarContext)_localctx).NOMEVARIAVEL!=null?((VarContext)_localctx).NOMEVARIAVEL.getText():null), Tipo.VARIAVEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIO() { return getToken(LuaParser.COMENTARIO, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitComentario(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comentario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(COMENTARIO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(LuaParser.RETURN, 0); }
		public TerminalNode INTEIRO() { return getToken(LuaParser.INTEIRO, 0); }
		public CalculoContext calculo() {
			return getRuleContext(CalculoContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_retorno);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(RETURN);
				setState(95);
				match(INTEIRO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(RETURN);
				setState(97);
				calculo();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23g\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\5\2\36\n\2\3\2\5\2!\n\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7?\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16e\n\16\3\16\2\2\17"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2a\2\35\3\2\2\2\4)\3\2\2\2\6.\3"+
		"\2\2\2\b\60\3\2\2\2\n\62\3\2\2\2\f>\3\2\2\2\16@\3\2\2\2\20H\3\2\2\2\22"+
		"S\3\2\2\2\24X\3\2\2\2\26[\3\2\2\2\30^\3\2\2\2\32d\3\2\2\2\34\36\5\b\5"+
		"\2\35\34\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37!\5\4\3\2 \37\3\2\2\2 !\3"+
		"\2\2\2!\3\3\2\2\2\"*\5\6\4\2#$\5\30\r\2$%\5\6\4\2%*\3\2\2\2&\'\5\6\4\2"+
		"\'(\5\30\r\2(*\3\2\2\2)\"\3\2\2\2)#\3\2\2\2)&\3\2\2\2*\5\3\2\2\2+/\5\b"+
		"\5\2,/\5\16\b\2-/\5\f\7\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\7\3\2\2\2\60"+
		"\61\5\20\t\2\61\t\3\2\2\2\62\63\5\26\f\2\63\64\7\r\2\2\64\65\7\6\2\2\65"+
		"\13\3\2\2\2\66\67\5\26\f\2\678\7\23\2\289\5\22\n\29?\3\2\2\2:;\5\26\f"+
		"\2;<\7\23\2\2<=\7\6\2\2=?\3\2\2\2>\66\3\2\2\2>:\3\2\2\2?\r\3\2\2\2@A\7"+
		"\n\2\2AB\7\3\2\2BC\5\n\6\2CD\7\3\2\2DE\7\13\2\2EF\7\f\2\2FG\7\21\2\2G"+
		"\17\3\2\2\2HI\7\7\2\2IJ\7\3\2\2JK\5\24\13\2KL\7\3\2\2LM\7\17\2\2MN\5\26"+
		"\f\2NO\7\20\2\2OP\7\4\2\2PQ\5\4\3\2QR\7\21\2\2R\21\3\2\2\2ST\5\24\13\2"+
		"TU\7\17\2\2UV\5\f\7\2VW\7\20\2\2W\23\3\2\2\2XY\7\t\2\2YZ\b\13\1\2Z\25"+
		"\3\2\2\2[\\\7\b\2\2\\]\b\f\1\2]\27\3\2\2\2^_\7\16\2\2_\31\3\2\2\2`a\7"+
		"\22\2\2ae\7\6\2\2bc\7\22\2\2ce\5\f\7\2d`\3\2\2\2db\3\2\2\2e\33\3\2\2\2"+
		"\b\35 ).>d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}