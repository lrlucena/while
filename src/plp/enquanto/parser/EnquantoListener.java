// Generated from Enquanto.g4 by ANTLR 4.4
package plp.enquanto.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EnquantoParser}.
 */
public interface EnquantoListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by the {@code atribuicao}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(@NotNull EnquantoParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atribuicao}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(@NotNull EnquantoParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enquanto}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(@NotNull EnquantoParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enquanto}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(@NotNull EnquantoParser.EnquantoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leia}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterLeia(@NotNull EnquantoParser.LeiaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leia}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitLeia(@NotNull EnquantoParser.LeiaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterELogico(@NotNull EnquantoParser.ELogicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitELogico(@NotNull EnquantoParser.ELogicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterInteiro(@NotNull EnquantoParser.InteiroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitInteiro(@NotNull EnquantoParser.InteiroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bloco}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterBloco(@NotNull EnquantoParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bloco}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitBloco(@NotNull EnquantoParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code naoLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterNaoLogico(@NotNull EnquantoParser.NaoLogicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code naoLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitNaoLogico(@NotNull EnquantoParser.NaoLogicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code escreva}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterEscreva(@NotNull EnquantoParser.EscrevaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code escreva}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitEscreva(@NotNull EnquantoParser.EscrevaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opRel}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterOpRel(@NotNull EnquantoParser.OpRelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opRel}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitOpRel(@NotNull EnquantoParser.OpRelContext ctx);
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
	 * Enter a parse tree produced by the {@code skip}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterSkip(@NotNull EnquantoParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitSkip(@NotNull EnquantoParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpPar(@NotNull EnquantoParser.ExpParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpPar(@NotNull EnquantoParser.ExpParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolPar}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolPar(@NotNull EnquantoParser.BoolParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolPar}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolPar(@NotNull EnquantoParser.BoolParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code se}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterSe(@NotNull EnquantoParser.SeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code se}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitSe(@NotNull EnquantoParser.SeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exiba}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterExiba(@NotNull EnquantoParser.ExibaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exiba}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitExiba(@NotNull EnquantoParser.ExibaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(@NotNull EnquantoParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(@NotNull EnquantoParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opBin}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterOpBin(@NotNull EnquantoParser.OpBinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opBin}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitOpBin(@NotNull EnquantoParser.OpBinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull EnquantoParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull EnquantoParser.IdContext ctx);
}