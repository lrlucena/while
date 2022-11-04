package plp.enquanto;

import java.io.IOException;
import java.util.Scanner;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import plp.enquanto.Linguagem.Programa;
import plp.enquanto.parser.EnquantoLexer;
import plp.enquanto.parser.EnquantoParser;

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

	public static void main(final String ... args) {
		final String arq;
		if (args.length > 0) {
			arq = args[0];
		} else {
			System.out.print("Qual o arquivo para executar? ");
			Scanner scanner = new Scanner(System.in);
			arq = scanner.nextLine();
			scanner.close();
		}
		final ParseTree tree = parse(arq);
		final ParseTreeWalker walker = new ParseTreeWalker();
		final Regras regras = new Regras();
		walker.walk(regras, tree);
		Programa programa = regras.getPrograma();
		programa.execute();
	}
}
