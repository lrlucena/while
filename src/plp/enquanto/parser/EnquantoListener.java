// Generated from java-escape by ANTLR 4.11.1
package plp.enquanto.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EnquantoParser}.
 */
public interface EnquantoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EnquantoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(EnquantoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(EnquantoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnquantoParser#seqComando}.
	 * @param ctx the parse tree
	 */
	void enterSeqComando(EnquantoParser.SeqComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#seqComando}.
	 * @param ctx the parse tree
	 */
	void exitSeqComando(EnquantoParser.SeqComandoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atribuicao}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(EnquantoParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atribuicao}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(EnquantoParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skip}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterSkip(EnquantoParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitSkip(EnquantoParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code se}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterSe(EnquantoParser.SeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code se}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitSe(EnquantoParser.SeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enquanto}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(EnquantoParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enquanto}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(EnquantoParser.EnquantoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exiba}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterExiba(EnquantoParser.ExibaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exiba}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitExiba(EnquantoParser.ExibaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code escreva}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterEscreva(EnquantoParser.EscrevaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code escreva}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitEscreva(EnquantoParser.EscrevaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bloco}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterBloco(EnquantoParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bloco}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitBloco(EnquantoParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leia}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterLeia(EnquantoParser.LeiaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leia}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitLeia(EnquantoParser.LeiaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterInteiro(EnquantoParser.InteiroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitInteiro(EnquantoParser.InteiroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opBin}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterOpBin(EnquantoParser.OpBinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opBin}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitOpBin(EnquantoParser.OpBinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterId(EnquantoParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitId(EnquantoParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpPar(EnquantoParser.ExpParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpPar(EnquantoParser.ExpParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link EnquantoParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBool(EnquantoParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link EnquantoParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBool(EnquantoParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eLogico}
	 * labeled alternative in {@link EnquantoParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterELogico(EnquantoParser.ELogicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eLogico}
	 * labeled alternative in {@link EnquantoParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitELogico(EnquantoParser.ELogicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code naoLogico}
	 * labeled alternative in {@link EnquantoParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterNaoLogico(EnquantoParser.NaoLogicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code naoLogico}
	 * labeled alternative in {@link EnquantoParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitNaoLogico(EnquantoParser.NaoLogicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opRel}
	 * labeled alternative in {@link EnquantoParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterOpRel(EnquantoParser.OpRelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opRel}
	 * labeled alternative in {@link EnquantoParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitOpRel(EnquantoParser.OpRelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolPar}
	 * labeled alternative in {@link EnquantoParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBoolPar(EnquantoParser.BoolParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolPar}
	 * labeled alternative in {@link EnquantoParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBoolPar(EnquantoParser.BoolParContext ctx);
}