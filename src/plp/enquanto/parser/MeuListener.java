package plp.enquanto.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import plp.enquanto.linguagem.Linguagem.*;

public class MeuListener extends EnquantoBaseListener {
	private Leia leia = new Leia();
	private Skip skip = new Skip();
	private ParseTreeProperty<Object> values = new ParseTreeProperty<>();

	private Programa programa;

	public Programa getPrograma() {
		return programa;
	}

	private void setValue(ParseTree node, Object value) {
		values.put(node, value);
	}

	private Object getValue(ParseTree node) {
		return values.get(node);
	}

	@Override
	public void exitBooleano(@NotNull EnquantoParser.BooleanoContext ctx) {
		setValue(ctx, new Booleano(ctx.getText().equals("verdadeiro")));
	}

	@Override
	public void exitLeia(@NotNull EnquantoParser.LeiaContext ctx) {
		setValue(ctx, leia);
	}

	@Override
	public void exitSe(@NotNull EnquantoParser.SeContext ctx) {
		Bool condicao = (Bool) getValue(ctx.bool());
		Comando entao = (Comando) getValue(ctx.comando(0));
		Comando senao = (Comando) getValue(ctx.comando(1));
		setValue(ctx, new Se(condicao, entao, senao));
	}

	@Override
	public void exitInteiro(@NotNull EnquantoParser.InteiroContext ctx) {
		setValue(ctx, new Inteiro(Integer.parseInt(ctx.getText())));
	}

	@Override
	public void exitSkip(@NotNull EnquantoParser.SkipContext ctx) {
		setValue(ctx, skip);
	}

	@Override
	public void exitEscreva(@NotNull EnquantoParser.EscrevaContext ctx) {
		Expressao exp = (Expressao) getValue(ctx.expressao());
		setValue(ctx, new Escreva(exp));
	}

	@Override
	public void exitPrograma(@NotNull EnquantoParser.ProgramaContext ctx) {
		@SuppressWarnings("unchecked")
		List<Comando> cmds = (List<Comando>) getValue(ctx.seqComando());
		programa = new Programa(cmds);
		setValue(ctx, programa);
	}

	@Override
	public void exitId(@NotNull EnquantoParser.IdContext ctx) {
		setValue(ctx, new Id(ctx.ID().getText()));
	}

	@Override
	public void exitSeqComando(@NotNull EnquantoParser.SeqComandoContext ctx) {
		List<Comando> comandos = new ArrayList<>();
		for (EnquantoParser.ComandoContext c : ctx.comando()) {
			comandos.add((Comando) getValue(c));
		}
		setValue(ctx, comandos);
	}

	@Override
	public void exitAtribuicao(@NotNull EnquantoParser.AtribuicaoContext ctx) {
		String id = ctx.ID().getText();
		Expressao exp = (Expressao) getValue(ctx.expressao());
		setValue(ctx, new Atribuicao(id, exp));
	}

	@Override
	public void exitBloco(@NotNull EnquantoParser.BlocoContext ctx) {
		@SuppressWarnings("unchecked")
		List<Comando> cmds = (List<Comando>) getValue(ctx.seqComando());
		setValue(ctx, new Bloco(cmds));
	}

	@Override
	public void exitOpBin(@NotNull EnquantoParser.OpBinContext ctx) {
		Expressao esq = (Expressao) getValue(ctx.expressao(0));
		Expressao dir = (Expressao) getValue(ctx.expressao(1));
		String op = ctx.getChild(1).getText();
		final ExpBin exp;
		switch (op) {
		case "+":
			exp = new ExpSoma(esq, dir);
			break;
		case "*":
			exp = new ExpMult(esq, dir);
			break;
		case "-":
			exp = new ExpSub(esq, dir);
			break;
		default:
			exp = new ExpSoma(esq, dir);
		}
		setValue(ctx, exp);
	}

	@Override
	public void exitEnquanto(@NotNull EnquantoParser.EnquantoContext ctx) {
		Bool condicao = (Bool) getValue(ctx.bool());
		Comando comando = (Comando) getValue(ctx.comando());
		setValue(ctx, new Enquanto(condicao, comando));
	}

	@Override
	public void exitELogico(@NotNull EnquantoParser.ELogicoContext ctx) {
		Bool esq = (Bool) getValue(ctx.bool(0));
		Bool dir = (Bool) getValue(ctx.bool(1));
		setValue(ctx, new ELogico(esq, dir));
	}

	@Override
	public void exitBoolPar(@NotNull EnquantoParser.BoolParContext ctx) {
		setValue(ctx, getValue(ctx.bool()));
	}

	@Override
	public void exitNaoLogico(@NotNull EnquantoParser.NaoLogicoContext ctx) {
		Bool b = (Bool) getValue(ctx.bool());
		setValue(ctx, new NaoLogico(b));
	}

	@Override
	public void exitExpPar(@NotNull EnquantoParser.ExpParContext ctx) {
		setValue(ctx, getValue(ctx.expressao()));
	}

	@Override
	public void exitExiba(@NotNull EnquantoParser.ExibaContext ctx) {
		String t = ctx.Texto().getText();
		String texto = t.substring(1, t.length() - 1);
		setValue(ctx, new Exiba(texto));
	}

	@Override
	public void exitOpRel(@NotNull EnquantoParser.OpRelContext ctx) {
		Expressao esq = (Expressao) getValue(ctx.expressao(0));
		Expressao dir = (Expressao) getValue(ctx.expressao(1));
		String op = ctx.getChild(1).getText();
		final ExpRel exp;
		switch (op) {
		case "=":
			exp = new ExpIgual(esq, dir);
			break;
		case "<=":
			exp = new ExpMenorIgual(esq, dir);
			break;
		default:
			exp = new ExpIgual(esq, dir);
		}
		setValue(ctx, exp);
	}
}
