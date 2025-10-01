package com.mycompany.analizadorlexico;



import java_cup.runtime.*;
import java.util.*;


@SuppressWarnings("fallthrough")
public class Lexico implements java_cup.runtime.Scanner, java.io.Serializable {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\2\2\22\0\1\1\1\4"+
    "\1\5\1\6\2\0\1\7\1\0\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\11\21\1\22"+
    "\1\0\1\23\1\24\1\25\2\0\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\2\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\37\1\45\1\46\1\47"+
    "\1\50\1\51\4\37\1\52\1\53\1\54\3\0\1\55"+
    "\3\27\1\56\1\27\1\57\1\60\3\37\1\61\2\37"+
    "\1\62\3\37\1\63\1\37\1\64\1\37\1\65\3\37"+
    "\1\0\1\66\10\0\1\3\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\3\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\1\1\12\2\13\1\14\1\15"+
    "\1\16\1\17\12\20\1\21\1\22\1\20\1\1\1\23"+
    "\1\0\1\24\2\0\1\25\1\26\1\0\1\2\1\0"+
    "\1\27\1\30\1\31\4\20\1\32\7\20\1\33\2\0"+
    "\1\34\4\20\1\35\6\20\2\0\1\2\1\20\1\36"+
    "\7\20\1\37\1\20\1\40\1\0\2\20\1\41\1\20"+
    "\1\42\3\20\1\43\1\0\1\44\3\20\1\45\1\46"+
    "\1\0\3\20\1\47\2\20\1\0\1\50\1\20\1\0"+
    "\1\20\12\0\1\51\2\0\1\52";

