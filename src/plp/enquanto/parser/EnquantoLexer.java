// Generated from C:\Users\Lucena\Enquanto.g4 by ANTLR 4.1
package plp.enquanto.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EnquantoLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__23=1, T__22=2, T__21=3, T__20=4, T__19=5, T__18=6, T__17=7, T__16=8, 
		T__15=9, T__14=10, T__13=11, T__12=12, T__11=13, T__10=14, T__9=15, T__8=16, 
		T__7=17, T__6=18, T__5=19, T__4=20, T__3=21, T__2=22, T__1=23, T__0=24, 
		INT=25, ID=26, Texto=27, Espaco=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'enquanto'", "')'", "'verdadeiro'", "'nao'", "'faca'", "'+'", "'*'", 
		"'-'", "'entao'", "'('", "'senao'", "'='", "';'", "'<='", "'e'", "'leia'", 
		"'{'", "'se'", "':='", "'exiba'", "'skip'", "'}'", "'escreva'", "'falso'", 
		"INT", "ID", "Texto", "Espaco"
	};
	public static final String[] ruleNames = {
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "INT", 
		"ID", "Texto", "Espaco"
	};


	public EnquantoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Enquanto.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 27: Espaco_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void Espaco_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\36\u00b6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\6\32\u00a1\n\32\r\32\16\32\u00a2\3\33\6\33\u00a6\n\33\r\33"+
		"\16\33\u00a7\3\34\3\34\7\34\u00ac\n\34\f\34\16\34\u00af\13\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\u00ad\36\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17"+
		"\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22"+
		"\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1"+
		"\67\35\19\36\2\3\2\3\5\2\13\f\17\17\"\"\u00b8\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5D\3\2\2\2\7F\3\2"+
		"\2\2\tQ\3\2\2\2\13U\3\2\2\2\rZ\3\2\2\2\17\\\3\2\2\2\21^\3\2\2\2\23`\3"+
		"\2\2\2\25f\3\2\2\2\27h\3\2\2\2\31n\3\2\2\2\33p\3\2\2\2\35r\3\2\2\2\37"+
		"u\3\2\2\2!w\3\2\2\2#|\3\2\2\2%~\3\2\2\2\'\u0081\3\2\2\2)\u0084\3\2\2\2"+
		"+\u008a\3\2\2\2-\u008f\3\2\2\2/\u0091\3\2\2\2\61\u0099\3\2\2\2\63\u00a0"+
		"\3\2\2\2\65\u00a5\3\2\2\2\67\u00a9\3\2\2\29\u00b2\3\2\2\2;<\7g\2\2<=\7"+
		"p\2\2=>\7s\2\2>?\7w\2\2?@\7c\2\2@A\7p\2\2AB\7v\2\2BC\7q\2\2C\4\3\2\2\2"+
		"DE\7+\2\2E\6\3\2\2\2FG\7x\2\2GH\7g\2\2HI\7t\2\2IJ\7f\2\2JK\7c\2\2KL\7"+
		"f\2\2LM\7g\2\2MN\7k\2\2NO\7t\2\2OP\7q\2\2P\b\3\2\2\2QR\7p\2\2RS\7c\2\2"+
		"ST\7q\2\2T\n\3\2\2\2UV\7h\2\2VW\7c\2\2WX\7e\2\2XY\7c\2\2Y\f\3\2\2\2Z["+
		"\7-\2\2[\16\3\2\2\2\\]\7,\2\2]\20\3\2\2\2^_\7/\2\2_\22\3\2\2\2`a\7g\2"+
		"\2ab\7p\2\2bc\7v\2\2cd\7c\2\2de\7q\2\2e\24\3\2\2\2fg\7*\2\2g\26\3\2\2"+
		"\2hi\7u\2\2ij\7g\2\2jk\7p\2\2kl\7c\2\2lm\7q\2\2m\30\3\2\2\2no\7?\2\2o"+
		"\32\3\2\2\2pq\7=\2\2q\34\3\2\2\2rs\7>\2\2st\7?\2\2t\36\3\2\2\2uv\7g\2"+
		"\2v \3\2\2\2wx\7n\2\2xy\7g\2\2yz\7k\2\2z{\7c\2\2{\"\3\2\2\2|}\7}\2\2}"+
		"$\3\2\2\2~\177\7u\2\2\177\u0080\7g\2\2\u0080&\3\2\2\2\u0081\u0082\7<\2"+
		"\2\u0082\u0083\7?\2\2\u0083(\3\2\2\2\u0084\u0085\7g\2\2\u0085\u0086\7"+
		"z\2\2\u0086\u0087\7k\2\2\u0087\u0088\7d\2\2\u0088\u0089\7c\2\2\u0089*"+
		"\3\2\2\2\u008a\u008b\7u\2\2\u008b\u008c\7m\2\2\u008c\u008d\7k\2\2\u008d"+
		"\u008e\7r\2\2\u008e,\3\2\2\2\u008f\u0090\7\177\2\2\u0090.\3\2\2\2\u0091"+
		"\u0092\7g\2\2\u0092\u0093\7u\2\2\u0093\u0094\7e\2\2\u0094\u0095\7t\2\2"+
		"\u0095\u0096\7g\2\2\u0096\u0097\7x\2\2\u0097\u0098\7c\2\2\u0098\60\3\2"+
		"\2\2\u0099\u009a\7h\2\2\u009a\u009b\7c\2\2\u009b\u009c\7n\2\2\u009c\u009d"+
		"\7u\2\2\u009d\u009e\7q\2\2\u009e\62\3\2\2\2\u009f\u00a1\4\62;\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\64\3\2\2\2\u00a4\u00a6\4c|\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\66\3\2\2\2\u00a9"+
		"\u00ad\7$\2\2\u00aa\u00ac\13\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b1\7$\2\2\u00b18\3\2\2\2\u00b2\u00b3\t\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\b\35\2\2\u00b5:\3\2\2\2\6\2\u00a2\u00a7\u00ad";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}