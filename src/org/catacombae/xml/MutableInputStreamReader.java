/*-
 * Copyright (C) 2007 Erik Larsson
 * 
 * All rights reserved.
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
 */

package org.catacombae.xml;

import java.io.*;
import java.nio.*;

public class MutableInputStreamReader extends Reader {
    private static final boolean DEBUG = true;
    private static final String PREFIX = "---->MutableInputStreamReader: ";
    private static final PrintStream os = System.out;
    private InputStream iStream;
    private InputStreamReader isReader;
    
    public MutableInputStreamReader(InputStream iStream, String charset) throws UnsupportedEncodingException {
	this.iStream = iStream;
	this.isReader = new InputStreamReader(iStream, charset);
    }
    public void close() throws IOException {
	try {
	if(DEBUG) os.println(PREFIX + "isReader.close()");
	isReader.close();
	}
	catch(IOException ioe) { if(DEBUG) ioe.printStackTrace(); throw ioe; }
	catch(RuntimeException e) { if(DEBUG) e.printStackTrace(); throw e; }
    }
    public void mark(int readAheadLimit) throws IOException {
	try {
	if(DEBUG) os.println(PREFIX + "isReader.mark(" + readAheadLimit + ")");
	isReader.mark(readAheadLimit);
	}
	catch(IOException ioe) { if(DEBUG) ioe.printStackTrace(); throw ioe; }
	catch(RuntimeException e) { if(DEBUG) e.printStackTrace(); throw e; }
    }
    public boolean markSupported() {
	try {
	boolean result = isReader.markSupported();
	if(DEBUG) os.println(PREFIX + "isReader.markSupported() == " + result);
	return result;
	}
	catch(RuntimeException e) { if(DEBUG) e.printStackTrace(); throw e; }
    }
    public int read() throws IOException {
	try {
	int result = isReader.read();
	if(DEBUG) os.println(PREFIX + "isReader.read() == " + result);
	return result;
	}
	catch(IOException ioe) { if(DEBUG) ioe.printStackTrace(); throw ioe; }
	catch(RuntimeException e) { if(DEBUG) e.printStackTrace(); throw e; }
    }
    public int read(char[] cbuf) throws IOException {
	try {
	int result = isReader.read(cbuf);
	if(DEBUG) os.println(PREFIX + "isReader.read(" + cbuf.length + " bytes...) == " + result);
	return result;
	}
	catch(IOException ioe) { if(DEBUG) ioe.printStackTrace(); throw ioe; }
	catch(RuntimeException e) { if(DEBUG) e.printStackTrace(); throw e; }
    }
    public int read(char[] cbuf, int off, int len) throws IOException {
	try {
	int result = isReader.read(cbuf, off, len);
	if(DEBUG) os.println(PREFIX + "isReader.read(" + cbuf.length + " bytes..., " + off + ", " + len + ") == " + result);
	return result;
	}
	catch(IOException ioe) { if(DEBUG) ioe.printStackTrace(); throw ioe; }
	catch(RuntimeException e) { if(DEBUG) e.printStackTrace(); throw e; }
    }
    public int read(CharBuffer target) throws IOException {
	try {
	int result = isReader.read(target);
	if(DEBUG) os.println(PREFIX + "isReader.read(CharBuffer with length " + target.length() + ") == " + result);
	return result;
	}
	catch(IOException ioe) { if(DEBUG) ioe.printStackTrace(); throw ioe; }
	catch(RuntimeException e) { if(DEBUG) e.printStackTrace(); throw e; }
    }
    public boolean ready() throws IOException {
	try {
	boolean result = isReader.ready();
	if(DEBUG) os.println(PREFIX + "isReader.ready() == " + result);
	return result;
	}
	catch(IOException ioe) { if(DEBUG) ioe.printStackTrace(); throw ioe; }
	catch(RuntimeException e) { if(DEBUG) e.printStackTrace(); throw e; }
    }
    public void reset() throws IOException {
	try {
	if(DEBUG) os.println(PREFIX + "isReader.reset()");
	isReader.reset();
	}
	catch(IOException ioe) { if(DEBUG) ioe.printStackTrace(); throw ioe; }
	catch(RuntimeException e) { if(DEBUG) e.printStackTrace(); throw e; }
    }
    public long skip(long n) throws IOException {
	try {
	long result = isReader.skip(n);
	if(DEBUG) os.println(PREFIX + "isReader.skip(" + n + ") == " + result);
	return result;
	}
	catch(IOException ioe) { if(DEBUG) ioe.printStackTrace(); throw ioe; }
	catch(RuntimeException e) { if(DEBUG) e.printStackTrace(); throw e; }
    }

    public void changeEncoding(String charset) throws UnsupportedEncodingException {
	try {
	if(DEBUG) os.println(PREFIX + "changeEncoding(\"" + charset + "\")");
	isReader = new InputStreamReader(iStream, charset);
	}
	catch(RuntimeException e) { if(DEBUG) e.printStackTrace(); throw e; }
    }
}