// Generated from BKOOL.g4 by ANTLR 4.5

package bkool.parser;

import bkool.utils.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class BKOOL extends Lexer {
	static {
		RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int ID = 1, LP = 2, RP = 3, WS = 4, ERROR_CHAR = 5;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] ruleNames = { "ID", "LP", "RP", "WS",
			"ERROR_CHAR" };

	private static final String[] _LITERAL_NAMES = { null, null, "'{'", "'}'" };
	private static final String[] _SYMBOLIC_NAMES = { null, "ID", "LP", "RP",
			"WS", "ERROR_CHAR" };
	public static final Vocabulary VOCABULARY = new VocabularyImpl(
			_LITERAL_NAMES, _SYMBOLIC_NAMES);

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
	public Token emit() {
		switch (getType()) {
		case ERROR_CHAR:
			Token result = super.emit();
			throw new ErrorToken(result.getText());
		default:
			return super.emit();
		}
	}

	public BKOOL(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "BKOOL.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7\37\b\1\4\2\t\2"
			+ "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\17\n\2\r\2\16\2\20\3\3\3\3\3"
			+ "\4\3\4\3\5\6\5\30\n\5\r\5\16\5\31\3\5\3\5\3\6\3\6\2\2\7\3\3\5\4\7\5\t"
			+ "\6\13\7\3\2\4\3\2c|\5\2\13\f\17\17\"\" \2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"
			+ "\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\16\3\2\2\2\5\22\3\2\2\2\7\24\3\2\2\2"
			+ "\t\27\3\2\2\2\13\35\3\2\2\2\r\17\t\2\2\2\16\r\3\2\2\2\17\20\3\2\2\2\20"
			+ "\16\3\2\2\2\20\21\3\2\2\2\21\4\3\2\2\2\22\23\7}\2\2\23\6\3\2\2\2\24\25"
			+ "\7\177\2\2\25\b\3\2\2\2\26\30\t\3\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27"
			+ "\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\34\b\5\2\2\34\n\3\2\2\2\35\36"
			+ "\13\2\2\2\36\f\3\2\2\2\5\2\20\31\3\b\2\2";
	public static final ATN _ATN = new ATNDeserializer()
			.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}