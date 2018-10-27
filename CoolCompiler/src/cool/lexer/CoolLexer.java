// Generated from CoolLexer.g4 by ANTLR 4.7.1

    package cool.lexer;	

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, WS=2, CLASS=3, ELSE=4, IF=5, FI=6, IN=7, INHERITS=8, ISVOID=9, 
		LET=10, LOOP=11, POOL=12, THEN=13, WHILE=14, CASE=15, ESAC=16, NEW=17, 
		NOT=18, OF=19, FALSE=20, TRUE=21, STRING=22, BLOCK_COMMENT=23, LINE_COMMENT=24, 
		SELF=25, SELF_TYPE=26, TYPE_ID=27, ID=28, INTEGER=29, ROUND_P_OPEN=30, 
		ROUND_P_COSED=31, SQUARE_P_OPEN=32, SQUARE_P_CLOSED=33, BRACE_P_OPEN=34, 
		BRACE_P_CLOSED=35, INTEGER_COMPLEMENT=36, PLUS=37, MINUS=38, MULTIPLY=39, 
		DIVISION=40, ASSIGN=41, SET=42, LESS_EQUAL=43, LESS=44, EQUAL=45, COLON=46, 
		SEMICOLON=47, COMMA=48, AT=49, POINT=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "CLASS", "ELSE", "IF", "FI", "IN", "INHERITS", "ISVOID", "LET", 
		"LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "NEW", "NOT", "OF", "FALSE", 
		"TRUE", "STRING", "BLOCK_COMMENT", "LINE_COMMENT", "SELF", "SELF_TYPE", 
		"DIGIT", "LOWER_LETTER", "UPPER_LETTER", "TYPE_ID", "ID", "INTEGER", "ROUND_P_OPEN", 
		"ROUND_P_COSED", "SQUARE_P_OPEN", "SQUARE_P_CLOSED", "BRACE_P_OPEN", "BRACE_P_CLOSED", 
		"INTEGER_COMPLEMENT", "PLUS", "MINUS", "MULTIPLY", "DIVISION", "ASSIGN", 
		"SET", "LESS_EQUAL", "LESS", "EQUAL", "COLON", "SEMICOLON", "COMMA", "AT", 
		"POINT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'false'", "'true'", null, 
		null, null, "'self'", "'SELF_TYPE'", null, null, null, "'('", "')'", "'['", 
		"']'", "'{'", "'}'", "'~'", "'+'", "'-'", "'*'", "'/'", "'<-'", "'=>'", 
		"'<='", "'<'", "'='", "':'", "';'", "','", "'@'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "WS", "CLASS", "ELSE", "IF", "FI", "IN", "INHERITS", "ISVOID", 
		"LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "NEW", "NOT", 
		"OF", "FALSE", "TRUE", "STRING", "BLOCK_COMMENT", "LINE_COMMENT", "SELF", 
		"SELF_TYPE", "TYPE_ID", "ID", "INTEGER", "ROUND_P_OPEN", "ROUND_P_COSED", 
		"SQUARE_P_OPEN", "SQUARE_P_CLOSED", "BRACE_P_OPEN", "BRACE_P_CLOSED", 
		"INTEGER_COMPLEMENT", "PLUS", "MINUS", "MULTIPLY", "DIVISION", "ASSIGN", 
		"SET", "LESS_EQUAL", "LESS", "EQUAL", "COLON", "SEMICOLON", "COMMA", "AT", 
		"POINT"
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

	    
	    private void raiseError(String msg) {
	        setText(msg);
	        setType(ERROR);
	    }


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 20:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

						
						String x = getText();
						int i = 0;
						while(i < x.length()){
							if(x.charAt(i) == '\\'){
								if(x.charAt(i+1) == '\n'){
									//x = x.substring(0,i) + x.substring(i+1,x.length());
									i++;
								}else
								if(x.charAt(i+1) != 'n' && x.charAt(i+1) != 't' && x.charAt(i+1) != 'b' && x.charAt(i+1) != 'f'){
									x = x.substring(0,i) + x.substring(i+1,x.length());
								}else					 
								 if(x.charAt(i+1) == 'n'){
									 x = x.substring(0,i) + '\n' + x.substring(i+2,x.length());
									 i++;
								 }else
								 if(x.charAt(i+1) == 't'){
								 	x = x.substring(0,i) + '\t' + x.substring(i+2,x.length());
								 	i++;
								 }else
								 if(x.charAt(i+1) == 'b'){
								 	x = x.substring(0,i) + '\b' + x.substring(i+2,x.length());
								 	i++;
								 }else
								 if (x.charAt(i+1) == 'f'){
									x = x.substring(0,i) + '\f' + x.substring(i+2,x.length());
								 	i++;
								}
							}
							else{
								i++;
							}
						}
						setText(x.substring(1,x.length()-1));
					
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u015a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\6\2m\n\2\r\2\16\2n\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00d4"+
		"\n\26\f\26\16\26\u00d7\13\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7"+
		"\27\u00e1\n\27\f\27\16\27\u00e4\13\27\3\27\3\27\3\27\5\27\u00e9\n\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u00f2\n\30\f\30\16\30\u00f5\13"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\7\36\u0115\n\36\f\36\16\36\u0118\13\36\3\37\3\37\3\37\3"+
		"\37\3\37\7\37\u011f\n\37\f\37\16\37\u0122\13\37\3 \3 \3 \7 \u0127\n \f"+
		" \16 \u012a\13 \5 \u012c\n \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\5\u00d5\u00e2\u00f3"+
		"\2\66\3\4\5\5\7\6\t\7\13\b\r\t\17\n\21\13\23\f\25\r\27\16\31\17\33\20"+
		"\35\21\37\22!\23#\24%\25\'\26)\27+\30-\31/\32\61\33\63\34\65\2\67\29\2"+
		";\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64\3\2"+
		"\27\5\2\13\f\16\17\"\"\4\2EEee\4\2NNnn\4\2CCcc\4\2UUuu\4\2GGgg\4\2KKk"+
		"k\4\2HHhh\4\2PPpp\4\2JJjj\4\2TTtt\4\2VVvv\4\2XXxx\4\2QQqq\4\2FFff\4\2"+
		"RRrr\4\2YYyy\3\2\62;\3\2c|\3\2C\\\3\2\63;\2\u0168\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3l\3\2\2"+
		"\2\5r\3\2\2\2\7x\3\2\2\2\t}\3\2\2\2\13\u0080\3\2\2\2\r\u0083\3\2\2\2\17"+
		"\u0086\3\2\2\2\21\u008f\3\2\2\2\23\u0096\3\2\2\2\25\u009a\3\2\2\2\27\u009f"+
		"\3\2\2\2\31\u00a4\3\2\2\2\33\u00a9\3\2\2\2\35\u00af\3\2\2\2\37\u00b4\3"+
		"\2\2\2!\u00b9\3\2\2\2#\u00bd\3\2\2\2%\u00c1\3\2\2\2\'\u00c4\3\2\2\2)\u00ca"+
		"\3\2\2\2+\u00cf\3\2\2\2-\u00db\3\2\2\2/\u00ec\3\2\2\2\61\u00fa\3\2\2\2"+
		"\63\u00ff\3\2\2\2\65\u0109\3\2\2\2\67\u010b\3\2\2\29\u010d\3\2\2\2;\u010f"+
		"\3\2\2\2=\u0119\3\2\2\2?\u012b\3\2\2\2A\u012d\3\2\2\2C\u012f\3\2\2\2E"+
		"\u0131\3\2\2\2G\u0133\3\2\2\2I\u0135\3\2\2\2K\u0137\3\2\2\2M\u0139\3\2"+
		"\2\2O\u013b\3\2\2\2Q\u013d\3\2\2\2S\u013f\3\2\2\2U\u0141\3\2\2\2W\u0143"+
		"\3\2\2\2Y\u0146\3\2\2\2[\u0149\3\2\2\2]\u014c\3\2\2\2_\u014e\3\2\2\2a"+
		"\u0150\3\2\2\2c\u0152\3\2\2\2e\u0154\3\2\2\2g\u0156\3\2\2\2i\u0158\3\2"+
		"\2\2km\t\2\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\b\2"+
		"\2\2q\4\3\2\2\2rs\t\3\2\2st\t\4\2\2tu\t\5\2\2uv\t\6\2\2vw\t\6\2\2w\6\3"+
		"\2\2\2xy\t\7\2\2yz\t\4\2\2z{\t\6\2\2{|\t\7\2\2|\b\3\2\2\2}~\t\b\2\2~\177"+
		"\t\t\2\2\177\n\3\2\2\2\u0080\u0081\t\t\2\2\u0081\u0082\t\b\2\2\u0082\f"+
		"\3\2\2\2\u0083\u0084\t\b\2\2\u0084\u0085\t\n\2\2\u0085\16\3\2\2\2\u0086"+
		"\u0087\t\b\2\2\u0087\u0088\t\n\2\2\u0088\u0089\t\13\2\2\u0089\u008a\t"+
		"\7\2\2\u008a\u008b\t\f\2\2\u008b\u008c\t\b\2\2\u008c\u008d\t\r\2\2\u008d"+
		"\u008e\t\6\2\2\u008e\20\3\2\2\2\u008f\u0090\t\b\2\2\u0090\u0091\t\6\2"+
		"\2\u0091\u0092\t\16\2\2\u0092\u0093\t\17\2\2\u0093\u0094\t\b\2\2\u0094"+
		"\u0095\t\20\2\2\u0095\22\3\2\2\2\u0096\u0097\t\4\2\2\u0097\u0098\t\7\2"+
		"\2\u0098\u0099\t\r\2\2\u0099\24\3\2\2\2\u009a\u009b\t\4\2\2\u009b\u009c"+
		"\t\17\2\2\u009c\u009d\t\17\2\2\u009d\u009e\t\21\2\2\u009e\26\3\2\2\2\u009f"+
		"\u00a0\t\21\2\2\u00a0\u00a1\t\17\2\2\u00a1\u00a2\t\17\2\2\u00a2\u00a3"+
		"\t\4\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\t\r\2\2\u00a5\u00a6\t\13\2\2\u00a6"+
		"\u00a7\t\7\2\2\u00a7\u00a8\t\n\2\2\u00a8\32\3\2\2\2\u00a9\u00aa\t\22\2"+
		"\2\u00aa\u00ab\t\13\2\2\u00ab\u00ac\t\b\2\2\u00ac\u00ad\t\4\2\2\u00ad"+
		"\u00ae\t\7\2\2\u00ae\34\3\2\2\2\u00af\u00b0\t\3\2\2\u00b0\u00b1\t\5\2"+
		"\2\u00b1\u00b2\t\6\2\2\u00b2\u00b3\t\7\2\2\u00b3\36\3\2\2\2\u00b4\u00b5"+
		"\t\7\2\2\u00b5\u00b6\t\6\2\2\u00b6\u00b7\t\5\2\2\u00b7\u00b8\t\3\2\2\u00b8"+
		" \3\2\2\2\u00b9\u00ba\t\n\2\2\u00ba\u00bb\t\7\2\2\u00bb\u00bc\t\22\2\2"+
		"\u00bc\"\3\2\2\2\u00bd\u00be\t\n\2\2\u00be\u00bf\t\17\2\2\u00bf\u00c0"+
		"\t\r\2\2\u00c0$\3\2\2\2\u00c1\u00c2\t\17\2\2\u00c2\u00c3\t\t\2\2\u00c3"+
		"&\3\2\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7n\2\2\u00c7"+
		"\u00c8\7u\2\2\u00c8\u00c9\7g\2\2\u00c9(\3\2\2\2\u00ca\u00cb\7v\2\2\u00cb"+
		"\u00cc\7t\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce\7g\2\2\u00ce*\3\2\2\2\u00cf"+
		"\u00d5\7$\2\2\u00d0\u00d1\7^\2\2\u00d1\u00d4\7$\2\2\u00d2\u00d4\13\2\2"+
		"\2\u00d3\u00d0\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00d9\7$\2\2\u00d9\u00da\b\26\3\2\u00da,\3\2\2\2\u00db\u00dc\7*\2\2\u00dc"+
		"\u00dd\7,\2\2\u00dd\u00e2\3\2\2\2\u00de\u00e1\5-\27\2\u00df\u00e1\13\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e8\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e5\u00e6\7,\2\2\u00e6\u00e9\7+\2\2\u00e7\u00e9\7\2\2\3\u00e8\u00e5"+
		"\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b\27\2\2"+
		"\u00eb.\3\2\2\2\u00ec\u00ed\7/\2\2\u00ed\u00ee\7/\2\2\u00ee\u00f3\3\2"+
		"\2\2\u00ef\u00f2\5/\30\2\u00f0\u00f2\13\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\f\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\b\30\2\2\u00f9\60\3\2\2\2\u00fa\u00fb\7u\2"+
		"\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7h\2\2\u00fe\62\3"+
		"\2\2\2\u00ff\u0100\7U\2\2\u0100\u0101\7G\2\2\u0101\u0102\7N\2\2\u0102"+
		"\u0103\7H\2\2\u0103\u0104\7a\2\2\u0104\u0105\7V\2\2\u0105\u0106\7[\2\2"+
		"\u0106\u0107\7R\2\2\u0107\u0108\7G\2\2\u0108\64\3\2\2\2\u0109\u010a\t"+
		"\23\2\2\u010a\66\3\2\2\2\u010b\u010c\t\24\2\2\u010c8\3\2\2\2\u010d\u010e"+
		"\t\25\2\2\u010e:\3\2\2\2\u010f\u0116\59\35\2\u0110\u0115\5\67\34\2\u0111"+
		"\u0115\59\35\2\u0112\u0115\5\65\33\2\u0113\u0115\7a\2\2\u0114\u0110\3"+
		"\2\2\2\u0114\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117<\3\2\2\2"+
		"\u0118\u0116\3\2\2\2\u0119\u0120\5\67\34\2\u011a\u011f\5\67\34\2\u011b"+
		"\u011f\59\35\2\u011c\u011f\5\65\33\2\u011d\u011f\7a\2\2\u011e\u011a\3"+
		"\2\2\2\u011e\u011b\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121>\3\2\2\2"+
		"\u0122\u0120\3\2\2\2\u0123\u012c\5\65\33\2\u0124\u0128\t\26\2\2\u0125"+
		"\u0127\5\65\33\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3"+
		"\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u0123\3\2\2\2\u012b\u0124\3\2\2\2\u012c@\3\2\2\2\u012d\u012e\7*\2\2\u012e"+
		"B\3\2\2\2\u012f\u0130\7+\2\2\u0130D\3\2\2\2\u0131\u0132\7]\2\2\u0132F"+
		"\3\2\2\2\u0133\u0134\7_\2\2\u0134H\3\2\2\2\u0135\u0136\7}\2\2\u0136J\3"+
		"\2\2\2\u0137\u0138\7\177\2\2\u0138L\3\2\2\2\u0139\u013a\7\u0080\2\2\u013a"+
		"N\3\2\2\2\u013b\u013c\7-\2\2\u013cP\3\2\2\2\u013d\u013e\7/\2\2\u013eR"+
		"\3\2\2\2\u013f\u0140\7,\2\2\u0140T\3\2\2\2\u0141\u0142\7\61\2\2\u0142"+
		"V\3\2\2\2\u0143\u0144\7>\2\2\u0144\u0145\7/\2\2\u0145X\3\2\2\2\u0146\u0147"+
		"\7?\2\2\u0147\u0148\7@\2\2\u0148Z\3\2\2\2\u0149\u014a\7>\2\2\u014a\u014b"+
		"\7?\2\2\u014b\\\3\2\2\2\u014c\u014d\7>\2\2\u014d^\3\2\2\2\u014e\u014f"+
		"\7?\2\2\u014f`\3\2\2\2\u0150\u0151\7<\2\2\u0151b\3\2\2\2\u0152\u0153\7"+
		"=\2\2\u0153d\3\2\2\2\u0154\u0155\7.\2\2\u0155f\3\2\2\2\u0156\u0157\7B"+
		"\2\2\u0157h\3\2\2\2\u0158\u0159\7\60\2\2\u0159j\3\2\2\2\21\2n\u00d3\u00d5"+
		"\u00e0\u00e2\u00e8\u00f1\u00f3\u0114\u0116\u011e\u0120\u0128\u012b\4\b"+
		"\2\2\3\26\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}