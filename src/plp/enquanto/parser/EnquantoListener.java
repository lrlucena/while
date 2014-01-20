// Generated from C:\Users\Lucena\Enquanto.g4 by ANTLR 4.1
package plp.enquanto.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EnquantoParser}.
 */
public interface EnquantoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EnquantoParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(@NotNull EnquantoParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(@NotNull EnquantoParser.BooleanoContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnquantoParser#leia}.
	 * @param ctx the parse tree
	 */
	void enterLeia(@NotNull EnquantoParser.LeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#leia}.
	 * @param ctx the parse tree
	 */
	void exitLeia(@NotNull EnquantoParser.LeiaContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnquantoParser#se}.
	 * @param ctx the parse tree
	 */
	void enterSe(@NotNull EnquantoParser.SeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#se}.
	 * @param ctx the parse tree
	 */
	void exitSe(@NotNull EnquantoParser.SeContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnquantoParser#inteiro}.
	 * @param ctx the parse tree
	 */
	void enterInteiro(@NotNull EnquantoParser.InteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#inteiro}.
	 * @param ctx the parse tree
	 */
	void exitInteiro(@NotNull EnquantoParser.InteiroContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnquantoParser#skip}.
	 * @param ctx the parse tree
	 */
	void enterSkip(@NotNull EnquantoParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#skip}.
	 * @param ctx the parse tree
	 */
	void exitSkip(@NotNull EnquantoParser.SkipContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnquantoParser#escreva}.
	 * @param ctx the parse tree
	 */
	void enterEscreva(@NotNull EnquantoParser.EscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#escreva}.
	 * @param ctx the parse tree
	 */
	void exitEscreva(@NotNull EnquantoParser.EscrevaContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnquantoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull EnquantoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull EnquantoParser.ProgramaContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnquantoParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull EnquantoParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull EnquantoParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnquantoParser#seqComando}.
	 * @param ctx the parse tree
	 */
	void enterSeqComando(@NotNull EnquantoParser.SeqComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#seqComando}.
	 * @param ctx the parse tree
	 */
	void exitSeqComando(@NotNull EnquantoParser.SeqComandoContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnquantoParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(@NotNull EnquantoParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(@NotNull EnquantoParser.AtribuicaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnquantoParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(@NotNull EnquantoParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(@NotNull EnquantoParser.BlocoContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnquantoParser#opBin}.
	 * @param ctx the parse tree
	 */
	void enterOpBin(@NotNull EnquantoParser.OpBinContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#opBin}.
	 * @param ctx the parse tree
	 */
	void exitOpBin(@NotNull EnquantoParser.OpBinContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnquantoParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(@NotNull EnquantoParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(@NotNull EnquantoParser.EnquantoContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnquantoParser#eLogico}.
	 * @param ctx the parse tree
	 */
	void enterELogico(@NotNull EnquantoParser.ELogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#eLogico}.
	 * @param ctx the parse tree
	 */
	void exitELogico(@NotNull EnquantoParser.ELogicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnquantoParser#boolPar}.
	 * @param ctx the parse tree
	 */
	void enterBoolPar(@NotNull EnquantoParser.BoolParContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#boolPar}.
	 * @param ctx the parse tree
	 */
	void exitBoolPar(@NotNull EnquantoParser.BoolParContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnquantoParser#naoLogico}.
	 * @param ctx the parse tree
	 */
	void enterNaoLogico(@NotNull EnquantoParser.NaoLogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#naoLogico}.
	 * @param ctx the parse tree
	 */
	void exitNaoLogico(@NotNull EnquantoParser.NaoLogicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnquantoParser#expPar}.
	 * @param ctx the parse tree
	 */
	void enterExpPar(@NotNull EnquantoParser.ExpParContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#expPar}.
	 * @param ctx the parse tree
	 */
	void exitExpPar(@NotNull EnquantoParser.ExpParContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnquantoParser#exiba}.
	 * @param ctx the parse tree
	 */
	void enterExiba(@NotNull EnquantoParser.ExibaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#exiba}.
	 * @param ctx the parse tree
	 */
	void exitExiba(@NotNull EnquantoParser.ExibaContext ctx);

	/**
	 * Enter a parse tree produced by {@link EnquantoParser#opRel}.
	 * @param ctx the parse tree
	 */
	void enterOpRel(@NotNull EnquantoParser.OpRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#opRel}.
	 * @param ctx the parse tree
	 */
	void exitOpRel(@NotNull EnquantoParser.OpRelContext ctx);
}