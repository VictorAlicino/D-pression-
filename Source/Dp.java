/* Dp.java */
/* Generated By:JavaCC: Do not edit this line. Dp.java */
import java.io.*;

public class Dp implements DpConstants {
    public static void main(String[] args) throws ParseException, IOException{
        System.out.print("Type the name of file to parse: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        try{
            Dp lex_analyzer = new Dp(new FileInputStream(filename));
            System.out.println("Starting Lexical Analysis on " + filename + "...");
            try{
                lex_analyzer.Dp();
                System.out.println("Lexical Analysis Completed");
            }catch(TokenMgrError e){
                System.out.println("\n" + e.getMessage() + "\nLexical Analysis Failed");
            }
        }catch(FileNotFoundException e){
            System.out.println("ERROR\n" + e.getMessage() + "\nLexical Analysis Failed");
        }
    }

// TOKEN LEXICAL ANALYZER
  static final public void Dp() throws ParseException {System.out.println("BEGIN OF FILE\n");
    Token t;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IF:
      case ELSE:
      case WHILE:
      case FOR:
      case RETURN:
      case INT:
      case FLOAT:
      case VOID:
      case CHAR_TYPE:
      case STRING:
      case BOOL:
      case TRUE:
      case FALSE:
      case PRINT:
      case MAIN:
      case LPAREN:
      case RPAREN:
      case LBRACE:
      case RBRACE:
      case LBRACKET:
      case RBRACKET:
      case COMMA:
      case SEMICOLON:
      case ID:
      case NUM_N:
      case NUM_R:
      case CHAR:
      case PLUS:
      case MINUS:
      case MULT:
      case DIV:
      case MOD:
      case EXP:
      case ASSIGN:
      case EQUAL:
      case NEQUAL:
      case LESS:
      case GREATER:
      case LEQUAL:
      case GEQUAL:
      case AND:
      case OR:
      case NOT:
      case COLON:
      case QUESTION:
      case ARROW:
      case INC:
      case DEC:
      case APOSTROPHE:
      case ADD_ASSIGN:
      case SUB_ASSIGN:
      case MUL_ASSIGN:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ID:{
        t = jj_consume_token(ID);
System.out.print("ID ");
        break;
        }
      case NUM_N:{
        t = jj_consume_token(NUM_N);
System.out.print("NUM_N ");
        break;
        }
      case NUM_R:{
        t = jj_consume_token(NUM_R);
System.out.print("NUM_R ");
        break;
        }
      case PLUS:{
        t = jj_consume_token(PLUS);
System.out.print("PLUS ");
        break;
        }
      case MINUS:{
        t = jj_consume_token(MINUS);
System.out.print("MINUS ");
        break;
        }
      case MULT:{
        t = jj_consume_token(MULT);
System.out.print("MULT ");
        break;
        }
      case DIV:{
        t = jj_consume_token(DIV);
System.out.print("DIV ");
        break;
        }
      case MOD:{
        t = jj_consume_token(MOD);
System.out.print("MOD ");
        break;
        }
      case EXP:{
        t = jj_consume_token(EXP);
System.out.print("EXP ");
        break;
        }
      case ASSIGN:{
        t = jj_consume_token(ASSIGN);
System.out.print("ASSIGN ");
        break;
        }
      case EQUAL:{
        t = jj_consume_token(EQUAL);
System.out.print("EQUAL ");
        break;
        }
      case NEQUAL:{
        t = jj_consume_token(NEQUAL);
System.out.print("NEQUAL ");
        break;
        }
      case LESS:{
        t = jj_consume_token(LESS);
System.out.print("LESS ");
        break;
        }
      case GREATER:{
        t = jj_consume_token(GREATER);
System.out.print("GREATER ");
        break;
        }
      case LEQUAL:{
        t = jj_consume_token(LEQUAL);
System.out.print("LEQUAL ");
        break;
        }
      case GEQUAL:{
        t = jj_consume_token(GEQUAL);
System.out.print("GEQUAL ");
        break;
        }
      case AND:{
        t = jj_consume_token(AND);
System.out.print("AND ");
        break;
        }
      case OR:{
        t = jj_consume_token(OR);
System.out.print("OR ");
        break;
        }
      case NOT:{
        t = jj_consume_token(NOT);
System.out.print("NOT ");
        break;
        }
      case LPAREN:{
        t = jj_consume_token(LPAREN);
System.out.print("(");
        break;
        }
      case RPAREN:{
        t = jj_consume_token(RPAREN);
System.out.print(")");
        break;
        }
      case LBRACE:{
        t = jj_consume_token(LBRACE);
System.out.println("{");
        break;
        }
      case RBRACE:{
        t = jj_consume_token(RBRACE);
System.out.println("}\n");
        break;
        }
      case LBRACKET:{
        t = jj_consume_token(LBRACKET);
System.out.print("[");
        break;
        }
      case RBRACKET:{
        t = jj_consume_token(RBRACKET);
System.out.println("]");
        break;
        }
      case SEMICOLON:{
        t = jj_consume_token(SEMICOLON);
System.out.println(" ");
        break;
        }
      case COMMA:{
        t = jj_consume_token(COMMA);
System.out.print(", ");
        break;
        }
      case COLON:{
        t = jj_consume_token(COLON);
System.out.print(": ");
        break;
        }
      case APOSTROPHE:{
        t = jj_consume_token(APOSTROPHE);
System.out.print("'");
        break;
        }
      case QUESTION:{
        t = jj_consume_token(QUESTION);
System.out.print("?");
        break;
        }
      case ARROW:{
        t = jj_consume_token(ARROW);
System.out.print("ARROW ");
        break;
        }
      case INC:{
        t = jj_consume_token(INC);
System.out.print("INC ");
        break;
        }
      case DEC:{
        t = jj_consume_token(DEC);
System.out.print("DEC ");
        break;
        }
      case ADD_ASSIGN:{
        t = jj_consume_token(ADD_ASSIGN);
System.out.print("ADD_ASSIGN ");
        break;
        }
      case SUB_ASSIGN:{
        t = jj_consume_token(SUB_ASSIGN);
System.out.print("SUB_ASSIGN ");
        break;
        }
      case MUL_ASSIGN:{
        t = jj_consume_token(MUL_ASSIGN);
System.out.print("MUL_ASSIGN ");
        break;
        }
      case IF:{
        t = jj_consume_token(IF);
System.out.print("IF ");
        break;
        }
      case ELSE:{
        t = jj_consume_token(ELSE);
System.out.print("ELSE ");
        break;
        }
      case WHILE:{
        t = jj_consume_token(WHILE);
System.out.print("WHILE ");
        break;
        }
      case FOR:{
        t = jj_consume_token(FOR);
System.out.print("FOR ");
        break;
        }
      case PRINT:{
        t = jj_consume_token(PRINT);
System.out.print("PRINT ");
        break;
        }
      case MAIN:{
        t = jj_consume_token(MAIN);
System.out.print("MAIN ");
        break;
        }
      case INT:{
        t = jj_consume_token(INT);
System.out.print("INT ");
        break;
        }
      case FLOAT:{
        t = jj_consume_token(FLOAT);
System.out.print("FLOAT ");
        break;
        }
      case CHAR:{
        t = jj_consume_token(CHAR);
System.out.print("CHAR ");
        break;
        }
      case CHAR_TYPE:{
        t = jj_consume_token(CHAR_TYPE);
System.out.print("CHAR_TYPE ");
        break;
        }
      case STRING:{
        t = jj_consume_token(STRING);
System.out.print("STRING ");
        break;
        }
      case BOOL:{
        t = jj_consume_token(BOOL);
System.out.print("BOOL ");
        break;
        }
      case TRUE:{
        t = jj_consume_token(TRUE);
System.out.print("TRUE ");
        break;
        }
      case FALSE:{
        t = jj_consume_token(FALSE);
System.out.print("FALSE ");
        break;
        }
      case VOID:{
        t = jj_consume_token(VOID);
System.out.print("VOID ");
        break;
        }
      case RETURN:{
        t = jj_consume_token(RETURN);
System.out.print("RETURN ");
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(0);
System.out.println("\nEND OF FILE ");
}

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public DpTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[2];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0xdfffef80,0xdfffef80,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x1fffffff,0x1fffffff,};
	}

  /** Constructor with InputStream. */
  public Dp(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Dp(java.io.InputStream stream, String encoding) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser.  ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new DpTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Dp(java.io.Reader stream) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new DpTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new DpTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Dp(DpTokenManager tm) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(DpTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  static private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[61];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 2; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 61; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  static private boolean trace_enabled;

/** Trace enabled. */
  static final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
