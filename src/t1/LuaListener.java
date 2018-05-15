// Generated from /home/rastakhan/Documents/UFSCar/CC1-T1/src/t1/Lua.g4 by ANTLR 4.7
package t1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LuaParser}.
 */
public interface LuaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LuaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LuaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LuaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#conjunto_codigos}.
	 * @param ctx the parse tree
	 */
	void enterConjunto_codigos(LuaParser.Conjunto_codigosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#conjunto_codigos}.
	 * @param ctx the parse tree
	 */
	void exitConjunto_codigos(LuaParser.Conjunto_codigosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(LuaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(LuaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(LuaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(LuaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_logica(LuaParser.Expressao_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_logica(LuaParser.Expressao_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#calculo}.
	 * @param ctx the parse tree
	 */
	void enterCalculo(LuaParser.CalculoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#calculo}.
	 * @param ctx the parse tree
	 */
	void exitCalculo(LuaParser.CalculoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#comando_if}.
	 * @param ctx the parse tree
	 */
	void enterComando_if(LuaParser.Comando_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#comando_if}.
	 * @param ctx the parse tree
	 */
	void exitComando_if(LuaParser.Comando_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#declaracao_funcao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_funcao(LuaParser.Declaracao_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#declaracao_funcao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_funcao(LuaParser.Declaracao_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#chamada_funcao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_funcao(LuaParser.Chamada_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#chamada_funcao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_funcao(LuaParser.Chamada_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#funcao_nome}.
	 * @param ctx the parse tree
	 */
	void enterFuncao_nome(LuaParser.Funcao_nomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#funcao_nome}.
	 * @param ctx the parse tree
	 */
	void exitFuncao_nome(LuaParser.Funcao_nomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(LuaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(LuaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(LuaParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(LuaParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(LuaParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(LuaParser.RetornoContext ctx);
}