  private static int [] zzUnpackAction() {
    int [] result = new int[133];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\67\0\156\0\245\0\334\0\u0113\0\u014a\0\67"+
    "\0\67\0\67\0\67\0\67\0\67\0\u0181\0\u01b8\0\u01ef"+
    "\0\u0226\0\67\0\u025d\0\u0294\0\u02cb\0\u0302\0\u0339\0\u0370"+
    "\0\u03a7\0\u03de\0\u0415\0\u044c\0\u0483\0\u04ba\0\u04f1\0\67"+
    "\0\67\0\u0528\0\u055f\0\67\0\334\0\67\0\u0596\0\u05cd"+
    "\0\67\0\u0181\0\u0604\0\u063b\0\u0672\0\67\0\67\0\67"+
    "\0\u06a9\0\u06e0\0\u0717\0\u074e\0\u0302\0\u0785\0\u07bc\0\u07f3"+
    "\0\u082a\0\u0861\0\u0898\0\u08cf\0\67\0\u0906\0\u093d\0\u0672"+
    "\0\u0974\0\u09ab\0\u09e2\0\u0a19\0\u0302\0\u0a50\0\u0a87\0\u0abe"+
    "\0\u0af5\0\u0b2c\0\u0b63\0\u0b9a\0\u0bd1\0\67\0\u0c08\0\u0302"+
    "\0\u0c3f\0\u0c76\0\u0cad\0\u0ce4\0\u0d1b\0\u0d52\0\u0d89\0\u0302"+
    "\0\u0dc0\0\u0302\0\u0df7\0\u0e2e\0\u0e65\0\u0302\0\u0e9c\0\u0302"+
    "\0\u0ed3\0\u0f0a\0\u0f41\0\u0302\0\u0f78\0\u0302\0\u0faf\0\u0fe6"+
    "\0\u101d\0\u0302\0\u0302\0\u1054\0\u108b\0\u10c2\0\u10f9\0\67"+
    "\0\u1130\0\u1167\0\u119e\0\u0302\0\u11d5\0\u120c\0\u1243\0\u127a"+
    "\0\u12b1\0\u12e8\0\u131f\0\u1356\0\u138d\0\u13c4\0\u13fb\0\u1432"+
    "\0\u1469\0\67\0\u14a0\0\u14d7\0\67";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[133];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\3\26\1\27\1\30"+
    "\1\31\2\26\1\32\5\26\1\33\1\34\1\35\1\36"+
    "\1\37\1\26\1\40\1\2\1\41\6\26\1\42\2\26"+
    "\1\43\70\0\2\3\110\0\1\44\42\0\5\45\1\46"+
    "\45\45\1\47\13\45\36\0\1\50\37\0\1\51\77\0"+
    "\2\52\57\0\1\53\4\0\1\54\65\0\1\52\1\0"+
    "\2\21\13\0\1\55\22\0\1\55\24\0\1\52\1\0"+
    "\2\21\71\0\1\56\66\0\1\57\66\0\1\60\62\0"+
    "\2\26\4\0\24\26\3\0\11\26\21\0\2\26\4\0"+
    "\4\26\1\61\17\26\3\0\11\26\21\0\2\26\4\0"+
    "\12\26\1\62\1\26\1\63\7\26\3\0\11\26\21\0"+
    "\2\26\4\0\12\26\1\64\11\26\3\0\11\26\21\0"+
    "\2\26\4\0\5\26\1\65\6\26\1\66\7\26\3\0"+
    "\11\26\21\0\2\26\4\0\17\26\1\67\4\26\3\0"+
    "\11\26\21\0\2\26\4\0\4\26\1\70\17\26\3\0"+
    "\11\26\21\0\2\26\4\0\21\26\1\71\2\26\3\0"+
    "\11\26\21\0\2\26\4\0\7\26\1\72\14\26\3\0"+
    "\11\26\21\0\2\26\4\0\14\26\1\73\7\26\3\0"+
    "\11\26\21\0\2\26\4\0\24\26\3\0\3\26\1\74"+
    "\5\26\67\0\1\75\2\45\2\0\63\45\57\0\1\76"+
    "\7\0\12\53\1\77\54\53\2\54\2\0\63\54\20\0"+
    "\2\100\4\0\6\100\21\0\2\100\30\0\2\26\4\0"+
    "\2\26\1\101\21\26\3\0\11\26\21\0\2\26\4\0"+
    "\20\26\1\102\3\26\3\0\11\26\21\0\2\26\4\0"+
    "\3\26\1\103\20\26\3\0\11\26\21\0\2\26\4\0"+
    "\15\26\1\104\6\26\3\0\11\26\21\0\2\26\4\0"+
    "\21\26\1\105\2\26\3\0\11\26\21\0\2\26\4\0"+
    "\15\26\1\106\6\26\3\0\11\26\21\0\2\26\4\0"+
    "\16\26\1\107\5\26\3\0\11\26\21\0\2\26\4\0"+
    "\17\26\1\110\4\26\3\0\11\26\21\0\2\26\4\0"+
    "\4\26\1\111\17\26\3\0\11\26\21\0\2\26\4\0"+
    "\21\26\1\112\2\26\3\0\11\26\21\0\2\26\4\0"+
    "\24\26\3\0\5\26\1\113\3\26\65\0\1\114\2\0"+
    "\12\53\1\115\4\53\1\116\47\53\20\0\2\26\4\0"+
    "\23\26\1\117\3\0\11\26\21\0\2\26\4\0\4\26"+
    "\1\120\17\26\3\0\11\26\21\0\2\26\4\0\3\26"+
    "\1\121\4\26\1\122\5\26\1\123\5\26\3\0\11\26"+
    "\21\0\2\26\4\0\1\124\23\26\3\0\11\26\21\0"+
    "\2\26\4\0\6\26\1\125\15\26\3\0\11\26\21\0"+
    "\2\26\4\0\4\26\1\126\17\26\3\0\11\26\21\0"+
    "\2\26\4\0\10\26\1\127\13\26\3\0\11\26\21\0"+
    "\2\26\4\0\14\26\1\130\7\26\3\0\11\26\21\0"+
    "\2\26\4\0\10\26\1\131\13\26\3\0\11\26\21\0"+
    "\2\26\4\0\24\26\3\0\10\26\1\132\56\0\1\133"+
    "\11\0\12\53\1\115\4\53\1\0\47\53\20\0\2\26"+
    "\4\0\1\134\23\26\3\0\11\26\21\0\2\26\4\0"+
    "\4\26\1\135\17\26\3\0\11\26\21\0\2\26\4\0"+
    "\5\26\1\136\16\26\3\0\11\26\21\0\2\26\4\0"+
    "\17\26\1\137\4\26\3\0\11\26\21\0\2\26\4\0"+
    "\21\26\1\140\2\26\3\0\11\26\21\0\2\26\4\0"+
    "\17\26\1\141\4\26\3\0\11\26\21\0\2\26\4\0"+
    "\1\142\23\26\3\0\11\26\21\0\2\26\4\0\14\26"+
    "\1\143\7\26\3\0\11\26\21\0\2\26\4\0\12\26"+
    "\1\144\11\26\3\0\11\26\62\0\1\145\25\0\2\26"+
    "\4\0\17\26\1\146\4\26\3\0\11\26\21\0\2\26"+
    "\4\0\2\26\1\147\21\26\3\0\11\26\21\0\2\26"+
    "\4\0\15\26\1\150\6\26\3\0\11\26\21\0\2\26"+
    "\4\0\1\151\23\26\3\0\11\26\21\0\2\26\4\0"+
    "\21\26\1\152\2\26\3\0\11\26\21\0\2\26\4\0"+
    "\6\26\1\153\15\26\3\0\11\26\57\0\1\154\30\0"+
    "\2\26\4\0\23\26\1\155\3\0\11\26\21\0\2\26"+
    "\4\0\6\26\1\156\15\26\3\0\11\26\21\0\2\26"+
    "\4\0\13\26\1\157\10\26\3\0\11\26\64\0\1\160"+
    "\23\0\2\26\4\0\1\161\23\26\3\0\11\26\21\0"+
    "\2\26\4\0\17\26\1\162\4\26\3\0\11\26\17\0"+
    "\1\163\1\0\2\26\4\0\24\26\3\0\11\26\21\0"+
    "\2\26\4\0\17\26\1\164\4\26\3\0\11\26\21\0"+
    "\2\26\4\0\1\165\23\26\3\0\11\26\47\0\1\166"+
    "\40\0\2\26\4\0\13\26\1\167\10\26\3\0\11\26"+
    "\33\0\1\170\52\0\1\171\1\0\2\26\4\0\24\26"+
    "\3\0\11\26\31\0\1\172\104\0\1\173\67\0\1\174"+
    "\51\0\1\175\72\0\1\176\60\0\1\177\101\0\1\200"+
    "\72\0\1\201\61\0\1\202\62\0\1\203\73\0\1\204"+
    "\65\0\1\205\24\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[5390];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\5\1\6\11\4\1\1\11\15\1\2\11"+
    "\2\1\1\11\1\0\1\11\2\0\1\11\1\1\1\0"+
    "\1\1\1\0\3\11\14\1\1\11\2\0\14\1\2\0"+
    "\1\11\14\1\1\0\11\1\1\0\6\1\1\0\3\1"+
    "\1\11\2\1\1\0\2\1\1\0\1\1\12\0\1\11"+
    "\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[133];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexico(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
              {
                System.out.println("Fin de archivo."); return null;
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { throw new Error("Caracter no permitido: <" + yytext() + "> en la linea " + yyline);
            }
          // fall through
          case 43: break;
          case 2:
            { /* se ignora */
            }
          // fall through
          case 44: break;
          case 3:
            { System.out.println("Token NOT encontrado, Lexema " + yytext());
            }
          // fall through
          case 45: break;
          case 4:
            { System.out.println("Token PARENT_IZQ encontrado, Lexema " + yytext());
            }
          // fall through
          case 46: break;
          case 5:
            { System.out.println("Token PARENT_DER encontrado, Lexema " + yytext());
            }
          // fall through
          case 47: break;
          case 6:
            { System.out.println("Token MULTI encontrado, Lexema " + yytext());
            }
          // fall through
          case 48: break;
          case 7:
            { System.out.println("Token MAS encontrado, Lexema " + yytext());
            }
          // fall through
          case 49: break;
          case 8:
            { System.out.println("Token COMA encontrado, Lexema " + yytext());
            }
          // fall through
          case 50: break;
          case 9:
            { System.out.println("Token MENOS encontrado, Lexema " + yytext());
            }
          // fall through
          case 51: break;
          case 10:
            { System.out.println("Token DIV encontrado, Lexema " + yytext());
            }
          // fall through
          case 52: break;
          case 11:
            { System.out.println("Token INT_CONST encontrado, Lexema " + yytext());
            }
          // fall through
          case 53: break;
          case 12:
            { System.out.println("Token DOS_PUNTOS encontrado, Lexema " + yytext());
            }
          // fall through
          case 54: break;
          case 13:
            { System.out.println("Token MENOR encontrado, Lexema " + yytext());
            }
          // fall through
          case 55: break;
          case 14:
            { System.out.println("Token ASSIGN encontrado, Lexema " + yytext());
            }
          // fall through
          case 56: break;
          case 15:
            { System.out.println("Token MAYOR encontrado, Lexema " + yytext());
            }
          // fall through
          case 57: break;
          case 16:
            { System.out.println("Token ID encontrado, Lexema " + yytext());
            }
          // fall through
          case 58: break;
          case 17:
            { System.out.println("Token CORCH_IZQ encontrado, Lexema " + yytext());
            }
          // fall through
          case 59: break;
          case 18:
            { System.out.println("Token CORCH_DER encontrado, Lexema " + yytext());
            }
          // fall through
          case 60: break;
          case 19:
            { System.out.println("Token DISTINTO encontrado, Lexema " + yytext());
            }
          // fall through
          case 61: break;
          case 20:
            { System.out.println("Token STRING_CONST encontrado, Lexema " + yytext());
            }
          // fall through
          case 62: break;
          case 21:
            { System.out.println("Token AND encontrado, Lexema " + yytext());
            }
          // fall through
          case 63: break;
          case 22:
            { System.out.println("Token FLOAT_CONST encontrado, Lexema " + yytext());
            }
          // fall through
          case 64: break;
          case 23:
            { System.out.println("Token MENOR_IGUAL encontrado, Lexema " + yytext());
            }
          // fall through
          case 65: break;
          case 24:
            { System.out.println("Token IGUAL encontrado, Lexema " + yytext());
            }
          // fall through
          case 66: break;
          case 25:
            { System.out.println("Token MAYOR_IGUAL encontrado, Lexema " + yytext());
            }
          // fall through
          case 67: break;
          case 26:
            { System.out.println("Token IF encontrado, Lexema " + yytext());
            }
          // fall through
          case 68: break;
          case 27:
            { System.out.println("Token OR encontrado, Lexema " + yytext());
            }
          // fall through
          case 69: break;
          case 28:
            { System.out.println("Token HEX_CONST encontrado, Lexema " + yytext());
            }
          // fall through
          case 70: break;
          case 29:
            { System.out.println("Token TYPE_INT encontrado, Lexema " + yytext());
            }
          // fall through
          case 71: break;
          case 30:
            { System.out.println("Token ELSE encontrado, Lexema " + yytext());
            }
          // fall through
          case 72: break;
          case 31:
            { System.out.println("Token THEN encontrado, Lexema " + yytext());
            }
          // fall through
          case 73: break;
          case 32:
            { System.out.println("Token SHOW encontrado, Lexema " + yytext());
            }
          // fall through
          case 74: break;
          case 33:
            { System.out.println("Token ENDIF encontrado, Lexema " + yytext());
            }
          // fall through
          case 75: break;
          case 34:
            { System.out.println("Token TYPE_FLOAT encontrado, Lexema " + yytext());
            }
          // fall through
          case 76: break;
          case 35:
            { System.out.println("Token UNTIL encontrado, Lexema " + yytext());
            }
          // fall through
          case 77: break;
          case 36:
            { System.out.println("Token DECVAR encontrado, Lexema " + yytext());
            }
          // fall through
          case 78: break;
          case 37:
            { System.out.println("Token REPEAT encontrado, Lexema " + yytext());
            }
          // fall through
          case 79: break;
          case 38:
            { System.out.println("Token TYPE_STRING encontrado, Lexema " + yytext());
            }
          // fall through
          case 80: break;
          case 39:
            { System.out.println("Token FUNC_IGUALES encontrado, Lexema " + yytext());
            }
          // fall through
          case 81: break;
          case 40:
            { System.out.println("Token ENDDECVAR encontrado, Lexema " + yytext());
            }
          // fall through
          case 82: break;
          case 41:
            { System.out.println("Token PROGRAM_SECTION encontrado, Lexema " + yytext());
            }
          // fall through
          case 83: break;
          case 42:
            { System.out.println("Token END_PROGRAM_SECTION encontrado, Lexema " + yytext());
            }
          // fall through
          case 84: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
