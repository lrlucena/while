package plp.enquanto;

import java.io.IOException;
import java.util.Scanner;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import plp.enquanto.linguagem.Linguagem.Programa;
import plp.enquanto.parser.EnquantoLexer;
import plp.enquanto.parser.EnquantoParser;
import plp.enquanto.parser.MeuListener;

import static java.lang.System.*;

public class Principal {

	private static ParseTree parse(String arq) {
		CharStream input;
		try {
			input = CharStreams.fromFileName(arq);
		} catch (IOException e) {
			input = CharStreams.fromString("exiba \"Arquivo não encontrado.\"");
		}
		final EnquantoLexer lexer = new EnquantoLexer(input);
		final CommonTokenStream tokens = new CommonTokenStream(lexer);
		final EnquantoParser parser = new EnquantoParser(tokens);
		return parser.programa();
	}

	public static void main(String ... args) {
		final String arq;
		if (args.length > 0) {
			arq = args[0];
		} else {
			out.print("Qual o arquivo para executar? ");
			arq = new Scanner(in).nextLine();
		}
		final ParseTree tree = parse(arq);
		final ParseTreeWalker walker = new ParseTreeWalker();
		final MeuListener listener = new MeuListener();
		walker.walk(listener, tree);
		Programa p1 = listener.getPrograma();
		p1.execute();
	}
}
